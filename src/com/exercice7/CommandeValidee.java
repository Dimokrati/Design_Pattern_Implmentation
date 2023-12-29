package com.exercice7;

public class CommandeValidee extends EtatCommande
{
    public CommandeValidee(Commande commande)
    {
        super(commande);
    }
    public void ajouteProduit(Produit produit){}
    public void efface()
    {
        commande.getProduits().clear();
    }
    public void retireProduit(Produit produit){}
    public EtatCommande etatSuivant()
    {
        return new CommandeLivree(commande);
    }
}
