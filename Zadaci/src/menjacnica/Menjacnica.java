package menjacnica;

public class Menjacnica {

//double-0.0 ; int-0 ; char ; boolean-false ; String-null.... + pocetne vrednosti
	double prodajniKurs;  // za koliko prodajes valutu
	double kupovniKurs;  //za koliklo je kupujes
	double srednjiKurs; //srednji kurs valute u menjacnic
	//String valuta;     //naziv valute
	Valuta valuta; //enum
	
	//postaviProdajniKurs metoda unosi neku vrdnost 
	
	
	
	
	//KONSTRUKTOR
	
	
	Menjacnica( Valuta valuta, double prodajniKurs, double kupovniKurs){
		postaviProdajniKurs(prodajniKurs);
		postaviKupovniKurs(kupovniKurs);
		postaviValutu(valuta);
		izracunajSrednjiKurs();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	void postaviProdajniKurs(double pk) {
		if(pk>0) {
			prodajniKurs=pk;
		}else {
			System.out.println("Prodajni kurs mora biti veci od nule");
			
		}
	}
	
	//postavi kupovni kurs
	void postaviKupovniKurs(double kk) { // moze i ovde kod svih ulaznih parametara da pises i 
		//kupovniKurs svj je
		if(kk>0) {
			//PAZI!!!!!
			//kupovniKurs=kupovniKurs; 
			// na konzoli bi bilo za kupovniKurs vrednost 0.0 
			//zasto?
			// zato sto java pise:
			//unosimo parametar
			//if(atribut>0)
			//parametar = atribut;
			//kako resiti?
			//this.kupovniKurs=kupovniKurs; na mesto atributa unesi vrednost parametra
			kupovniKurs=kk;
		}else {
			System.out.println("Kupovni  kurs mora biti veci od nule");
			
		}
	}
	
	
	
	//window-->outline( u show view)
	//window-->package explorer ( u show view)
	
	void postaviValutu (Valuta v) {
		if(v!=null)
			valuta=v;
		else
			System.out.println(" Valuta ne sme biti null!");
	}
	
	
	
    //metoda koja racuna srednji kurs
    //PAZIIII!!!
	//deljenje: 5.0/2.0=2.5; 5/2=2(ceo int)-celobrojno deljenje bez ostatka
	//deljenje: procenat necega-od 25 djaka je 30 d0bilo petice: 25/30.0*100 ili 25.0/30*100-bar jedan od operanada mora biti realan broj
	void izracunajSrednjiKurs() {  // OPERATORI: + - * /; %-ost. pri deljenju; i=i*3==i*=3..; ++, --;
		if(prodajniKurs>0 && kupovniKurs>0)
			srednjiKurs = (prodajniKurs + kupovniKurs)/2;
		else
			
			System.out.println("Oba kursa moraju biti veca od nule");
			
	}
	//PAZI!!!
	// nema ulaznih parametara i ne vraca nista, JER SU SVE 3 PROENLJIVE PREDSTAVLJENE PREKO ATRIBUTA!!!
	
	
	
	
	
	double zameniZaDinare(double iznos) {  // float 12.3F mora, pa zbog tog koristimo double
		return iznos*kupovniKurs;         //PROCITAJ PRAKTIKUM!!!
	}
	
	
	
	//metoda koja menja nasu valutu za stranu 
	double zameniZaStranuValutu(double iznos) {
		return iznos*prodajniKurs;
	}
	
	
	void ispisi() {
		System.out.println("Valuta: "+valuta);
		System.out.println("Kupovni kurs: " + kupovniKurs);
		System.out.println("ProdajniKurs: " +prodajniKurs);
		System.out.println("Srednji kurs: " +srednjiKurs);
		}
	
	
	
	
	
	
	
}
