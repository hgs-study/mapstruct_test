package com.test.mapstruct_test.web.dto;

import lombok.*;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class userDto {

    private String name;
    private int age;
    private String gender;
}
