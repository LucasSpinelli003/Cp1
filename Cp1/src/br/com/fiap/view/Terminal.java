package br.com.fiap.view;



import javax.swing.JOptionPane;

import br.com.fiap.faculdade.model.*;

public class Terminal {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ");
		String nomeCurso = JOptionPane.showInputDialog(null,"Digite o nome do seu curso: ");
		int rm = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o seu rm: "));
		
		Curso c = new Curso();
		c.setNome(nomeCurso);;
		
		Aluno a = new Aluno(nome,c.getNome(),rm);
		
		System.out.println(a.notaCp(10,9,10));
		System.out.println(a.notaFinal(10, 10));
		
	}

}