package com.company;

import java.util.Scanner;

public class Boat extends Vehicle {
    String motor;

    /**
     * Constructor para clase Vehicle
     *
     * @param listNumPassengers número de pasajeros
     * @param ynCrew            define tripulación
     * @param regDate           Fecha de registro
     * @param displacementMed   Medio de desplazamiento
     */
    public Boat(String listNumPassengers, String ynCrew, String regDate, String displacementMed, String motor) {
        super(listNumPassengers, ynCrew, regDate, displacementMed, "Boat");
        this.motor = motor;


    }

    public static Boat createBoat() {
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
                System.out.println("---------------------------------------------------------");
                System.out.println("please, entering the type motor the your vehicle");
                System.out.println("-------------------------------------------------------------");
                Scanner motor = new Scanner(System.in);
                String newMotor = motor.nextLine();

                Boat car = new Boat(numPassengersStr, newCrewStr, newRegDate, newDisplacementMedium, newMotor);
                return car;


        }catch (Exception e) {
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }
        return null;
    }
}

