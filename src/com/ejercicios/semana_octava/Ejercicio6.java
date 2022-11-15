package com.ejercicios.semana_octava;

import java.util.Scanner;

public class Ejercicio6 {
    public static void Jugar(){
        int n1 = (int) (Math.random() * 100) + 1;
        System.out.println("El número está entre el 1 y el 100 ");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime el número, tienes 5 intentos");
        int vidas = 5;
        for (int i=0;i<5;i++){
            int n2 = entrada.nextInt();
            vidas--;
            if (n1==n2){
                System.out.println("Acertaste");
                break;
            }else{
                System.out.println("No acertaste, te quedan " + vidas + " vidas");
            }
        }
        System.out.println("Has perdido, el número era " + n1);
    }

    public static void main(String[] args) {
        Jugar();
    }
}
