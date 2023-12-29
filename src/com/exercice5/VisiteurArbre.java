package com.exercice5;


public interface VisiteurArbre {
    void visiter(NoeudValeur noeudValeur);
    void visiter(NoeudPlus noeudPlus);
    void visiter(NoeudMoins noeudMoins);
}

