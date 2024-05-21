package com.progetto.challangeFilm.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	
    private static final SimpleDateFormat DATE_FORMAT =  new SimpleDateFormat("yyyy-MM-dd");



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
		//Ricerca dei film nei range desiderati
	    if (dataInizio != null && dataFine != null) {
			    try {
					Date dateEnd =  DATE_FORMAT.parse(dataFine);
					Date dateStart =  DATE_FORMAT.parse(dataInizio);
					List<FilmEntity> findByDateRange = filmRepository.findByDateRange(dateStart,dateEnd);
					return findByDateRange;

				} catch (ParseException e) {
					e.printStackTrace();
				}
//			
			
	    } else if (dataInizio != null) {
	        Date dateStart;
			try {
				dateStart = DATE_FORMAT.parse(dataInizio);
				return filmRepository.findByDataInizio(dateStart);

			} catch (ParseException e) {
				e.printStackTrace();
			}
	  
	}
		return null;


	}

	
	
}
