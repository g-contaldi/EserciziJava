package it.dstech.botten.model;

import java.util.ArrayList;

public class KickBoxer extends Personaggio {

	public KickBoxer(String nome) {
		super(nome, "KickBoxer");
		setMosse(getListMosse());
	}

	public void setMosse(ArrayList<Mossa> mosse) {
		mosse.add(new Mossa("Jab", 2));
		mosse.add(new Mossa("Front Kick", 4));
		mosse.add(new Mossa("Middle Kick", 7));
	}

	public ArrayList<Mossa> getMosse() {
		return getMosse();
	}

}
