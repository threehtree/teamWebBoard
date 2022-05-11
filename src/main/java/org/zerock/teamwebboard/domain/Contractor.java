package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contractor {
    private int ctno;
    private String ctID;
    private Integer categoryNum;
    private String ctName;
    private String businessNum;
    private String ctCall;
    private String ctEmail;
    private String ctAddress;
    private String ctFileNum;

    private LocalDate regDate;
    private LocalDate updateDate;
}
