public class PortaAnd extends PortaNot 
{
	private boolean entrada2;
	public boolean getSaida()
	{
		return getEntrada() && entrada2;
	}
	public void setEntrada2(boolean entrada2)
	{
		this.entrada2 = entrada2;
	}
	protected boolean getEntrada2()
	{
		return entrada2;
	}
}
