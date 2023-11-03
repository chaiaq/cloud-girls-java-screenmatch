package br.com.player.modelos;

public class Musica extends Audio {
	private String artista;
	private String album;
	
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	@Override
	public void exibeFichaTecnica() {
		System.out.println("Nome da música: " + getTitulo());
		System.out.println("Duração(minutos): " + getDuracao());
		System.out.println("Artista: " + getArtista());
		System.out.println("Álbum: " + getAlbum());
		System.out.println("Total de reproduções: " + pegaReproducoes());
		System.out.println("Número de curtidas: " + pegaCurtidas());
		System.out.println("Classificação: " + pegaClassificacao());
	}
	
	
}
