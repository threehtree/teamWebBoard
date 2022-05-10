package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Requester {

    private String requesterID;
    private String requesterName;
    private String requesterCall;
    private String requesterEmail;
    private String requesterFile;
    private String residentNum;

    private LocalDate regDate;
    private LocalDate updateDate;
}
