package planinarenje;

public class Planinar {
	/*
	 * Planinar ima ime, prezime i jedinstveni celobrojni identifikacioni broj.
	 * Planinar moze da se penje po zadatoj planini. Penjanje moze biti uspesno ili
	 * neuspesno. Moze da se sastavi tekstualni opis planinara u obliku ime-ident.
	 */

	private String ime;
	private String prezime;
	private int id;
	private static int globalId = 0;

	public Planinar(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		this.id = globalId;
		globalId++;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		// return ime + "-" + idPlan;
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append("-").append(id);
		return sb.toString();
	}

}
