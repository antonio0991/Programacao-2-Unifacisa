public class AvaliacaoFaculdade extends Avaliacao
{
	private static final int NUMERO_DE_PROVAS = 3;
	
	private double reposicao;
	
	AvaliacaoFaculdade()
	{
		setNotas(new double[NUMERO_DE_PROVAS]);
	}
	
	public void setReposicao(double reposicao)
	{
		this.reposicao = reposicao;
	}
	
	public double getMedia() 
	{
		double soma = 0;
		
		for (int i = 0; i<NUMERO_DE_PROVAS; i++)
		{
				soma += getNotas()[i];
		}
		for (int i = 0; i<NUMERO_DE_PROVAS; i++)
		{
			if(getNotas()[i]<reposicao) 
			{
				soma -= getNotas()[i] + reposicao;
				break;
		
			}
		}
		return soma;
	}

}
