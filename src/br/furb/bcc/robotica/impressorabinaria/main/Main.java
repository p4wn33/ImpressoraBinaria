package br.furb.bcc.robotica.impressorabinaria.main;

import java.util.ArrayList;

import br.furb.bcc.robotica.impressorabinaria.controle.GerenciadorMatriz;
import br.furb.bcc.robotica.impressorabinaria.controle.Modelador;
import br.furb.bcc.robotica.impressorabinaria.modelo.Linha;
import br.furb.bcc.robotica.impressorabinaria.modelo.Matriz;
import br.furb.bcc.robotica.impressorabinaria.modelo.Segmento;
import br.furb.bcc.robotica.impressorabinaria.robo.movimentar.RoboImprime;


public class Main {
	public static void main(String[] args) {
		
		
//		Segmento segmento = new Segmento();
//		segmento.setInicio(0);
//		segmento.setFim(1);
//		ArrayList<Segmento> listSegmento = new ArrayList();
//		listSegmento.add(segmento);
//		
//		Segmento segmento2 = new Segmento();
//		segmento2.setInicio(3);
//		segmento2.setFim(3);
//		listSegmento.add(segmento2);
//		
//		Segmento segmento3 = new Segmento();
//		segmento3.setInicio(5);
//		segmento3.setFim(7);
//		listSegmento.add(segmento3);
//		
//		Segmento segmento4 = new Segmento();
//		segmento4.setInicio(10);
//		segmento4.setFim(10);
//		listSegmento.add(segmento4);
//		
//		Linha linha = new Linha(0,   listSegmento);
//		ArrayList<Linha> listLinhas = new ArrayList();
//		listLinhas.add(linha);
//		Matriz matrizTeste  = new Matriz();
//		matrizTeste.setLinhas(listLinhas);
//		GerenciadorMatriz.getInstance().setMatriz(matrizTeste);
//		
//		RoboImprime.getInstance().imprimirMatriz(GerenciadorMatriz.getInstance().getMatriz());
		
		executar();
	}
	
	
	private static void executar(){
		GerenciadorMatriz.getInstance().carregarArquivoMatriz();
		Modelador.getInstance().criarModelagem();
		RoboImprime.getInstance().imprimirMatriz(GerenciadorMatriz.getInstance().getMatriz());
	}
	
}
