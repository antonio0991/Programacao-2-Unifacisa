public class ListaAlinhadaDireita extends ListaAlinhada
{
	public String toString()
	{
		StringBuilder buffer = new StringBuilder();
		for(int i = 0; i<5; i++)
		{
			for(int k = 0; k<getQteColunas() - getItens()[i].length(); k++)
			{
				buffer.append(" ");
			}
			buffer.append(getItens()[i]);
			buffer.append("\n");
		}
		return buffer.toString();
	}
}
