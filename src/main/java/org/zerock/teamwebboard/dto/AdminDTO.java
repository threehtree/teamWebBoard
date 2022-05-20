package org.zerock.teamwebboard.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class AdminDTO {
    private Integer adNo;
    private String adID;
    private String adName;
    private String adPhone;
    private String adEmail;
    private String adProfile;
    private String adBirth;
    private String adAddress;
    private Integer authority;

    private LocalDate regDate;
    private LocalDate updateDate;
    private int delFlag;
}
