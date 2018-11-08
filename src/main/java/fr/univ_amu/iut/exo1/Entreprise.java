package fr.univ_amu.iut.exo1;

import java.util.ArrayList;

public class Entreprise {
    private static ArrayList<Employe> listeEmployes;
    private String nomEntreprise;

    public ArrayList<Employe> getListeEmployes() {
        return listeEmployes;
    }

    public Entreprise(ArrayList<Employe> listeEmployes, String nomEntreprise) {
        this.listeEmployes = listeEmployes;
        this.nomEntreprise = nomEntreprise;
    }

    public static void ToString(Entreprise e){
        System.out.println("Entreprise "+e.nomEntreprise+" a pour employés : ");
        for(Employe emp : listeEmployes){
            emp.toString();
        }
    }
    public void addListeEmployes(Employe e ) {
        listeEmployes.add(e);
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }
}
