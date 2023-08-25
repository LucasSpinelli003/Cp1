package br.com.fiap.view;



import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.faculdade.model.*;

public class Terminal {
	
	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		System.out.println("----------Faculdade dos cria-----------");
		System.out.println("---------------------------------------");		

		Scanner leitor = new Scanner(System.in);

		ArrayList<Aluno> array = new ArrayList<Aluno>();
		
		int confirma = 1;
		while (confirma != 0){
			
			System.out.println("1 - Adicionar");
			System.out.println("2 - Remover");
			System.out.println("3 - Consultar por nome");
			System.out.println("4 - Consultar por Index"); 
			System.out.println("5 - Listar todos os alunos");
			System.out.println("6 - Exibir nota Cp");
			System.out.println("7 - Exibir nota geral");
			System.out.println("8 - Sair");
			
			System.out.println("Escolha uma opção: ");
			int autenticando = leitor.nextInt();
			
			switch (autenticando) {
		    case 1:
		    	System.out.println("Digite o nome do aluno: ");
		    	String nome = leitor.next();
		    	
		    	System.out.println("RM: ");
		    	int rm = leitor.nextInt();
		    	
		    	System.out.println("Curso:");
		    	String nomeCurso = leitor.next();
		    	
		    	System.out.println("Duração: (em anos)");
		    	int duracao = leitor.nextInt();
		    	
		    	System.out.println("Nota cp1: ");
		    	double nota1 = leitor.nextDouble();
		    	
		    	System.out.println("Nota cp2: ");
		    	double nota2 = leitor.nextDouble();
		    	
		    	System.out.println("Nota cp3: ");
		    	double nota3 = leitor.nextDouble();
		    	
		    	System.out.println("Nota challenge: ");
		    	double notaChallenge = leitor.nextDouble();
		    	
		    	System.out.println("Nota Global Solutions: ");
		    	double notaGlobal = leitor.nextDouble();
		    	
		    	
		    	Curso c = new Curso(nomeCurso,duracao);
		    	Aluno alunoNovo = new Aluno(nome,c,rm,nota1,nota2,nota3,notaChallenge,notaGlobal);
		    	array.add(alunoNovo);
		    	System.out.println("O aluno " + alunoNovo.getNome() + " foi adicionado.");
		        break;
		    case 2:
		    	if(array.size() > 0) {
			    	int i = 0;
			    	for (Aluno alunos : array) {
			    		i++;
						System.out.println(i + " - " + alunos.getNome() + " " + alunos.getRm());
					}
			    	System.out.println("Digite o indentificador do aluno que deseja excluir: ");
			    	int excluido = leitor.nextInt();
			    	
			    	System.out.println("O aluno " + array.get(excluido - 1).getNome() + " foi removido.");
			    	array.remove(excluido - 1);
			    	break;
		    	}else {
		    		System.out.println("Nenhum aluno foi adicionado para poder ser excluido.");
		    		break;
		    	}
		    case 3:
		    	if(array.size()>0) {
			    	int index = 0;
			    	System.out.println("Digite o nome do aluno que deseja buscar: ");
			    	String nomeAluno = leitor.next().toUpperCase();
			    	
			    	for (Aluno aluno : array) {
						String nominho = aluno.getNome().toUpperCase();
						index++;
						if (nomeAluno.equals(nominho)) {
							System.out.println("Foi encontrado: ");
							System.out.println("Aluno: " + aluno.getNome() + " |" + " RM: " + aluno.getRm() + " |" + " Curso: " + aluno.getCurso().getNome() + " |" + " Duração: " + aluno.getCurso().getDuracao() + "anos" );
						}else {
							System.out.println("Nenhum aluno foi encontrado na posição " + index + " com o nome " + nomeAluno);
						}
					}
		    	}else {
		    		System.out.println("Nenhum aluno foi adicionado ainda.");
		    		break;
		    	}
		    		
		    	
				
		    	break;
		    case 4:
		    	if(array.size()>0) {
			    	System.out.println("Digite o index do aluno que deseja buscar: ");
			    	int buscado = leitor.nextInt();
			 
			    	System.out.println("O aluno " + array.get(buscado).getNome() + " foi encontrado");
			    	
			    	break;
		    	}else {
		    		System.out.println("Nenhum aluno foi adicionado ainda.");
		    		break;
		    	}
		    	
		    case 5:
		    	if(array.size()>0) {
			    	for (Aluno alunos : array) {
						System.out.println("Aluno: " + alunos.getNome() + " |" + " RM: " + alunos.getRm() + " |" + " Curso: " + alunos.getCurso().getNome() + " |" + " Duração: " + alunos.getCurso().getDuracao() + "anos" );
			    	}
			    	break;
		    	}else {
		    		System.out.println("Nenhum aluno foi adicionado ainda.");
		    		break;
		    	}
		    case 6:
		    	if(array.size()>0) {
		    		for (Aluno aluno : array) {
		    			double notaCp = aluno.notaCp(aluno.getNota1(),aluno.getNota2(),aluno.getNota3());
						System.out.println("O " + aluno.getNome() + " ficom com: " + notaCp + " na média CP");
					}
		    		break;
		    	}else {
		    		System.out.println("Nenhum aluno foi adicionado ainda.");
		    		break;
		    	}
		    
		    case 7:
		    	if(array.size()>0) {
		    		for (Aluno aluno : array) {
		    			double cpGeral = aluno.notaCp(aluno.getNota1(), aluno.getNota2(), aluno.getNota3());
		    			double mediaGeral = aluno.notaFinal(aluno.getChallenge(),aluno.getGlobal(),cpGeral);
						System.out.println("O " + aluno.getNome() + " ficom com: " + mediaGeral + " na média geral do semestre!");
					}
		    		break;
		    	}else {
		    		System.out.println("Nenhum aluno foi adicionado ainda.");
		    		break;
		    	}
		    case 8:
		    	confirma = 0;
		    	break;
		}
			if (confirma != 0) {
				System.out.println("Se deseja sair digite \" 0 \" ");
				confirma = leitor.nextInt();
			}
			
		}
			
		System.out.println("\n ---- Volte sempre ----");
}
	}

