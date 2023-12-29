package com.exercice8;

import java.util.*;
public class DessinUnVehiculeLigne implements
        DessinCatalogue
{
    public void dessine(List<VueVehicule> contenu)
    {
        System.out.println(
                "Dessine les véhicules avec un véhicule par ligne");
        for (VueVehicule vueVehicule: contenu)
        {
            vueVehicule.dessine();
            System.out.println();
        }
        System.out.println();
    }
}