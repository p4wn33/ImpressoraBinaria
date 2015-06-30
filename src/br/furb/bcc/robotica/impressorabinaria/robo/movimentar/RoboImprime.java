package br.furb.bcc.robotica.impressorabinaria.robo.movimentar;

import java.util.ArrayList;

import lejos.nxt.Motor;
import br.furb.bcc.robotica.impressorabinaria.modelo.Linha;
import br.furb.bcc.robotica.impressorabinaria.modelo.Matriz;
import br.furb.bcc.robotica.impressorabinaria.modelo.Segmento;
import br.furb.bcc.robotica.impressorabinaria.robo.config.RoboConfig;



public class RoboImprime {
	private int posicaoEscritor = 0;
	private static RoboImprime instance;
		
	public static RoboImprime getInstance() {
		if(instance == null){
			instance = new RoboImprime();
		}
		return instance;
	}
		
	public void imprimirMatriz(Matriz matrizImpressao){
		for (Linha unicaLinha : matrizImpressao.getLinhas()){
			escreverLinha(unicaLinha);
		}
		
	}

	private void escreverLinha(Linha linha) {
		ArrayList<Segmento> listSegmento = linha.getSegmentos();		
		for (Segmento unicoSegmento : listSegmento) {
			if (posicaoEscritor < unicoSegmento.getInicio()){
				andarSegmento(unicoSegmento.getInicio() - posicaoEscritor );
				posicaoEscritor = unicoSegmento.getInicio();
			}
			escreverSegmento(unicoSegmento);
			
		}
		andarCarrinho();
		voltarEscritor(posicaoEscritor);
	}

	private void escreverSegmento(Segmento segmento) {
		baixarCaneta();
		andarSegmento1(segmento.getFim() - segmento.getInicio());
		levantarCaneta();
		posicaoEscritor = segmento.getFim();
		
	}
	private void andarSegmento(int qtd) {
		Motor.B.rotate(RoboConfig.DISTANCIA_CANETA * qtd);
	}
	private void andarSegmento1(int qtd) {
		Motor.B.rotate(RoboConfig.DISTANCIA_CANETA * qtd);
	}

	private void andarCarrinho() {
		Motor.A.rotate(RoboConfig.DISTANCIA_CARRINHO);
	}
	
	private void voltarEscritor(int qtd) {
		Motor.B.rotate((RoboConfig.DISTANCIA_CANETA * qtd) * (-1));
	}

	private void levantarCaneta() {
		Motor.C.rotate(RoboConfig.VALOR_SUBIR_CANETA);
	}

	private void baixarCaneta() {
		Motor.C.rotate(RoboConfig.VALOR_BAIXAR_CANETA);
	}
	
	public void calibrarBase(){
		Motor.A.rotate(RoboConfig.TAMANHO_BASE);
	}
	
	public void calibrarCabecote(){
		Motor.B.rotate(RoboConfig.TAMANHO_CABECOTE);
	}

}
