package ex4;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
    	//criando os dois vetores para servicos e mercadorias
        Mercadoria[] vetmercadorias = new Mercadoria[10];
        Servico[] vetservicos = new Servico[10];

        int escolha;
        do {
        	//definindo o menu
            String[] opcoes = { "Cadastrar mercadoria", "Cadastrar serviço", "Busca dados de mercadoria", 
                                "Buscar dados de serviço", "Sair" };
            escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu de opções",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[4]);

            switch (escolha) {
            	//-----------------------------------------------------------------------------------------------------------------
                // Cadastrar mercadoria
                case 0:
                    boolean mercadoriaCadastrada = false;
                    for (int i = 0; i < vetmercadorias.length; i++) {
                        if (vetmercadorias[i] == null) {
                            String codigo = JOptionPane.showInputDialog("Digite o código do produto:");
                            int codigoInt = Integer.parseInt(codigo);
                            String nome = JOptionPane.showInputDialog("Digite o nome do produto:");
                            String peso = JOptionPane.showInputDialog("Digite o peso do produto:");
                            double pesoDouble = Double.parseDouble(peso);

                            // Criar instância de Mercadoria
                            vetmercadorias[i] = new Mercadoria(pesoDouble, codigoInt, nome);

                            JOptionPane.showMessageDialog(null, "Mercadoria cadastrada com sucesso!");
                            mercadoriaCadastrada = true;
                            break;
                        }
                    }
                    if (!mercadoriaCadastrada) {
                        JOptionPane.showMessageDialog(null, "Limite de mercadorias atingido!");
                    }
                    break;
                 //----------------------------------------------------------------------------------------------------------------
                // Cadastrar serviço
                case 1:
                    boolean servicoCadastrado = false;
                    for (int i = 0; i < vetservicos.length; i++) {
                        if (vetservicos[i] == null) {
                            String codigo = JOptionPane.showInputDialog("Digite o código do serviço:");
                            int codigoInt = Integer.parseInt(codigo);
                            String nome = JOptionPane.showInputDialog("Digite o nome do serviço:");
                            String valorHora = JOptionPane.showInputDialog("Digite o valor hora do serviço:");
                            double valorHoraDouble = Double.parseDouble(valorHora);

                            // Criar instância de Servico
                            vetservicos[i] = new Servico(valorHoraDouble, codigoInt, nome);

                            JOptionPane.showMessageDialog(null, "Serviço cadastrado com sucesso!");
                            servicoCadastrado = true;
                            break;
                        }
                    }
                    if (servicoCadastrado==false) {
                        JOptionPane.showMessageDialog(null, "Limite de serviços atingido!");
                        break;
                    }
                    break;
                //--------------------------------------------------------------------------------------------------------------------------
                // Busca de dados de mercadoria
                case 2:
                    String nome = JOptionPane.showInputDialog("Digite o nome da mercadoria para buscar:");
                    
                    boolean encontrado = false;
                    for (Mercadoria mercadoria : vetmercadorias) {
                    	/*aqui usamos o .equals para poder comparar strings e definimos um objeto do tipo mercadoria, e ele ira percorrer 
                    	 o vetor vetmercadorias e receber o valor da posicao do momento, feito isso, e efetuado uma comparacao com o
                    	 valor da posicao, para verificar se ela e nula e se e igual ao valor que estamos procurando*/
                        if (mercadoria != null && mercadoria.getNome().equalsIgnoreCase(nome)) {
                            JOptionPane.showMessageDialog(null, 
                                "Mercadoria encontrada:\n" +
                                "Codigo: "+ mercadoria.getCodigo()+ "\n"+
                                "Nome: " + mercadoria.getNome() + "\n" +
                                "Peso: " + mercadoria.getPeso());
                            encontrado = true;
                            break;
                        }
                    }
                    if (encontrado==false) {
                        JOptionPane.showMessageDialog(null, "Mercadoria não encontrada.");
                        break;
                    }
                  break;
                    
                 //----------------------------------------------------------------------------------------------------------------
                 //busca de dados de servicos
                case 3:
                	String nomeServico = JOptionPane.showInputDialog("Digite o nome da servico para buscar:");
                    
                    boolean encontrado2 = false;
                    for (Servico servico : vetservicos) {
                    	//aqui usamos o .equals para poder comparar strings
                        if (servico != null && servico.getNome().equalsIgnoreCase(nomeServico)) {
                            JOptionPane.showMessageDialog(null, 
                                "Servico encontrado:\n" +
                                "Codigo: "+ servico.getCodigo()+ "\n"+
                                "Nome: " + servico.getNome() + "\n" +
                                "Peso: " + servico.getValorHora());
                            encontrado2 = true;
                            break;
                        }
                    }
                    if (encontrado2==false) {
                        JOptionPane.showMessageDialog(null, "Servico não encontrado.");
                        break;
                    }
                break;
               //---------------------------------------------------------------------------------------------------------------------
            }
        } while (escolha != 4);
    }
}
