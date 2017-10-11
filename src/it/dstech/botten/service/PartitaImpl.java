package it.dstech.botten.service;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import it.dstech.botten.model.KickBoxer;
import it.dstech.botten.model.KungFu;
import it.dstech.botten.model.Mossa;
import it.dstech.botten.model.Personaggio;
import it.dstech.botten.model.Wrestler;

public class PartitaImpl implements Partita {

	Scanner input = new Scanner(System.in);

	ArrayList<Personaggio> listaPersonaggi = new ArrayList<>();

	public void setPersonaggi(ArrayList<Personaggio> listaPersonaggi) {
		listaPersonaggi.add(new KungFu("Fabio San "));
		listaPersonaggi.add(new KungFu("Mauro San "));
		listaPersonaggi.add(new KungFu("Gianluca San "));
		listaPersonaggi.add(new KickBoxer("Paolo Creed "));
		listaPersonaggi.add(new KickBoxer("Mattia Sakara "));
		listaPersonaggi.add(new KickBoxer("Fabrizio Armabianca "));
		listaPersonaggi.add(new Wrestler("David Misterio "));
		listaPersonaggi.add(new Wrestler("Lorenzo Guerrero "));
		listaPersonaggi.add(new Wrestler("ALBERO "));
	}

	public ArrayList<Personaggio> getListaPersonaggi() {
		return listaPersonaggi;
	}

	public void stampaListaPersonaggi(ArrayList<Personaggio> listaPersonaggi) {
		int indice = 1;
		for (Personaggio personaggio : listaPersonaggi) {
			System.out.println(indice + ". " + personaggio);
			indice++;
		}
	}

	@Override
	public Personaggio selezionaPersonaggio(ArrayList<Personaggio> listaPersonaggi) {
		System.out.println("##############################");
		System.out.println("Seleziona Personaggio");
		System.out.println("##############################");
		int scan = input.nextInt();
		input.nextLine();
		return listaPersonaggi.get(scan - 1);
	}

	@Override
	public Personaggio selezionaPersonaggioCPU(ArrayList<Personaggio> listaPersonaggi) {
		Random rnd = new Random();
		return listaPersonaggi.get(rnd.nextInt(10));
		}

	@Override
	public Mossa selezionaColpo(Personaggio personaggio) {
		int scan, x = 0;
		personaggio.stampaMosse();

		do {
			System.out.println("Scegli la mossa 1 - 2 - 3");
			scan = input.nextInt();
			input.nextLine();
			if (personaggio.getStamina() >= personaggio.getMosse(scan - 1).getDanno() * 3)
				x = 1;
			else
				System.out.println("Non hai abbastanza stamina per utilizzare " + personaggio.getMosse(scan - 1));
		} while (x != 1);

		return personaggio.getMosse(scan - 1);
	}

	@Override
	public Mossa selezionaColpoCpu(Personaggio personaggio) {
		int x = 0;
		int r;
		Random rnd = new Random();
		do {
			r = rnd.nextInt(2);
			if (personaggio.getStamina() >= personaggio.getMosse(r).getDanno() * 3)
				x = 1;
		} while (x != 1);

		return personaggio.getMosse(r);
	}

	@Override
	public void colpo(Personaggio pA, Personaggio pI, Mossa mossa) {
		System.out.println(pA + " Attaca " + pI + " Utilizzando" + mossa);
		if (pA.getStamina() <= 50 && pA.getStamina() >= 40)
			pA.topStamina();
		else
			pA.addStamina(10);

		pA.setStamina(mossa.getDanno() * 3);
		pI.setVita(mossa.getDanno());
	}

	@Override
	public void statoPartita(Personaggio pA, Personaggio pI) {
		System.out.println("TU " + pA.resoconto());
		System.out.println("CPU " + pI.resoconto());
	}

}
