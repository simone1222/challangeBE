package com.progetto.challangeFilm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)
@Entity(name="FilmEntity")
@Table(name = "film")
public class FilmEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_film")
	private Long idFilm;
	 @Column 
	private String titolo;
	 @Column
	private String regista;
	 @JsonFormat(pattern = "yyyy-MM-dd")
	 @Column(name="data_inizio")
	private Date dataInizio;
	 @JsonFormat(pattern = "yyyy-MM-dd")
	 @Column(name="data_fine")
	private Date dataFine;
}
