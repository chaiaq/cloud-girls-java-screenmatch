package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screematch.calculos.CalculadoraDeTempo;
import br.com.alura.screematch.calculos.FiltroRecomendacao;
import br.com.alura.screematch.modelos.Episodio;
import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;



public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
		
		// meuFilme.setNome ("O Poderoso Chefão");
		// meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		
		System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
		
		/*
		System.out.println(meuFilme);
		// se imprimir a variavel filme, aparece o 'endereço'
		System.out.println(meuFilme.nome);
		// para imprimir o atributo precisa adentrar nele com o ponto
		*/
		
		meuFilme.exibeFichaTecnica();
		
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		
		// System.out.println(meuFilme.somaDasAvaliacoes);
		// System.out.println(meuFilme.totalDeAvaliacoes);
		
		System.out.println(meuFilme.pegaMedia());
		System.out.println(meuFilme.getTotalDeAvaliacoes());
		
		Serie lost = new Serie("Lost", 2000);
		// lost.setNome("Lost");
		// lost.setAnoDeLancamento(2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutorPorEpisodio(50);
		
		System.out.println(lost.getTemporadas());
		System.out.println("Total de tempo da série: " + lost.getDuracaoEmMinutos());
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		System.out.println(calculadora.getTempoTotal());
		
		
		Filme outroFilme = new Filme("Avatar", 2023);
		
		// outroFilme.setNome ("Avatar");
		// outroFilme.setAnoDeLancamento(2023);
		outroFilme.setDuracaoEmMinutos(280);
		
		calculadora.inclui(outroFilme);
		System.out.println(calculadora.getTempoTotal());
		
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());
		
		System.out.println(meuFilme.pegaMedia());
		System.out.println(meuFilme.getClassificacao());
		
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		
		filtro.filtra(episodio);
		
		var filmeDoPaulo = new Filme ("Dogville", 2003);
		// podemos declarar o objeto diretamente através da var
		filmeDoPaulo.setDuracaoEmMinutos(200);
		filmeDoPaulo.avalia(10);
		
		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        
        System.out.println(listaDeFilmes);
        
        System.out.println("To String: " + listaDeFilmes.get(0).toString());
        
		
		
	}

}
