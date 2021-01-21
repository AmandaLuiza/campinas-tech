/*Exercício 4, dia 3: Construa um algoritmo que leia 10 valores inteiros e positivos e:
Encontre o maior valor
Encontre o menor valor
Calcule a média dos números lidos*/

package com.campinastech;

import java.util.Scanner;

public class ExercicioOito {

public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int soma = 0;

    System.out.println("Insira o 1º número:");
    int valor = entrada.nextInt();
    int menor = valor;
    int maior = valor;
    soma += valor;

    System.out.println("Insira o 2º número:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 3º número:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 4º número:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 5º número:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 6º número:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 7º número:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 8º número:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 9º número:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("Insira o 10º número:");
    valor = entrada.nextInt();
    if (valor > maior) {
        maior = valor;
    }
    if (valor < menor) {
        menor = valor;
    }
    soma += valor;

    System.out.println("O maior valor é: " + maior);
    System.out.println("O menor valor é: " + menor);
    System.out.print("A média é: " + soma / 10);

    entrada.close();
    }
}
