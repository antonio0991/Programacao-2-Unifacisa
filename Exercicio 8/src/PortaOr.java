public class PortaOr extends PortaAnd
{
	public boolean getSaida()
	{
		return getEntrada() | getEntrada2();
	}
}
