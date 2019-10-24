import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Inteiro
{
	private int numero;
	public Inteiro(int numero)
	{
		this.numero=numero;
	}
	public int getDigitos()

	{
		if(numero<100000)//5 digitos ou menos
		{
			if(numero<100)//1 ou 2
			{
				if(numero<10)
					return 1;
				else
					return 2;
			}
			else//3, 4 ou 5
			{
				if(numero<1000)
					return 3;
				else 
				{
					if(numero<10000)//4 ou 5
						return 4;
					else
						return 5;
				}
			}
		}
		else//6 ou mais
		{
			if(numero<10000000)//6 ou 7
			{
				if(numero<1000000)
					return 6;
				else
					return 7;
			}
			else//8, 9 ou 10
			{
				if(numero<100000000)
					return 8;
				else//9 ou 10
				{
					if(numero<1000000000)
						return 9;
					else
						return 10;
				}
			}	
		}
	}
	public int fatorial(int n)
	{
		int resultado;
		if(n==1||n==0)
			return 1;
		resultado = fatorial(n-1) * n;
		return resultado;
	}
	public int getNumero()
	{
		return numero;
	}
}

class ParDeNumeros
{
	private int x,y;
	public ParDeNumeros(int x, int y)
	{
		//X deve ser o menor número para a função getMMC não precisar de um caso para cada situação
		if(x < y) 
		{
		this.x = x;
		this.y = y;
		}
		else
		{
			this.x = y;
			this.y = x;
		}
	}
	
	public int getMMC()
	{
		 boolean isMMC = false;
		 int MMC = 0, multX = x, multY = y;
		 while(!isMMC)
		 {
			if(multX > multY)
			{
				multY += y;
			}
			else if(multX < multY)
			{
				multX += x;
			}
			else
			{
				MMC = multX;
				isMMC = true;
			}
		 }
		return MMC;
	}
	
	public int getMDC()
	{
		int div1 = x, div2 = y, resto = y%x;
		do
		{
			resto = div2%div1;
			div2 = div1;
			div1 = resto;
		}while(resto != 0);
		return div2;
	}
}

class PotenciaNumerica
{
	private int base, expoente;
	public PotenciaNumerica(int b, int e)
	{
		base = b;
		expoente = e;
	}
	public int getPotencia()
	{
		int potencia = base;
		if(expoente == 0)
			return 1;
		for(int i=1; i<expoente; i++)
		{
			potencia *= base;
		}
		
		return potencia;
	}
	
}

class VerificadorDeParidade
{
	private long binario;
	public VerificadorDeParidade(long binario)
	{
		this.binario = binario;
	}
	public boolean getParidade()
	{
		boolean paridade = false;
		int numerosDe1 = 0;
		String numero = Long.toString(binario);
		
		//Iterando pela string numero e checando se cada caractere é 0 ou 1
		for(int i=0; i<numero.length(); i++)
		{
			char c = numero.charAt(i);
			if(c == '1')
				numerosDe1++;
		}
		if(numerosDe1%2 == 0)
			paridade = true;
		
		return paridade;
	}
}

class Somatorio
{
	private int valInicio, valFinal;
	public Somatorio(int valInicio, int valFinal)
	{
		this.valInicio = valInicio;
		this.valFinal = valFinal;
	}
	public int somatoria()
	{
		int resultado = 0;
		for(int i = valInicio; i <= valFinal; i++)
		{
			resultado+=i;
		}
		return resultado;
	}
}

class Arabico
{
	private int arabico;
	public Arabico(int arabico)
	{
		this.arabico = arabico;
	}
	
	private int getUnidade()
	{
		return arabico%10;
	}
	
	private int getDezena()
	{
		/*Como o número é inteiro, há arredondamento para a parte inteira*/
		return arabico % 100 / 10;
	}
	
	private int getCentena()
	{
		return arabico % 1000 / 100;
	}
	
	private int getMilhar()
	{
		return arabico / 1000;
	}
	
	public String toRomano()
	{
		String romano = "";
		if(getMilhar() == 1)
		romano += "M";
		switch(getCentena())
		{
		case 0:
			break;
		case 1:
			romano+="C";
			break;
		case 2:
			romano+="CC";
			break;
		case 3:
			romano+="CCC";
			break;
		case 4:
			romano+="CD";
			break;
		case 5:
			romano+="D";
			break;
		case 6:
			romano+="DC";
			break;
		case 7:
			romano+="DCC";
		break;
			case 8:
			romano+="DCCC";
		break;
			case 9:
				romano+="CM";
				break;
			}
		switch(getDezena())
		{
		case 0:
			break;
		case 1:
			romano+="X";
			break;
		case 2:
			romano+="XX";
			break;
		case 3:
			romano+="XXX";
			break;
		case 4:
			romano+="XL";
			break;
		case 5:
			romano+="L";
			break;
		case 6:
			romano+="LX";
			break;
		case 7:
			romano+="LX";
			break;
		case 8:
			romano+="LX";
			break;
		case 9:
			romano+="XC";
			break;
		}
		
		switch(getUnidade())
		{
		case 0:
			break;
		case 1:
			romano+="I";
			break;
		case 2:
			romano+="II";
			break;
		case 3:
			romano+="III";
			break;
		case 4:
			romano+="IV";
			break;
		case 5:
			romano+="V";
			break;
		case 6:
			romano+="VI";
			break;
		case 7:
			romano+="VII";
			break;
		case 8:
			romano+="VIII";
			break;
		case 9:
			romano+="IX";
			break;
		}
		return romano;
	}
}

class SintNumText
{
	private int numero;
	public SintNumText(int numero)
	{
		this.numero = numero;
	}
	
	private int getUnidade()
	{
		return this.numero % 10;
	}
	
	private int getDezena()
	{
		/*Como o número é inteiro, há arredondamento para a parte inteira*/
		return this.numero % 100 / 10;
	}
	
	private int getCentena()
	{
		return this.numero % 1000 / 100;
	}
	
	private int getMilhar()
	{
		return this.numero / 1000;
	}
	
	private String MilharToText()
	{
		String texto = "";
		switch(getMilhar())
		{
		case 0:
		case 1:
			break;
		case 2:
			texto += " dois";
			break;
		case 3:
			texto += " tres";
			break;
		case 4:
			texto += " quatro";
			break;
		case 5:
			texto += " cinco";
			break;
		case 6:
			texto += " seis";
			break;
		case 7:
			texto += " sete";
			break;
		case 8:
			texto += " oito";
			break;
		case 9:
			texto += " nove";
			break;
		default:
			break;
		}
		if(getMilhar()>0)
			texto += " mil";
		return texto;
	}
	
	private String CentenaToText()
	{
		String texto = "";
		if(getMilhar() != 0 && getCentena() != 0 && getDezena()==0 && getUnidade()==0)
			texto+=" e";
		switch(getCentena())
		{
		case 0:
			break;
		case 1:
			if(getDezena()==0 && getUnidade()==0)
				texto+= " cem";
			else
				texto += " cento";
			break;
		case 2:
			texto += " duzentos";
			break;
		case 3:
			texto += " trezentos";
			break;
		case 4:
			texto += " quatrocentos";
			break;
		case 5:
			texto += " quinhentos";
			break;
		case 6:
			texto += " seiscentos";
			break;
		case 7:
			texto += " setecentos";
			break;
		case 8:
			texto += " oitocentos";
			break;
		case 9:
			texto += " novecentos";
			break;
		default:
			break;
		}
		return texto;
	}
	
	private String DezenaToText()
	{
		String texto = "";
		if((getMilhar()!=0||getCentena()!=0)&&getDezena()!=0)
			texto+=" e";
		switch(getDezena())
		{
		case 0:
			break;
		case 1:
			switch(getUnidade())
			{
			case 0:
				texto += " dez";
				break;
			case 1:
				texto += " onze";
				break;
			case 2:
				texto += " doze";
				break;
			case 3:
				texto += " treze";
				break;
			case 4:
				texto += " quatorze";
				break;
			case 5:
				texto += " quinze";
				break;
			case 6:
				texto += " dezesseis";
				break;
			case 7:
				texto += " dezessete";
				break;
			case 8:
				texto += " dezoito";
				break;
			case 9:
				texto += " dezenove";
				break;
			default:
				break;
			}
			break;
		case 2:
			texto += " vinte";
			break;
		case 3:
			texto += " trinta";
			break;
		case 4:
			texto += " quarenta";
			break;
		case 5:
			texto += " cinquenta";
			break;
		case 6:
			texto += " sessenta";
			break;
		case 7:
			texto += " setenta";
			break;
		case 8:
			texto += " oitenta";
			break;
		case 9:
			texto += " noventa";
			break;
		default:
			break;
		}
		return texto;
	}
	
	private String UnidadeToText()
	{
		String texto = "";
		if((getMilhar()!=0 || getCentena()!=0 || getDezena()!=0) && getDezena()!=1 && getUnidade()!=0)
			texto+=" e";
		if(getDezena() != 1)
		{
			switch(getUnidade())
			{
			case 1:
				texto += " um";
				break;
			case 2:
				texto += " dois";
				break;
			case 3:
				texto += " tres";
				break;
			case 4:
				texto += " quatro";
				break;
			case 5:
				texto += " cinco";
				break;
			case 6:
				texto += " seis";
				break;
			case 7:
				texto += " sete";
				break;
			case 8:
				texto += " oito";
				break;
			case 9:
				texto += " nove";
				break;
			default:
				break;
			
			}
		}
		return texto;
	}
	
	public String toText()
	{
		String text = "";
		text += MilharToText();
		text += CentenaToText();
		text += DezenaToText();
		text += UnidadeToText();
		return text;
	}
}

class Calendario
{
	private int[] dias = new int[31];
	private char[] semana = {'D', 'S', 'T', 'Q', 'Q', 'S', 'S'};
	GregorianCalendar data;
	public Calendario(int mes, int ano)
	{
		data = new GregorianCalendar(ano, mes - 1, 1);
		for(int i = 1; i<=data.getActualMaximum(Calendar.DAY_OF_MONTH); i++)
		{
			this.dias[i-1] = i;
		}
	}
	public void exibir()
	{
		printSemana();
		printNumeros();
		
	}
	
	private void printSemana()
	{
		for(int i=0; i<7; i++)
		{
			System.out.print(semana[i] + "  ");	
		}
			System.out.print("\n");
	}

	private void printNumeros()
	{
		int cont=0;
		while(cont!=data.get(Calendar.DAY_OF_WEEK)*3-3)
		{
			System.out.print(" ");
			cont++;
		}
		for(int i=1; i<=data.getActualMaximum(Calendar.DAY_OF_MONTH); i++)
		{

			if(i%7-data.get(Calendar.DAY_OF_WEEK)==0&&i!=0)
			{
				System.out.print("\n");
			}
			if(i>=10)
				System.out.print(dias[i-1] + " ");
			else
				System.out.print(dias[i-1] + "  ");
		}
	}
}

public class Main
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		/*
		//Questões 1 e 2
		System.out.print("Digite o número: ");
		Inteiro num = new Inteiro(scan.nextInt());
		System.out.println("A quantidade de dígitos é: " + num.getDigitos());
		System.out.println("O fatorial é: " + num.fatorial(num.getNumero()));
		
		//Questões 3 e 4
		System.out.print("Digite um número: ");
		int x = scan.nextInt();
		System.out.print("Digite outro número: ");
		int y = scan.nextInt();
		ParDeNumeros par1 = new ParDeNumeros(x,y);
		System.out.println("O MMC entre esses números é: " + par1.getMMC());
		System.out.println("O MDC entre esses números é: " + par1.getMDC());
		
		//Questão 5
		System.out.print("Digite a base: ");
		int base = scan.nextInt();
		System.out.print("Digite o expoente: ");
		int expoente = scan.nextInt();
		PotenciaNumerica pow = new PotenciaNumerica(base, expoente);
		System.out.print("O valor é: " + pow.getPotencia());
		
		//Questão 6
		System.out.print("Digite: ");
		long binario = scan.nextLong();
		VerificadorDeParidade paridade = new VerificadorDeParidade(binario);
		System.out.print("Paridade: " + paridade.getParidade());
		
		//Questão 7
		 System.out.print("Digite o valor inicial: ");
		 int inicio = scan.nextInt();
		 System.out.print("Digite o valor inicial: ");
		 int fim = scan.nextInt();
		 Somatorio soma = new Somatorio(inicio, fim);
		 System.out.println("A somatória é: " + soma.somatoria());
		 
		//Questão 8
		 System.out.print("Digite o número: ");
		 int numero = scan.nextInt();
		 Arabico arabico = new Arabico(numero);
		 System.out.println("A representação em romano é: " + arabico.toRomano());

		//Questão 9
		for(int i=0; i<20; i++) {
		 System.out.print("Digite o número: ");
		 int numero = scan.nextInt();
		 SintNumText snt = new SintNumText(numero);
		 System.out.println("Por extenso: " + snt.toText());
		}*/
		
		//Questão 10
		System.out.print("Insira o ano: ");
		int ano = scan.nextInt();
		System.out.print("Insira o mês: ");
		int mes = scan.nextInt();
		Calendario cal = new Calendario(mes, ano);
		cal.exibir();
		
		scan.close();
	}

}
