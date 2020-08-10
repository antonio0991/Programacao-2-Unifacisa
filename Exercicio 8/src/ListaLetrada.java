public class ListaLetrada extends Lista
{
	public String toString()
	{
		StringBuilder lista = new StringBuilder();
		for (int i = 0; i<4; ++i)
		{
			lista.append((char)('a' + i));
			lista.append(") ");
			lista.append(getItens()[i]);
			lista.append("\n");
		}
		lista.append('e');
		lista.append(") ");
		lista.append(getItens()[5]);
		return lista.toString();
	}
}
