package fr.univ_amu.iut.exo1;

import java.time.LocalDate;

public class Employe {
    private int numE;
    private String secuSociale;
    private String nomE;
    private String prenomE;
    private int echelon;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private int base;
    private int nbHeures;

    public Employe(int numE, String secuSociale, String nomE, String prenomE, int echelon, LocalDate dateNaissance, LocalDate dateEmbauche, int base, int nbHeures) {
        this.numE = numE;
        this.secuSociale = secuSociale;
        this.nomE = nomE;
        this.prenomE = prenomE;
        this.echelon = echelon;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.base=base;
        this.nbHeures=nbHeures;
    }

    public static void ToString(Employe e){
        System.out.println("Employe numéro "+ e.numE +" : "+ e.prenomE + e.nomE +", numéro sécurité sociale : "+ e.secuSociale + " echelon : " + e.echelon
               +" Date de naissance : " + e.dateNaissance +" Date d'embauche : " + e.dateEmbauche + " salaire brut : " + e.salaireB());

    }

    public double salaireB() {
        return base*nbHeures+100;
    }


    public double getSalaireN() {
        return (salaireB()*80)*100;
    }


    public int getNumE() {
        return numE;
    }


    public String getSecuSociale() {
        return secuSociale;
    }


    public String getNom() {
        return nomE;
    }

    public String getPrenom() {
        return prenomE;
    }

    public int getEchelon() {
        return echelon;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public String getNomE() {
        return nomE;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public int getBase() {
        return base;
    }

    public int getNbHeures() {
        return nbHeures;
    }
}
