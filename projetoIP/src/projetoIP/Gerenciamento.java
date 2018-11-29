package projetoIP;

public class Gerenciamento {

	private String mes;
	private double custo;
	private double totalVenda;
	private double lucro;
	
	Gerenciamento(){
		
	}
	public String getMes() {
		return this.mes;
	}
	public void compra (int valor) {
		this.custo += valor;
	}
	
	public void totall (int valor) {
		this.totalVenda += valor;
	}
	
	public void lucrol() {
		this.lucro = totalVenda - custo;
	}

}
