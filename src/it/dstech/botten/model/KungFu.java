package it.dstech.botten.model;

import java.util.ArrayList;

public class KungFu extends Personaggio {

	public KungFu(String nome) {
		super(nome, "KungFu");
		setMosse(getListMosse());
	}

	public void setMosse(ArrayList<Mossa> mosse) {
		mosse.add(new Mossa("Pugno", 3));
		mosse.add(new Mossa("Calcio", 5));
		mosse.add(new Mossa("Gomitata", 6));
	}

	public ArrayList<Mossa> getMosse() {
		return getListMosse();
	}

}
