package com.progetto.challangeFilm.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.progetto.challangeFilm.model.FilmEntity;
import com.progetto.challangeFilm.repository.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	private FilmRepository filmRepository;

	@Override
	public List<FilmEntity> listaFilm() {
		 Date oggi = new Date();
		List<FilmEntity> filmInProgrammazione = filmRepository.filmInProgrammazione(oggi);
		return filmInProgrammazione;
	}

	@Override
	public List<FilmEntity> listaFilmStorico() {
		 Date oggi = new Date();
			List<FilmEntity> filmInProgrammazione = filmRepository.filmStorico(oggi);
			return filmInProgrammazione;
	}

	
	
}
