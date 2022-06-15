package org.zerock.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zerock.board.dto.ReplyDTO;
import org.zerock.board.service.ReplyService;

import java.util.List;

@RestController
@Log4j2
@RequestMapping("/replies")
@RequiredArgsConstructor
public class ReplyController {

    private final ReplyService service;

    @GetMapping(value = "/board/{bno}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ReplyDTO>> getListByBoard(@PathVariable("bno") Long bno) {
        return new ResponseEntity<List<ReplyDTO>>(service.getList(bno), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Long> register(@RequestBody ReplyDTO replyDTO) {
        Long rno = service.register(replyDTO);
        return new ResponseEntity<>(rno, HttpStatus.OK);
    }
}
