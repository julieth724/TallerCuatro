package com.company;

import java.util.Scanner;

public class Truck extends Vehicle {
    String numberDoors;
    String licensePlate;
    String height;
    String numWheels;

    /**
     * Constructor para clase Vehicle
     *
     * @param listNumPassengers número de pasajeros
     * @param ynCrew            define tripulación
     * @param regDate           Fecha de registro
     * @param displacementMed   Medio de desplazamiento
     */
    public Truck(String listNumPassengers, String ynCrew, String regDate, String displacementMed, String numberDoors, String licensePlate, String height, String numWheels) {
        super(listNumPassengers, ynCrew, regDate, displacementMed, "Truck");
        this.numberDoors = numberDoors;
        this.licensePlate = licensePlate;
        this.height = height;
        this.numWheels = numWheels;

    }

    public static Truck createTrucks() {
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
                System.out.println("please, entering registration date the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner registrationDate = new Scanner(System.in);
                String newRegDate = registrationDate.nextLine();
                System.out.println("---------------------------------------------------------");
                System.out.println("please, entering displacement Medium the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner displacementMedium = new Scanner(System.in);
                String newDisplacementMedium = displacementMedium.nextLine();
                System.out.println("---------------------------------------------------------");
                System.out.println("please, entering the number Doors the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner numberDoors = new Scanner(System.in);
                String newNumberDoors = numberDoors.nextLine();
                System.out.println("---------------------------------------------------------");
                System.out.println("please, entering the number Doors the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner licensePlate = new Scanner(System.in);
                String newLicensePlate = licensePlate.nextLine();
                System.out.println("please, entering the height the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner height = new Scanner(System.in);
                String newHeight = height.nextLine();
                System.out.println("---------------------------------------------------------");
                System.out.println("please, entering number wheels the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner numWheels = new Scanner(System.in);
                String newNumWheels = numWheels.nextLine();

                Truck truck = new Truck(numPassengersStr, newCrewStr, newRegDate, newDisplacementMedium, newNumberDoors, newLicensePlate, newHeight, newNumWheels);
                return truck;


        }catch (Exception e) {
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }
        return null;
    }
}

