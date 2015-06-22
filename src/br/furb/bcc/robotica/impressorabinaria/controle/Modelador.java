package br.furb.bcc.robotica.impressorabinaria.controle;

import java.util.ArrayList;

import br.furb.bcc.robotica.impressorabinaria.modelo.Linha;
import br.furb.bcc.robotica.impressorabinaria.modelo.Segmento;

public class Modelador {
	
	private static Modelador instance;
	private ArrayList<Linha> linhas;
	
	public static Modelador getInstance(){
		if(instance == null){
			instance = new Modelador();
		}
		return instance;
	}
	
	public void criarModelagem(){
		 ArrayList<int[]> vetores = GerenciadorMatriz.getInstance().getMatriz().getVetores();
		 ArrayList<Linha> linhas = new ArrayList<Linha>();
		 int nrLinha = 0;
		 for(int[] vetor : vetores){
			 ArrayList<Segmento> segmentos = new ArrayList<Segmento>();
			 Segmento segmento = null;
			 
			 for(int j = 0; j < vetor.length; j++){
				 boolean fimLinha = j == vetor.length-1;
				 boolean novoSegmento = segmento == null;
				 
				 if(vetor[j] == 0){ //novo segmento, continuidade de segmento existente ou termino de linha
					 if(segmento == null){ //novo segmento
						 segmento = new Segmento();
						 segmento.setInicio(j);
					 } else { //continuidade de segmento existente
						 segmento.setFim(j);
					 }
				 }
				 if(j == vetor.length-1){
					 
				 }
				 
				 
				 else{ //termino de segmento ou omissao de posicoes
					 if(segmento != null){ //termino de segmento
						 segmentos.add(segmento.clone());
						 segmento = null;
					 }
					 //omissao de posicoes (nao faz nada)
				 }
			 }
			 
			 Linha linha = new Linha(nrLinha, segmentos);
			 linhas.add(linha);
			 nrLinha++;
		 }
	}

}
