package Atividades;
import java.util.Scanner;

public class Ex04Lista02 {
//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
//�mpar exiba o n�mero elevado ao quadrado.
	
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int num;
		double raiz, potencia;
		
		System.out.println("Digite um n�mero inteiro: ");
		num =  leia.nextInt();
		
		if(num % 2 == 0) { //se o resto da divs�o do n�mero por 2 for = 0 � par.
			System.out.println("Par...");
			raiz = Math.sqrt(num); // biblioteca de mat que mostra a exta��o de raiz quadrada do n�
			System.out.printf("Raiz quadrada: %.2f" , raiz);
		}
			else {
			System.out.println("Impar...");
			potencia =Math.pow(num, 2);
			System.out.println("Potencia: " + potencia);
		}
	}

}
