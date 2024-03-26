package br.com.fiap;

import java.util.Scanner;

public class UsaEleitor2 {

	public static void main(String[] args) {
		
		Eleitor eleitor3 = new Eleitor();
		Eleitor eleitor4;
		Scanner scan;
		
		try {
			scan = new Scanner(System.in);
			
			System.out.println("Digite seu nome: ");
			eleitor3.setNome(scan.nextLine());
			
			System.out.println("Digite seu ano de nascimento");
			eleitor3.setAnoNascimento(scan.nextInt());
			
			int idade = eleitor3.calculaIdade(2024);
			
			System.out.println("Digite o número do título: ");
			eleitor3.setNumTitulo(scan.nextInt());
			
			System.out.println("Digite a zona: ");
			eleitor3.setZona(scan.nextInt());
			
			System.out.println("Digite a seção: ");
			eleitor3.setSecao(scan.nextInt());
			
			System.out.println("Nome: " + eleitor3.getNome()
			+ "\nIdade: " + idade + " anos"
			+ "\nTítulo: " + eleitor3.getNumTitulo()
			+ "\nZona: " + eleitor3.getZona()
			+ "\nSeção: " + eleitor3.getSecao());
			
		} catch (Exception e) {
			System.out.println("Algo está inváldo");
		}
		
		
		try {
			scan = new Scanner(System.in);
			
			System.out.println("\nDigite seu nome, o ano de nascimento, número do título, a zona e a seção: ");
			eleitor4 = new Eleitor(scan.nextLine(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
			int idade1 = eleitor4.calculaIdade(2024);
			
			System.out.println("Nome: " + eleitor4.getNome()
			+ "\nIdade: " + idade1 + " anos"
			+ "\nTítulo: " + eleitor4.getNumTitulo()
			+ "\nZona: " + eleitor4.getZona()
			+ "\nSeção: " + eleitor4.getSecao());
			
		} catch (Exception e) {
			System.out.println("Algo está inváldo");
		}
		
		
		
		
	}

}
