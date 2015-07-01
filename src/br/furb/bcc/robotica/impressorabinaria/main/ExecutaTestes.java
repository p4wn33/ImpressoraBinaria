package br.furb.bcc.robotica.impressorabinaria.main;

import java.util.ArrayList;

import br.furb.bcc.robotica.impressorabinaria.controle.GerenciadorMatriz;
import br.furb.bcc.robotica.impressorabinaria.modelo.Linha;
import br.furb.bcc.robotica.impressorabinaria.modelo.Matriz;
import br.furb.bcc.robotica.impressorabinaria.modelo.Segmento;
import br.furb.bcc.robotica.impressorabinaria.robo.movimentar.RoboImprime;

public class ExecutaTestes {
	public static void testeManual1(){
		Segmento segmento = new Segmento();
		segmento.setInicio(0);
		segmento.setFim(1);
		ArrayList<Segmento> listSegmento = new ArrayList();
		listSegmento.add(segmento);
		
		Segmento segmento2 = new Segmento();
		segmento2.setInicio(3);
		segmento2.setFim(3);
		listSegmento.add(segmento2);
		
		Segmento segmento3 = new Segmento();
		segmento3.setInicio(5);
		segmento3.setFim(7);
		listSegmento.add(segmento3);
		
		Segmento segmento4 = new Segmento();
		segmento4.setInicio(10);
		segmento4.setFim(10);
		listSegmento.add(segmento4);
		
		Linha linha = new Linha(0,   listSegmento);
		ArrayList<Linha> listLinhas = new ArrayList();
		listLinhas.add(linha);
		Matriz matrizTeste  = new Matriz();
		matrizTeste.setLinhas(listLinhas);
		GerenciadorMatriz.getInstance().setMatriz(matrizTeste);
		
		RoboImprime.getInstance().imprimirMatriz(GerenciadorMatriz.getInstance().getMatriz());
		
	}
	
	public static void testeManual2(){
		Segmento segmento = new Segmento();
		segmento.setInicio(0);
		segmento.setFim(1);
		ArrayList<Segmento> listSegmento = new ArrayList();
		listSegmento.add(segmento);
		
		Segmento segmento2 = new Segmento();
		segmento2.setInicio(3);
		segmento2.setFim(3);
		listSegmento.add(segmento2);
		
		Segmento segmento3 = new Segmento();
		segmento3.setInicio(5);
		segmento3.setFim(7);
		listSegmento.add(segmento3);
		
		Segmento segmento4 = new Segmento();
		segmento4.setInicio(10);
		segmento4.setFim(10);
		listSegmento.add(segmento4);
		Linha linha = new Linha(0,   listSegmento);
	    //-------------------------------------	linha2---------------
		ArrayList<Segmento> listSegmento2 = new ArrayList();
		Segmento segmento5 = new Segmento();
		segmento5.setInicio(0);
		segmento5.setFim(1);
		listSegmento2.add(segmento5);
		
		Segmento segmento6 = new Segmento();
		segmento6.setInicio(3);
		segmento6.setFim(3);
		listSegmento2.add(segmento6);
		
		Segmento segmento7 = new Segmento();
		segmento7.setInicio(5);
		segmento7.setFim(7);
		listSegmento2.add(segmento7);
		
		Segmento segmento8 = new Segmento();
		segmento8.setInicio(10);
		segmento8.setFim(10);
		listSegmento2.add(segmento8);		
		
		Linha linha2 = new Linha(0,   listSegmento2);
		
		//-------------------------------	
		ArrayList<Linha> listLinhas = new ArrayList();
		listLinhas.add(linha);
		listLinhas.add(linha2);
		Matriz matrizTeste  = new Matriz();
		matrizTeste.setLinhas(listLinhas);
		GerenciadorMatriz.getInstance().setMatriz(matrizTeste);
		
		RoboImprime.getInstance().imprimirMatriz(GerenciadorMatriz.getInstance().getMatriz());
		
	}
}
