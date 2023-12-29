package com.exercice7;

public class CommandeLivree extends EtatCommande
{
    public CommandeLivree(Commande commande)
    {
        super(commande);
    }
    public void ajouteProduit(Produit produit){}
    public void efface(){}
    public void retireProduit(Produit produit){}
    public EtatCommande etatSuivant()
    {
        return this;
    }
}
