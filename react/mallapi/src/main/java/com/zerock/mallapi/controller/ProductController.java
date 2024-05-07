package com.zerock.mallapi.controller;

import com.zerock.mallapi.dto.PageRequestDTO;
import com.zerock.mallapi.dto.PageResponseDTO;
import com.zerock.mallapi.dto.ProductDTO;
import com.zerock.mallapi.service.ProductService;
import com.zerock.mallapi.util.CustomFileUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService; //ProductServcie 주입
    private final CustomFileUtil fileUtil;

    @PostMapping("/")
    public Map<String, Long> register(ProductDTO productDTO){

        log.info("rgister: " + productDTO);

        List<MultipartFile> files = productDTO.getFiles();
        // 파일 입출력 로직 실행 후 저장된 파일 이름 목록 
        List<String> uploadFileNames = fileUtil.saveFiles(files);
        productDTO.setUploadFileNames(uploadFileNames);

//        log.info(uploadFileNames.toString());

        //서비스 호출 -> 파일 정보 저장
        Long pno = productService.register(productDTO);

        return Map.of("result", pno);
    }


    // @PostMapping("/")
    // public Map<String, String> register(ProductDTO productDTO){

    //   log.info("rgister: " + productDTO);

    //   List<MultipartFile> files = productDTO.getFiles();

    //   List<String> uploadFileNames = fileUtil.saveFiles(files);

    //   productDTO.setUploadFileNames(uploadFileNames);

    //   log.info(uploadFileNames);

    //   return Map.of("RESULT", "SUCCESS");
    // }

    @GetMapping("/view/{fileName}")
    public ResponseEntity<Resource> viewFileGET(@PathVariable String fileName){

        return fileUtil.getFile(fileName);

    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping("/list")
    public PageResponseDTO<ProductDTO> list(PageRequestDTO pageRequestDTO) {

        log.info("list............." + pageRequestDTO);

        return productService.getList(pageRequestDTO);

    }

    @GetMapping("/{pno}")
    public ProductDTO read(@PathVariable Long pno) {

        return productService.get(pno);
    }

    @PutMapping("/{pno}")
    public Map<String, String> modify(@PathVariable(name="pno")Long pno, ProductDTO productDTO) {

        productDTO.setPno(pno);

        ProductDTO oldProductDTO = productService.get(pno);

        //기존의 파일들 (데이터베이스에 존재하는 파일들 - 수정 과정에서 삭제되었을 수 있음)
        List<String> oldFileNames = oldProductDTO.getUploadFileNames();

        //새로 업로드 해야 하는 파일들
        List<MultipartFile> files = productDTO.getFiles();

        //새로 업로드되어서 만들어진 파일 이름들
        List<String> currentUploadFileNames = fileUtil.saveFiles(files);

        //화면에서 변화 없이 계속 유지된 파일들
        List<String> uploadedFileNames = productDTO.getUploadFileNames();

        //유지되는 파일들  + 새로 업로드된 파일 이름들이 저장해야 하는 파일 목록이 됨
        if(currentUploadFileNames != null && currentUploadFileNames.size() > 0) {

            uploadedFileNames.addAll(currentUploadFileNames);

        }
        //수정 작업
        productService.modify(productDTO);

        if(oldFileNames != null && oldFileNames.size() > 0){

            //지워야 하는 파일 목록 찾기
            //예전 파일들 중에서 지워져야 하는 파일이름들
            List<String> removeFiles =  oldFileNames
                    .stream()
                    .filter(fileName -> uploadedFileNames.indexOf(fileName) == -1).collect(Collectors.toList());

            //실제 파일 삭제
            fileUtil.deleteFiles(removeFiles);
        }
        return Map.of("RESULT", "SUCCESS");
    }

    @DeleteMapping("/{pno}")
    public Map<String, String> remove(@PathVariable("pno") Long pno) {

        //삭제해야할 파일들 알아내기
        List<String> oldFileNames =  productService.get(pno).getUploadFileNames();

        productService.remove(pno);

        fileUtil.deleteFiles(oldFileNames);

        return Map.of("RESULT", "SUCCESS");

    }
}
