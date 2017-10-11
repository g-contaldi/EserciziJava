package it.dstech.botten.service;

import java.util.ArrayList;

import it.dstech.botten.model.Mossa;
import it.dstech.botten.model.Personaggio;

public interface Partita {

	public Personaggio selezionaPersonaggio(ArrayList<Personaggio> listaPersonaggi);

	public Personaggio selezionaPersonaggioCPU(ArrayList<Personaggio> listaPersonaggi);

	public Mossa selezionaColpo(Personaggio personaggio);

	public Mossa selezionaColpoCpu(Personaggio personaggio);

	public void colpo(Personaggio pA, Personaggio pI, Mossa mossa);

	public void statoPartita(Personaggio pA, Personaggio pI);

}
