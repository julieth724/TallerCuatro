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
    private String numWheels;
    private String registrationDate;
    private String displacementMedium;
    public static ArrayList<Vehicle> vehiculo = new ArrayList<>();

    /**
     * Constructor para clase Vehicle
     * @param listNumPassengers número de pasajeros
     * @param ynCrew define tripulacion
     * @param numWheels numero de Ruedas
     * @param regDate Fecha de registro
     * @param displacementMed Medio de desplazamiento
     */
    public Vehicle(String listNumPassengers, String ynCrew, String numWheels, String regDate, String displacementMed) {
        this.numberOfPassengers = listNumPassengers;
        this.crew = ynCrew;
        this.numWheels = numWheels;
        this.registrationDate = regDate;
        this.displacementMedium =displacementMed;

    }

    /**
     * Método para crear el vehículo con sus atributos
     * Decisión que permite parar la ejecución cuando hay 10 elementos dentro del arraylist
     */
    public static void createVehiculo() {
        try {
            if (vehiculo.size()<10) {
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
                System.out.println("please, entering number wheels the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner numWheels = new Scanner(System.in);
                String newNumWheels = numWheels.nextLine();
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

                Vehicle newVehiculoP = new Vehicle(numPassengersStr, newCrewStr, newNumWheels, newRegDate, newDisplacementMedium);
                vehiculo.add(newVehiculoP);

            }else{
                System.out.println("It only has space for 10 vehicles");
            }
        } catch (Exception e) {
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }

        Menu.next();
    }

    /**
     * Método que muestra los vehículos creados
     */
    public static void  seeVehiculo() {
        try {
            System.out.println("these are your lists");
            System.out.println("-----------------------------------------------------");
            if (vehiculo.size() > 0) {
                vehiculo.forEach(item -> System.out.println("Number of passenger: "+item.getNumberOfPassengers() +
                                                            "\nCrew: " + item.getCrew() +
                                                            "\nNumber the wheels: " + item.getNumWheels() +
                                                            "\nRegistration Date: " + item.getRegistrationDate() +
                                                            "\nDisplacement medium: " + item.getDisplacementMedium()
                                                            + "\n_______________________________________________________"
                        ));

            } else {
                System.out.println("You don't have any List, please go to create one");
            }
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

    public String getNumWheels() {
        return numWheels;
    }


    public String getRegistrationDate() {
        return registrationDate;
    }


    public String getDisplacementMedium() {
        return displacementMedium;
    }

}
