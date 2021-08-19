package autoescola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
		int x;
		System.out.println("quantidade de alunos a se cadastrar ?");
		x=sc.nextInt();
		
		Aluno cadastro[]= new Aluno[x];
		int i;
		for(i=0;i<x;i++) {
			Aluno ficha=new Aluno();
			
			System.out.println("digite o nome do aluno");
			ficha.setNome(sc.next());
			
			System.out.println("Digite o CPF do aluno");
			ficha.setCpf(sc.nextInt());
			
			cadastro[i]=ficha;
			
		}
		for(i=0;i<x;i++) {
			System.out.println("O cadastro número:  "+i);
			System.out.println("o chassi do veículo é: "+cadastro[i].getNome());
			System.out.println("a placa do veículo é: "+cadastro[i].getCpf());
			System.out.println("================================================");
		
	 }
	}
}