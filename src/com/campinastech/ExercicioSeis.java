/*Exercicio 2, dia 3: Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos*/

package com.campinastech;

import java.util.Scanner;

public class ExercicioSeis {

public static void main(String args[]) {
        
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite a idade do nadador: ");
    int idade = entrada.nextInt();
    
    if (idade >= 5 && idade <= 7) {
    System.out.println("Categoria infantil A");
    } else if (idade >= 8 && idade <= 11) {
        System.out.println("Categoria infantil B");
    } else if (idade >= 12 && idade <= 13) {
        System.out.println("Categoria juvenil A");
    } else if (idade >= 14 && idade <= 17) {
        System.out.println("Categoria juvenil B");
    } else if (idade > 17) {
        System.out.println("Categoria Adultos");
    } else {
        System.out.println("Categoria não encontrada para a idade: " + idade);
    }

    entrada.close();
    }
}