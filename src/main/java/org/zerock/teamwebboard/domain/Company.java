package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    private Integer comNo;
    private String comID;
    private String comName;
    private String comPhone;
    private String comEmail;
    private String comLocation;
    private String businessNum;
    private String businessCheck;
    private String comIntro;
    private String comCategory;

    private Integer conNo;
    private String conProfile;

    private LocalDate regDate;
    private LocalDate updateDate;
    private int delFlag ;
}
