package it.dstech.lavoratore;

public class LavoratoreConStraordinariPagati extends Lavoratore {

	private int oreStraordinario;

	private final double retribuzioneOraria;

	public LavoratoreConStraordinariPagati(String nome, int livello, int oreStraordinario) {
		super(nome, livello);
		this.oreStraordinario = oreStraordinario;
		this.retribuzioneOraria = 10.0;
	}

	public void stampaStraordinari() {
		System.out.println("Il numero di ore di straordinario e': " + getOreStraordinario());
	}

	public void stampaStipendio() {
		super.stampaStipendio();
		System.out.println(
				"Con gli straordinari e': " + (getStipendio() + (getRetribuzioneOraria() * getOreStraordinario())));
	}

	public int getOreStraordinario() {
		return oreStraordinario;
	}

	public void setOreStraordinario(int oreStraordinario) {
		this.oreStraordinario = oreStraordinario;
	}

	public double getRetribuzioneOraria() {
		return retribuzioneOraria;
	}

}
