package org.zerock.teamwebboard.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    private int adno;
    private String adID;
    private String adName;
    private String adCall;
    private String adEmail;
    private int authority;

    private LocalDate regDate;
    private LocalDate updateDate;
}
