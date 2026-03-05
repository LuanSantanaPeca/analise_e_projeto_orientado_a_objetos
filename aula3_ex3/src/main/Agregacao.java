package main;
import java.util.*;

class Escola{
	private String nome;

    public Escola(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}

class Professor{
	private String nome;
    private List<Escola> escolas;

    public Professor(String nome) {
        this.nome = nome;
        this.escolas = new ArrayList<>();
    }

    public void adicionarDepartamento(Escola escola) {
    	escolas.add(escola);
    }

    public void listarDepartamentos() {
        for (Escola escola : escolas) {
            System.out.println(nome + " dá aula em: " + escola.getNome());
        }
    }
}

public class Agregacao {
	public static void main(String[] args) {
        Professor professor = new Professor("Luan Enrico");
        Escola escola1 = new Escola("Universidade Unicesumar");
        Escola escola2 = new Escola("SESI da Indústria - CIC");

        professor.adicionarDepartamento(escola1);
        professor.adicionarDepartamento(escola2);

        professor.listarDepartamentos();
    }
}
