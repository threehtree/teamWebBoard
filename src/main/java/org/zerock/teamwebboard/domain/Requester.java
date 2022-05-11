package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Requester {
    private int rno;
    private String rID;
    private String rName;
    private String rCall;
    private String rEmail;
    private String rImg;
    private String residentNum;

    private LocalDate regDate;
    private LocalDate updateDate;

}
