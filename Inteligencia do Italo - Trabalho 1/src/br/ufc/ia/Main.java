package br.ufc.ia;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a entrada (Formato: PPPP_BBBB):");
		String entrada = s.nextLine();
		String[] estadoAtual = entrada.split("");
		AEstrela estrela = new AEstrela(estadoAtual);
		//ArrayList<No> solucao = estrela.algoritmoEstrela();
//		for (No passo : solucao) {
//			System.out.println(passo.estado);
//		}

	}

}
