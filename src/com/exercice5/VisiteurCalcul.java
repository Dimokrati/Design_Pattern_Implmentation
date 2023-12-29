package com.exercice5;


public class VisiteurCalcul implements VisiteurArbre {
    private int resultat;

    @Override
    public void visiter(NoeudValeur noeudValeur) {
        resultat = noeudValeur.getValeur();
    }

    @Override
    public void visiter(NoeudPlus noeudPlus) {
        noeudPlus.getGauche().accept(this);
        int gauche = resultat;
        noeudPlus.getDroit().accept(this);
        int droit = resultat;
        resultat = gauche + droit;
    }

    @Override
    public void visiter(NoeudMoins noeudMoins) {
        noeudMoins.getGauche().accept(this);
        int gauche = resultat;
        noeudMoins.getDroit().accept(this);
        int droit = resultat;
        resultat = gauche - droit;
    }


    public int getResultat() {
        return resultat;
    }
}

