package planinarenje;

public class KlasicniPlaninar extends Planinar {
	/*
	 * planinar je plainar koji se penje po planinama nizim od 2000m,inace je
	 * penjanje neuspesno.Tekstualni oblik K_ime-identitet
	 */
	private static int maxvisina = 2000;

	public KlasicniPlaninar(String ime, String prezime) {
		super(ime, prezime);
	}

	public boolean penjiSe(int visina) {
		boolean pentranje = true;
		if (visina > maxvisina) {
			pentranje = false;
		}
		return pentranje;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('K').append('_');
		sb.append(super.toString()); // dodaje ime-prezime iz klase Planinar
		return sb.toString();
	}

}
