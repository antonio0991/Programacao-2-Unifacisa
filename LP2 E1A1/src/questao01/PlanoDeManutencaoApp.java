package questao01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PlanoDeManutencaoApp 
{
	public static void main(String[] args) throws ParseException 
	{	Scanner teclado = new Scanner(System.in);
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Digite intervalo em quilometros: ");
		int kmIntervalo = Integer.parseInt(teclado.nextLine());
		System.out.print("Digite intervalo em meses: ");
		int mesesIntervalo = Integer.parseInt(teclado.nextLine());
		ManutencaoPreventiva manutencao = new ManutencaoPreventiva(mesesIntervalo, kmIntervalo);
		System.out.print("Digite quilometragem na troca: ");
		int kmTroca = Integer.parseInt(teclado.nextLine());
		manutencao.setKmTroca(kmTroca);
		System.out.print("Digite data da troca: ");
		Date dataTroca = formatador.parse(teclado.nextLine());
		manutencao.setDataTroca(dataTroca);
		int kmProxTroca = manutencao.getKmProximaTroca();
		System.out.print("Digite quilometragem atual: ");
		int kmAtual = Integer.parseInt(teclado.nextLine());
		manutencao.setKmAtual(kmAtual);
		System.out.print("Digite data atual: ");
		Date dataAtual = formatador.parse(teclado.nextLine());
		manutencao.setDataAtual(dataAtual);
		System.out.println("Quilometragem para proxima troca: " + kmProxTroca);
		Date dataProxTroca = manutencao.getDataProximaTroca();
		System.out.println("Data para proxima troca: " + formatador.format(dataProxTroca));
		
		System.out.print("Eh tempo de realizar manutencao novamente? " + (manutencao.isTempoManutencao()? "sim": "nao"));
		teclado.close();
	}
}
