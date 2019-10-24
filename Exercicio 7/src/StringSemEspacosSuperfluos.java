public class StringSemEspacosSuperfluos 
{
	private String frase;

	public StringSemEspacosSuperfluos(String frase)
	{
		this.frase = frase;
	}
	
	public String getStringFormatada()
	{
		String[] palavras = frase.split(" ");
		StringBuffer formato = new StringBuffer();
		for(int i = 0; i<palavras.length; i++)
		{
			if(!palavras[i].isBlank())
				formato.append(palavras[i] + " ");
		}
		return formato.toString().trim();
	}
}
