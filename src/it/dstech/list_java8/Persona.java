package it.dstech.list_java8;

/**
 * @author gianluca
 *
 */
public class Persona {

	private String nome;
	private String cognome;
	private int eta;
	private boolean saldato;

	public Persona(String nome, String cognome, int eta, boolean saldato) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.saldato = saldato;
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

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public boolean isSaldato() {
		return saldato;
	}

	public void setSaldato(boolean saldato) {
		this.saldato = saldato;
	}

	@Override
	public String toString() {
		return "- " + cognome + ", " + nome + ", " + eta + ", saldato=" + saldato;
	}

}
