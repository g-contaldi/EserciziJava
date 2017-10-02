package it.dstech.lavoratore;

public class Lavoratore {

	private String nome;

	private int livello;

	private double stipendio;

	public Lavoratore(String nome, int livello) {
		this.nome = nome;
		this.livello = livello;
		if (livello == 3)
			this.stipendio = 1200;
		if (livello == 4)
			this.stipendio = 1400;
		if (livello == 5)
			this.stipendio = 1600;
		if (livello == 6)
			this.stipendio = 1800;
	}

	public void stampaStipendio() {
		System.out.println("Lo stipendio di " + getNome() + " e': " + getStipendio());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

}
