package Atividades;
import java.util.Scanner;

public class Ex01Lista3 {

	public static void main(String[] args) {
		
		// Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
		//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
	
			Scanner entrada = new Scanner(System.in);
			
			float [] notas = new float[5]; //float --> tem uma capacidade de armazenamento menor e s�o n�s quebrados.
			float maior = 0;
			 
			System.out.println("Digite a pontua��o: ");
			 for(int i = 0; i < notas.length; i++) {  //length aqui t� buscar o tamanho do vetor. 
				 
				 System.out.println((i+1)+ "� Pontua��o: ");///em cada posi��o � atribu�do o valor que eu t� digitando.
				 notas[i] = entrada.nextFloat();
				 {
				 if(notas[i]> maior)
				  maior = notas[i];
			 }
			 }
 					System.out.println("A maior pontua��o foi: " + maior);
 					entrada.close(); /// LEMBRE DE FAZER ISSO
 }
}
	