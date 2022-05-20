package org.zerock.teamwebboard.domain;


import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AttachFile {
//파일 업로드용으로 아예 따로 만듬
    private String uuid;
    private String fileName;
    private String savePath;
    private boolean img;

}
