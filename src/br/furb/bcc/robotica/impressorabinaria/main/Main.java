package br.furb.bcc.robotica.impressorabinaria.main;

import br.furb.bcc.robotica.impressorabinaria.controle.GerenciadorMatriz;
import br.furb.bcc.robotica.impressorabinaria.controle.Modelador;
import br.furb.bcc.robotica.impressorabinaria.modelo.Linha;
import br.furb.bcc.robotica.impressorabinaria.robo.movimentar.RoboImprime;


public class Main {
	public static void main(String[] args) {
	
		executar();

	}
	
	
	private static void executar(){

		GerenciadorMatriz.getInstance().carregaMatrizEstatica();
		Modelador.getInstance().criarModelagem();
		
		for(Linha linha : GerenciadorMatriz.getInstance().getMatriz().getLinhas()){
			System.out.println(linha.getNrLinha() + " - " + linha.getSegmentos().size());
		}
		
		RoboImprime.getInstance().imprimirMatriz(GerenciadorMatriz.getInstance().getMatriz());
	}
	
}
