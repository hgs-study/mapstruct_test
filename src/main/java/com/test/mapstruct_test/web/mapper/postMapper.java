package com.test.mapstruct_test.web.mapper;


import com.test.mapstruct_test.domain.post.post;
import com.test.mapstruct_test.web.dto.postDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface postMapper {

    postMapper INSTANCE = Mappers.getMapper(postMapper.class);

    @Mapping(source = "writer", target = "postUserName")
    @Mapping(source = "content" , target = "postContent")
    post toPostEntity(postDto postDto);
}
