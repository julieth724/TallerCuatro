package com.company;

import java.util.*;
/**
 *Clase para definir comportamientos de la play list
 * @author Angela Julieth Ossa Cuellar
 */
public class RandomNum {

   public static void enterDate(){
       /**
        * Método para captura de datos y ejecución de la aplicación
        */
    Scanner sc = new Scanner(System.in);
       System.out.println("Enter the amount of data");

       int n = sc.nextInt();
       int [] v = new int[n];
       generate(v);
       System.out.println("------------------------------------------");
       printVector(v);
       System.out.println("\n------------------------------------------");
       quickSort(v);
       System.out.println("\nWelcome to the Ramdon Number");
       System.out.println("Select the desired option");
       int response = 0;

       System.out.println("1. would you like to order");
       System.out.println("0. Exit");

       sc = new Scanner(System.in);
       response = Integer.valueOf(sc.nextLine());
       switch (response) {
           case 1:
               System.out.println("\nordered items: ");
               quick(0, (v.length - 1), v);
               System.out.println("\n------------------------------------------");
               printVector(v);
               System.out.println("\n------------------------------------------");
               break;
           case 0:
               System.out.println("Thank you for you visit");
               break;
           default:
               System.out.println("Please select a correct answer");
       }

   }

   public static void quick(int first, int latest, int[] v) {
       /**
        * Método para realizar ordenación Rápida
        */
       if(first>=latest) return;
       int pivote=v[first];
       int elemIzq=first+1;
       int elemDer=latest;
       while(elemIzq<=elemDer){
           while(elemIzq<=latest && v[elemIzq]<pivote){
               elemIzq++;
           }
           while(elemDer>first && v[elemDer]>=pivote){
               elemDer--;
           }
           if(elemIzq<elemDer){
               int temp=v[elemIzq];
               v[elemIzq]=v[elemDer];
               v[elemDer]=temp;
           }
       }

       if(elemDer>first){
           int temp=v[first];
           v[first]=v[elemDer];
           v[elemDer]=temp;
       }
       quick(first, elemDer-1, v);
       quick(elemDer+1, latest, v);
   }

    public static void printVector(int vec[]){
        /**
         * Método para imprimir vector
         */
        for(int i=0;i<vec.length;i++){
            System.out.print(vec[i]+" ");
        }
    }

    public static void quickSort(int v[]){
        /**
         * Ejecución para método de orden rápido
         */
        final int N=v.length;
        quick(0, N-1, v);
    }

     private static void generate(int[]v){
        /**
         * Método para generar el arreglo
         */
       Random r = new Random();
       for (int i=0; i<v.length; i++){
           v[i]=r.nextInt(20);
       }
   }

}