package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    private String adminID;
    private String adminName;
    private String adminCall;
    private String adminEmail;
    private Integer reportNum;

    private LocalDate regDate;
    private LocalDate updateDate;
}
