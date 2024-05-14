package com.progetto.challangeFilm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progetto.challangeFilm.model.FilmEntity;
import com.progetto.challangeFilm.service.FilmService;

@RestController
@RequestMapping("/api/film")
public class FilmController {

	
	@Autowired
	private FilmService filmService;
	

	@GetMapping("/listaFilmProgrammati")
	private List<FilmEntity> listaFilmProgrammati(){
		List<FilmEntity> listaFilm = filmService.listaFilm();
		return listaFilm;
		
	}
	
	@GetMapping("/listaFilmStorico")
	private List<FilmEntity> listaFilmStorico(){
		List<FilmEntity> listaFilm = filmService.listaFilmStorico();
		return listaFilm;
		
	}
}
