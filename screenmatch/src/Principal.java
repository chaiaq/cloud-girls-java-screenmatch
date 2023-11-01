import br.com.alura.screematch.calculos.CalculadoraDeTempo;
import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		
		meuFilme.setNome ("O Poderoso Chefão");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		
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
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoDeLancamento(2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutorPorEpisodio(50);
		
		System.out.println(lost.getTemporadas());
		System.out.println("Total de tempo da série: " + lost.getDuracaoEmMinutos());
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		System.out.println(calculadora.getTempoTotal());
		
		
		Filme outroFilme = new Filme();
		
		outroFilme.setNome ("Avatar");
		outroFilme.setAnoDeLancamento(2023);
		outroFilme.setDuracaoEmMinutos(280);
		
		calculadora.inclui(outroFilme);
		System.out.println(calculadora.getTempoTotal());
		
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());
		
		
	}

}
