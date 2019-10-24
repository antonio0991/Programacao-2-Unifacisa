package questao02;

public class VetorDeInteiros 
{
	int[] array = new int[2];
	int tamanho;
	public void addNumero(int numero)
	{
		if(tamanho==array.length)
		{
			int[] aux = new int[tamanho*2];
			for(int i = 0; i<tamanho; i++)
			{
				aux[i] = array[i];
			}
			array = aux;
		}
		array[tamanho] = numero;
		tamanho++;
	}
	public int[] getNumeros()
	{
		if(tamanho<array.length)
		{
			int[] aux = new int[tamanho];
			for(int i = 0; i<tamanho; i++)
			{
				aux[i] = array[i];
			}
			array = aux;
		}
		return array;
	}
}
