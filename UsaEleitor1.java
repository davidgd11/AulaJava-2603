package br.com.fiap;

public class UsaEleitor1 {

	public static void main(String[] args) {
		
		Eleitor eleitor1 = new Eleitor();
		Eleitor eleitor2 = new Eleitor("Eduardo", 2000, 20, 10, 30);
		
		eleitor1.setNome("David");
		eleitor1.setAnoNascimento(2005);
		eleitor1.setNumTitulo(20);
		eleitor1.setSecao(10);
		eleitor1.setZona(30);
		int idade = eleitor1.calculaIdade(2024);
		
		int idade1 = eleitor2.calculaIdade(2024);
		
		System.out.println("Nome: " + eleitor1.getNome()
		+ "\nIdade: " + idade + " anos"
		+ "\nTítulo: " + eleitor1.getNumTitulo()
		+ "\nZona: " + eleitor1.getZona()
		+ "\nSeção: " + eleitor1.getSecao());
		
		System.out.println("\nNome: " + eleitor2.getNome()
		+ "\nIdade: " + idade1 + " anos"
		+ "\nTítulo: " + eleitor2.getNumTitulo()
		+ "\nZona: " + eleitor2.getZona()
		+ "\nSeção: " + eleitor2.getSecao());

	}

}
