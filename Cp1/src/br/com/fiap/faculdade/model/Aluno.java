package br.com.fiap.faculdade.model;

public class Aluno {

	private String nome;
	private Curso curso;
	private int rm;
	private double nota;
	private double notaCpGeral;
	 
	
	
	
	public double notaCp(double nota1, double nota2, double nota3) {
		if(nota1>nota2 && nota3> nota2) {
			 notaCpGeral = (nota1+ nota3)/2;
		}else if(nota2>nota1 && nota3>nota1) {
			 notaCpGeral = (nota2 + nota3);
		}else if(nota1>nota3 && nota2>nota3) {
			 notaCpGeral = (nota1+nota2);
		}else if(nota1 == nota2 && nota1 == nota3) {
			 notaCpGeral = (nota1+nota2)/2;
		}
		return notaCpGeral;
	}
	
	public double notaFinal(double challenge,double global) {
		return nota = (challenge*0.2)+(global*0.6)+ (notaCpGeral*0.2);
	}

	public Aluno(String nome, Curso curso, int rm) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getNotaCpGeral() {
		return notaCpGeral;
	}

	public void setNotaCpGeral(double notaCpGeral) {
		this.notaCpGeral = notaCpGeral;
	}
	
	
	
	
	
}