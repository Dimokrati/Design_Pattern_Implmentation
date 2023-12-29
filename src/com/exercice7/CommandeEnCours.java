package com.exercice7;

public class CommandeEnCours extends EtatCommande
{
    public CommandeEnCours(Commande commande)
    {
        super(commande);
    }
    public void ajouteProduit(Produit produit)
    {
        commande.getProduits().add(produit);
    }
    public void efface()
    {
        commande.getProduits().clear();
    }
    public void retireProduit(Produit produit)
    {
        commande.getProduits().remove(produit);
    }
    public EtatCommande etatSuivant()
    {
        return new CommandeValidee(commande);
    }
}
