package br.ufc.ia;

import java.util.ArrayList;
import java.util.HashMap;

public class AEstrela{
	String[] estadoAtual;
	
	HashMap<String, Integer> fronteira = new HashMap<String, Integer>();
	HashMap<String, Integer> visitados = new HashMap<String, Integer>();
	
	public AEstrela(String[] estadoAtual) {
		super();
		this.estadoAtual = estadoAtual;
	}

	No algoritmoEstrela(){
		ArrayList<No> solucao = new ArrayList<>();
		//1.Verifica se o nó é solução
	
		
		//2.Verifica vizinhos
		
		//3.Escolhe menor f
		
		//4. Volte para o passo 1
		
		return null;
	
	}
	
	public boolean verificaSolucao(No no){
		
		estadoAtual = no.getEstado().split("");
		if ((estadoAtual[0]=="B") && (estadoAtual[1]=="B") && (estadoAtual[2]=="B") && (estadoAtual[3]=="B")){
			return true;
		}else{
			return false;
		}
		
	}
	
	public void gerarFilhos(No pai){
		String[] estado = pai.getEstado().split("");
		int espaco = -1;
		int e = 0;
		int custoG, custoH;
		String c, aux, novoEstado;
		
		while (e<9){
			if(estado[e] == "_"){
				espaco = e;
				break;
			} else e++;
		}
		
		for (int i = 0; i<9; i++){
			c = estado[i];

			if( c == "_"){
			}
			else {
				//calcula custo g da peça em questão
				custoG =  Math.abs(i - espaco);
				custoG = custoG + pai.getCustoG();
				
				//faz o movimento. troca o espeço com a peça em questão
				String[] temp = estado;
				aux = temp[i];
				temp[i] = temp[espaco];
				temp[espaco] = aux;
				novoEstado = temp.toString();
				custoH = calcularH(temp);
				No filho = new No(custoG , custoH, novoEstado, pai);

				if(verificaSolucao(filho)== true){
					//é solução, busca os pais
				}
				
//				verificasolucao(filho);
//
//				if (!visitado.contains(no.estado)){ 
//					fronteira.add(filho);
//					}
		  	}
		}
	}
	
	public int calcularH(String[] estado){
		return 0;
	}
}

