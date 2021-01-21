//Exercício 3, dia 2: Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.

package com.campinastech;

import java.util.Scanner;

public class ExercicioTres {
	
public static void main(String args[]) {
	        
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite a base do retângulo:");
    int base = entrada.nextInt();

    System.out.println("Digite a altura do retângulo");
    int altura = entrada.nextInt();
    int area = base * altura;
    System.out.println("A área do retângulo é: " + area);

    entrada.close();
    }
}
