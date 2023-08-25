package br.com.fiap.faculdade.model;

public class Aluno {

	private String nome;
	private Curso curso;
	private int rm;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota;
	private double global;
	private double challenge;
	 
	
	
	
	public double notaCp( double nota1, double nota2,double  nota3) {
		double notaCpGeral = 0;
		if(nota1>=nota2 && nota3>=nota2) {
			 notaCpGeral = (nota1+ nota3)/2;
		}else if(nota2>=nota1 && nota3>=nota1) {
			 notaCpGeral = (nota2 + nota3)/2;
		}else if(nota1>=nota3 && nota2>=nota3) {
			 notaCpGeral = (nota1+nota2)/2;
		}
		return notaCpGeral;
	}
	
	public double notaFinal(double challenge,double global,double notaCpGeral) {
		return nota = (challenge*0.2)+(global*0.6)+ (notaCpGeral*0.2);
	}

	

	public Aluno(String nome, Curso curso, int rm, double nota1, double nota2, double nota3,  double global, double challenge) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.rm = rm;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.global = global;
		this.challenge = challenge;
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getGlobal() {
		return global;
	}

	public void setGlobal(double global) {
		this.global = global;
	}

	public double getChallenge() {
		return challenge;
	}

	public void setChallenge(double challenge) {
		this.challenge = challenge;
	}
	
	
	
	
	
	
}