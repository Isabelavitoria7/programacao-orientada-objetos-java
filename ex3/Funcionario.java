package ex3;

public class Funcionario {
    public String nome;
    public String cpf;
    public String endereco;
    public Cargo funcao; // Tipo Cargo

    // Construtor para inicializar o funcionário
    public Funcionario(String nome, String cpf, Cargo funcao, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.funcao = funcao;
        this.endereco = endereco;
    }
}
