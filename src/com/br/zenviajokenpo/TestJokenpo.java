package com.br.zenviajokenpo;

import org.junit.Assert;
import org.junit.Test;

public class TestJokenpo {

	 
  private String jogada(String jogador1, String jogador2) {
		
		return null;
	}

		@Test
	    public void jogador2_invalido(){
	        String jogador1 = "pedra";
	        String jogador2 = "agua";

	        String resultado = jogada(jogador1, jogador2);

	        Assert.assertEquals("jogador2 invalido", resultado);
	    }

	    @Test
	    public void pedraEmpataComPedra(){
	        String jogador1 = "pedra";
	        String jogador2 = "pedra";

	        String resultado = jogada(jogador1, jogador2);

	        Assert.assertEquals("empate", resultado);
	    }

	    @Test
	    public void papelEmpataComPapel(){
	        String jogador1 = "papel";
	        String jogador2 = "papel";

	        String resultado = jogada(jogador1, jogador2);

	        Assert.assertEquals("empate", resultado);
	    }

	    @Test
	    public void tesouraEmpataComTesoura(){
	        String jogador1 = "tesoura";
	        String jogador2 = "tesoura";

	        String resultado = jogada(jogador1, jogador2);

	        Assert.assertEquals("empate", resultado);
	    }

	    @Test
	    public void pedraGanhaTesoura(){
	        String jogador1 = "pedra";
	        String jogador2 = "tesoura";

	        String resultado = jogada(jogador1, jogador2);

	        Assert.assertEquals("Pedra ganha", resultado);
	    }

	    @Test
	    public void pedraGanhaTesoura_jogador2(){
	        String jogador1 = "tesoura";
	        String jogador2 = "pedra";

	        String resultado = jogada(jogador1, jogador2);

	        Assert.assertEquals("Pedra ganha", resultado);
	    }

	    @Test
	    public void tesouraGanhaPapel(){
	        String jogador1 = "tesoura";
	        String jogador2 = "papel";

	        String resultado = jogada(jogador1, jogador2);

	        Assert.assertEquals("Tesoura ganha", resultado);
	    }

	    @Test
	    public void tesouraGanhaPapel_jogador2(){
	        String jogador1 = "papel";
	        String jogador2 = "tesoura";

	        String resultado = jogada(jogador1, jogador2);

	        Assert.assertEquals("Tesoura ganha", resultado);
	    }

	    @Test
	    public void papelGanhaPedra(){
	        String jogador1 = "papel";
	        String jogador2 = "pedra";

	        String resultado = jogada(jogador1, jogador2);

	        Assert.assertEquals("Papel ganha", resultado);
	    }

	    @Test
	    public void papelGanhaPedra_jogador2(){
	        String jogador1 = "pedra";
	        String jogador2 = "papel";

	        String resultado = jogada(jogador1, jogador2);

	        Assert.assertEquals("Papel ganha", resultado);
	    }
	}

