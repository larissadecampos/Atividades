package Atividades;
import java.util.Scanner;
import java.lang.Math;

public class Ex02Lista01Extra {
 //Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, P=0, I=0;
	
	System.out.println("Digite um n�mero: ");
	num1 = leia.nextInt();
	
	 if(num1 % 2 == 0){ //se o resto da divs�o do n�mero por 2 for = 0 � par.
		P = P+1;
	 }
		else {
			I = I+1;
		}
			
	 System.out.println("Digite um n�mero: ");
		num2 = leia.nextInt();
	 
		if(num2 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um n�mero: ");
		num3 = leia.nextInt();
	 
		if(num3 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um n�mero: ");
		num4 = leia.nextInt();
	 
		if(num4 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um n�mero: ");
		num5 = leia.nextInt();
	 
		if(num5 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}	
		System.out.println("Digite um n�mero: ");
		num6 = leia.nextInt();
	 
		if(num6 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um n�mero: ");
		num7 = leia.nextInt();
	 
		if(num7 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}	
		System.out.println("Digite um n�mero: ");
		num8 = leia.nextInt();
	 
		if(num8 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um n�mero: ");
		num9 = leia.nextInt();
	 
		if(num9 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
		System.out.println("Digite um n�mero: ");
		num10 = leia.nextInt();
	 
		if(num10 % 2 == 0){ 
			P = P+1;
		 }
			else {
				I = I+1;
			}
	System.out.println("A quantidade de n�meros pares �: " + P + ". A quantidade de n�meros �mpares �: " + I +".");	
	}
	
	}
