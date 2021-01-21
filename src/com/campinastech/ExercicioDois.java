//Exercício 2, dia 2: Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.

package com.campinastech;

import java.util.Scanner;

public class ExercicioDois {

public static void main(String args[]) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um valor inteiro para que seja digo qual é o antecessor: ");
    int numero = entrada.nextInt();
    int antecessor = numero - 1;
    
    System.out.println("O antecessor de " + numero + " é: " + antecessor); 
	
    entrada.close();
}
}
