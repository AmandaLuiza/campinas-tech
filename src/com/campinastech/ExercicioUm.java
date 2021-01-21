//Exercicio 1, dia 2: Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z. A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com que o valor que está em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram armazenados nas variáveis.

package com.campinastech;

public class ExercicioUm {  
	public static void main(String args[]) { 
	int y = 99;
    int z = 11;
    
    System.out.println("o valor ínicial de Y é : " + y);
    System.out.println("o valor ínicial de Z é : " + z);
    
    int x = 0;
    x = y;
    y = z;
    z = x;
    
    System.out.println("o valor final de Y é : " + y);
    System.out.println("o valor final de Z é : " + z);
  } 
}