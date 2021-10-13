package it.prova.test;

import java.util.HashSet;
import java.util.Set;

import it.prova.model.Rubrica;

public class TestRubrica {

	public static void main(String[] args) {

		Set<Rubrica> rubricaSet = new HashSet<Rubrica>();

		// AGGIUNTA CONTATTI TELEFONICI E STAMPA//

		Rubrica nuovoContatto1 = new Rubrica("Vincenzo", "Pipitone", 123456789);
		Rubrica nuovoContatto2 = new Rubrica("Mario", "Rossi", 338777123);
		Rubrica nuovoContatto3 = new Rubrica("Andrea", "Dipre", 511643211);
		Rubrica nuovoContatto4 = new Rubrica("Giovanni", "Rana", 813456789);

		rubricaSet.add(nuovoContatto1);
		rubricaSet.add(nuovoContatto2);
		rubricaSet.add(nuovoContatto3);
		rubricaSet.add(nuovoContatto4);
		rubricaSet.add(nuovoContatto1); //Provo ad aggiungere elemento duplicato//

		for (Rubrica insiemeRubrica : rubricaSet) {
			System.out.println("Contatti Rubrica: " + "\nNome: " + insiemeRubrica.getNome() + "\nCognome: "
					+ insiemeRubrica.getCognome() + "\nNumero Telefonico:  " + insiemeRubrica.getNumero()
					+ "\n--------");
		}

		rubricaSet.remove(nuovoContatto4); // Rimuove il contatto numero 4
		System.out.println(rubricaSet.size()); // Dimensioni della Lista

	}

}
