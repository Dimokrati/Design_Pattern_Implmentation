package com.exercice7;

public class Produit
{
    protected String nom;
    public Produit(String nom)
    {
        this.nom = nom;
    }
    public void affiche()
    {
        System.out.println("Produit : " + nom);
    }
}
