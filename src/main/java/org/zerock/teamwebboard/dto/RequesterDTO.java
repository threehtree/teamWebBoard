package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RequesterDTO {
    private String requesterID;
    private String requesterName;
    private String requesterCall;
    private String requesterEmail;
    private String requesterFile;
    private String residentNum;

    private LocalDate regDate;
    private LocalDate updateDate;
}
