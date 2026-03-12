package main;

import java.util.ArrayList;
import java.util.List;

class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}

class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    public void listarFuncionarios() {
        System.out.println("Funcionários da empresa " + nome + ":");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome());
        }
    }
}

public class Cardinalidade {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Engenharia de Software A - 3 Periodo");
        Funcionario funcionario1 = new Funcionario("Luan");
        Funcionario funcionario2 = new Funcionario("Eduardo");
        Funcionario funcionario3 = new Funcionario("Juan");

        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);
        empresa.adicionarFuncionario(funcionario3);
        empresa.listarFuncionarios();
    }
}
