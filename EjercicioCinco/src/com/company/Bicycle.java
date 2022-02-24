package com.company;

import java.util.Scanner;

public class Bicycle extends Vehicle {

    String numWheels;

    /**
     * Constructor para clase Vehicle
     *
     * @param listNumPassengers número de pasajeros
     * @param ynCrew            define tripulación
     * @param regDate           Fecha de registro
     * @param displacementMed   Medio de desplazamiento
     */
    public Bicycle(String listNumPassengers, String ynCrew, String regDate, String displacementMed, String numWheels) {
        super(listNumPassengers, ynCrew, regDate, displacementMed, "Bicycle");
        this.numWheels = numWheels;

    }

    public static Bicycle createBicycle() {
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
                System.out.println("please, entering number wheels the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner numWheels = new Scanner(System.in);
                String newNumWheels = numWheels.nextLine();

                Bicycle bicycle = new Bicycle(numPassengersStr, newCrewStr, newRegDate, newDisplacementMedium, newNumWheels);
                return bicycle;


        }catch (Exception e) {
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }
        return null;
    }
}

