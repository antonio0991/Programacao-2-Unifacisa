public class Main 
{

	public static void main(String[] args)
	{
		

	}



	private static String leString(String mensagem)
	{
		System.out.print(mensagem);
		return TECLADO.nextLine();
	}
	
	private static int leInt(String mensagem)
	{
		
		return Integer.parseInt(leString(mensagem));
	}
	
	private static long leLong(String mensagem)
	{
		return Long.parseLong(leString(mensagem));
	}
	
	private static double leDouble(String mensagem)
	{
		return Double.parseDouble(leString(mensagem));
	}
	
	private static char leChar(String mensagem)
	{
		return leString(mensagem).charAt(0);
	}
}
