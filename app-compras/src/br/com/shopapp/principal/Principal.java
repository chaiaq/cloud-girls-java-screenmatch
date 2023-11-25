package br.com.shopapp.principal;

import java.util.Collections;
import java.util.Scanner;

import br.com.shopapp.modelos.CartaoDeCredito;
import br.com.shopapp.modelos.Compras;

public class Principal {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		// a classe Scanner permite receber informações
		// que o usuário digita na tela
		System.out.println("Digite o limite do cartão: ");
		double limite = leitura.nextDouble();
		// next Double entende que o valor recebido é um double
		CartaoDeCredito cartao = new CartaoDeCredito(limite);
		
		int sair = 1;
		while (sair != 0) {
			System.out.println("Digite o produto a ser comprado: ");
			String produto = leitura.next();
			
			System.out.println("Digite o valor da compra: ");
			double valor = leitura.nextDouble();
			
			Compras compras = new Compras(produto, valor);
			boolean compraRealizada = cartao.permiteCompra(compras);
			
			if (compraRealizada) {
				System.out.println("Compra realizada!");
				System.out.println("Digite 0 para sair ou 1 para continuar");
				sair = leitura.nextInt();
			} else {
				System.out.println("Saldo insuficiente!");
				sair = 0;
			}
		}
		
		System.out.println("**********");
		System.out.println("Compras realizadas!");
		Collections.sort(cartao.getCompras());
		for (Compras c : cartao.getCompras()) {
			System.out.println(c.getProduto() + " - " + c.getValor());
		}
		
		System.out.println("\n***********************");
		System.out.println("\nSaldo do cartão: " + cartao.getSaldo());
		
	}
}
