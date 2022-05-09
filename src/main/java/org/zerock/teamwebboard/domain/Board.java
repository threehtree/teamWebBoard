package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Board {
    private Integer bno;
    private String title;
    private String content;
    private String writer;

    private LocalDate regDate;
    private LocalDate updateDate;
}
