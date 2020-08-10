public abstract class Avaliacao
{
	private double[] notas = null;
	
	public double[] getNotas()
	{
		return notas;
	}
	public void setNotas(double[] notas) 
	{
		this.notas = notas;
	}

	public boolean isAprovado()
	{
		if (getMedia()>= 7)
			return true;
		return false;
	}
	
	
	public abstract double getMedia();
}
