
public class TelefoneInterurbano extends Telefone
{
	public static final long MASCARA_8_DIGITOS = 100000000;
	public static final long MASCARA_2_DIGITOS = 100;
	
	public long getCodigoDDD()
	{
		return getNumero() / (MASCARA_8_DIGITOS) % MASCARA_2_DIGITOS;
	}
	
	public String toString()
	{
		return "(" + getCodigoDDD() + ")" + super.toString();
	}
}
