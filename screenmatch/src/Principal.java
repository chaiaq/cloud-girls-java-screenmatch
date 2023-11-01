import br.com.alura.screematch.modelos.Filme;

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
		
	}

}
