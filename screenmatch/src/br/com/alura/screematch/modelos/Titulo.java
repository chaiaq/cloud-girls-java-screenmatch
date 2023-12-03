package br.com.alura.screematch.modelos;

import br.com.alura.screematch.excecao.ErroDeConversaoDeAnoException;

public class Titulo implements Comparable<Titulo> {
	// a classe vai especificar o que
	// todos os filmes e series têm em comum
	// dentro do sistema criado
	
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacoes;
	private int duracaoEmMinutos;
	
	// criando um construtor personalizado:
	public Titulo (String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        
        if (meuTituloOmdb.year().length() > 4) {
        	throw new ErroDeConversaoDeAnoException ("Não consegui converter o ano, pois tem mais de 4 caracteres");
        }
        
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

	public int getTotalDeAvaliacoes() {
		return totalDeAvaliacoes;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	

	public String getNome() {
		return nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	// o metodo que não devolve nada é void (vazio)
	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento: " + anoDeLancamento);
	}
	
	// metodo para avaliacoes	
	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacoes++;
	}
	
	public double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacoes;
	}

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
    
    @Override
    public String toString() {
    	return "Nome: " + nome + "\nAno de Lançamento: " + anoDeLancamento + "\nDuração: " + duracaoEmMinutos + " minutos";
    }

}
