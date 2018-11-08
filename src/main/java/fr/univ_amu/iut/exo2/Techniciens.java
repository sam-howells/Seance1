package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Techniciens extends Employe {
    protected int nbUnitesProduites;
    protected double tauxCommissionUnite;
    public Techniciens(int numE, String secuSociale, String nomE, String prenomE, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche,
                       int base, int nbHeures, int nbUnitesProduites,double tauxCommissionUnite) {
        super(numE, secuSociale, nomE, prenomE, echelon, dateNaissance, dateEmbauche, base, nbHeures);
        this.nbUnitesProduites=nbUnitesProduites;
        this.tauxCommissionUnite=tauxCommissionUnite;

    }
    public void fabriquerProduit(){
        System.out.println("Je fabrique un produit");
    }
    public double salaireB(){
        return super.salaireB() + nbUnitesProduites * tauxCommissionUnite;
    }

    public int getNbUnitesProduites() {
        return nbUnitesProduites;
    }

    public double getTauxCommissionUnite() {
        return tauxCommissionUnite;
    }
}
