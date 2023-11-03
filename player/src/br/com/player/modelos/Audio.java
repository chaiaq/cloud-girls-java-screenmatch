package br.com.player.modelos;

public class Audio {
	private String titulo;
	private double duracao;
	private int totalDeReproducoes;
	private int curtidas;
	private int totalDeClassificacoes;
	private double somaDasClassificacoes;
	private int totalDeCurtidas;
	
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
	public int getCurtidas() {
		return curtidas;
	}
	
	public void exibeFichaTecnica() {
		System.out.println("Nome da música: " + titulo);
		System.out.println("Duração(minutos): " + duracao);
		System.out.println("Total de reproduções: " + pegaReproducoes());
		System.out.println("Número de curtidas: " + pegaCurtidas());
		System.out.println("Classificação: " + pegaClassificacao());
	}
	
	// metodo para classificação
	public void classifica(double nota) {
		somaDasClassificacoes += nota;
		totalDeClassificacoes++;
	}
	
	public double pegaClassificacao() {
		if (totalDeClassificacoes > 0) {
			return somaDasClassificacoes / totalDeClassificacoes;
		} else {
			return 0;
		}
	}
	
	// metodo para curtir
	public void curte() {
		totalDeCurtidas++;
	}
	
	public int pegaCurtidas() {
		return totalDeCurtidas;
	}
	
	// metodo para reproduzir
	public void reproduz() {
		totalDeReproducoes++;
	}
	
	public int pegaReproducoes() {
		return totalDeReproducoes;
	}
	
}
