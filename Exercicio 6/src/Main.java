import java.util.Scanner;
import java.util.Date;

class PontoCartesiano
{
	private int x,y;
	private String rotulo;
	public PontoCartesiano(int x, int y, String rotulo) 
	{
		this.x = x;
		this.y = y;
		this.rotulo = rotulo;
	}
	public PontoCartesiano getCopia()
	{
		PontoCartesiano copia = new PontoCartesiano(x,y,rotulo);
		return copia;
	}
	@Override
	public String toString() {
		return "x: " + x + "\ny: " + y + "\nrotulo: " + rotulo;
	}
	
}

class DescritorMusical
{
	private String artista, album, nome;
	private int numero;
	public DescritorMusical(String artista, String album, String nome, int numero)
	{
		this.artista = artista;
		this.album = album;
		this.nome = nome;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "artista: " + artista + "\nalbum: " + album + "\nnome: " + nome + "\nnumero: " + numero;
	}
	public DescritorMusical getCopia()
	{
		DescritorMusical copia = new DescritorMusical(artista, album, nome, numero);
		return copia;
	}
}

class Contato
{
	String nome, email;
	long telefone;
	public Contato(String nome, String email, long telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "nome: " + nome + "\nemail: " + email + "\ntelefone: " + telefone;
	}
	private boolean isNull(String atributo)
	{
		if(atributo == null || atributo.isBlank())
		{
			return true;
		}
		return false;
	}
	public void merge(Contato outro)
	{
		if(isNull(outro.nome))
		{
			outro.nome = this.nome;
		}
		if(isNull(outro.email))
		{
			outro.email = this.email;
		}
		if(outro.telefone == 0)
		{
			outro.telefone = this.telefone;
		}
	}
}

class Pessoa
{
	private static final double PRIMEIRA_ALIQUOTA = 0.08;
	private static final double PRIMEIRA_FAIXA_SALARIAL = 1174.86;
	private static final double SEGUNDA_ALIQUOTA = 0.09;
	private static final double SEGUNDA_FAIXA_SALARIAL = 1958.10;
	private static final double TERCEIRA_ALIQUOTA = 0.11;
	private static final double TERCEIRA_FAIXA_SALARIAL = 3916.20;
	private static final double TETO_CONTRIBUICAO = TERCEIRA_FAIXA_SALARIAL * TERCEIRA_ALIQUOTA;
	
	private double salario; 
	
	public Pessoa(double salario) {
		this.salario = salario;
	}
	
	private double calculaContribuicao()
	{
		if(salario<=PRIMEIRA_FAIXA_SALARIAL)
			return salario*PRIMEIRA_ALIQUOTA;
		else if(salario<=SEGUNDA_FAIXA_SALARIAL)
			return salario*SEGUNDA_ALIQUOTA;
		else if(salario<=TERCEIRA_FAIXA_SALARIAL)
			return salario*TERCEIRA_ALIQUOTA;
		else
			return TETO_CONTRIBUICAO;
	}
	
	public double getContribuicao()
	{
		return (double) Math.round(calculaContribuicao()*100/100);
	}
	
	public double getSalarioLiquido() 
	{
		return salario-getContribuicao();
	}
	
	public double getSalarioBruto()
	{
		return salario;
	}
}

class Ficha
{
	private static int valor = 0;
	private Date atendimento = new Date(System.currentTimeMillis());
	
	public Ficha()
	{
		valor++;
	}
	
	@Override
	public String toString() {
		return valor + " " + atendimento;
	}
}

class Atleta
{
	private static double maiorPeso = 0, maiorAltura = 0;
	
	private String nome;
	private double peso, altura;
	public Atleta(String nome, double peso, double altura)
	{
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		if(peso>maiorPeso)
			maiorPeso = peso;
		if(altura>maiorAltura)
			maiorAltura = altura;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public double getPeso()
	{
		return peso;
	}
	
	public double getAltura()
	{
		return altura;
	}
	
	public static double getMaiorPeso()
	{
		return maiorPeso;
	}
	
	public static double getMaiorAltura()
	{
		return maiorAltura;
	}
	
}

class Calculadora
{
	public static double somar(double a, double b)
	{
		return a+b;
	}
	public static double subtrair(double a, double b)
	{
		return a-b;
	}
	public static double multiplicar(double a, double b)
	{
		return a*b;
	}
	public static double dividir(double a, double b)
	{
		return a/b;
	}
}

class Momento
{
	private static int VALOR_PADRAO = 0;
	
	private int dia, mes, ano, hora, minuto, segundo;

	public Momento(int dia, int mes, int ano, int hora, int minuto, int segundo)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	public Momento(int dia, int mes, int ano, int hora, int minuto)
	{
		this(dia, mes, ano, hora, minuto, VALOR_PADRAO);
	}
	public Momento(int dia, int mes, int ano)
	{
		this(dia, mes, ano, VALOR_PADRAO, VALOR_PADRAO);
	}
	
	public String toString()
	{
		return dia + "/" + mes + "/" + ano + " " + hora + ":" + minuto + ":" + segundo;
	}
}

class ConversorDePotencia
{
	private static final double CV_PARA_HP = 0.9863;
	private static final double CV_PARA_KW = 0.7355;
	
	public static double getHP(double cv)
	{
		return cv*CV_PARA_HP;
	}
	
	public static double getKW(double cv)
	{
		return cv*CV_PARA_KW;
	}
}

class ConversorDeComprimento
{
	private static final double METROS_PARA_JARDAS = 1.09361;
	private static final double METROS_PARA_POLEGADAS = 39.36996;
	
	public static double getJardas(double metros)
	{
		return metros*METROS_PARA_JARDAS;
	}
	
	public static double getPolegadas(double metros)
	{
		return metros*METROS_PARA_POLEGADAS;
	}
	
}

public class Main
{

	private static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//Questão 1
		/*PontoCartesiano p1 = new PontoCartesiano(leInt("Digite x: "), leInt("Digite y: "), leString("Digite o rótulo: "));
		PontoCartesiano p2 = p1.getCopia();
		System.out.print(p1.toString() + "\n fornece \n" + p2.toString());
		
		//Questão 2
		DescritorMusical d1 = new DescritorMusical(leString("Digite o artista: "), leString("Digite o album: "), leString("Digite o nome: "), leInt("Digite o numero: "));
		DescritorMusical d2 = d1.getCopia();
		System.out.print(d1.toString() + "\nfornece\n" + d2.toString());
		
		//Questão 3
		Contato c1 = new Contato(leString("Digite o nome: "), leString("Digite o email: "), leLong("Digite o telefone: "));
		Contato c2 = new Contato(leString("Digite o nome: "), leString("Digite o email: "), leLong("Digite o telefone: "));
		c1.merge(c2);
		System.out.print(c2.toString());
		
		//Questão 4
		Pessoa cidadao = new Pessoa(leDouble("Digite o salário: "));
		System.out.print(cidadao.getSalarioBruto() + " fornece " + cidadao.getContribuicao() + " " + cidadao.getSalarioLiquido());
		
		
		//Questão 5
		int num=leInt("Digite o número de fichas: ");
		Ficha fichas[] = new Ficha[num];
		System.out.print(num + " fornece ");
		for (int i=0;i<num-1; i++)
		{
			fichas[i] = new Ficha();
			System.out.print(fichas[i].toString() + ", ");
		}
		fichas[num-1] = new Ficha();
		System.out.print(fichas[num-1].toString());
		
		
		//Questão 6
		Atleta a1 = new Atleta(leString("Digite o nome: "), leDouble("Digite o peso: "), leDouble("Digite a altura:"));
		Atleta a2 = new Atleta(leString("Digite o nome: "), leDouble("Digite o peso: "), leDouble("Digite a altura:"));
		System.out.print("Maior peso: " + Atleta.getMaiorPeso() + "\nMaior altura: " + Atleta.getMaiorAltura());
		
		
		//Questão 7
		double a = leDouble("Insira a: ");
		char operacao = leChar("Insira a operação: ");
		double b = leDouble("Insira b: ");
		System.out.println(calcular(a, b, operacao));
		
		
		//Questão 8
		Momento m1 = new Momento(leInt("Insira o dia: "), leInt("Insira o mes: "), leInt("Insira o ano: "));
		System.out.println(m1.toString());*/
		
		//Questão 9
		//Questão 10
	}
	
	private static double calcular(double a, double b, char operacao)
	{
		switch(operacao)
		{
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
		case 'x':
			return a*b;
		case '/':
		case ':':
			return a/b;
		default:
			return operacao;
		}
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
