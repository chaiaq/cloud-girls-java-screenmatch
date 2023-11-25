package br.com.shopapp.modelos;

public class Compras implements Comparable<Compras>{
	private String produto;
	private double valor;
	
	public Compras (String produto, double valor) {
		this.produto = produto;
		this.valor = valor;
	}
	
	public String getProduto() {
		return produto;
	}
	
	public double getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return "Compra: " + produto + ", valor: R$ " + valor;
	}

	@Override
	public int compareTo(Compras outraCompra) {
		return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
	}
		
	
}
