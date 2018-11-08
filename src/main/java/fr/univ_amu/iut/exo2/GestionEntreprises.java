package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;
import fr.univ_amu.iut.exo1.Entreprise;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {

        Employe e1 = new Employe(1,"sz1232", "Bert","Erwan"
                ,0, LocalDate.of(1998,11,23),LocalDate.of(1999,9,9),
                40,40);
        Commerciaux e2 = new Commerciaux(2,"zjoarjao","Poujol","Theo",78,
                LocalDate.of(1999,11,23),LocalDate.of(1999,9,9),
                45,35,400,20);
        Vendeur axel= new Vendeur(3,"fzereaz","Ribes", "Axel", 6,
                LocalDate.of(2000,01,13),LocalDate.of(1999,9,9),
                50,24,320,13);
        Représentant nathan = new Représentant(4,"fpzeze","Vignal","Nathan", 5,
                LocalDate.of(1999,9,9), LocalDate.of(1999,9,10),
                42,32, 700,2 );
        Techniciens Ben = new Techniciens(5,"fzkoepf", "Benesti","Benjamin", 8,
                LocalDate.of(1999,9,9), LocalDate.of(1999,9,10),
                80, 24,40,50.21);
        ArrayList<Employe> listeEmployes=new ArrayList<Employe>();
        listeEmployes.add(e1);
        listeEmployes.add(e2);
        listeEmployes.add(axel);
        listeEmployes.add(nathan);
        listeEmployes.add(Ben);
        Entreprise maBoiteInfo= new Entreprise(listeEmployes,"maBoiteInfo");
        Entreprise.ToString(maBoiteInfo);
    }
}