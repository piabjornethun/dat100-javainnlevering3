package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	// a)

	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg() {
		
	}
	// b)

	public Innlegg(int id, String bruker, String dato) {
		this(id, bruker, dato, 0);

	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;

	}

	// c)
	
	public String getBruker() {
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	// d)

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes++;
	}

	// f)
	
	public boolean erLik(Innlegg innlegg) {
		return innlegg != null && this.id ==innlegg.getId();

	}

	// e)

	@Override
	public String toString() {
		return id + "\n"
				+ bruker +"\n"
				+ dato +"\n"
				+ likes +"\n";

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
