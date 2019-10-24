public class ComparaString 
{
	private String palavra1, palavra2;
	
	public ComparaString(String palavra1, String palavra2)
	{
		this.palavra1 = palavra1;
		this.palavra2 = palavra2;
	}

	public String getStringAntes()
	{
		if(palavra1.compareTo(palavra2) < 0)
		{
			return palavra1;
		}
		return palavra2;
	}
	
	public String getStringDepois()
	{
		if(getStringAntes().equals(palavra1))
			return palavra2;
		return palavra1;
	}
}
