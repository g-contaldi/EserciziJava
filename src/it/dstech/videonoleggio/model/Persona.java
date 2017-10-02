package it.dstech.videonoleggio.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {

	private String nome;

	private String cognome;

	private List<Film> listFilm;

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		listFilm = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public List<Film> getListFilm() {
		return listFilm;
	}

	public void setListFilm(List<Film> listFilm) {
		this.listFilm = listFilm;
	}

}
