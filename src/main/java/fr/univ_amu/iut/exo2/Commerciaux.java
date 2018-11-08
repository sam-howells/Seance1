package fr.univ_amu.iut.exo2;

import fr.univ_amu.iut.exo1.Employe;

import java.time.LocalDate;

public class Commerciaux extends Employe {
    protected int chiffreAffaire;
    protected int tauxCommission;
    public Commerciaux(int numE, String secuSociale, String nomE, String prenomE, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, int base, int nbHeures,
                       int chiffreAffaire,int tauxCommission) {
        super(numE, secuSociale, nomE, prenomE, echelon, dateNaissance, dateEmbauche, base, nbHeures);
        this.chiffreAffaire=chiffreAffaire;
        this.tauxCommission=tauxCommission;
    }
    public void negocierTransaction(){
        System.out.println("Je négocie une transaction");
    }
    public double salaireB(){
        return (getBase()+chiffreAffaire*tauxCommission)+100;
    }
}
