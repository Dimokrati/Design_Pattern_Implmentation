package com.exercice4;

class Journalisation {
    private static Journalisation instance;
    private StringBuilder logMessages;

    private Journalisation() {
        logMessages = new StringBuilder();
    }

    public static Journalisation getInstance() {
        if (instance == null) {
            instance = new Journalisation();
        }
        return instance;
    }

    public void ajouterLog(String message) {
        logMessages.append(message).append("\n");
    }

    public String getLog() {
        return logMessages.toString();
    }
}

class CompteBancaire {
    private int numero;
    private double solde;

    public CompteBancaire(int numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public void deposerArgent(double montant) {
        solde += montant;
        Journalisation.getInstance().ajouterLog("Dépôt sur le compte " + numero + ": " + montant + " DA");
    }

    public void retirerArgent(double montant) {
        if (montant <= solde) {
            solde -= montant;
            Journalisation.getInstance().ajouterLog("Retrait du compte " + numero + ": " + montant + " DA");
        } else {
            Journalisation.getInstance().ajouterLog("Retrait impossible du compte " + numero + ": solde insuffisant");
        }
    }

    public int getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }
}


public class Main {
    public static void main(String[] args) {
        CompteBancaire compte123 = new CompteBancaire(123, 0);
        CompteBancaire compte321 = new CompteBancaire(321, 0);

        compte123.deposerArgent(100);
        compte123.retirerArgent(80);

        compte321.deposerArgent(200);
        compte321.retirerArgent(110);

        System.out.println("Journalisation pour le compte 123 :\n" + Journalisation.getInstance().getLog());
        System.out.println("Journalisation pour le compte 321 :\n" + Journalisation.getInstance().getLog());
    }
}
