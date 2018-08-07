package com.hand.infra.util;

import com.hand.infra.mapper.FilmMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class InsertInterceptor {
    @Resource
    private FilmMapper filmMapper ;
    public void before() {
        System.out.println("Before Insert Film Data");
        System.out.println("total:"+filmMapper.countFilm());

    }

    public void after() {
        System.out.println("After Insert Film Data");
        System.out.println("total:"+filmMapper.countFilm());
    }
}
