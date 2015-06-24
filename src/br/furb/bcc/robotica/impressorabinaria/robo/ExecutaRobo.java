package br.furb.bcc.robotica.impressorabinaria.robo;

import java.util.ArrayList;

import br.furb.bcc.robotica.impressorabinaria.modelo.Linha;
import br.furb.bcc.robotica.impressorabinaria.modelo.Segmento;
import br.furb.bcc.robotica.impressorabinaria.robo.movimentar.MovimentarRobo;

public class ExecutaRobo {
	public static void main(String[] args) {
		ExecutaRobo er = new ExecutaRobo();

		
		//er.executar6();
		er.tamanhoBase();
		er.tamanhoCabecote();

	}

	public void executar1() {
		MovimentarRobo mr = new MovimentarRobo();
		Linha linhaTeste = new Linha();
		ArrayList<Segmento> listSegmento = new ArrayList<>();
		Segmento segmentoTeste = new Segmento();
		segmentoTeste.setInicio(0);
		segmentoTeste.setInicio(1);
		listSegmento.add(segmentoTeste);
		Segmento segmentoTeste2 = new Segmento();
		segmentoTeste2.setInicio(3);
		segmentoTeste2.setInicio(6);
		listSegmento.add(segmentoTeste2);
		linhaTeste.setSegmentos(listSegmento);
		mr.escreverLinha(linhaTeste);

	}

	public void executar2() {
		MovimentarRobo mr = new MovimentarRobo();
		mr.movimentarCarinho();

		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.movimentarCarinho();
		mr.movimentarCarinho();
		mr.movimentarCarinho();
		mr.movimentarCarinho();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();

	}

	public void executar3() {
		MovimentarRobo mr = new MovimentarRobo();
		mr.movimentarCarinho();

	}

	public void executar4() {
		MovimentarRobo mr = new MovimentarRobo();

		mr.baixarCaneta();
		mr.levantarCaneta();

		mr.movimentarCaneta();
		mr.movimentarCaneta();

		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();

		mr.movimentarCaneta();
		mr.movimentarCaneta();

		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();

		mr.movimentarCarinho();

		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();

		mr.baixarCaneta();

		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();

		mr.movimentarCarinho();

		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();

	}

	public void executar5() {
		MovimentarRobo mr = new MovimentarRobo();
		// linha 1
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		// linha 2
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		// linha 3
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		// linha 4
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		// linha 5
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		// linha 5
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
	}

	public void executar6() {

		MovimentarRobo mr = new MovimentarRobo();
		// linha 1
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();

		// linha 3
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();

		// linha 5
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		// linha 7
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();

		// linha 9
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		// linha 9
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();

		// linha 10

		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		// linha 10

		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		// linha 10

		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.baixarCaneta();
		mr.movimentarCaneta();
		mr.levantarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();
		mr.movimentarCaneta();

		mr.movimentarCarinho();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
		mr.movimentarCanetaRe();
	}

	public void tamanhoBase(){
		MovimentarRobo mr = new MovimentarRobo();
		mr.calibrarBase();
	}
	
	public void tamanhoCabecote(){
		MovimentarRobo mr = new MovimentarRobo();
		mr.calibrarCabecote();
	}
	
}
