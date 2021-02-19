package com.test.mapstruct_test.domain.post;

import lombok.*;

import java.time.OffsetDateTime;

@Getter
@NoArgsConstructor
@Setter
public class post {

    private long postNo;
    private String postUserName;
    private String postContent;
    private OffsetDateTime createDateTime = OffsetDateTime.now();
}
