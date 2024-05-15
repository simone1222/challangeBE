package com.progetto.challangeFilm.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.progetto.challangeFilm.model.FilmEntity;
import com.progetto.challangeFilm.repository.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {
	
	
	@Autowired
	private FilmRepository filmRepository;
	
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");


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

	@Override
	public List<FilmEntity> findFilmByDateRange(String dataInizio, String dataFine) {
		 try {
	            Date dateStart = DATE_FORMAT.parse(dataInizio);
	            Date dateEnd = DATE_FORMAT.parse(dataFine);
	            return filmRepository.findByDateRange(dateStart, dateEnd);
	        } catch (ParseException e) {
	            throw new RuntimeException("Invalid date format", e);
	        }
		 

	}

	

	
	
}
