public class ListaCentralizada extends ListaAlinhada
{
	public String toString()
	{
		StringBuilder buffer = new StringBuilder();
		int meio = getQteColunas()/2;
		for(int i = 0; i<5; i++)
		{
			for(int k = 0; k<meio - getItens()[i].length()/2; k++)
			{
				buffer.append(" ");
			}
			buffer.append(getItens()[i]);
			buffer.append("\n");
		}
		return buffer.toString();
	}
}
