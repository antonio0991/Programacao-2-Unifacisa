public class StringInversa
{
	private String original;
	
	public StringInversa(String original)
	{
		this.original = original;
	}

	public String getInversa()
	{
		StringBuffer inversa = new StringBuffer();
		for(int i=0;i<original.length();i++)
		{
			inversa.append(original.charAt(original.length()-i));
		}
		return inversa.toString();
	}
}
