package Atividadades;
import java.util.Scanner;

public class Ex03Lista01 {
	//Fa�a um sistema que leia o tempo de dura��o de um evento em uma 
	//f�brica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	
	 public static void main(String[] args) {
	      Scanner leia = new Scanner(System.in);

	  int totalSegundos, segundos, minutos, horas, dias;
	
	    System.out.println("Dura��o em segundos: "); 
	    totalSegundos = leia.nextInt(); 
	    horas = (totalSegundos/3600);
	   	minutos = (totalSegundos % 3600)/60;
	  	segundos = (totalSegundos % 3600) % 60; 

	 System.out.println( " O tempo de dura��o em horas � "+ horas);
	 System.out.println(" O tempo de dura��o em minutos � " + minutos);
	 System.out.println(" O tempo de dura��o em segundos � " + segundos);

	   


}
}