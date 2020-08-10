public class ListaAlinhadaEsquerda extends ListaAlinhada
{
	public String toString()
	{
		StringBuilder buffer = new StringBuilder();
		 for(int i = 0; i<5; ++i)
		{
			buffer.append(getItens()[i]);
			buffer.append("\n");
		}
		return buffer.toString().trim();
	}
}
