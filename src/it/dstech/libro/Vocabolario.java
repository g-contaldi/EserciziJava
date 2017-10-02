package it.dstech.libro;

public class Vocabolario extends Libro {

	private int numDefinizioni;

	public Vocabolario(int numPag, int numDefinizioni) {
		super(numPag);
		this.numDefinizioni = numDefinizioni;
	}

	public void stampaDefinizioni() {
		stampaPagine();
		System.out.println("Numero di definizioni: " + getNumDefinizioni());
		System.out.println("Numero medio di definizioni per pagina: " + getNumDefinizioni() / getNumPagine());
	}

	public int getNumDefinizioni() {
		return numDefinizioni;
	}

	public void setNumDefinizioni(int numDefinizioni) {
		this.numDefinizioni = numDefinizioni;
	}

}