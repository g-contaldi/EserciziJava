package it.dstech.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CollectionExample {

	public static void main(String[] args) {

//		arrayList();
		 vector();
//		 hashSet();
		// hashMap();

	}

	private static void arrayList() {

		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(27, "marco", "bianco"));
		lista.add(new Persona(80, "luca", "arancio"));
		lista.add(new Persona(75, "giovanni", "rossi"));
		lista.add(new Persona(29, "mario", "bianchi"));

		// ordinamento per cognome
		Collections.sort(lista, new Comparator<Persona>() {

			@Override
			public int compare(Persona p1, Persona p2) {
				return p1.getCognome().toLowerCase().compareTo(p2.getCognome().toLowerCase());
			}
		});

		// giro la lista con un foreach e stampo anche l'indice
		int i = 0;
		for (Persona persona : lista) {
			System.out.println(i + " - " + persona);
			i++;
		}

		// accedo alla 2 posizione della lista
		Persona persona = lista.get(2);
		System.out.println(persona);

		// giro la lista con l'iterator
		// Iterator<Persona> it = lista.iterator();
		// while (it.hasNext()) {
		// Persona p = it.next();
		// System.out.println(p);
		// }

	}

	private static void vector() {

		List<Persona> lista = new Vector<>();
		lista.add(new Persona(27, "marco", "bianco"));
		lista.add(new Persona(80, "luca", "arancio"));
		lista.add(new Persona(75, "giovanni", "rossi"));
		lista.add(new Persona(29, "mario", "bianchi"));

		for (Persona persona : lista) {
			System.out.println(persona);
		}

	}

	private static void hashSet() {

		Set<Persona> hash = new HashSet<>();
		hash.add(new Persona(27, "marco", "bianco"));
		hash.add(new Persona(27, "marco", "bianco"));
		hash.add(new Persona(80, "luca", "arancio"));
		hash.add(new Persona(75, "giovanni", "rossi"));

		for (Persona persona : hash) {
			System.out.println(persona);
		}
		System.out.println(hash.size());
	}

	private static void hashMap() {

		// mappa chiave, valore
		Map<String, Persona> hash = new HashMap<>();
		hash.put("marco", new Persona(27, "marco", "bianco"));
		hash.put("luca", new Persona(80, "luca", "arancio"));
		hash.put("giovanni", new Persona(75, "giovanni", "rossi"));
		hash.put("mario", new Persona(29, "mario", "bianchi"));

		// per poter usare l'iterator ma anche il foreach,
		// devo prima usare il metodo values() che mi ritorna una collection
		Collection<Persona> collection = hash.values();
		Iterator<Persona> it = collection.iterator();
		while (it.hasNext()) {
			Persona p = it.next();
			System.out.println(p);
		}

		for (Persona persona : collection) {
			System.out.println(persona);
		}

		// accedo direttamente all'oggetto per la sua chiave
		Persona persona = hash.get("luca");
		System.out.println(persona);
	}

}
