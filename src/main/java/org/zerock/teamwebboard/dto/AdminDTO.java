package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AdminDTO {
    private int adno;
    private String adID;
    private String adName;
    private String adCall;
    private String adEmail;
    private int authority;

    private LocalDate regDate;
    private LocalDate updateDate;
}
