package com.ejercicios.semana_octava;

import java.util.Scanner;

public class Ejercicio1 {
    public static int[] notas = new int[100];
    public static int n;
    public static void RegistraNotas() {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);

        System.out.println("¿Cuantas notas va a introducir?");
        n = entrada.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println("Introduzca las notas");
            notas[i] = entrada1.nextInt();
        }
    }
    public static void  MostrarNotas(){
        for (int i = 0; i < n; i++){
            System.out.println("La " + i + "nota es " + notas[i]);
        }
    }
    public static void main(String[] args) {
        RegistraNotas();
        MostrarNotas();
    }
}