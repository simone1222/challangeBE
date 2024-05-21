package com.progetto.challangeFilm.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.progetto.challangeFilm.model.FilmEntity;

@Repository
public interface FilmRepository extends JpaRepository<FilmEntity, Long> {

	 @Query("SELECT f FROM FilmEntity f WHERE f.dataInizio > :oggi")
	 	List<FilmEntity> filmInProgrammazione(Date oggi);

	 @Query("SELECT f FROM FilmEntity f WHERE f.dataInizio < :oggi")
		List<FilmEntity> filmStorico(Date oggi);
	 

	 @Query("SELECT f FROM FilmEntity f WHERE :dataInizio BETWEEN f.dataInizio AND f.dataFine AND :dataFine BETWEEN f.dataInizio AND f.dataFine")
	 List<FilmEntity> findByDateRange(@Param("dataInizio") Date dataInizio, @Param("dataFine") Date dataFine);

	 List<FilmEntity> findByDataInizio(Date dataInizio);


	}
