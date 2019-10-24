package questao02;

public class ComparadorDeVetores
{
	private int[] vetor1, vetor2;
	public ComparadorDeVetores(int[] vetor1, int[] vetor2)
	{
		this.vetor1 = vetor1;
		this.vetor2 = vetor2;
	}
	public int[] getValoresRepetidos()
	{
		int tamanho = 0;
		for(int i=0; i<vetor1.length;i++)
		{
			for(int j=0; j<vetor2.length; j++)
			{
				if(vetor1[i] == vetor2[j])
				{
					tamanho++;
				}
			}
		}
		int[] repetidos = new int[tamanho];
		int posicao = 0;
		for(int i=0; i<vetor1.length;i++)
		{
			for(int j=0; j<vetor2.length; j++)
			{
				if(vetor1[i] == vetor2[j])
				{
					repetidos[posicao] = vetor1[i];
					posicao++;
				}
			}
		}
		return repetidos;
	}
}
