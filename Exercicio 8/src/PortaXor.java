public class PortaXor extends PortaAnd
{
	public boolean getSaida()
	{
		return getEntrada() ^ getEntrada2();
	}
}
