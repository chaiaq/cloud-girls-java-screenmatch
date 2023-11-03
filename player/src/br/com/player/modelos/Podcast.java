package br.com.player.modelos;

public class Podcast extends Audio {
	private String apresentador;
	private String episódio;
	
	public String getApresentador() {
		return apresentador;
	}
	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}
	public String getEpisódio() {
		return episódio;
	}
	public void setEpisódio(String episódio) {
		this.episódio = episódio;
	}
	
	public void exibeFichaTecnica() {
		System.out.println("Nome do programa: " + getTitulo());
		System.out.println("Duração(minutos): " + getDuracao());
		System.out.println("Apresentador: " + getApresentador());
		System.out.println("Episódio: " + getEpisódio());
		System.out.println("Total de reproduções: " + pegaReproducoes());
		System.out.println("Número de curtidas: " + pegaCurtidas());
		System.out.println("Classificação: " + getClassificacao());
	}
	
	@Override
	public double getClassificacao() {
		if (this.pegaCurtidas() > 500) {
			return 10;
		} else {
			return 8;
		}
	}
	
}
