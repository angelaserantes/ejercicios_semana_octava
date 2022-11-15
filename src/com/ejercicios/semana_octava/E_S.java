package com.ejercicios.semana_octava;

import java.util.Scanner;

public class E_S{
    public static String DevolverCadena1(String frase){
        return frase;

    }

    public static int DevolverEntero(){
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Dime una cadena de números");
        int numeros = entrada1.nextInt();
        return numeros;
    }

    public static String DevolverCadena2(){
       String frase2 = "Practicando métodos";
       return frase2;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime una frase");
        String frase1 = entrada.nextLine();
        System.out.println("La frase introducida es " + DevolverCadena1(frase1));
        System.out.println("El valor entero es: " + DevolverEntero());
        System.out.println("La frase guardada es: " + DevolverCadena2());

    }
}
