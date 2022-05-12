package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RequesterDTO {
    private int reqno;
    private String reqID;
    private String reqName;
    private String reqCall;
    private String reqEmail;
    private String reqImg;
    private String residentNum;

    private LocalDate regDate;
    private LocalDate updateDate;
}
