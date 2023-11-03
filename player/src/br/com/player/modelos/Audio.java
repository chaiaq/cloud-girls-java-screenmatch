package br.com.player.modelos;

public class Audio {
	private String titulo;
	private double duracao;
	private int totalDeReproducoes;
	private int totalDeCurtidas;
	private double classificacao;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public int getTotalDeReproducoes() {
		return totalDeReproducoes;
	}
 	
	public double getClassificacao() {
		return classificacao;
	}

	
	// metodo para curtir
	public void curte() {
		this.totalDeCurtidas++;
	}
	
	public int pegaCurtidas() {
		return totalDeCurtidas;
	}
	
	// metodo para reproduzir
	public void reproduz() {
		this.totalDeReproducoes++;
	}
	
	public int pegaReproducoes() {
		return totalDeReproducoes;
	}
	
}
