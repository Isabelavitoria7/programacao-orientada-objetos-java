package ex3;

public class Funcionario {
    public String nome;
    public String cpf;
    public Cargo funcao; // Tipo Cargo

    // Construtor para inicializar o funcionário
    public Funcionario(String nome, String cpf, Cargo funcao) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
    }
}
