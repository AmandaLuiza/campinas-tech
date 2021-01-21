/*Exercício 1, dia 4: Construa um algoritmo que leia 10 valores inteiros e positivos e:
Encontre o maior valor
Encontre o menor valor
Calcule a média dos números lidos Esse exercício foi dado na aula 3 e agora vamos otimizar ele utilizando o while e for.*/

//WHILE

package com.campinastech;

import java.util.Scanner;

public class ExercicioOnze {

	public static void main(String[] args) {

	Scanner entrada = new Scanner(System.in);
		
    int soma = 0;

    int menor = Integer.MAX_VALUE;
    int maior = Integer.MIN_VALUE;

    int i = 1;

    while (i <= 10) {
        System.out.printf("Digite o " + i + "º número: ");
        int valor = entrada.nextInt();

        if (valor > maior) {
            maior = valor;
        }

        if (valor < menor) {
            menor = valor;
        }
        soma += valor;

        i++;
    }
    
    System.out.println("O maior valor digitado foi: " + maior);
    System.out.println("O menor valor digitado foi: " + menor);
    System.out.print("A média dos valores é: " + soma / 10);

    entrada.close();
    }
}
