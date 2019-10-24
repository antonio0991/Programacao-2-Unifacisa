package questao01;
import java.util.Date;

public class ManutencaoPreventiva
{
	private int mesesIntervalo, kmIntervalo, kmTroca, kmAtual;
	Date dataTroca, dataAtual;
	public ManutencaoPreventiva(int mesesIntervalo, int kmIntervalo)
	{
		this.mesesIntervalo = mesesIntervalo;
		this.kmIntervalo = kmIntervalo;
	}
	public void setKmTroca(int kmTroca)
	{
		this.kmTroca = kmTroca;
	}
	public void setKmAtual(int kmAtual)
	{
		this.kmAtual = kmAtual;
	}
	public void setDataTroca(Date dataTroca)
	{
		this.dataTroca = dataTroca;
	}
	public void setDataAtual(Date dataAtual)
	{
		this.dataAtual = dataAtual;
	}

	@SuppressWarnings("deprecation")
	private int getAnoProximaTroca()
	{
		int anoProximaTroca = dataTroca.getYear();
		if(dataTroca.getMonth() + mesesIntervalo > 12)
		{
			anoProximaTroca++;
		}
		return anoProximaTroca;
	}
	@SuppressWarnings("deprecation")
	private int getMesProximaTroca()
	{
		int mesProximaTroca = dataTroca.getMonth() + mesesIntervalo;
		if(dataTroca.getMonth() + mesesIntervalo > 11)
		{
			mesProximaTroca-=11;
		}
		return mesProximaTroca;
	}
	public Date getDataProximaTroca()
	{
		@SuppressWarnings("deprecation")
		Date dataProximaTroca = new Date(getAnoProximaTroca(), getMesProximaTroca(), dataTroca.getDay());
		return dataProximaTroca;
	}
	public int getKmProximaTroca()
	{
		return kmTroca + kmIntervalo;
	}
	public boolean isTempoManutencao()
	{
		if(dataAtual.getTime()<dataTroca.getTime())
		{
			return true;
		}
		else if(kmAtual>kmTroca)
		{
			return true;
		}
		return false;
	}
}