package com.ejercicios.semana_octava;

import java.util.Scanner;

public class Juego {
    public static void ComprobarNumeros() {
        int n1 = (int) (Math.random() * 10) + 1;
        System.out.println("El número está entre el 1 y el 10 ");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el número");
        for (int i = 0; i <=n1; i++){
            int n2 = entrada.nextInt();
            if (n1 == n2) {
                System.out.println("Acertaste");
                break;
            } else if (n1 > n2) {
                System.out.println("no acertaste el número es mayor");
            } else {
                System.out.println("no acertaste el número es menor");
            }
    }


    }

    public static void main(String[] args) {
        ComprobarNumeros();
    }
}



