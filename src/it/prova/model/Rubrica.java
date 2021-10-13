package it.prova.model;

public class Rubrica {

	private String nome;
	private String cognome;
	private int numero;

	public Rubrica() {
		super();
	}

	public Rubrica(String nome, String cognome, int numero) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
