package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ContractDTO {

    private Integer contractNum;
    private Integer categoryNum;
    private String requesterID;
    private String contractorID;
    private String area;
    private String workScope;
    private String workDetail;
    private Integer workLimit;
    private String contractState;
    private String contractName;
    private String contractFile;
    private String priceState;
    private String negotiationState;
    private String declarationState;

    private LocalDate regDate;
    private LocalDate updateDate;
}
