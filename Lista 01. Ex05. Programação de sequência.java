package Atividadades;
import java.util.Scanner;

public class Ex05Lista01 {
//Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
// respectivamente.
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int nota1, nota2, nota3, soma;
	
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = entrada.nextInt();
	
		soma = ((nota1*2) + (nota2*3) + (nota3*5));
		System.out.println("Sua m�dia ponderada �: " + soma/5);
	}	 

	}
