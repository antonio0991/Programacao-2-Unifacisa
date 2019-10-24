import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.Math;

class Numero
{
	private int num;
	public Numero(int n)
	{
		num = n;
	}
	
	public boolean isImpar()
	{
		if(num%2 == 0)
			return false;
		else
			return true;
	}
	
	public int abs()
	{
		if(num < 0)
			return num*= -1;
		else
			return num;
	}
}

class Comparador2
{
	private float num1, num2;
	
	public Comparador2(float x,float  y)
	{
		num1 = x;
		num2 = y;
	}
	
	public float retornaMaior()
	{
		if(num1>num2)
			return num1;
		else
			return num2;
	}
	
	public float retornaMenor()
	{
		if(num1<num2)
			return num1;
		else
			return num2;
	}
}

class Comparador3
{
	float num1, num2, num3;
	
	public Comparador3(float x, float y, float z)
	{
		num1 = x;
		num2 = y;
		num3 = z;
	}
	
	public float retornaMaior()
	{
		if(num1>num2 && num1>num3)
			return num1;
		else if (num2>num1 && num2>num3)
			return num2;
		else
			return num3;
	}
	
	public float retornaMenor()
	{
		if(num1<num2 && num1<num3)
			return num1;
		else if (num2<num1 && num2<num3)
			return num2;
		else
			return num3;	
	}
}

class SegundoGrau
{
	float a,b,c, delta;
	
	public SegundoGrau(float x, float y, float z)
	{
		a = x;
		b = y;
		c = z;
		delta = b*b - 4*a*c;
	}
	
	float getDelta()
	{
		return delta;
	}
	
	public int numeroRaizes()
	{
		if(delta>0)
			return 2;
		else if(delta == 0)
			return 1;
		else
			return 0;
	}
	
	public void resposta()
	{
		if(numeroRaizes() == 2)
		{
			double x1, x2;
			x1 = ((b*(-1)) + Math.sqrt(delta))/(2*a);
			x2 = ((b*(-1)) - Math.sqrt(delta))/(2*a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		else if(numeroRaizes() == 1)
		{
			double x1;
			x1 = ((b*(-1)) + Math.sqrt(delta))/(2*a);
			System.out.println("x1 = " + x1);
		}
		else
		{
			System.out.println("Não possui raizes reais");
		}
	}
}

class Mes
{
	private int numero, ano;
	
	public Mes(int numero)
	{
		this.numero = numero;
	}
	
	public String getNome()
	{
		String nomeMes;
		switch(numero)
		{
			case 1:
				nomeMes = "Janeiro";
				break;
			case 2:
				nomeMes =  "Fevereito";
				break;
			case 3:
				nomeMes =  "Março";
				break;
			case 4:
				nomeMes =  "Abril";
				break;
			case 5:
				nomeMes =  "Maio";
				break;
			case 6:
				nomeMes =  "Junho";
				break;
			case 7:
				nomeMes =  "Julho";
				break;
			case 8:
				nomeMes =  "Agosto";
				break;
			case 9:
				nomeMes =  "Setembro";
				break;
			case 10:
				nomeMes =  "Outubro";
				break;
			case 11:
				nomeMes =  "Novembro";
				break;
			case 12:
				nomeMes =  "Dezembro";
				break;
			default:
				nomeMes =  "Mês inválido";
				break;
		}
		return nomeMes;
	}
	
	public Mes(String nomeMes)

	{
		switch(nomeMes)
		{
			case "Janeiro":
				numero = 1;
				break;
			case "Fevereiro":
				numero = 2;
				break;
			case "Março":
				numero = 3;
				break;
			case "Abril":
				numero = 4;
				break;
			case "Maio":
				numero = 5;
				break;
			case "Junho":
				numero = 6;
				break;
			case "Julho":
				numero = 7;
				break;
			case "Agosto":
				numero = 8;
				break;
			case "Setembro":
				numero = 9;
				break;
			case "Outubro":
				numero = 10;
				break;
			case "Novembro":
				numero = 11;
				break;
			case "Dezembro":
				numero = 12;
				break;
			default:
				numero = 0;
				break;
		}
	}

	public int diasDoMes()
	{
		switch(numero)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			if(ano%4 == 0)
				return 29;
			else
				return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 31;
		default:
			return 0;
		}
	}

	public void setAno(int a)
	{
		ano = a;
	}
	
	public int getAno()
	{
		return ano;
	}
	
	public int getnumero()
	{
		return numero;
	}
	
}

class Angulo
{
	private float angulo;
	private int quadrante;
	
	public Angulo(float a)
	{
		angulo = a;
		associaQuadrante();
	}
	
	private void associaQuadrante()
	{
		float anguloSimp = angulo%360;
		
		if(anguloSimp>0 && anguloSimp<90)
			quadrante = 1;
		else if(anguloSimp>90 && anguloSimp<180)
			quadrante = 2;
		else if(anguloSimp>180 && anguloSimp<270)
			quadrante = 3;
		else if(anguloSimp>270 && anguloSimp<360)
			quadrante = 4;
		else
			quadrante = 0;
	}

	public float getQuadrante()
	{
		return quadrante;
	}
}

class Ano
{
	private int ano;
	
	public Ano(int a)
	{
		ano = a;
	}
	
	public boolean isBissexto()
	{
		if(ano%4 == 0)
			return true;
		else
			return false;
	}
}

class Triangulo
{
	double l1, l2, l3;
	
	public Triangulo(double x, double y, double z)
	{
		l1 = x;
		l2 = y;
		l3 = z;
	}
	
	public boolean isTriangulo()
	{
		if(l1+l2>l3 && l1+l3>l2 && l2+l3>l1)
			return true;
		else
			return false;
	}
	
	public String tipo()
	{
		if(isTriangulo()) 
		{
			if(l1 == l2 && l1 == l3)
				return "equilátero";
			else if(l1 == l2 || l1 == l3 || l2 == l3)
				return "isósceles";
			else
				return "escaleno";
		}
		else
			return "nenhuma";
	}
}

class Aniversario
{
	private int diaNasc, mesNasc, anoNasc, diaHoje, mesHoje, anoHoje;
	public Aniversario()
	{
		GregorianCalendar data = new GregorianCalendar();
		data.setTimeInMillis(System.currentTimeMillis());
		diaHoje = data.get(Calendar.DAY_OF_MONTH);
		mesHoje = data.get(Calendar.MONTH) + 1;
		anoHoje = data.get(Calendar.YEAR);
	}
	
	public void setDiaNasc(int diaNasc)
	{
		this.diaNasc = diaNasc;
	}
	
	public void setMesNasc(int mesNasc)
	{
		this.mesNasc = mesNasc;
	}
	
	public void setAnoNasc(int anoNasc)
	{
		this.anoNasc = anoNasc;
	}
	
	public int getIdade()
	{
		int idade = anoHoje - anoNasc - 1;
		if(mesNasc<mesHoje)
			idade++;
		else if(mesNasc == mesHoje)
		{
			if(diaNasc <= diaHoje)
				idade++;
		}
		return idade;
	}
	
}

class ProximaRefeicao
{
	private int hora, minuto;
	
	public ProximaRefeicao(int h, int m)
	{
		hora = h;
		minuto = m;
	}

	public String proxima()
	{
		if (hora == 6 && minuto <=30 || hora < 6 && minuto <60 || hora < 24 && minuto < 60 && hora > 19 || hora == 19 && minuto > 45 && minuto < 60)
			return "café da manhã";
		else if (hora < 13 && minuto < 60)
			return "almoço";
		else if (hora <24 && minuto < 60)
			return "jantar";
		else
			return "horario inválido";
	}
}

class Avaliacao
{
	private int aulas, faltas;
	private float nota1, nota2, nota3;
	
	public Avaliacao(int aulas, int faltas, float nota1, float nota2, float nota3)
	{
		this.setAulas(aulas);
		this.setFaltas(faltas);
		this.setNota1(nota1);
		this.setNota2(nota2);
		this.setNota3(nota3);
	}
	
	public String getAprovacao()
	{
		if(getFrequencia() >= 75 && getMedia() >= 7)
			return "aprovado";
		else if(getFrequencia() <= 75)
			return "reprovado por falta";
		else
			return "reprovado";
	}
	
	public float getMedia()
	{
		return (nota1+nota2+nota3)/3;
	}

	public double getFrequencia()
	{
		double frequencia = (double)1 - (double)faltas/aulas;
		double frequenciaArredondada = (double)Math.round(frequencia*100)/100;
		return frequenciaArredondada*100;
	}
	
	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public void setAulas(int aulas) {
		this.aulas = aulas;
	}
	
}

class ConsumoEnergia
{
	private int consumo;
	
	public ConsumoEnergia(int consumo)
	{
		this.consumo = consumo;
	}
	
	public float getValor()
	{
		if(consumo > 500)
		{
			float diferenca = consumo - 500;
			return (float)0.15 * diferenca + 30;
		}
		else if(consumo > 200)
		{
			float diferenca = consumo - 200;
			return (float)(diferenca * 0.12 + 18);
		}
		else if(consumo > 100)
		{
			float diferenca = consumo - 100;
			return (float)(diferenca * 0.10 + 8);
		}
		else
			return (float)(consumo * 0.08);
	}
}

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//Questões 1 e 2
		
		System.out.println("Digite o número");
		Numero n = new Numero(scan.nextInt());
		System.out.println("É impar? " + n.isImpar());
		System.out.println("O valor absoluto é: " + n.abs());
		
		//Questões 3 e 4
		System.out.println("Digite número: ");
		float num1 = scan.nextFloat();
		System.out.println("Digite número: ");
		float num2 = scan.nextFloat();
		Comparador2 comp2 = new Comparador2(num1, num2);
		System.out.println("O maior valor é " + comp2.retornaMaior());
		System.out.println("O menor valor é " + comp2.retornaMenor());
		
		//Questões 5 e 6
		System.out.println("Digite número: ");
		num1 = scan.nextFloat();
		System.out.println("Digite número: ");
		num2 = scan.nextFloat();
		System.out.println("Digite número: ");
		float num3 = scan.nextFloat();
		Comparador3 comp3 = new Comparador3(num1,num2,num3);
		System.out.println("O maior valor é " + comp3.retornaMaior());
		System.out.println("O menor valor é " + comp3.retornaMenor());
		
		//Questão 7
		System.out.println("Digite 'a': ");
		float a = scan.nextFloat();
		System.out.println("Digite 'b': ");
		float b = scan.nextFloat();
		System.out.println("Digite 'c': ");
		float c = scan.nextFloat();
		SegundoGrau eq = new SegundoGrau(a,b,c);
		System.out.println("Delta = " + eq.getDelta());
		eq.resposta();
		
		//Questão 8
		System.out.println("Digite o número do mês: ");
		Mes mesNumero = new Mes(scan.nextInt());
		System.out.println("O mês é: " + mesNumero.getNome());
		
		//Questões 9 e 10
		System.out.println("Digite o nome do mês: ");
		Mes mesNome = new Mes(scan.next());
		System.out.println("Digite o ano: ");
		mesNome.setAno(scan.nextInt());
		System.out.println("O mês é: " + mesNome.getnumero());
		System.out.println("O ano é: " + mesNome.getAno());
		System.out.println("A quantidade de dias do mês é: " + mesNome.diasDoMes());
		
		//Questão 11
		System.out.println("Digite o valor do angulo: ");
		Angulo ang = new Angulo (scan.nextFloat());
		System.out.println("Esse ângulo pertence ao quadrante: " + ang.getQuadrante());
		
		//Questão 12
		System.out.println("Digite o ano: ");
		Ano ano = new Ano(scan.nextInt());
		System.out.println("Bissexto: " + ano.isBissexto());
		
		
		//Questões 13 e 14
		System.out.println("Digite o lado 1: ");
		double lado1 = scan.nextDouble();
		System.out.println("Digite o lado 2: ");
		double lado2 = scan.nextDouble();
		System.out.println("Digite o lado 3: ");
		double lado3 = scan.nextDouble();
		Triangulo tri = new Triangulo(lado1, lado2, lado3);
		System.out.println(tri.isTriangulo());
		System.out.println(tri.tipo());
		
		//Questão 15
		
		Aniversario aniversario = new Aniversario();
		System.out.print("Digite o dia: ");
		aniversario.setDiaNasc(scan.nextInt());
		System.out.print("Digite o mês: ");
		aniversario.setMesNasc(scan.nextInt());
		System.out.print("Digite o ano: ");
		aniversario.setAnoNasc(scan.nextInt());
		System.out.print("A idade da pessoa é: " + aniversario.getIdade());
		
		//Questão 16
		System.out.println("Digite a hora: ");
		int hora = scan.nextInt();
		System.out.println("Digite os minutos: ");
		int minuto = scan.nextInt();
		ProximaRefeicao comida = new ProximaRefeicao(hora,minuto);
		System.out.println("A proxima refeição será: " + comida.proxima());
		
		//Questão 17
		System.out.print("Digite a nota 1: ");
		float nota1 = scan.nextFloat();
		System.out.print("Digite a nota 2: ");
		float nota2 = scan.nextFloat();
		System.out.print("Digite a nota 3: ");
		float nota3 = scan.nextFloat();
		System.out.print("Digite o número de aulas: ");
		int aulas = scan.nextInt();
		System.out.print("Digite o número de faltas: ");
		int faltas = scan.nextInt();
		Avaliacao avaliacao = new Avaliacao(aulas, faltas, nota1, nota2, nota3);
		System.out.println("Média do aluno: " + avaliacao.getMedia());
		System.out.println("Frequencia do aluno: " + avaliacao.getFrequencia() + "%");
		System.out.println("O aluno foi: " + avaliacao.getAprovacao());
		
		//Questão 18
		System.out.print("Digite o consumo: ");
		ConsumoEnergia consumo = new ConsumoEnergia(scan.nextInt());
		System.out.println("Valor do consumo: " + consumo.getValor());
		
		scan.close();
	}

}
