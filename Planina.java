package planinarenje;

import java.util.ArrayList;

public class Planina {
	/*
	 * Planina ima ime i visinu (u metrima) koji mogu da se dohvate. Moze da se
	 * sastavi tekstualni opis planine u obliku ime(visina). Takodje planina sadrizi
	 * listu planinara. Moze da se dohvati planinar na nekoj odredjenoj poziciji u
	 * listi, moguce je da se doda/ukloni planinar. Takodje moguce je ispisati sve
	 * planinare na planini u obliku [ime-ident,ime-ident,ime-ident...]
	 * 
	 */

	private String ime;
	private double visina;
	private ArrayList<Planinar> planinari;

	public Planina(String ime, double visina) {
		this.ime = ime;
		this.visina = visina;
		planinari = new ArrayList<>();
	}

	public String getIme() {
		return ime;
	}

	public double getVisina() {
		return visina;
	}

	public void dodajPlaninara(Planinar p) {
		planinari.add(p);
	}

	public void ukloniPlaninara(Planinar p) {
		planinari.remove(p);
	}

	public int getBrPlaninara() {
		return planinari.size();
	}

	public void ispisiPlaninare() {
		System.out.print("[ ");

//		for (int i=0; i<planinari.size(); i++) {
//			Planinar p = planinari.get(i);
//			System.out.println(p);
//		}

		for (Planinar p : planinari) {
			System.out.print(p + " ");
		}

		System.out.print("]");
	}

	@Override
	public String toString() {
		return ime + " (" + visina + ")";
	}
}
