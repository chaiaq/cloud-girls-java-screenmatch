package br.com.player.principal;

import br.com.player.modelos.Favoritas;
import br.com.player.modelos.Musica;
import br.com.player.modelos.Podcast;

public class Principal {
	public static void main(String[] args) {
		Musica inTheEnd = new Musica();
		inTheEnd.setTitulo("In the End");
		inTheEnd.setDuracao(3.36);
		inTheEnd.setArtista("Linkin Park");
		inTheEnd.setAlbum("Hybrid Theory");
		
		inTheEnd.exibeFichaTecnica();
		
		for (int i = 0; i < 10; i++) {
			inTheEnd.curte();
		}

		for (int i = 0; i < 1000; i++) {
			inTheEnd.reproduz();
		}
				
		inTheEnd.exibeFichaTecnica();
		
		Podcast naoInviabilize = new Podcast();
		naoInviabilize.setTitulo("Não Inviabilize");
		naoInviabilize.setApresentador("Deia Freitas");
		naoInviabilize.setEpisódio("Picolé de Limão");
		naoInviabilize.setDuracao(15.14);
		
		naoInviabilize.exibeFichaTecnica();
		
		for (int i = 0; i < 500; i++) {
			naoInviabilize.curte();
		}
		
		for (int i = 0; i < 5000; i++) {
			naoInviabilize.reproduz();
		}
		
		naoInviabilize.exibeFichaTecnica();
		
		Favoritas favoritas = new Favoritas();
		favoritas.inclui(naoInviabilize);
		favoritas.inclui(inTheEnd);
		
	}
}
