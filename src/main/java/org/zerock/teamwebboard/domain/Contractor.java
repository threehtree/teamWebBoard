package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contractor {

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
