package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RequesterDTO {
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
