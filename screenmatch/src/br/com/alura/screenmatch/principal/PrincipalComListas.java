package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;
import br.com.alura.screematch.modelos.Titulo;



public class PrincipalComListas {
	public static void main(String[] args) {
		Filme meuFilme = new Filme ("O Poderoso Chefão", 1970);
		meuFilme.avalia(10);
		Filme outroFilme = new Filme ("Avatar", 2023);
		outroFilme.avalia(6);
		var filmeDoPaulo = new Filme ("Dogville", 2003);
		filmeDoPaulo.avalia(9);
		
		Serie lost = new Serie ("Lost", 2000);
		
		Filme f1 = filmeDoPaulo;
		
		ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
		listaDeAssistidos.add(filmeDoPaulo);
		listaDeAssistidos.add(meuFilme);
		listaDeAssistidos.add(outroFilme);
		listaDeAssistidos.add(lost);
		listaDeAssistidos.add(f1);
		
		/*
		for (Titulo item: listaDeAssistidos) {
			System.out.println(item);
			// não aparece o titulo da serie 
			// porque não trocamos o tostring da serie
			Filme filme = (Filme) item;
			// aviso que o item é um filme
			System.out.println("Classificação: " + filme.getClassificacao());
			// para a serie não dá certo porque ela não é filme
			
		}
		*/
		
		for (Titulo item: listaDeAssistidos) {
			System.out.println(item.getNome());
			if (item instanceof Filme filme && filme.getClassificacao() > 2) {
				System.out.println("Classificação: " + filme.getClassificacao());
			}
		}
		
		
		List<String> buscaPorArtista = new ArrayList<>();
		buscaPorArtista.add("Adam Sandler");
		buscaPorArtista.add("Paulo");
		buscaPorArtista.add("Jacqueline");
		
		System.out.println(buscaPorArtista);
		
		Collections.sort(buscaPorArtista);
		System.out.println("Depois de ordenado: " + buscaPorArtista);
		
		Collections.sort(listaDeAssistidos);
		System.out.println(listaDeAssistidos);
		
		listaDeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println(listaDeAssistidos);
	}
}
