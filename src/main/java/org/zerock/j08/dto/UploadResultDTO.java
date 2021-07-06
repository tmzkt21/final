package org.zerock.j08.dto;

import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UploadResultDTO {

    private String uuid;
    private String fileName;


}
