public class PagamentoCartaoParcelado extends PagamentoCartao
{
	private int qteParcelas;
	
	public void setQteParcelas(int qteParcelas)
	{
		this.qteParcelas = qteParcelas;
	}
	
	public int getQteParcelas()
	{
		return qteParcelas;
	}
}
