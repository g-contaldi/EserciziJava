package it.dstech.botten.model;

import java.util.ArrayList;

public class Wrestler extends Personaggio {

	public Wrestler(String nome) {
		super(nome, "Wrestler");
		setMosse(getListMosse());
	}

	public void setMosse(ArrayList<Mossa> mosse) {
		mosse.add(new Mossa("Chop", 2));
		mosse.add(new Mossa("DropKick", 5));
		mosse.add(new Mossa("Suplex", 8));
	}

	public ArrayList<Mossa> getMosse() {
		return getListMosse();
	}

}
