package br.furb.bcc.robotica.impressorabinaria.controle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import br.furb.bcc.robotica.impressorabinaria.modelo.Matriz;
import br.furb.bcc.robotica.impressorabinaria.modelo.StringUtil;

public class GerenciadorMatriz {
	
	private static GerenciadorMatriz instance;
	private Matriz matriz;
	
	public static GerenciadorMatriz getInstance(){
		if(instance == null){
			instance = new GerenciadorMatriz();
		}
		return instance;
	}
	
	public void carregarArquivoMatriz(){
		File dir = new File("./");
		File arquivoMatriz = null;
		for(File f : dir.listFiles()){
			if(StringUtil.contains(f.getName(), ".matriz")){
				arquivoMatriz = f;
				break;
			}
		}
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivoMatriz)));
			int linha[];
			ArrayList<int[]> linhas = new ArrayList<int[]>();
			int i = 0;
			for(String line; (line = br.readLine()) != null; i++){
				linha = new int[line.toCharArray().length];
				for(int j = 0; j < line.toCharArray().length; j++){
					linha[j] = Integer.parseInt(String.valueOf(line.charAt(j)));
				}
				linhas.add(linha.clone());
			}
			this.matriz = new Matriz(linhas);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Matriz getMatriz(){
		return this.matriz;
	}
}
