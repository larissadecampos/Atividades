package Atividades;
import java.util.Scanner;

public class Ex03Lista02 {

	public static void main(String[] args) {
/// Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
		// 10-14 infantil
		// 15-17 juvenil
		// 18-25 adulto
		Scanner entrada = new Scanner (System.in);
		
		int idade;
	
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
	
		if (idade >=10 && idade <=14) {
			System.out.println("Sua categoria � Infantil.");
		}
		else if (idade >=15 && idade <=17) {                             
			System.out.println("Sua categoria � Juvenil.");	
		}
		else if(idade >=18 && idade <=25) {           
			System.out.println("Sua categoria � Adulto.");
		}	
		else if(idade <10 || idade >25) {
			System.out.println("N�o existem categorias para pessoas da sua idade.");
		}
	
	}

	}
