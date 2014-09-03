package br.ufc.ia;

import java.util.ArrayList;
import java.util.HashMap;

public class AEstrela{
	String[] estadoAtual;
	
	HashMap<String, No> fronteira = new HashMap<String, No>();
	HashMap<String, No> visitados = new HashMap<String, No>();
	
	public AEstrela(String[] estadoAtual) {
		super();
		this.estadoAtual = estadoAtual;
	}

	public ArrayList<No> algoritmoEstrela(){
		ArrayList<No> solucao = new ArrayList<>();
		//criar no a partir do estadoAtual: estado= estadoAtual, custoG= 0 custoH=calcula pai =null	
		
		
		
		//2.Verifica vizinhos
		//3.Escolhe menor f
		//4. Volte para o passo 1
		
		return solucao;
	
	}

	
	public No gerarFilhos(No pai){
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
				
				//faz o movimento. troca o espaço com a peça em questão
				String[] temp = estado;
				aux = temp[i];
				temp[i] = temp[espaco];
				temp[espaco] = aux;
				novoEstado = temp.toString();
				
				custoH = calcularH(temp);
				No filho = new No(custoG , custoH, novoEstado, pai);
				fronteira.put(filho.getEstado(), filho);

				if(verificaSolucao(filho)== true){
					//é solução, busca os pais
					return filho;
				}
				
		  	}
			
		}
		fronteira.remove(pai.getEstado());
		visitados.put(pai.getEstado(), pai);
		
		
		return null;
	}
	
	public int calcularH(String[] estado){
		int custoH=0, j=0;
		for(int i=0; i<9; i++){
			if (estado[i]=="B"){
				custoH = custoH + i-j;
				j++;
			}
		}
		
		return custoH;
	}
	
	
	public boolean verificaSolucao(No no){
		
		estadoAtual = no.getEstado().split("");
		if ((estadoAtual[0]=="B") && (estadoAtual[1]=="B") && (estadoAtual[2]=="B") && (estadoAtual[3]=="B")){
			return true;
		}else{
			return false;
		}
		
	}
}


