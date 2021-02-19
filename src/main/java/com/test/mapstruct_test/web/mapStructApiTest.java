package com.test.mapstruct_test.web;

import com.test.mapstruct_test.domain.post.post;
import com.test.mapstruct_test.web.dto.postDto;
import com.test.mapstruct_test.web.mapper.postMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mapStructApiTest {



    @GetMapping("/test")
    public postDto test(){
        return postDto.builder().writer("현").content("내용").build();
    }

    @GetMapping("/mapstructTest")
    public post mapstructTest(){
        postDto postRequestDto = postDto.builder().writer("현").content("내용 dto -> entity").build();
        System.out.println("postRequestDto :"+postRequestDto);
        post dtoToPost = postMapper.INSTANCE.toPostEntity(postRequestDto);

        return dtoToPost;

    }
}
