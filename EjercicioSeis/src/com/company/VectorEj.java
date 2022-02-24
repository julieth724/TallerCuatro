package com.company;
/**
 * Clase Vector
 * @autor Angela Julieth Ossa Cuellar
 */


import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class VectorEj {

    /**
     * Se crean los dos variables que se van a ingresar al Vector
     */
    public static Integer num;
     public static Integer num2;

    public static Integer getNum() {
        return num;
    }

    public static void setNum(Integer num) {
        VectorEj.num = num;
    }

    public static Integer getNum2() {
        return num2;
    }

    public static void setNum2(Integer num2) {
        VectorEj.num2 = num2;
    }

    public static void createVector(){
        /**
         * Metodo que permite el ingreso de datos al vector y compara los valores
         */
        Vector<Integer> vector = new Vector<Integer>(25, 5);
        Integer lastValue = null;
        boolean areEqual;
    do {
          Scanner sc = new Scanner(System.in);
          num = Integer.valueOf(sc.nextLine());
          vector.add(num);
          areEqual = Objects.equals(num, lastValue);
          lastValue = num;
      }while (!areEqual);
      vector.forEach(item-> System.out.println(item.toString()));

    }
}


