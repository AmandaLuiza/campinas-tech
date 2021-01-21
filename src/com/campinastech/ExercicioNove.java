//Exercício 5, dia 3: Escreva um algoritmo em Java que seja capaz de fazer as seguintes operações matemáticas (adição, subtração, multiplicação e divisão). Todas as operações serão entre dois valores. No começo do algoritmo pergunte ao usuário qual operação ele deseja fazer e quais são os valores.
// a, s, m, d

package com.campinastech;

import java.util.Scanner;

public class ExercicioNove {

public static void main(String[] args) {

  Scanner entrada = new Scanner(System.in);

  System.out.println("Digite uma operação: a > adição, s > subtração, m > multiplicação, ou d > divisão:");
  String operacao = entrada.next();

  System.out.println("Digite um número:");
  int valor1 = entrada.nextInt();

  System.out.println("Digite outro número:");
  int valor2 = entrada.nextInt();


  switch(operacao) {
    case "a":
      int soma = valor1 + valor2;
      System.out.println("A soma entre os números é: " + soma);
      break;
    case "s":
      int subtracao = valor1 - valor2;
      System.out.println("A subtração entre os números é: " + subtracao);
      break;
    case "m":
      int multiplicacao = valor1 * valor2;
      System.out.println("A multiplicação entre os números é: " + multiplicacao);
      break;
    case "d":
      if (valor2 == 0) {
        System.out.println("Não se pode dividir por 0");
      } else {
        double divisao = valor1 / (double) valor2;
        System.out.println("A divisão entre os números é: " + divisao);
      }
      break;
    default:
      System.out.println("Operação não encontrada");
  	}
  	entrada.close();
	}
}