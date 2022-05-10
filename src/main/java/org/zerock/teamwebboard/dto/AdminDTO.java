package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AdminDTO {
    private String adminID;
    private String adminName;
    private Integer adminCall;
    private String adminEmail;
    private Integer reportNum;

    private LocalDate regDate;
    private LocalDate updateDate;
}
