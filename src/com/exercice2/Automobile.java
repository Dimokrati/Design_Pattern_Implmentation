package com.exercice2;

abstract class Automobile {
    protected String modele;
    protected String couleur;
    protected int puissance;
    protected int espace;

    public Automobile(String modele, String couleur, int puissance, int espace) {
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
        this.espace = espace;
    }

    public abstract void afficherCaracteristiques();
}


class AutomobileElectricite extends Automobile {
    public AutomobileElectricite(String modele, String couleur, int puissance, int espace) {
        super(modele, couleur, puissance, espace);
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Automobile Électrique - Modèle: " + modele + ", Couleur: " + couleur +
                ", Puissance: " + puissance + " kW, Espace: " + espace + " litres");
    }
}

class AutomobileEssence extends Automobile {
    public AutomobileEssence(String modele, String couleur, int puissance, int espace) {
        super(modele, couleur, puissance, espace);
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Automobile Essence - Modèle: " + modele + ", Couleur: " + couleur +
                ", Puissance: " + puissance + " CV, Espace: " + espace + " litres");
    }
}


abstract class Scooter {
    protected String modele;
    protected String couleur;
    protected int puissance;

    public Scooter(String modele, String couleur, int puissance) {
        this.modele = modele;
        this.couleur = couleur;
        this.puissance = puissance;
    }

    public abstract void afficherCaracteristiques();
}


class ScooterElectricite extends Scooter {
    public ScooterElectricite(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Scooter Électrique - Modèle: " + modele + ", Couleur: " + couleur +
                ", Puissance: " + puissance + " kW");
    }
}

class ScooterEssence extends Scooter {
    public ScooterEssence(String modele, String couleur, int puissance) {
        super(modele, couleur, puissance);
    }

    @Override
    public void afficherCaracteristiques() {
        System.out.println("Scooter Essence - Modèle: " + modele + ", Couleur: " + couleur +
                ", Puissance: " + puissance + " CV");
    }
}


interface FabriqueVehicule {
    Automobile creerAutomobile(String modele, String couleur, int puissance, int espace);
    Scooter creerScooter(String modele, String couleur, int puissance);
}


class FabriqueVehiculeElectricite implements FabriqueVehicule {
    @Override
    public Automobile creerAutomobile(String modele, String couleur, int puissance, int espace) {
        return new AutomobileElectricite(modele, couleur, puissance, espace);
    }

    @Override
    public Scooter creerScooter(String modele, String couleur, int puissance) {
        return new ScooterElectricite(modele, couleur, puissance);
    }
}

class FabriqueVehiculeEssence implements FabriqueVehicule {
    @Override
    public Automobile creerAutomobile(String modele, String couleur, int puissance, int espace) {
        return new AutomobileEssence(modele, couleur, puissance, espace);
    }

    @Override
    public Scooter creerScooter(String modele, String couleur, int puissance) {
        return new ScooterEssence(modele, couleur, puissance);
    }
}
