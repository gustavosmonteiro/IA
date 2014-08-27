package br.ufc.ia;

import java.util.ArrayList;

public class AEstrela{
	String[] estadoAtual;
	
	
	
	
	public AEstrela(String[] estadoAtual) {
		super();
		this.estadoAtual = estadoAtual;
	}

	ArrayList<No> algoritmoEstrela(){
		ArrayList<No> solucao = new ArrayList<>();
		//1.Verifica se o nó é solução
		if(verificaSolucao(estadoAtual) == true){
			while()
		}
	
		
		//2.Verifica vizinhos
		
		//3.Escolhe menor f
		
		//4. Volte para o passo 1
		
		return null;
	
	}
	
	boolean verificaSolucao(String[] estadoAtual){
		if ((estadoAtual[0]=="B") && (estadoAtual[1]=="B") && (estadoAtual[2]=="B") && (estadoAtual[3]=="B")){
			return true;
		}else{
			return false;
		}
		
	}
	
	

}
