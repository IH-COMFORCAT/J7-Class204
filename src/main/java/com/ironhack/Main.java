package com.ironhack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        int[] array = {1, 2, 3, 4, 5};



        for (int i = 0; i < args.length; i++) {
            System.out.println(array[i]);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, introduce tu edad");

        /*
        int age = parseInt(input.nextLine());
        System.out.println(age);


        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("demo.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */


        int age = 0;
        boolean isCorrect = false;

        while (!isCorrect) {
            try {
                age = parseIntDelegation(input.nextLine());
                isCorrect = true;
            } catch (NumberFormatException numberFormatException) {

                System.out.println("Formato no válido, por favor, introduce números enteros:");

            } catch (IllegalArgumentException illegalArgumentException) {

                System.out.println(illegalArgumentException.getMessage());

            }
        }




        //FileWriter writer = new FileWriter("demo.txt");
        //"8" int 8 "33"


    }

    public static int parseInt(String str) {

        int result = 0;
        try {
         result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("No se ha podido convertir a número, se devuelve un 0");
        }

        if (result < 0 || result > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        }

        return result;
    }

    public static int parseIntDelegation(String str) throws RuntimeException {
        int result = Integer.parseInt(str);
        if (result < 0 || result > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150");
        }
        return result;
    }
}