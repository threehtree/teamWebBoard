package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Requester {
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
