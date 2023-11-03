package br.com.player.modelos;

public class Favoritas {
	public void inclui (Audio audio) {
		if (audio.getClassificacao() >= 8) {
			System.out.println(audio.getTitulo() + " é um favorito!");
		} else {
			System.out.println(audio.getTitulo() + " é bem popular!");
		}
	}
}
