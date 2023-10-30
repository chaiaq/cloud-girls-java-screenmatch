
public class Filme {
	// a classe vai especificar o que
	// todos os filmes têm em comum
	// dentro do sistema criado
	String nome;
	int anoDeLancamento;
	boolean incluidoNoPlano;
	double somaDasAvaliacoes;
	int totalDeAvaliacoes;
	int duracaoEmMinutos;
	
	
	// o metodo que não devolve nada é void (vazio)
	void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
	}
	
	// metodo para avaliacoes	
	void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
	
	double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}
	
	
}
