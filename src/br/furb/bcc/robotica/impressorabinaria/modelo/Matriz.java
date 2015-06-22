package br.furb.bcc.robotica.impressorabinaria.modelo;

import java.util.ArrayList;

public class Matriz {
	
	private ArrayList<int[]> vetores;
	private ArrayList<Linha> linhas;
	
	public Matriz(ArrayList<int[]> matriz) {
		super();
		this.vetores = matriz;
	}

	public ArrayList<int[]> getVetores() {
		return vetores;
	}

	public void setVetores(ArrayList<int[]> matriz) {
		this.vetores = matriz;
	}

	public ArrayList<Linha> getLinhas() {
		return linhas;
	}

	public void setLinhas(ArrayList<Linha> linhas) {
		this.linhas = linhas;
	}
	
}
