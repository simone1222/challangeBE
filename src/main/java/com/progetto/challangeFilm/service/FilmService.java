package com.progetto.challangeFilm.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.progetto.challangeFilm.model.FilmEntity;

@Service
public interface FilmService {

	public List<FilmEntity> listaFilm();

	public List<FilmEntity> listaFilmStorico();

	public List<FilmEntity> findFilmByDateRange(String dataInizio, String dataFine);

}
