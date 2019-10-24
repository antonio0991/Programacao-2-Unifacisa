public class ContadorDeVogais
{
	private String palavra;

	public ContadorDeVogais(String palavra)
	{
		this.palavra = palavra;
	}
	
	public int getQteVogais()
	{
		int cont = 0;
		for(int i=0; i<palavra.length(); i++)
		{
			if(isVogal(Character.toUpperCase(palavra.charAt(i))))
				cont++;	
		}
		return cont;
	}
	
	private boolean isVogal(char c)
	{
		if(c == 'A' || c=='Á' || c=='Â' || c=='Ã' || c=='À')
			return true;
		else if(c == 'E' || c == 'É' || c == 'Ê' || c == 'È')
			return true;
		else if(c == 'I' || c == 'Í' || c == 'Î' || c == 'Ì')
			return true;
		else if(c == 'O' || c == 'Ó' || c == 'Ô' || c == 'Ò')
			return true;
		else if(c == 'U' || c == 'Ú' || c == 'Û' || c == 'Ù' || c == 'Ü')
			return true;
		
		return false;
	}
}
