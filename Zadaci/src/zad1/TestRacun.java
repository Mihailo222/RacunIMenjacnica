package zad1;

public class TestRacun {
public static void main(String[] args) {
	Racun racun =new Racun();
	
	
	
	
	
	
	racun.nacinPlacanja=NacinPlacanja.KARTICA;
	
	
	racun.nazivArtikla1 ="Ice moka karamela";
	racun.kolicina1 = 2;
	racun.jedinicnaCena1=335.0;
	
	
	racun.nazivArtikla2 ="Topla moka velika";
	racun.kolicina2 = 3;
	racun.jedinicnaCena2=375.0;
	
	
	
	racun.nazivArtikla3 ="Kapucino";
	racun.kolicina3 = 1;
	racun.jedinicnaCena3=250.0;
	
	
	
	/*
	
	System.out.println("Broj racuna je" + racun.brojRacuna);
	System.out.println("Artikal1: "+ racun.nazivArtikla1   + "  " + racun.kolicina1 + "  "+ racun.jedinicnaCena1);
	System.out.println("Artikal2: "+ racun.nazivArtikla2   + "  " + racun.kolicina2 + "  "+ racun.jedinicnaCena2);
	System.out.println("Artikal3: "+ racun.nazivArtikla3   + "  " + racun.kolicina3 + "  "+ racun.jedinicnaCena3);
	System.out.println("                           ");
	System.out.println("Nacin placanja:"  +  racun.nacinPlacanja);
	System.out.println("Ukupan iznos: " + racun.izracunajIznos());
	System.out.println("Kusur: " + racun.izracunajKusur(5000));
	if(racun.izracunajIznos()>3000) {
		System.out.println("Ostvarili ste besplatnu dostavu!");
		
	} else {
		System.out.println("Vasa dostava se naplacuj!");
	}
	
	
	*/
	
	Racun.prikaziRacun(racun);
	System.out.println("--------------------------------");
	Racun racun2 = Racun.kreirajRacun("ice moka", 335.0, 1, "topla moka", 375.0, 2, "voda rosa", 120.0, 5);
	Racun.prikaziRacun(racun2);
	
	
	
	
	
		
}
}
