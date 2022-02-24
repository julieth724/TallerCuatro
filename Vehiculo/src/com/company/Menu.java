package com.company;

import java.util.Scanner;
/**
 * Clase que Funciona como menú
 * @author Angela Julieth Ossa Cuellar
 */
public class Menu {

    /**
     * Método que es ejecutado desde el Main
     */
    public static void mainMenu(){


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
                           Vehicle.createVehiculo();
                           break;
                       case "2":
                           Vehicle.seeVehiculo();
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

    /**
     * Método que funciona como alto
     */
    public static void next () {
        try {
            System.out.println("enter any key to continue");
            Scanner sc = new Scanner(System.in);
            String response = sc.next();
            mainMenu();
        }catch (Exception e) {
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }

    }


}

