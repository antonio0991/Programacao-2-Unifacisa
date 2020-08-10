import java.util.Scanner;

public class Main
{
	public static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args)
	{
		/*Telefone telefone = null;
		switch(leString("Digite tipo: "))
		{
		case "telefone":
			telefone = new Telefone();
			break;
		case "interurbano":
			telefone = new TelefoneInterurbano();
			break;
		case "internacional":
			telefone = new TelefoneInternacional();
			break;
		}
		telefone.setNumero(leLong("Digite o número: "));*/
		ListaCentralizada lista = new ListaCentralizada();
		lista.setQteColunas(leInt("Colunas: "));
		for(int i=0; i<5; ++i)
		{
			lista.addItem(leString("Insira item: "));
		}
		System.out.print(lista);
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
