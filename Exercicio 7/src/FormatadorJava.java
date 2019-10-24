public class FormatadorJava
{
	private static final int TRANSFORMA_MAIUSCULA = 'A' - 'a';
	
	private String identificador;
	public void setIdentificador(String identificador)
	{
		this.identificador = identificador;
	}
	
	public String getFormatoAtributo()
	{
		return getFormatoCamelCase(false);
	}
	
	public String getFormatoMetodo()
	{
		return getFormatoAtributo() + "()";
	}
	
	public String getFormatoClasse()
	{
		return getFormatoCamelCase(true);
	}
	
	private String getFormatoCamelCase(boolean primeiraMinuscula)
	{
		String[] pedacos = identificador.toLowerCase().split(" ");
		StringBuilder buffer = new StringBuilder();
		for(int i=0; i<pedacos.length;i++)
		{
			String pedaco = pedacos[i];
			char letra = pedaco.charAt(0);
			if(i != 0 || !primeiraMinuscula)
			{
				letra = (char) (pedaco.charAt(0) + TRANSFORMA_MAIUSCULA);
			}
				buffer.append(letra);
			buffer.append(pedaco.substring(1));
		}
		return buffer.toString();
	}
}