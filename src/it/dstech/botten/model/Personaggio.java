package it.dstech.botten.model;

import java.util.ArrayList;

public class Personaggio {

	private double vita;

	private double stamina;

	private String nome;

	private String stileLotta;

	private ArrayList<Mossa> mosse;

	public Personaggio(String nome, String stileLotta) {
		this.nome = nome;
		this.stileLotta = stileLotta;
		vita = 100;
		stamina = 50;
		mosse = new ArrayList<Mossa>();
	}

	public void topStamina() {
		this.stamina = 50.0;
	}

	public void addStamina(double stamina) {
		this.stamina += stamina;
	}

	public void setStamina(double stamina) {
		this.stamina -= stamina;
	}

	public double getStamina() {
		return stamina;
	}

	public Mossa getMosse(int i) {
		return mosse.get(i);
	}

	public ArrayList<Mossa> getListMosse() {
		return mosse;
	}

	public double getVita() {
		return vita;
	}

	public void setVita(double vita) {
		this.vita -= vita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStileLotta() {
		return stileLotta;
	}

	public void setStileLotta(String stileLotta) {
		this.stileLotta = stileLotta;
	}

	public String resoconto() {
		return "[ " + nome + ", Vita " + vita + ", Stamina " + stamina + " ]";
	}

	public void stampaMosse() {
		System.out.println("Mosse disponibili  " + getListMosse());
	}

	@Override
	public String toString() {
		return "[ " + nome + "- " + stileLotta + " ]";
	}

}
