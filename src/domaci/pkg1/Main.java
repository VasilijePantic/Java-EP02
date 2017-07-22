/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaci.pkg1;

import java.util.Scanner;

/**
 *
 * @author Vasilije Pantic
 */
public class Main {

    public static void main(String[] args) {

        Scanner skener = new Scanner(System.in);
//zaposleni 1
        Zaposleni z1 = new Zaposleni();

        System.out.println("Unesite Vas id: ");
        int id1 = skener.nextInt();
        z1.setId(id1);

        System.out.println("Unesite Vase ime: ");
        String ime1 = skener.next();
        z1.setIme(ime1);

        System.out.println("Unesite Vase prezime: ");
        String prezime1 = skener.next();
        z1.setPrezime(prezime1);

        System.out.println("Unesite Vasu platu: ");
        double plata1 = skener.nextDouble();
        z1.setPlata(plata1);

        System.out.println("Unesite Vas pol: ");
        String pol1 = skener.next();
        z1.setPol(pol1);
        System.out.println("id: " + z1.getId() + " ime: " + z1.getIme() + " prezime: " + z1.getPrezime() + " plata: " + z1.getPlata() + " pol: " + z1.getPol());

//zaposleni 2
        Zaposleni z2 = new Zaposleni();

        System.out.println("Unesite Vas id: ");
        int id2 = skener.nextInt();
        z2.setId(id2);

        System.out.println("Unesite Vase ime: ");
        String ime2 = skener.next();
        z2.setIme(ime2);

        System.out.println("Unesite Vase prezime: ");
        String prezime2 = skener.next();
        z2.setPrezime(prezime2);

        System.out.println("Unesite Vasu platu: ");
        double plata2 = skener.nextDouble();
        z2.setPlata(plata2);

        System.out.println("Unesite Vas pol: ");
        String pol2 = skener.next();
        z2.setPol(pol2);

        System.out.println("id: " + z2.getId() + " ime: " + z2.getIme() + " prezime: " + z2.getPrezime() + " plata: " + z2.getPlata() + " pol: " + z2.getPol());

//zaposleni 3
        Zaposleni z3 = new Zaposleni();

        System.out.println("Unesite Vas id: ");
        int id3 = skener.nextInt();
        z3.setId(id3);

        System.out.println("Unesite Vase ime: ");
        String ime3 = skener.next();
        z3.setIme(ime3);

        System.out.println("Unesite Vase prezime: ");
        String prezime3 = skener.next();
        z3.setPrezime(prezime3);

        System.out.println("Unesite Vasu platu: ");
        double plata3 = skener.nextDouble();
        z3.setPlata(plata3);

        System.out.println("Unesite Vas pol: ");
        String pol3 = skener.next();
        z3.setPol(pol3);

        System.out.println("id: " + z3.getId() + " ime: " + z3.getIme() + " prezime: " + z3.getPrezime() + " plata: " + z3.getPlata() + " pol: " + z3.getPol());

        //zbir plata zaposlenih
        
        double zbirPlata = z1.getPlata() + z2.getPlata() + z3.getPlata();
        System.out.println("Zbir svih plata je: " + zbirPlata);
        
    }

}
