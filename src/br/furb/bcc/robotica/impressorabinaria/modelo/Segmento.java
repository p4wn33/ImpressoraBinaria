package br.furb.bcc.robotica.impressorabinaria.modelo;

public class Segmento implements Cloneable{
	
	private int inicio;
	private int fim;
	public int getInicio() {
		return inicio;
	}
	public void setInicio(int inicio) {
		this.inicio = inicio;
	}
	public int getFim() {
		return fim;
	}
	public void setFim(int fim) {
		this.fim = fim;
	}
	
	public Segmento clone(){
		try {
			return (Segmento) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
