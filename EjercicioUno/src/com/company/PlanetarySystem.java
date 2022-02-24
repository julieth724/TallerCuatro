package com.company;

import java.util.UUID;

/**
 * Clase abstracta de sistema planetario
 * @author Angela Julieth Ossa Cuellar
 */

public abstract class PlanetarySystem {
    public static UUID id = UUID.randomUUID();
    public String nameObjet;
    public double mass;
    public double density;
    public double diameter;
    public double DistanceSun;


    public PlanetarySystem(String nameObjet, double mass, double density, double diameter, double distanceSun) {
        this.nameObjet = nameObjet;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
    }

    public String getNameObjet() {
        return nameObjet;
    }

    public abstract void create();
    public abstract void seeObjetPlanetary();

    public static UUID getId() {
        return id;
    }

    public double getMass() {
        return mass;
    }

    public double getDensity() {
        return density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setNameObjet(String nameObjet) {
        this.nameObjet = nameObjet;
    }

    public double getDistanceSun() {
        return DistanceSun;
    }

    public void setDistanceSun(double distanceSun) {
        DistanceSun = distanceSun;
    }
}
