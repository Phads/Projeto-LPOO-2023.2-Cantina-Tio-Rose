package classes;

public class produto {
	
	public String nome;
	public double precoCompra;
	public double precoVenda;
	public int quantidadeEstoque;
	public String codigoBarras;
	
	public produto(String nome, String codigoBarras) {
		super();
		this.nome = nome;
		this.codigoBarras = codigoBarras;
	}
	
	private void calcularPreçoVenda() {
		double margemLucro = this.precoCompra * 0.1;
		this.precoVenda = this.precoCompra + margemLucro;
	}
	
	public void reporEstoque(int quantidade) {
		this.setQuantidadeEstoque(this.getQuantidadeEstoque() + quantidade);
	}
	
	public void reduzirEstoque(int quantidade) {
		this.setQuantidadeEstoque(this.getQuantidadeEstoque() - quantidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	
	
	

}
