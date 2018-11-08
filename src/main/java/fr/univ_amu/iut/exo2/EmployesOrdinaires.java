package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class EmployesOrdinaires extends Employe {
    public EmployesOrdinaires(int numE, String secuSociale, String nomE, String prenomE, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, int base, int nbHeures) {
        super(numE, secuSociale, nomE, prenomE, echelon, dateNaissance, dateEmbauche, base, nbHeures);
    }

    public void effectuerTacheOrdinaire(){
        System.out.println("J'effectue une tâche ordinaire");
    }
    public double salaireB(){
        return super.salaireB()+this.getEchelon()*100;
    }
}
