public class NomeCadastro
{
	private String nome;

	public NomeCadastro(String nome)
	{
		this.nome = nome;
	}
	
	public String getNomeFormatado()
	{
		return nome.toUpperCase().trim();
	}
}
