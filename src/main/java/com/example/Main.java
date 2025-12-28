package com.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        final int NUMERO_MAX_INTENTOS = 3;
        int intentos;
        int respuesta;

        int numeroSecreto = random.nextInt(10) + 1;

        System.out.println("Adivina El Numero");
        intentos = NUMERO_MAX_INTENTOS;
        while (intentos <= NUMERO_MAX_INTENTOS) {
            System.out.println("=======================");
            System.out.println("Tienes: " + intentos + " intentos");
            System.out.print("El numero esta entre 1 y 10, cual es? ");
            respuesta = sc.nextInt();


            if (respuesta == numeroSecreto) {
                System.out.println("-----------------------------------");
                System.out.println("-----------------------------------");
                System.out.println("El numero que ingresaste es el correcto.");
                System.out.println("-----------------------------------");
                System.out.println("-----------------------------------");
                break;
            } else if (respuesta < numeroSecreto) {
                System.out.println("-----------------------------------");
                System.out.println("El numero secreto es mayor.");
                intentos--;
            } else {
                System.out.println("-----------------------------------");
                System.out.println("El numero secreto es menor.");
                intentos--;
            }

            if (intentos == 0) {
                System.out.println("-----------------------------------");
                System.out.println("-----------------------------------");
                System.out.println("Perdiste, te quedaste sin intentos.");
                System.out.println("El numero secreto era: " + numeroSecreto);
                System.out.println("-----------------------------------");
                System.out.println("-----------------------------------");
                break;
            }
        }

    }
}