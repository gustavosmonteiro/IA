package br.ufc.ia;


public class No {
	
	private String estado;
	private No pai;
	private int custoG, custoH;
	
	public No(int custoG, int custoH, String estado, No pai){
		
		this.custoG = custoG;
		this.custoH = custoH;
		this.estado = estado;
		this.pai = pai;
	}

	
	public int getCustoG() {
		return custoG;
	}
	public void setCustoG(int custoG) {
		this.custoG = custoG;
	}
	public int getCustoH() {
		return custoH;
	}
	public void setCustoH(int custoH) {
		this.custoH = custoH;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String value) {
		this.estado = value;
	}
	public No getPai() {
		return pai;
	}
	public void setPai(No pai) {
		this.pai = pai;
	}
	
		
}