package com.company;

import java.util.Scanner;

/**
 * Clase que captura los planetas
 * @author Angela Julieth Ossa Cuellar
 */

public class Planet extends PlanetarySystem {

    String TYPE = "PLANET";

    public Planet(String nameObjet, double mass, double density, double diameter, double distanceSun) {
        super(nameObjet, mass, density, diameter, distanceSun);
    }

    @Override
    public void create() {
        try {
            System.out.println("we are entering your Planet");
            System.out.println("\n---------------------------------------------------------");
            System.out.println("please, entering the name the your planet");
            System.out.println("-------------------------------------------------------------");
            Scanner nameObjet = new Scanner(System.in);
            String newNameObjet = nameObjet.nextLine();
            System.out.println("\n---------------------------------------------------------");
            System.out.println("please, entering the mass the your planet");
            System.out.println("-------------------------------------------------------------");
            Scanner mass = new Scanner(System.in);
            Double newMass = mass.nextDouble();
            System.out.println("\n---------------------------------------------------------");
            System.out.println("please, entering the density the your planet");
            System.out.println("-------------------------------------------------------------");
            Scanner density = new Scanner(System.in);
            Double newDensity = density.nextDouble();
            System.out.println("\n---------------------------------------------------------");
            System.out.println("please, entering the diameter the your planet");
            System.out.println("-------------------------------------------------------------");
            Scanner diameter = new Scanner(System.in);
            Double newDiameter = diameter.nextDouble();
            System.out.println("\n---------------------------------------------------------");
            System.out.println("please, entering the Distance to the sun the your planet");
            System.out.println("-------------------------------------------------------------");
            Scanner distanceSun = new Scanner(System.in);
            Double newDistanceSun = distanceSun.nextDouble();
            this.nameObjet = newNameObjet;
            this.mass = newMass;
            this.density = newDensity;
            this.diameter = newDiameter;
            this.DistanceSun = newDistanceSun;
            this.TYPE = "Planet";
        }catch (Exception e){
            System.out.println("You can only enter numbers");
            create();
        }

    }

    @Override
    public void seeObjetPlanetary() {

        try {
            System.out.println("-----------------------------------------------------");

            System.out.println("the Name is: " + this.getNameObjet() +
                    "\nthe Mass is: " + this.getMass() +
                    "\nthe Density is: " + this.getDensity() +
                    "\nthe Diameter is: " + this.getDiameter() +
                    "\nThe Distance to the sun is: " + this.getDistanceSun()+
                    "\nThe Distance to the sun is: " + this.getTYPE() +
                    "\n_______________________________________________________"
            );

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }

    }

    public String getTYPE() {
        return TYPE;
    }

}