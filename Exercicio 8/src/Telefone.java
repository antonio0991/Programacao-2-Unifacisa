public class Telefone
{
	private static final int MASCARA_4_DIGITOS = 10000;
	private long numero;
	
	public long getNumero()
	{
		return numero;
	}
	
	public String toString()
	{
		return (numero / MASCARA_4_DIGITOS) % MASCARA_4_DIGITOS + "-" + numero % MASCARA_4_DIGITOS;
	}
}
