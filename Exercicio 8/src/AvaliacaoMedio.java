public class AvaliacaoMedio extends Avaliacao
{
	
	private static final int NUMERO_DE_PROVAS = 4;

	private double[] recuperacao = new double[NUMERO_DE_PROVAS];
	
	AvaliacaoMedio()
	{
		setNotas(new double[NUMERO_DE_PROVAS]);
	}
	
	public double getMedia() 
	{
		double soma = 0;
		
		for(int i = 0; i<NUMERO_DE_PROVAS; i++)
		{
			soma += getNotasFinais()[i];
		}
		
		return soma/NUMERO_DE_PROVAS;
	}
	
	private double[] getNotasFinais()
	{
		double[] notasFinais = new double[NUMERO_DE_PROVAS];
		for (int i = 0; i<NUMERO_DE_PROVAS; i++)
		{
			if(getNotas()[i] > recuperacao[i])
			{
				notasFinais[i] = getNotas()[i];
			}
			else
			{
				notasFinais[i] = recuperacao[i];
			}
		}
		return notasFinais;
	}

	public double[] getRecuperacao()
	{
		return recuperacao;
	}

	public void setRecuperacao(double[] recuperacao)
	{
		this.recuperacao = recuperacao;
	}
	
}
