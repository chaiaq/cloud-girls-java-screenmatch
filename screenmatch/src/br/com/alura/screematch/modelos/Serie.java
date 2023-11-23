package br.com.alura.screematch.modelos;

public class Serie extends Titulo {
	private int temporadas;
	private boolean ativa;
	private int episodiosPorTemporada;
	private int minutorPorEpisodio;
	
	// construtor personalizado:
	public Serie (String nome, int anoDeLancamento) {
		super (nome, anoDeLancamento);
	}
	
	
	
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getEpisodiosPorTemporada() {
		return episodiosPorTemporada;
	}
	public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
		this.episodiosPorTemporada = episodiosPorTemporada;
	}
	public int getMinutorPorEpisodio() {
		return minutorPorEpisodio;
	}
	public void setMinutorPorEpisodio(int minutorPorEpisodio) {
		this.minutorPorEpisodio = minutorPorEpisodio;
	}
	
	@Override	
	public int getDuracaoEmMinutos() {
		return temporadas * episodiosPorTemporada *	minutorPorEpisodio;
		// irá sobrescrever o valor original da classe mãe
	}
	
}
