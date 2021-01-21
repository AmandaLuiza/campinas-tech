//Exercício 4, dia 2: Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

package com.campinastech;

import java.util.Scanner;

public class ExercicioQuatro {
	
public static double percentual(double eleitores, double total) {

    double percentual = total * 100 / eleitores;
    return percentual;

}

public static void main(String args[]) {

	Scanner entrada = new Scanner(System.in);

    System.out.println("Digite o total de votos");
    int votos = entrada.nextInt();
    System.out.println("Digite o total de votos em branco");
    int brancos = entrada.nextInt();
    System.out.println("Digite o total de votos nulos");
    int nulos = entrada.nextInt();
    System.out.println("Digite o total de votos validos");
    int validos = entrada.nextInt();

    System.out.println("A quantidade total de votos é: " + votos);
    System.out.println("A quantidade total de votos em branco é: " + brancos);
    System.out.println("A quantidade total de votos nulos é: " + nulos);
    System.out.println("A quantidade total de votos validos é: " + validos);

    double pbrancos = votos * 100 / brancos;
    double pnulos = votos * 100 / nulos;
    double pvalidos = votos * 100 / validos;
    
    System.out.println("O percentual total de votos em branco é: " + pbrancos + "%");
    System.out.println("O percentual total de votos nulos é: " + pnulos + "%");
    System.out.println("O percentual total de votos validos é: " + pvalidos + "%");

    entrada.close();
    }
}