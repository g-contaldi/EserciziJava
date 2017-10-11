package it.dstech.botten.model;

public class Mossa {

	String nome;

	double danno;

	public Mossa(String nome, double danno) {
		this.nome = nome;
		this.danno = danno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDanno() {
		return danno;
	}

	public void setDanno(double danno) {
		this.danno = danno;
	}

	@Override
	public String toString() {
		return " [ " + nome + " - danno " + danno + " ]";
	}

}
