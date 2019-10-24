package questao02;

import java.util.Arrays;
import java.util.Scanner;

public class DetectorDeRepeticoesApp 
{
	public static void main(String[] args) 
	{	Scanner teclado = new Scanner(System.in);
		//preenchendo o primeiro vetor
		VetorDeInteiros vetor1 = new VetorDeInteiros();
		System.out.println("Enchendo estrutura 1");
		System.out.print("Digite valor inteiro: ");
		String numero = teclado.nextLine();
		while (!numero.isEmpty()) 
		{	vetor1.addNumero(Integer.parseInt(numero));
			System.out.print("Digite valor inteiro: ");
			numero = teclado.nextLine();
		}
		int[] valoresVetor1 = vetor1.getNumeros();
		
		System.out.println("Vetor 1 = " + Arrays.toString(valoresVetor1));
		//preenchendo o segundo vetor, o codigo esta replicado porque ainda nao vimos metodos estaticos
		VetorDeInteiros vetor2 = new VetorDeInteiros();
		System.out.println("Enchendo estrutura 2");
		System.out.print("Digite valor inteiro: ");
		numero = teclado.nextLine();
		while (!numero.isEmpty()) 
		{	vetor2.addNumero(Integer.parseInt(numero));
			System.out.print("Digite valor inteiro: ");
			numero = teclado.nextLine();
		}
		int[] valoresVetor2 = vetor2.getNumeros();
		System.out.println("Vetor 2 = " + Arrays.toString(valoresVetor2));
		//procurando os repetidos
		ComparadorDeVetores comparador = new ComparadorDeVetores(valoresVetor1, valoresVetor2);
		int[] repetidos = comparador.getValoresRepetidos();
		System.out.println("Valores repetidos = " + Arrays.toString(repetidos));
		teclado.close();
	}
}
