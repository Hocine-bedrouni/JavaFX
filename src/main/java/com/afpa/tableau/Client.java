package com.afpa.tableau;

public class Client {

    private String nom;
    private String prenom;
    private String ville;


    /**
     * constructeur par défaut
     */
    public Client(){}


    /**
     * Constructeur avec paramètre
     *
     */
    public Client (String n, String p, String v){
        this.nom = n;
        this.prenom = p;
        this.ville = v;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getVille() {
        return ville;
    }
}
