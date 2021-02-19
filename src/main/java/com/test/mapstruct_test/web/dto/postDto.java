package com.test.mapstruct_test.web.dto;

import lombok.*;

import java.time.OffsetDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class postDto {

    private String writer;
    private String content;

}
