package ex3;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class App {

    // Lista de funcionários
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {  // Loop para manter o menu interativo
            int option = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "\nDigite a opcao: \n1 - Cadastrar um funcionário \n2- Listar todos os funcionários \n3- Buscar funcionário por nome \n4 - Sair ", 
                JOptionPane.QUESTION_MESSAGE));

            switch (option) {
                case 1:
                    // Cadastrar um funcionário
                    String nome = JOptionPane.showInputDialog("Digite o nome do funcionário:");
                    String cpf = JOptionPane.showInputDialog("Digite o CPF do funcionário:");
                    String titulo = JOptionPane.showInputDialog("Digite o título do cargo:");
                    String endereco = JOptionPane.showInputDialog("Digite o endereço do funcionário:");
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário:"));

                    // Criando o cargo
                    Cargo funcao = new Cargo(titulo, salario);

                    // Criando o funcionário e adicionando à lista
                    Funcionario funcionario = new Funcionario(nome, cpf, funcao, endereco);
                    funcionarios.add(funcionario);

                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
                    break;

                case 2:
                    // Listar todos os funcionários
                    if (funcionarios.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
                    } else {
                        StringBuilder lista = new StringBuilder();
                        for (Funcionario f : funcionarios) {
                            lista.append("Nome: ").append(f.nome)
                                 .append(", CPF: ").append(f.cpf)
                                 .append(", Endereço: ").append(f.endereco)
                                 .append(", Cargo: ").append(f.funcao.titulo)
                                 .append(", Salário: ").append(f.funcao.salario)
                                 .append("\n");
                        }
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                    break;

                case 3:
                    // Buscar funcionário por nome
                    String nomeBusca = JOptionPane.showInputDialog("Digite o nome do funcionário a ser buscado:");
                    boolean encontrado = false;
                    for (Funcionario f : funcionarios) {
                        if (f.nome.equalsIgnoreCase(nomeBusca)) {
                            JOptionPane.showMessageDialog(null, 
                                "Nome: " + f.nome + "\nCPF: " + f.cpf +"\nEndereço: " + f.endereco + "\nCargo: " + f.funcao.titulo + "\nSalário: " + f.funcao.salario);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        JOptionPane.showMessageDialog(null, "Funcionário não encontrado.");
                    }
                    break;

                case 4:
                    // Sair do programa
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}
