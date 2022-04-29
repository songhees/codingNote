package org.zerock.service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardAttachVO;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardAttachVOMapper;
import org.zerock.mapper.BoardMapper;

import java.util.List;

@Log4j
@Service
public class BoardServiceImpl implements BoardService {

    @Setter(onMethod_ = @Autowired)
    private BoardMapper mapper;

    @Setter(onMethod_ = @Autowired)
    private BoardAttachVOMapper attachMapper;

    @Override
    public void register(BoardVO board) {
        log.info("register........" + board);

        mapper.insertSelectKey(board);
        if (board.getAttachList() == null || board.getAttachList().size() <= 0) {
            return;
        }

        board.getAttachList().forEach(attach -> {
            attach.setBno(board.getBno());
            attachMapper.insert(attach);
        });

    }

    @Override
    public BoardVO get(Long bno) {
        log.info("get..........." + bno);
        return mapper.read(bno);
    }

    @Override
    public List<BoardAttachVO> getAttachList(Long bno) {
        return attachMapper.findByBno(bno);
    }

    @Override
    public boolean modify(BoardVO board) {
        log.info("update......." + board);
        return mapper.update(board) == 1;
    }

    @Override
    public boolean remove(Long bno) {
        log.info("delete........." + bno);
        return mapper.delete(bno) == 1;
    }

//    @Override
//    public List<BoardVO> getList() {
//        log.info("getList.........");
//        return mapper.getList();
//    }
    @Override
    public List<BoardVO> getList(Criteria cri) {
        log.info("get List with criteria: " + cri);
        return mapper.getListWithPaging(cri);
    }

    @Override
    public int getTotal(Criteria cri) {
        log.info("get total count");
        return mapper.getTotalCount(cri);
    }
}
