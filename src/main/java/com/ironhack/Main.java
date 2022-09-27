package com.ironhack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        /*
        int[] array = {1, 2, 3, 4, 5};



        for (int i = 0; i < args.length; i++) {
            System.out.println(array[i]);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Por favor, introduce tu edad");


        int age = parseInt(input.nextLine());
        System.out.println(age);


        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("demo.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


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


         */


        //FileWriter writer = new FileWriter("demo.txt");
        //"8" int 8 "33"

        String name = null;
        String surname = "Pérez";

        try {
            concat(name, surname);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //concat(name, surname);

        System.out.println("Estamos en la linea 72!!!!");

        System.out.println(Integer.MAX_VALUE);
        System.out.println(multiply(27, 2));


    }

    public static int multiply(int a, int b) {
        // 10 = 5 * 2;
        // 10/5 != 2;

        int product = a * b;
        if(product/a != b) {
            throw new IllegalArgumentException("Product is greater than Integer.MAX_Value");
        }
        return product;

    }

    public static String concat(String firstName, String lastName) {

        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name must be defined");
        }

        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name must be defined");
        }

        return firstName + " " + lastName;
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