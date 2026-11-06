package no.hvl.dat100.oppgave3;

// a)

import no.hvl.dat100.oppgave1.Innlegg;
import no.hvl.dat100.common.TODO;

public class Blogg {

	private Innlegg[] innleggstabell;
	private int nesteledig;

	// b)

	public Blogg() {
		this(20);
	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	// c)

	public int getAntall() {
		return nesteledig;
	}

	// d)
	
	public Innlegg[] getSamling() {
		return innleggstabell;
	}

	// e)
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggstabell[i].erLik(innlegg)) {
				return i;
			}
		}

		return -1;
	}

	// f)

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	// g)

	public boolean ledigPlass() {
		return nesteledig < innleggstabell.length;
	}

	// h)
	
	public boolean leggTil(Innlegg innlegg) {
		if (innlegg == null || finnes(innlegg) || !ledigPlass()) {
			return false;
		}

		innleggstabell[nesteledig] = innlegg;
		nesteledig++;

		return true;
	}

	// i)
	@Override
	public String toString() {
		String resultat = nesteledig + "\n";

		for (int i = 0; i < nesteledig; i++) {
			resultat += innleggstabell[i].toString();
		}

		return resultat;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}
