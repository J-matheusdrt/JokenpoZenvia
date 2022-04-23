package com.br.zenviajokenpo;

public class Jogador {

	private String jogadaJogador1;
	private String jogadaJogador2;

	public String getJogador1() {
		return jogadaJogador1;
	}

	public void setJogador1(String jogador1) {
		this.jogadaJogador1 = jogador1;
	}

	public String getJogador2() {
		return jogadaJogador2;
	}

	public void setJogador2(String jogador2) {
		this.jogadaJogador2 = jogador2;
	}

	public String juiz() {

		if (this.jogadaJogador1.toUpperCase().equals(jogadaJogador2.toUpperCase())) {
			return "Empate";
		} else {

			switch (this.jogadaJogador1.toUpperCase()) {
			case "PEDRA":
				switch (this.jogadaJogador2.toUpperCase()) {
				case "TESOURA":
					return "Vitoria jogador 1";
				case "PAPEL":
					return "Vitoria jogador 2";
				}

			case "PAPEL":
				switch (this.jogadaJogador2.toUpperCase()) {
				case "PEDRA":
					return "Vitoria jogador 1";
				case "TESOURA":
					return "Vitoria jogador 2";
				}
			case "TESOURA":
				switch (this.jogadaJogador2.toUpperCase()) {
				case "PAPEL":
					return "Vitoria jogador 1";
				case "PEDRA":
					return "Vitoria jogador 2";
				}

			}
		}
		return "Por favor, Digite apenas (pedra, papel ou tesoura!";

	}

}
