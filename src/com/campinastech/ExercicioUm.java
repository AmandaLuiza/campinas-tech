package com.campinastech;

public class ExercicioUm {  
	  public static void main(String args[]) { 
	    int y = 99;
	    int z = 11;
	    System.out.println("o valor � : " + y);
	    System.out.println("o valor � : " + z);
	    int aux = 0;
	    String str = "";
	    aux = y;
	    y = z;
	    z = aux;
	    System.out.println("o valor novo � : " + y);
	    System.out.println("o valor novo � : " + z);
	  } 
	}
