package br.com.alura.screenmatch.principal;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screematch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screematch.modelos.Titulo;
import br.com.alura.screematch.modelos.TituloOmdb;

public class PrincipalComBusca {
	public static void main(String[] args) throws IOException, InterruptedException {

		Scanner leitura = new Scanner (System.in);
		String buscar = "";
		
		List<Titulo> titulos = new ArrayList<>();
		
		Gson gson = new GsonBuilder()
				.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
				.setPrettyPrinting()
				.create();

		while (!buscar.equalsIgnoreCase("sair")) {
			// enquanto buscar for diferente de sair

			System.out.println("Digite um filme para buscar: ");
			buscar = leitura.nextLine();
			
			
			if (buscar.equalsIgnoreCase("sair")) {
				break;
			}

			String endereco = "http://www.omdbapi.com/?t=" + buscar.replace(" ", "+")+ "&apikey=5b5ebbe";

			try {

				HttpClient client = HttpClient.newHttpClient();
				HttpRequest request = HttpRequest.newBuilder()
						.uri(URI.create(endereco))
						.build();

				HttpResponse<String> response = client
						.send(request, HttpResponse.BodyHandlers.ofString());


				String json = response.body();
				System.out.println(json);



				// Titulo meuTitulo = gson.fromJson(json, Titulo.class);
				TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
				System.out.println(meuTituloOmdb);

				// aplicando o controle de exceção
				// try {
				// vamos colocar o bloco inteiro dentro do try para
				// poder tratar mais exceções


				Titulo meuTitulo = new Titulo(meuTituloOmdb);
				System.out.println(meuTitulo);

				// salvar a busca em um arquivo
				/*
				 * FileWriter escrita = new FileWriter("filmes.txt");
				 * escrita.write(meuTitulo.toString()); escrita.close();
				 */


				titulos.add(meuTitulo);
			} catch (NumberFormatException e) {
				System.out.println("Aconteceu um erro: ");
				System.out.println(e.getMessage());
			} catch (IllegalArgumentException e) {
				System.out.println("Erro de argumento de busca, verifique o endereço");
			} catch (ErroDeConversaoDeAnoException e) {
				System.out.println(e.getMessage());
			}

		}
		
		System.out.println(titulos);

		FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
		
		System.out.println("O programa finalizou corretamente!");



	}


}
