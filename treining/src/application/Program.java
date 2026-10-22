package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import entities.Aluno;
import entities.Curso;

public class Program {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos anlunos para o curso A?: ");
		int n = entrada.nextInt();
		entrada.nextLine();
		
		Set<Aluno> alunos = new HashSet<>();
		Set<Curso> setCursoA = new HashSet<>();
		for(int i = 0; i < n; i++) {
			System.out.println("Aluno " + (i + 1));
			int al = entrada.nextInt();
			entrada.nextLine();
			Aluno aluno = new Aluno(al);
			alunos.add(aluno);
			
			Curso cursoA = new Curso(aluno);
			setCursoA.add(cursoA);
		}

		System.out.println("Quantos anlunos para o curso B?: ");
	    n = entrada.nextInt();
		entrada.nextLine();
		
		Set<Curso> setCursoB = new HashSet<>();
		for(int i = 0; i < n; i++) {
			System.out.println("Aluno " + (i + 1));
			int al = entrada.nextInt();
			entrada.nextLine();
			Aluno aluno = new Aluno(al);
			alunos.add(aluno);
			
			Curso cursoB = new Curso(aluno);
			setCursoB.add(cursoB);
		}
		

		System.out.println("Quantos anlunos para o curso C?: ");
	    n = entrada.nextInt();
		entrada.nextLine();
		
		Set<Curso> setCursoC = new HashSet<>();
		for(int i = 0; i < n; i++) {
			System.out.println("Aluno " + (i + 1));
			int al = entrada.nextInt();
			entrada.nextLine();
			Aluno aluno = new Aluno(al);
			alunos.add(aluno);
			
			setCursoC.add(new Curso(aluno));
		}
		System.out.println("Total students: " + alunos.size());
		
		System.out.println("Alunos curso A: ");
		for (Curso curso : setCursoA) {
		    System.out.println(curso.getAlunos().getNumeroId());
		}
		
		System.out.println("Alunos curso B: ");
		for (Curso curso : setCursoB) {
		    System.out.println(curso.getAlunos().getNumeroId());
		}
		
		System.out.println("Alunos curso C: ");
		for (Curso curso : setCursoC) {
		    System.out.println(curso.getAlunos().getNumeroId());
		}

	}
}
