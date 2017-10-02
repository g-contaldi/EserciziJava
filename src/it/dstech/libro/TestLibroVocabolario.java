package it.dstech.libro;

public class TestLibroVocabolario {

	public static void main(String[] args) {

		Libro libro = new Libro(1500);
		System.out.println("*********\n* LIBRO *\n*********");
		libro.stampaPagine();

		Libro vocabolario = new Vocabolario(4500, 52100);
		System.out.println("***************\n* VOCABOLARIO *\n***************");
		((Vocabolario) vocabolario).stampaDefinizioni();

	}
}
