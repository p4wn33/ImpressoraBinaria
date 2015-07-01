package br.furb.bcc.robotica.impressorabinaria.modelo;

import java.util.ArrayList;

public class ListaSegmento{
	
	private ArrayList<Segmento> segmentos;

	public ListaSegmento() {
		this.segmentos = new ArrayList<Segmento>();
	}

	public ArrayList<Segmento> getSegmentos() {
		return segmentos;
	}

	public void setSegmentos(ArrayList<Segmento> segmentos) {
		this.segmentos = segmentos;
	}
}
