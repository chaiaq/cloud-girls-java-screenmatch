package br.com.player.principal;

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
		
		inTheEnd.classifica(8);
		inTheEnd.classifica(10);
		inTheEnd.classifica(5);
		
		inTheEnd.curte();
		inTheEnd.curte();
		inTheEnd.curte();
		
		inTheEnd.reproduz();
		inTheEnd.reproduz();
		inTheEnd.reproduz();
		inTheEnd.reproduz();
		inTheEnd.reproduz();
		
		
		inTheEnd.exibeFichaTecnica();
		
		Podcast naoInviabilize = new Podcast();
		naoInviabilize.setTitulo("Não Inviabilize");
		naoInviabilize.setApresentador("Deia Freitas");
		naoInviabilize.setEpisódio("Picolé de Limão");
		naoInviabilize.setDuracao(15.14);
		
		naoInviabilize.exibeFichaTecnica();
		
		naoInviabilize.classifica(5);
		naoInviabilize.classifica(10);
		
		naoInviabilize.curte();
		naoInviabilize.curte();
		
		naoInviabilize.reproduz();
		naoInviabilize.reproduz();
		naoInviabilize.reproduz();
		naoInviabilize.reproduz();
		
		naoInviabilize.exibeFichaTecnica();
		
	}
}
