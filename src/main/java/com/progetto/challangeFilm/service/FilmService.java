package com.progetto.challangeFilm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.progetto.challangeFilm.model.FilmEntity;

@Service
public interface FilmService {

	public List<FilmEntity> listaFilm();

	public List<FilmEntity> listaFilmStorico();

}
