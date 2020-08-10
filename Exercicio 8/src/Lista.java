public abstract class Lista 
{
	private String[] itens = new String[5];
	
	protected String[] getItens() 
	{
		return itens;
	}

	public void setItens(String[] itens) 
	{
		this.itens = itens;
	}
	
	public String toString()
	{
		StringBuilder lista = new StringBuilder();
		for (int i = 0; i<4; ++i)
		{
			lista.append("• " + getItens()[i] + "\n");
		}
		lista.append("• " + getItens()[5]);
		return lista.toString();
	}
}
