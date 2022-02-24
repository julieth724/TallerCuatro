package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    /**
     * Método que es ejecutado desde el Main
     */
    static ArrayList<Vehicle> vehicles= new ArrayList<>();

    public static void mainMenu() {
        try {
            System.out.println("Welcome to the Ferry");
            System.out.println("Select the desired option");

            System.out.println("1. Create your Vehicle");
            System.out.println("2. view your vehicles");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            switch (option) {
                case "1":
                    typeMenu();
                    break;
                case "2":
                    vehicles.forEach(Vehicle::seeVehiculo);
                    next();
                    break;
                case "0":
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
                    mainMenu();
            }

        } catch (Exception e) {
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }

    }

    public static void typeMenu() {

        try {
            if (vehicles.size()<10) {
            System.out.println("Select the desired option");

            System.out.println("1. Create your Vehicle type Car");
            System.out.println("2. Create your Vehicle type Truck");
            System.out.println("3. Create your Vehicle type Bicycle");
            System.out.println("4. Create your Vehicle type Boat");
            System.out.println("5. Create your Vehicle type Motorcycle");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            switch (option) {
                case "1":
                    Cars car = Cars.createCars();
                    car.seeVehiculo();
                    vehicles.add(car);
                    next();
                    break;
                case "2":
                    Truck truck = Truck.createTrucks();
                    truck.seeVehiculo();
                    vehicles.add(truck);
                    next();
                    break;
                case "3":
                    Bicycle bicycle = Bicycle.createBicycle();
                    bicycle.seeVehiculo();
                    vehicles.add(bicycle);
                    next();
                    break;
                case "4":
                    Boat boat = Boat.createBoat();
                    boat.seeVehiculo();
                    vehicles.add(boat);
                    next();
                    break;
                case "5":
                    Motorcycle motorcycle = Motorcycle.createMotorcycle();
                    motorcycle.seeVehiculo();
                    vehicles.add(motorcycle);
                    next();
                    break;
                case "0":
                    System.out.println("Go Back..");
                    break;
                default:
                    System.out.println("Please select a correct answer");
                    mainMenu();
            }
            }else {
                System.out.println("It only has space for 10 vehicles");
                mainMenu();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }

    }

    /**
     * Método que funciona como alto
     */
    public static void next() {
        try {
            System.out.println("enter any key to continue");
            Scanner sc = new Scanner(System.in);
            String response = sc.next();
            mainMenu();
        } catch (Exception e) {
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }
    }



}