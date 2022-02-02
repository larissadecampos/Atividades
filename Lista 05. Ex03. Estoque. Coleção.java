package Atividades;

public class Estoque {
/*Crie uma um programa para trabalhar com estoque de uma loja, 
 *o programa dever� trabalhar com Collection do tipo List do 
 *Java para manipular os dados desse estoque, o programa dever� 
 *atender as seguintes funcionalidades:
  Armazenar dados da List
  Remover dados da list;
  Atualizar dados da list.
  Apresentar todos os dados da list.
  */
	
	//Vari�veis
	
	private String produto;
	private double pre�o;
	private int quantidade;
	
	@Override
	public String toString() {
		return "\nproduto=" + produto + ", pre�o=" + pre�o + ", quantidade=" + quantidade;
	}
	
	
	public Estoque(String produto, double pre�o, int quantidade) {
		super();
		this.produto = produto;
		this.pre�o = pre�o;
		this.quantidade = quantidade;
	}


	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
	
		
	