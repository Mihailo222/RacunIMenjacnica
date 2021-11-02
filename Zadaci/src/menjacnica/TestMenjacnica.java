package menjacnica;

public class TestMenjacnica {
	
public static void main(String[] args) {
	  // Menjacnica m = new Menjacnica();
	//KADA SMO NAPRAVILI KONSTRUKTOR MENJACNICA, SADA SE POZIVI VRSE PREKO KONSTRUKTORA!!
	//OVO BEZ ZAGRADA SADA VISE NE VAZI, JER KONSTRUKTOR PROSLEDJUJE PARAMETRE!!
	//OVO JE PRAVLJENJE OBJEKATA PREKO PARAMETARA!!
	Menjacnica m = new Menjacnica(Valuta.EUR, 118.5, 117.0); //poziv enuma
	
     //KAD IMAMO KONSTRUKTOR, ONDA NAM OVO VISE I NE TREBA, JER KLONSTRUKTOR TO ODRADI
	//ZA SVE OBJEKTE NAPRAVLJENE POMOCU ISTOG!!!!!
	/*
	//m.kupovniKurs=
	m.postaviKupovniKurs(117.0);
	m.postaviProdajniKurs(118.5);
	m.izracunajSrednjiKurs();// moras ovde prvo da izracunas da ti ne bi pisalo 0.0!!
	m.postaviValutu("EUR");
	*/
	//konstruktor odradjuje sav zakomentarisan posao
	m.ispisi();
	
	
	double dinari = m.zameniZaDinare(100);
	System.out.println("Za 100 dinara se dobija" + dinari + "dinara");
	
	double euri = m.zameniZaStranuValutu(100);
	System.out.println("Za 100e se dobija " + euri + "eura");
	/* MOZE I OVAKO:
	 double iznos=100;
	 double dinari=m.zameniZaDinare(iznos);
	 S.o.pln("Za" + iznos + "EUR se dobija " + dinari + "dinara");
	  */
	
}

//zadatak ispisi 5 puta zdravo-for petlja
/*
 * static void ispisiPoruku(String poruka){
 * for( int i=0; i<=10; i++){
 * System.out.println(poruka);*/

//zadatak
// sa i<=0 se zove NEIZVRSIVA PETLJA


//ZADATAK ispisi brojeve od 1 do 20 sa uslovima-varijacije
/*
 * for(int i=1; i<=20; i++){
 * System.out.println(i);
 * if(i==19) break;   // prekini petlju kad stigne do 18
 * }
 * System.out.println("STOP");*/


//zadatak

/* for(int i=1; i<=20; i++){
* System.out.println(i);
* if(i==19) continue;   // preskoci uslov!!!
* }
* System.out.println("STOP");*/












}
