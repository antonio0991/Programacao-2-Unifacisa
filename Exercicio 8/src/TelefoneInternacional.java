
public class TelefoneInternacional extends TelefoneInterurbano
{
	private static final long MASCARA_10_DIGITOS = 10000000000l;
	
	public long getCodigoPais()
	{
		return getNumero() / MASCARA_10_DIGITOS;
	}
	public String toString()
	{
		return "(" + getCodigoDDD() + ")" + super.toString();
	}
}
