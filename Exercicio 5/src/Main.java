import java.util.Scanner;

class Inteiro
{
	private int numero;
	public Inteiro(int numero)
	{
		this.numero = numero;
	}
	
	private int getQteDiv()
	{
		int qteDiv=0;
		
		for(int i=1; i<=numero; i++)
		{
			if(numero%i==0)
				qteDiv++;
		}
		
		return qteDiv;
	}
	
	public int[] getDivisores()
	{
		int[] divisores = new int[getQteDiv()];
		int indice=0;
		for(int i=1; i<=numero/2; i++)
		{
			if(numero%i==0)
			{
				divisores[indice] = i;
				indice++;
			}
		}
		divisores[divisores.length-1] = numero;
		return divisores;
	}
}

class VetorDeReais
{
	private double[] numeros = new double[4];
	public VetorDeReais(double[] numeros)
	{
		this.numeros = numeros;
	}
	
	public double getMaior()
	{
		double maior = numeros[0];
		for(int i = 1; i<numeros.length; i++)
		{
			if(maior<numeros[i])
				maior=numeros[i];
		}
		
		return maior;
	}
	
	public double getMenor()
	{
		double menor = numeros[0];
		for(int i = 1; i<numeros.length; i++)
		{
			if(menor>numeros[i])
				menor=numeros[i];
		}
		
		return menor;
	}
	
	public double getMedia()
	{
		double soma =0 , media;
		for(int i = 0; i<numeros.length; i++)
		{
			soma+=numeros[i];
		}
		media = soma/4;
		return media;
	}
}

class ListaDeNumeros
{
	private int[] numeros = new int[5];
	private int posicao = 0;
	public boolean repeticaoExists()
	{
		boolean repeticao = false;
		for(int i = 0; i<posicao; i++)
		{
			for(int j=i+1; j<posicao; j++)
			{
				if(numeros[i] == numeros[j])
					repeticao = true;
			}
		}
		return repeticao;
	}
	
	public void addValor(int valor)
	{
		if(posicao == numeros.length)
		{
			int[] novoArray = new int[2*posicao];
			for(int i=0; i<posicao; i++)
			{
				novoArray[i] = numeros[i];
			}
			numeros = novoArray;
		}
		
		numeros[posicao] = valor;
		posicao++;
	}
}

class ListaDeProcurados
{
	private String[] nomes = new String[1];
	private int posicao = 0;
	public void addNome(String nome)
	{
		if(posicao == nomes.length)
		{
			String[] novoArray = new String[2*posicao];
			for(int i=0; i<posicao; i++)
			{
				novoArray[i] = nomes[i];
			}
			nomes = novoArray;
		}
		nomes[posicao] = nome;
		posicao++;
	}
	
	public boolean hasNome(String nome)
	{
		boolean achou = false;
		for(int i=0; i<posicao; i++)
		{
			if(nomes[i].equals(nome))
				achou = true;
		}
		return achou;
	}
}

class Campeonato
{
	String[] times = new String[2];
	String[] permutacoes;
	int numeroTimes;
	public void addTime(String time)
	{
		if(numeroTimes == times.length)
		{
			String[] novoArray = new String[2*numeroTimes];
			for(int i=0; i<numeroTimes; i++)
			{
				novoArray[i] = times[i];
			}
			times = novoArray;
		}
		times[numeroTimes] = time;
		numeroTimes++;
	}
	
	public void getTimes()
	{
		for(int i = 0; i<numeroTimes; i++)
		{
			System.out.print(times[i] + " ");
	
		}
	}
	public void printPartidas()
	{
		permutacoes = setPermutacoes();
		for(int i = 0; i<permutacoes.length; i++)
		{
			System.out.print(permutacoes[i] + " ");
		}
	}
	
	private String[] setPermutacoes()
	{
		int numeroPermutacoes = ((numeroTimes-1)*(numeroTimes-1) + numeroTimes-1)/2;//Numero triangular de n T(n) = n+(n-1)+(n-2)+...+1 = (n^2+n)/2
		String[] permutacoes = new String[numeroPermutacoes];
		int cont=0;
		for(int i=0; i<numeroTimes; i++)
		{
			for(int j = i+1; j<numeroTimes; j++)
			{
				permutacoes[cont] = times[i] + " X " + times[j];
				cont++;
			}
		}
		return permutacoes;
	}
}

public class Main 
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		/*
		//Questão 1
		System.out.print("Digite o número: ");
		Inteiro inteiro = new Inteiro(teclado.nextInt());
		System.out.println("Os divisores são: " + Arrays.toString(inteiro.getDivisores()));
		
		//Questões 2 ,3 e 4
		double numeros[] = new double[4];
		for(int i = 0; i<4; i++)
		{
			System.out.print("Digite e adicione no array o valor: ");
			numeros[i] = teclado.nextDouble();
		}
		VetorDeReais reais = new VetorDeReais(numeros);
		System.out.println("O maior valor no array é: " + reais.getMaior());
		System.out.println("O menor valor no array é: " + reais.getMenor());
		System.out.println("O valor da média entre os valores é: " + reais.getMedia());
		
		
		//Questão 5
		ListaDeNumeros lista  = new ListaDeNumeros();
		System.out.print("Digite e adicione no array o valor: ");
		String valor = teclado.nextLine();
		while(!valor.isEmpty())
		{
			lista.addValor(Integer.parseInt(valor));
			System.out.print("Digite e adicione no array o valor: ");
			valor = teclado.nextLine();
		}
		System.out.println("A lista possui valores repetidos: " + lista.repeticaoExists());
		
		
		//Questão 6
		ListaDeProcurados procurados = new ListaDeProcurados();
		System.out.println("Cadastro\n");
		System.out.print("Digite um nome: ");
		String nome = teclado.nextLine();
		while(!nome.isEmpty())
		{
			procurados.addNome(nome);
			System.out.print("Digite um nome: ");
			nome = teclado.nextLine();
		}
		
		System.out.println("Busca: ");
		System.out.print("Digite um nome: ");
		String busca = teclado.nextLine();
		while(!busca.isEmpty())
		{
			System.out.println("O nome foi encontrado: " + procurados.hasNome(busca));
			System.out.print("Digite um nome: ");
			busca = teclado.nextLine();
		}*/
		
		//Questão 7
		Campeonato futebol = new Campeonato();
		System.out.println("Cadastro\n");
		System.out.print("Digite um time: ");
		String time = teclado.nextLine();
		while(!time.isEmpty())
		{
			futebol.addTime(time);
			System.out.print("Digite um time: ");
			time = teclado.nextLine();
		}
		System.out.print("Times: ");
		futebol.getTimes();
		System.out.print("\n");
		System.out.print("Partidas: ");
		futebol.printPartidas();
		System.out.print("\n");
		
		teclado.close();
	}	

}
