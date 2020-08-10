public class PortaNot 
{
	private boolean entrada;
	public boolean getSaida()
	{
		return !entrada;
	}
	public void setEntrada(boolean entrada)
	{
		this.entrada = entrada;
	}
	protected boolean getEntrada()
	{
		return entrada;
	}
}
