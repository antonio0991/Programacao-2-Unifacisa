public class ListaNumerada extends Lista
{
	public String toString()
	{
		StringBuilder lista = new StringBuilder();
		for (int i = 0; i<4; ++i)
		{
			lista.append(i);
			lista.append(") ");
			lista.append(getItens()[i]);
			lista.append("\n");
		}
		lista.append(5);
		lista.append(") ");
		lista.append(getItens()[5]);
		return lista.toString();
	}
}
