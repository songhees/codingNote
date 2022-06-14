package org.zerock.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardDTO {

    private Long bno;
    private String title;
    private String content;
    private String writerEmail;
    private String writerName;
    private LocalDateTime redDate;
    private LocalDateTime modDate;
    private int replyCount;
}
