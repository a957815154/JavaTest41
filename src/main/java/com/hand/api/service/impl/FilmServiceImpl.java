package com.hand.api.service.impl;

import com.hand.api.service.FilmService;
import com.hand.domain.entity.FilmE;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.transaction.annotation.Transactional;


public class FilmServiceImpl implements FilmService {
    private FilmMapper filmMapper;

    public FilmMapper getFilmMapper() {
        return filmMapper;
    }

    public void setFilmMapper(FilmMapper filmMapper) {
        this.filmMapper = filmMapper;
    }

    @Override
    @Transactional
    public void insertFilm(FilmE film) {

            filmMapper.insertFilm(film);
            int i = 5 / 0;


    }

    @Override
    @Transactional
    public void insertFilm2(FilmE film) {
        filmMapper.insertFilm(film);

    }

    @Override
    @Transactional
    public int countFilm() {
       return  filmMapper.countFilm();
    }

}
