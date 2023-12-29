package com.exercice5;


public interface Noeud {
    void accept(VisiteurArbre visiteur);
}


class NoeudValeur implements Noeud {
    private int valeur;

    public NoeudValeur(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    @Override
    public void accept(VisiteurArbre visiteur) {
        visiteur.visiter(this);
    }
}


class NoeudPlus implements Noeud {
    private Noeud gauche;
    private Noeud droit;

    public NoeudPlus(Noeud gauche, Noeud droit) {
        this.gauche = gauche;
        this.droit = droit;
    }

    public Noeud getGauche() {
        return gauche;
    }

    public Noeud getDroit() {
        return droit;
    }

    @Override
    public void accept(VisiteurArbre visiteur) {
        visiteur.visiter(this);
    }
}


class NoeudMoins implements Noeud {
    private Noeud gauche;
    private Noeud droit;

    public NoeudMoins(Noeud gauche, Noeud droit) {
        this.gauche = gauche;
        this.droit = droit;
    }

    public Noeud getGauche() {
        return gauche;
    }

    public Noeud getDroit() {
        return droit;
    }

    @Override
    public void accept(VisiteurArbre visiteur) {
        visiteur.visiter(this);
    }
}

