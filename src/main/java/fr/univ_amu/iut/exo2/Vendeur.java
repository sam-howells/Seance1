package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Vendeur extends Commerciaux {


    public Vendeur(int numE, String secuSociale, String nomE, String prenomE, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, int base, int nbHeures, int chiffreAffaire, int tauxCommission) {
        super(numE, secuSociale, nomE, prenomE, echelon, dateNaissance, dateEmbauche, base, nbHeures, chiffreAffaire, tauxCommission);
    }
}
