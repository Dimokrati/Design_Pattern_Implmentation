package com.exercice5;


public class VisiteurAffichage implements VisiteurArbre {
    @Override
    public void visiter(NoeudValeur noeudValeur) {
        System.out.print(noeudValeur.getValeur() + " ");
    }

    @Override
    public void visiter(NoeudPlus noeudPlus) {
        System.out.print("+ ");
        noeudPlus.getGauche().accept(this);
        noeudPlus.getDroit().accept(this);
    }

    @Override
    public void visiter(NoeudMoins noeudMoins) {
        System.out.print("- ");
        noeudMoins.getGauche().accept(this);
        noeudMoins.getDroit().accept(this);
    }

    public static void afficherArbre(Noeud racine) {
        VisiteurAffichage visiteur = new VisiteurAffichage();
        racine.accept(visiteur);
    }
}

