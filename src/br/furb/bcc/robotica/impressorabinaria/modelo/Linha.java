package br.furb.bcc.robotica.impressorabinaria.modelo;

import java.util.ArrayList;

public class Linha {
	
	private int nrLinha;
	private ArrayList<Segmento> segmentos;
	
	public Linha(){
		this.nrLinha  = 0;
		this.segmentos = null;
	}
	public Linha(int nrLinha, ArrayList<Segmento> segmentos) {
		super();
		this.nrLinha = nrLinha;
		this.segmentos = segmentos;
	}

	public int getNrLinha() {
		return nrLinha;
	}

	public void setNrLinha(int nrLinha) {
		this.nrLinha = nrLinha;
	}

	public ArrayList<Segmento> getSegmentos() {
		return segmentos;
	}

	public void setSegmentos(ArrayList<Segmento> segmentos) {
		this.segmentos = segmentos;
	}
	
}
