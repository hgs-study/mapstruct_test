package com.test.mapstruct_test.web.dto;

import lombok.*;

import java.time.OffsetDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class postChildDto extends postParentDto{
    private int hit;
    private OffsetDateTime createDateTime;

    @Builder
    public postChildDto(String writer, String content, int hit,OffsetDateTime createDateTime){
        super(writer, content);
        this.hit = hit;
        this.createDateTime = createDateTime;
    }
}
