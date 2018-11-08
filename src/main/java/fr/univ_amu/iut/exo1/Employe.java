package fr.univ_amu.iut.exo1;

import java.time.LocalDate;

public class Employe {
    private int numE;
    private String secuSociale;
    private String nomE;
    private String prenomE;
    private String echelon;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private double salaireB;
    private double salaireN;

    public Employe(int numE, String secuSociale, String nomE, String prenomE, String echelon, LocalDate dateNaissance, LocalDate dateEmbauche, int base, int nbHeures) {
        this.numE = numE;
        this.secuSociale = secuSociale;
        this.nomE = nomE;
        this.prenomE = prenomE;
        this.echelon = echelon;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.salaireB=base*nbHeures;
        this.salaireN=(salaireB*80)/100;
    }

    public static void ToString(Employe e){
        System.out.println("Employe numéro "+ e.numE +" : "+ e.prenomE + e.nomE +", numéro sécurité sociale : "+ e.secuSociale + "echelon : " + e.echelon
               +"Date de naissance : " + e.dateNaissance +" Date d'embauche : " + e.dateEmbauche);

    }

    public double getSalaireB() {
        return salaireB;
    }


    public double getSalaireN() {
        return salaireN;
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

    public String getEchelon() {
        return echelon;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

}
