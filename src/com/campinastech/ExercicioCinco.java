//Exercício 1, dia 3: Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.

package com.campinastech;

import java.util.Scanner;

public class ExercicioCinco {

public static void main(String args[]) {
    
	Scanner entrada = new Scanner(System.in);
    
	System.out.println("Digite um número para saber se é par ou ímpar:");
    int numero = entrada.nextInt();

    if (numero % 2 == 0) {
        System.out.println("O número " + numero + " é par!");
    } else {
        System.out.println("O número " + numero + " é ímpar!");
    } 
    entrada.close();
	}
}




