package planinarenje;

public class GP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planinar p1=new KlasicniPlaninar("Mirko", "Alvirovic");
		Planina planina= new Planina("Avala", 511);
		Alpinista a1=new Alpinista("Zoran", "Sumadinac");
		Alpinista a2= new Alpinista("Zlatko","Zlatkovic");
		a1.setPartner(a2);
		System.out.println(a2.getPartner());
		planina.dodajPlaninara(p1);
		planina.ispisiPlaninare();
		System.out.println(planina);
		System.out.println(p1);


	}

}
