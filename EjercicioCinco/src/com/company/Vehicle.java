package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que captura 10 vehículos para ferry
 * @author Angela Julieth Ossa Cuellar
 */

public class Vehicle {
    /**
     * Definición de atributos
     *
     */
    private String numberOfPassengers;
    public String crew;
    private String registrationDate;
    private String displacementMedium;
    private String type;

    public String getType() {
        return type;
    }

    /**
     * Constructor para clase Vehicle
     * @param listNumPassengers número de pasajeros
     * @param ynCrew define tripulación
     * @param regDate Fecha de registro
     * @param displacementMed Medio de desplazamiento
     */

    public Vehicle(String listNumPassengers, String ynCrew, String regDate, String displacementMed, String type) {
        this.numberOfPassengers = listNumPassengers;
        this.crew = ynCrew;
        this.registrationDate = regDate;
        this.displacementMedium = displacementMed;
        this.type = type;
    }
    public Vehicle(String listNumPassengers, String ynCrew, String regDate, String displacementMed) {
        this.numberOfPassengers = listNumPassengers;
        this.crew = ynCrew;
        this.registrationDate = regDate;
        this.displacementMedium = displacementMed;
        this.type = "Vehicle";
    }
    /**
     * Método para crear el vehículo con sus atributos
     */
    public static Vehicle createVehiculo() {
        try {

                System.out.println("we are entering your vehicle");
                System.out.println("\n---------------------------------------------------------");
                System.out.println("please, entering number passenger the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner listNumPassengers = new Scanner(System.in);
                String numPassengersStr = listNumPassengers.nextLine();
                System.out.println("---------------------------------------------------------");
                System.out.println("Is the vehicle manned? write yes/no");
                System.out.println("-------------------------------------------------------------");
                Scanner ynCrew = new Scanner(System.in);
                String newCrewStr = ynCrew.nextLine();
                System.out.println("---------------------------------------------------------");
                System.out.println("---------------------------------------------------------");
                System.out.println("please, entering registration date the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner registrationDate = new Scanner(System.in);
                String newRegDate = registrationDate.nextLine();
                System.out.println("---------------------------------------------------------");
                System.out.println("please, entering displacement Medium the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner displacementMedium = new Scanner(System.in);
                String newDisplacementMedium = displacementMedium.nextLine();

                Vehicle newVehiculoP = new Vehicle(numPassengersStr, newCrewStr, newRegDate, newDisplacementMedium);
                return newVehiculoP;


        } catch (Exception e) {
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }
        return null;
    }

    /**
     * Método que muestra los vehículos creados
     */
    public void  seeVehiculo() {
        try {
            System.out.println("-----------------------------------------------------");

                System.out.println("Number of passenger: "+this.getNumberOfPassengers() +
                        "\nCrew: " + this.getCrew() +
                        "\nRegistration Date: " + this.getRegistrationDate() +
                        "\nDisplacement medium: " + this.getDisplacementMedium() +
                        "\nType: " + this.getType()
                        + "\n_______________________________________________________"
                );


            System.out.println("-----------------------------------------------------");

        } catch (Exception e) {
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }
    }

    /**
     * Generación de getters
     *
     */

    public String getNumberOfPassengers() {
        return numberOfPassengers;
    }


    public String getCrew() {
        return crew;
    }


    public String getRegistrationDate() {
        return registrationDate;
    }


    public String getDisplacementMedium() {
        return displacementMedium;
    }


}

