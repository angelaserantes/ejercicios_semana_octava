package com.ejercicios.semana_octava;

import java.util.Scanner;

public class Ejercicio3 {
    public static void MostrarNumeros(){
        System.out.println("¿Cuántos números aleatorios quieres generar?");
        Scanner datos = new Scanner(System.in);
        int valor = datos.nextInt();
        System.out.println("Dime el número más pequeño");
        int nmin = datos.nextInt();
        System.out.println("Dime el número más grande");
        int nmax = datos.nextInt();
        int [] cantidad = new int[100];
        for (int i=0; i<valor;i++){
            cantidad[i] = (int)(Math.random()* nmax) + nmin;
        }for (int i=0; i<valor;i++){
            System.out.println("Los números aleatorios son " + cantidad[i]);
        }
    }

    public static void main(String[] args) {
        MostrarNumeros();
    }
}
