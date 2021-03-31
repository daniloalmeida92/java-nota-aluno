package application;

import java.util.Locale;
import java.util.Scanner;

import entities.NotaAluno;

public class Aluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Programa de nota de Aluno");
		System.out.println();
		
		NotaAluno notaAluno = new NotaAluno();
		System.out.println("Digite o nome do aluno: ");
		notaAluno.nome = sc.nextLine();
		
		System.out.println("Digita a 1ª nota do 1º trimestre: ");
		notaAluno.n1 = sc.nextDouble();
		System.out.println("Digita a 2ª nota do 2º trimestre: ");
		notaAluno.n2 = sc.nextDouble();
		System.out.println("\"Digita a 3ª nota do 3º trimestre: ");
		notaAluno.n3 = sc.nextDouble();
		
		
		System.out.println("A nota final do aluno é: " + notaAluno.notaGeral());
		
		System.out.println(notaAluno.passOrFailed());
		
		sc.close();
		
	}

}
