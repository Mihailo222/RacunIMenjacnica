package zad1;

public class Racun {
	
	
	String nazivArtikla1, nazivArtikla2, nazivArtikla3;
	int kolicina1, kolicina2, kolicina3;
	double jedinicnaCena1, jedinicnaCena2, jedinicnaCena3;
	
	int brojRacuna;
	
	NacinPlacanja nacinPlacanja;
	
	static int brojacRacuna = 0;
	

	
	
	//napravi konstruktor koji pravi objekte za koje vazi da se 
	//broj racuna automatki povecava za 1
      Racun() {
		brojacRacuna++;
		brojRacuna=brojacRacuna;
	
	}
      
      
      
      //metoda koja rauna iznos 
      
      double izracunajIznos() {
    	  double iznos=0;
    	  iznos=jedinicnaCena1*kolicina1+jedinicnaCena2*kolicina2+jedinicnaCena3*kolicina3;
    	  return iznos;  
      }
      
      
      //metoda koja racuna kusur
      
      double izracunajKusur(double uplacenIznos) {
    	  double kusur=uplacenIznos-izracunajIznos();
    	  return kusur;
      }
      
      //metodu koja racuna ukupan porez
      
      double izracunajPorez() {
    	  double porez=izracunajIznos()/1.2;
    	  return porez;
      }
      
      
      
      
      //izracunaj prosecnu cenu artikla
      
      double izracunajProsecnuCenu() {
    	  double prosecnaCena=(jedinicnaCena1+jedinicnaCena2+jedinicnaCena3)/3;
    	  return prosecnaCena;
      }
      
      
      
      //da li je isporuka besplatna
      
      boolean daLiJeIsporukaBesplatna() {
    	  if(izracunajIznos()>3000) {
    		  System.out.println("Porudzbina je besplatna!");
    		  return true;
    	  }else {
    		  System.out.println("POrudzbina nije besplatna");
    		  return false;
    	  }
      }
      
      
      
      //staticka metoda koja prikazuje racun
      
      static void prikaziRacun(Racun racun) {
    	  //mora Racun racun jer sve pritnln metode koriste objekat racun
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
    		
      }
      
      
      static Racun kreirajRacun(String naziv1, double cena1, int kolicina1, String naziv2, double cena2, int kolicina2, String naziv3, double cena3, int kolicina3) {
    	  Racun noviRacun = new  Racun();
    	  noviRacun.nacinPlacanja=NacinPlacanja.KARTICA;
    	  
    	  noviRacun.nazivArtikla1=naziv1;
    	  noviRacun.jedinicnaCena1=cena1;
    	  noviRacun.kolicina1=kolicina1;
    	  
    	  noviRacun.nazivArtikla2=naziv2;
    	  noviRacun.jedinicnaCena2=cena2;
    	  noviRacun.kolicina2=kolicina2;
    	  
    	  noviRacun.nazivArtikla3=naziv3;
    	  noviRacun.jedinicnaCena3=cena3;
    	  noviRacun.kolicina3=kolicina3;
    	  return noviRacun;
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
