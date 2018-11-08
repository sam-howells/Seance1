package fr.univ_amu.iut.exo1;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEntreprises {

    public static void main(String[] args) {
        Employe e1 = new Employe(1,"sz1232", "Bert","Erwan"
                ,0, LocalDate.of(1998,11,23),LocalDate.of(1999,9,9),
                40,40);
        Employe e2 = new Employe(2,"zjoarjao","Poujol","Theo",78,
                LocalDate.of(1999,11,23),LocalDate.of(1999,9,9),
                45,35);
        ArrayList<Employe>listeEmployes=new ArrayList<Employe>();
        listeEmployes.add(e1);
        listeEmployes.add(e2);
        Entreprise maBoiteInfo= new Entreprise(listeEmployes,"maBoiteInfo");
        Entreprise.ToString(maBoiteInfo);


    }
}