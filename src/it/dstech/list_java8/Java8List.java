package it.dstech.list_java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8List {

	public static void main(String[] args) {

		List<Persona> list = new ArrayList<>();
		initializeList(list);

		System.out.println("------\nLista iscritti:\n------");
		list.stream().sorted(ordinaLista()).forEach(System.out::println);

		System.out.println("------\nLista di maggiorenni:\n------");
		listaConMaggiorenni(list);

		System.out.println("------\nLista di chi ha saldato:\n------");
		listaSaldato(list, n -> n.isSaldato());

	}

	private static void initializeList(List<Persona> list) {
		list.add(new Persona("mimmo", "capone", 25, true));
		list.add(new Persona("alberto", "angela", 105, false));
		list.add(new Persona("chiara", "di biase", 34, true));
		list.add(new Persona("serena", "trotta", 45, true));
		list.add(new Persona("giacomo", "giacomini", 72, false));
		list.add(new Persona("gennaro", "esposito", 17, false));
		list.add(new Persona("greta", "linetti", 29, true));
		list.add(new Persona("giosuè", "carducci", 16, true));
		list.add(new Persona("antonio", "carducci", 23, false));
		list.add(new Persona("antonio", "vivaldi", 63, false));
		list.add(new Persona("luisa", "marinucci", 37, true));
	}

	private static Comparator<Persona> ordinaLista() {
		return Comparator.comparing(Persona::getEta, Integer::compare)
				.thenComparing(Persona::getCognome, String::compareToIgnoreCase)
				.thenComparing(Persona::getNome, String::compareToIgnoreCase);
	}

	private static List<Persona> listaConMaggiorenni(List<Persona> list) {

		List<Persona> collect = list.stream().filter(f -> f.getEta() >= 18).sorted(ordinaLista())
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
		return collect;
	}

	private static List<Persona> listaSaldato(List<Persona> list, Predicate<Persona> predicate) {

		List<Persona> saldato = new ArrayList<>();
		for (Persona persona : list) {
			if (predicate.test(persona))
				saldato.add(persona);
		}
		saldato.stream().sorted(ordinaLista()).forEach(System.out::println);
		return saldato;
	}

}
