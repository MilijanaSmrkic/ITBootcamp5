package planinarenje;

public class Alpinista extends Planinar {
	/*
	 * Alpinista je planinar kome moze da se dodeli drugi Alpinista kao partner i
	 * koji se penje po planinama visim od 3000m. Partner moze da se dohvati i
	 * postavi. Nije moguce postaviti partnera ukoliko partner vec ima dodeljenog
	 * partnera. Ukoliko alpinista nema dodeljenog partnera ili je planina manja od
	 * 3000m, penjanje je neuspesno. Tekstualni opis je A_ime-ident.
	 */
	private Alpinista partner;

	public Alpinista(String ime, String prezime) {
		super(ime, prezime);

	}

	public boolean penjise(int visina) {
		return visina >= 3000 && partner != null;
	}

	public Alpinista getPartner() {
		return partner;
	}

	public void setPartner(Alpinista buduciPartner) {
		if (this.partner == null && buduciPartner.partner == null) {
			this.partner = buduciPartner;
			buduciPartner.partner = this;
		}
	}

	public void ukloniPartnera() {
		if (partner != null) {
			partner.partner = null;
			partner = null;
		}

	}
}
