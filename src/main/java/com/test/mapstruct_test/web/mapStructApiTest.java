package com.test.mapstruct_test.web;

import com.test.mapstruct_test.domain.post.post;
import com.test.mapstruct_test.web.dto.postChildDto;
import com.test.mapstruct_test.web.dto.postDto;
import com.test.mapstruct_test.web.mapper.postMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

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

    @GetMapping("/extendsDtoTest")
    public postChildDto extendsDtoTest(){
        postChildDto postChildDtoTest = new postChildDto();
        postChildDtoTest.setWriter("현");
        return postChildDto.builder().writer("현").content("상속  dtd 내용 (빌더패턴)").hit(2).createDateTime(OffsetDateTime.now()).build();
    }
}
