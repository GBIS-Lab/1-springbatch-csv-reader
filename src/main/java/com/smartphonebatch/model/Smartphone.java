package com.smartphonebatch.model;

import lombok.Data;

@Data
public class Smartphone {
    private String marque;
    private String modele;
    //private String capacite;
    private String os;
    private int anneeSortie;
    private double tailleEcran;
    private double prix;
}
