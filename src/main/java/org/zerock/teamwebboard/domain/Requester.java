package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Requester {
    private String num;
    private String rid;
    private String rname;
    private String rcall;
    private String remail;
    private String rfile;
    private String residentNum;

//    private LocalDate regDate;
//    private LocalDate updateDate;
}
