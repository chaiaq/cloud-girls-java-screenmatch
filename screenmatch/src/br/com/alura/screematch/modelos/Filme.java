package br.com.alura.screematch.modelos;

import br.com.alura.screematch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
	private String diretor;
	
	// como criamos um construtor personalizado para
	// titulo, que é a mãe, agora temos que criar nos filhos
	public Filme (String nome, int anoDeLancamento) {
		super (nome, anoDeLancamento);
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	@Override
	public int getClassificacao() {
		return (int) pegaMedia()/2;
	}
	
	
	// agora quando chamar o objeto não aparece mais o endereço
	// e sim o método toString que foi reescrito
	@Override
	public String toString() {
		return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
	}
	
}
