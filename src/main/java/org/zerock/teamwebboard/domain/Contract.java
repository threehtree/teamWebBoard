package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contract {

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
