package com.ejercicios.semana_octava;

import java.util.Scanner;

public class Azar {
    public static int DevolverNumero(int NumMax, int NumMin){
        int rango = (NumMax - NumMin) +1;
        return (int) (Math.random()*rango)+NumMin;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el número más pequeño");
        int n1 = entrada.nextInt();
        System.out.println("Dime el número más grande");
        int n2 = entrada.nextInt();
        System.out.println("El número al azar entre " + n1 + " y " + n2 + " es " + DevolverNumero(n1,n2));
    }
}
