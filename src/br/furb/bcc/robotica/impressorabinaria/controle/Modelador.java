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
				 boolean escuro = vetor[j] == 0;
				 
				 //fim da linha?
				 if(fimLinha && novoSegmento){
					 //AVALIAR SE EH 1 OU ZERO PARA CRIAR OU NAO O NOVO SEGMENTO
					 if(escuro){
						 criarSegmentoFinal(segmentos, segmento, j);
						 segmento = null;
					 } else {
						 //nao faz nada devido a colocacao clara
					 }
				 }
				 
				 if(fimLinha && !novoSegmento){
					 //AVALIAR SE EH 1 OU ZERO PARA FINALIZAR O SEGMENTO INCLUINDO OU NAO A ULTIMA POSICAO
					 if(escuro){
						 terminarSegmentoInclusivo(segmentos, segmento, j);
						 segmento = null;
					 } else {
						 terminarSegmentoExclusivo(segmentos, segmento, j);
						 segmento = null;
					 }
				 }
				 
				 //inicio de segmento?
				 if(!fimLinha && novoSegmento){
					 //AVALIAR SE EH 1 OU ZERO PARA CRIAR OU NAO UM NOVO SEGMENTO
					 if(escuro){
						 criarNovoSegmento(segmento, j);
					 } else {
						//nao faz nada devido a colocacao clara
					 }
				 }
				 
				 //continua segmento?
				 if(!fimLinha && !novoSegmento){
					 //AVALIAR SE EH 1 OU ZERO PARA CONTINUAR OU TERMINAR O SEGMENTO
					 if(escuro){
						 continuarSegmento(segmento, j);
					 } else {
						 terminarSegmento(segmentos, segmento);
						 segmento = null;
					 }
				 }
			 }
			 
			 Linha linha = new Linha(nrLinha, segmentos);
			 linhas.add(linha);
			 nrLinha++;
		 }
		 
		 GerenciadorMatriz.getInstance().getMatriz().setLinhas(linhas);
	}
	
	/**
	 * Cria um unico segmento no final da linha
	 * @param segmentos
	 * @param segmento
	 * @param posicao
	 */
	private void criarSegmentoFinal(ArrayList<Segmento> segmentos, Segmento segmento, int posicao){
		segmento = new Segmento();
		segmento.setInicio(posicao);
		segmento.setFim(posicao);
		segmentos.add(segmento.clone());
	}
	
	/**
	 * Termina um segmento incluindo a ultima posicao da linha
	 * @param segmentos
	 * @param segmento
	 * @param posicao
	 */
	private void terminarSegmentoInclusivo(ArrayList<Segmento> segmentos, Segmento segmento, int posicao){
		segmento.setFim(posicao);
		segmentos.add(segmento.clone());
		
	}
	
	/**
	 * Termina um segmento sem considerar a ultima posicao da linha
	 * @param segmentos
	 * @param segmento
	 * @param posicao
	 */
	private void terminarSegmentoExclusivo(ArrayList<Segmento> segmentos, Segmento segmento, int posicao){
		segmento.setFim(posicao-1);
		segmentos.add(segmento.clone());
	}
	
	/**
	 * Cria um novo segmento no inicio ou no meio da linha
	 * @param segmento
	 * @param posicao
	 */
	private void criarNovoSegmento(Segmento segmento, int posicao){
		segmento = new Segmento();
		segmento.setInicio(posicao);
		segmento.setFim(posicao);
	}
	
	/**
	 * Continua um segmento atualizando prolongando a posicao final. Nao usado na ultima posicao da linha
	 * @param segmento
	 * @param posicao
	 */
	private void continuarSegmento(Segmento segmento, int posicao){
		segmento.setFim(posicao);		
	}
	
	/**
	 * Termina um segmento no meio da linha adicionando-o a lista
	 * @param segmentos
	 * @param segmento
	 */
	private void terminarSegmento(ArrayList<Segmento> segmentos, Segmento segmento){
		segmentos.add(segmento.clone());
	}

}
