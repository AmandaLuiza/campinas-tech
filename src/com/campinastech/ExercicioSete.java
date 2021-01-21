//Exercício 3, dia 3: Escreva um algoritmo em Java que leia dois números inteiros e determine qual é o menor. Escreva um algoritmo que determina o maior também.

package com.campinastech;

import java.util.Scanner;

public class ExercicioSete {

    public static void main(String args[]) {
	        
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o primeiro valor: ");
    int n1 = entrada.nextInt();

    System.out.println("Digite o segundo valor: ");
    int n2 = entrada.nextInt();
    
    if (n1 < n2) {
        System.out.println("O valor " + n1 + " é o menor e o " + n2 + " é o maior");
    } else if (n1 > n2) {
    	System.out.println("O valor " + n1 + " é o maior e o " + n2 + " é o menor");
    } else {
        System.out.println("Os valores digitados são iguais");
    }

    entrada.close();
    }
}
