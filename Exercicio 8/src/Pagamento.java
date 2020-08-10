public abstract class Pagamento
{
	public static final int SEM_DESCONTO = 0;
	public static final int UMA_PARCELA = 1;
	
	private double subtotal;
	
	public double getSubtotal()
	{
		return subtotal;
	}
	
	public void setSubtotal(double subtotal)
	{
		this.subtotal = subtotal;
	}
	
	public double getValorParcela()
	{
		return (getSubtotal() - getDesconto()*getSubtotal()/100) / getQteParcelas();
	}
	
	public int getQteParcelas()
	{
		return UMA_PARCELA;
	}
	
	public abstract double getDesconto();
	
	public String toString()
	{
		return "R$ " + getSubtotal() + " - " + getDesconto() + "% = " + getQteParcelas() + " X " + getValorParcela();
	}
	
}
