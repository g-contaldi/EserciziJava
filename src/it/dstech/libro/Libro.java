package it.dstech.libro;

public class Libro {

	private int numPagine;

	public Libro(int numPagine) {
		this.numPagine = numPagine;
	}

	public void stampaPagine() {
		System.out.println("Numero di pagine: " + getNumPagine());
	}

	public int getNumPagine() {
		return numPagine;
	}

	public void setNumPagine(int numPagine) {
		this.numPagine = numPagine;
	}

}
