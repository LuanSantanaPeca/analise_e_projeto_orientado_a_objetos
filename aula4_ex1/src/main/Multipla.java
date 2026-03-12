package main;

class Disciplina {
	private String nome;

	public Disciplina(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}

class Professor {
	private String nome;

	public Professor(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
}

class Estudante {
	private String nome;
	private Disciplina disciplina;
	private Professor orientador;

	public Estudante(String nome) {
		this.nome = nome;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public void setOrientador(Professor orientador) {
		this.orientador = orientador;
	}
	public void exibirDetalhes() {
		System.out.println("Estudante: " + nome);
		System.out.println("Disciplina: " + disciplina.getNome());
		System.out.println("Orientador: " + orientador.getNome());
	}
}

public class Multipla {
	public static void main(String[] args) {
		Estudante estudante = new Estudante("Luan");
		Disciplina disciplina = new Disciplina("Análise e projetos orientado a objetos");
		Professor professor = new Professor("Dr. Flores");

		estudante.setDisciplina(disciplina);
		estudante.setOrientador(professor);
		estudante.exibirDetalhes();
	}
}
