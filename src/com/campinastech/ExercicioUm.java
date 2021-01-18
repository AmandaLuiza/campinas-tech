package com.campinastech;

public class ExercicioUm {  
	  public static void main(String args[]) { 
	    int y = 99;
	    int z = 11;
	    System.out.println("o valor é : " + y);
	    System.out.println("o valor é : " + z);
	    int aux = 0;
	    String str = "";
	    aux = y;
	    y = z;
	    z = aux;
	    System.out.println("o valor novo é : " + y);
	    System.out.println("o valor novo é : " + z);
	  } 
	}
