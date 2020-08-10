public abstract class ListaAlinhada
{
	private String[] itens = new String[5];
	private int qteColunas;
	private int posicao = 0;
	protected String[] getItens()
	{
		return itens;
	}
	public void addItem(String item)
	{
		itens[posicao] = item;
		posicao++;
	}
	public void setQteColunas(int qteColunas)
	{
		this.qteColunas = qteColunas;
	}
	protected int getQteColunas()
	{
		return qteColunas;
	}
	public abstract String toString();
}
