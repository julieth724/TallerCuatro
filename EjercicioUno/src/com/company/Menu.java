package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que inicia el menú
 * @author Angela Julieth Ossa Cuellar
 */
public class Menu {
    /**
     * @objets Arreglo para crear sistema planetario
     * @calculate Arreglo para Calcular fuerza gravitacional entre dos objetos
     */
    static ArrayList<PlanetarySystem> objets= new ArrayList<>();
    static ArrayList<PlanetarySystem> calculate= new ArrayList<>();

    /**
     * Método que es ejecutado desde el Main para lanzar el menú
     */
    public static void mainMenu() {
        try {
            System.out.println("Welcome to the space");
            System.out.println("Select the desired option");

            System.out.println("1. Create your Planetary body");
            System.out.println("2. view your Planetary body");
            System.out.println("3. Calculate gravitational pull");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();

            switch (option) {
                case "1":
                    Planet planet = new Planet("",0, 0,0,0);
                    planet.create();
                    objets.add(planet);
                    next();
                    break;
                case "2":
                    objets.forEach(PlanetarySystem::seeObjetPlanetary);
                   // next();
                    break;
                case "3":
                    System.out.println("Choose object one to calculate gravitational attraction");
                    chooseTheObjets();
                    System.out.println("Choose object two to calculate gravitational attraction");
                    chooseTheObjets();
                    Calculated();
                    delete();
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
            System.out.println(e.getMessage());
            System.out.println("connection error occurred");
            Menu.mainMenu();
        }
    }
    /**
     * Método que da pausa al programa
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
    /**
     * Método que calcula la atracción gravitacional de dos cuerpos
     */
   public static void Calculated() {
       System.out.println("calculated gravitational attraction of the planets");
       for (int i = 0; i < calculate.size(); i++) {
           System.out.println(i + ". " + calculate.get(i).getNameObjet());
       }

       double f;
       double G = 0.00000000000667;
       double m1 = 0;
       double m2 = 0;
       double r = 0;

       r = (calculate.get(1).DistanceSun) - (calculate.get(0).getDistanceSun());
       m1 = (calculate.get(0).getMass());
       m2 = (calculate.get(1).getMass());
       f = G * ((m1 * m2) / r * r);

       System.out.println("The gravitational attraction between the bodies " + calculate.get(0).getNameObjet() + " and " + calculate.get(1).getNameObjet() + " is " + f);
   }
    /**
     * Método que muestra los objetos dentro del sistema planetario
     */
    public static void chooseTheObjets(){

        for (int i = 0; i < objets.size(); i++) {
            System.out.println(i + ". " +  " Name Planet " + objets.get(i).getNameObjet());
        }
        Scanner addPlanetScanner = new Scanner(System.in);
        int addPlanetIndex = Integer.parseInt(addPlanetScanner.nextLine());
        calculate.add(objets.get(addPlanetIndex));
        }

        public static void delete(){
            calculate.clear();
        }
    }



