package br.furb.bcc.robotica.impressorabinaria.robo.movimentar;

import java.util.ArrayList;

import br.furb.bcc.robotica.impressorabinaria.modelo.Linha;
import br.furb.bcc.robotica.impressorabinaria.modelo.Segmento;
import br.furb.bcc.robotica.impressorabinaria.robo.config.RoboConfig;
import lejos.nxt.Motor;

public class MovimentarRobo {
	private int posicaoEscritor;

	public MovimentarRobo() {
		this.posicaoEscritor = 0;
	}

	public void escreverLinha(Linha linha) {
		ArrayList<Segmento> listSegmento = linha.getSegmentos();
		movimentarCarinho();
		for (Segmento unicoSegmento : listSegmento) {
			escreverSegmento(unicoSegmento);
		}
		voltarCarinho();
	}

	public void escreverSegmento(Segmento segmento) {
		while (posicaoEscritor < segmento.getFim()) {
			if (posicaoEscritor < segmento.getInicio()) {
				movimentarCaneta();
				posicaoEscritor++;
			} else {
				baixarCaneta();
				while (posicaoEscritor < segmento.getFim()) {
					movimentarCaneta();
					posicaoEscritor++;
				}
			}
		}
		levantarCaneta();
	}

	public void movimentarCarinho() {
		Motor.A.rotate(RoboConfig.DISTANCIA_CARRINHO);
	}
	
	public void movimentarCanetaRe() {
		Motor.B.rotate(RoboConfig.DISTANCIA_CANETA * (-1));
	}

	public void movimentarCaneta() {
		Motor.B.rotate(RoboConfig.DISTANCIA_CANETA);
	}

	public void voltarCarinho() {
		while (posicaoEscritor > 0) {
			Motor.B.rotate(RoboConfig.DISTANCIA_CANETA * (-1));
			posicaoEscritor--;
		}
	}

	public void levantarCaneta() {
		Motor.C.rotate(RoboConfig.VALOR_SUBIR_CANETA);
	}

	public void baixarCaneta() {
		Motor.C.rotate(RoboConfig.VALOR_BAIXAR_CANETA);
	}
	
	public void calibrarBase(){
		Motor.A.rotate(RoboConfig.TAMANHO_BASE);
	}
	
	public void calibrarCabecote(){
		Motor.B.rotate(RoboConfig.TAMANHO_CABECOTE);
	}

}
