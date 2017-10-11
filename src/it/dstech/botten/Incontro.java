package it.dstech.botten;

import it.dstech.botten.model.Personaggio;
import it.dstech.botten.service.PartitaImpl;

public class Incontro {

	public static void main(String[] args) {

		PartitaImpl partita = new PartitaImpl();
		Personaggio personaggioTu;
		Personaggio personaggioCpu;

		System.out.println("###    BOTTEN    ###");
		System.out.println("##############################");
		partita.setPersonaggi(partita.getListaPersonaggi());
		partita.stampaListaPersonaggi(partita.getListaPersonaggi());
		personaggioTu = partita.selezionaPersonaggio(partita.getListaPersonaggi());
		personaggioCpu = partita.selezionaPersonaggioCPU(partita.getListaPersonaggi());
		System.out.println(personaggioTu + " VS " + personaggioCpu);
		System.out.println("##############################");
		partita.statoPartita(personaggioTu, personaggioCpu);

		while ((personaggioTu.getVita() > 0) && (personaggioCpu.getVita() > 0)) {
			partita.colpo(personaggioTu, personaggioCpu, partita.selezionaColpo(personaggioTu));
			partita.colpo(personaggioCpu, personaggioTu, partita.selezionaColpoCpu(personaggioCpu));
			partita.statoPartita(personaggioTu, personaggioCpu);
			System.out.println("##############################");
		}
		if (personaggioTu.getVita() > personaggioCpu.getVita())
			System.out.println("YOU WIN!");
		else if (personaggioTu.getVita() == personaggioCpu.getVita())
			System.out.println("DRAW");
		else
			System.out.println("YOU LOSE");
		System.out.println("##############################");

	}
}
