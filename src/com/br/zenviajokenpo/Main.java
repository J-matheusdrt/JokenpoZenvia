package com.br.zenviajokenpo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
			Jogador objJogada = new Jogador();

			while (true) {
				System.out.print("----------JOKENPO----------\n"
					 + "Jogador 1, Faça sua escolha: ");
				objJogada.setJogador1(ler.next());

				System.out.print("Jogador 2, Faça sua escolha: ");
				objJogada.setJogador2(ler.next());

				System.out.println(objJogada.juiz() + "\n");

			}
		

	}

}
