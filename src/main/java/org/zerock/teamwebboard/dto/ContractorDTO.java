package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ContractorDTO {
    private String contractorID;
    private Integer categoryNum;
    private String contractorName;
    private String businessNum;
    private String contractorCal;
    private String contractorEmail;
    private String contractorAddress;
    private String contractorFile;

    private LocalDate regDate;
    private LocalDate updateDate;
}
