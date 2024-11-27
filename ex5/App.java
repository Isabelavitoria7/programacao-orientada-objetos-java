package ex5;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		ContaCorrente[] vetContaC = new ContaCorrente[10];
		ContaPoupanca[] vetContaP = new ContaPoupanca[10];
		
		
		int escolha;
		
		do {
			//definindo o menu
            String[] opcoes = { "Cadastrar CC", "Cadastrar CP", "Sacar de uma CC", 
                                "Sacar de uma CP","Depositar em uma CC",
                                "Depositar em uma CP","Saldo de uma CC",
                                "Saldo de uma CP","Alterar cheque ESP", "Sair" };
            escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu de opções",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[9]);
            
            
            
            switch (escolha) {
            	//-------------------------------------------------------------------------------------------------------
            	//criar conta corrente
            	case 0:{
            		
            		
            		
            		
            		for(int i=0;i< vetContaC.length;i++) {
            			if(vetContaC[i]==null) {
            				String numeroconta = JOptionPane.showInputDialog("Digite o numero da conta a ser criada");
                    		Integer NumeroConta = Integer.parseInt(numeroconta);
                    		String senha = JOptionPane.showInputDialog("Digite a senha da conta a ser criada");
                    		
                    		vetContaC[i] = new ContaCorrente(senha,NumeroConta,0,0,0);
                    		JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
                    		
                            break;
            			}
            		}break;	
            	}
            	//----------------------------------------------------------------------------------------------------------
            	//criar conta poupanca
            	case 1:{
            		
            		
            		for(int i=0;i< vetContaP.length;i++) {
            			if(vetContaP[i]==null) {
            				String numeroconta = JOptionPane.showInputDialog("Digite o numero da conta a ser criada");
                    		Integer NumeroConta = Integer.parseInt(numeroconta);
                    		String senha = JOptionPane.showInputDialog("Digite a senha da conta a ser criada");
                    		String taxa = JOptionPane.showInputDialog("Digite a taxa de rendimento da conta poupanca");
                    		float Taxa = Float.parseFloat(taxa);
                    		vetContaP[i] = new ContaPoupanca(senha,NumeroConta,0,Taxa);
                    		
                    		JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!");
                    		
                            break;
            			}
            		}break;	
            	}
            	//------------------------------------------------------------------------------------------------------------
            	//sacar de uma conta corrente
            	case 2:{
            		String numeroConta = JOptionPane.showInputDialog("Digite o numero da conta");
            		Integer NumeroConta= Integer.parseInt(numeroConta);
            		String senha = JOptionPane.showInputDialog("Digite a senha da conta");
            		String valorsacar = JOptionPane.showInputDialog("Digite a quantidade que deseja sacar");
            		float ValorSacar = Float.parseFloat(valorsacar);
            		for(int i=0;i<=vetContaC.length;i++) {
            			if(vetContaC[i].getNumero() == NumeroConta && vetContaC[i].getSenha().equalsIgnoreCase(senha)) {
            				vetContaC[i].saca(ValorSacar);
            				JOptionPane.showMessageDialog(null, "R$"+ValorSacar + "sacado com sucesso"+"\n"
            				+"Seu novo saldo e: "+vetContaC[i].getSaldo());
            				vetContaC[i].AtualizaTransacao();
            				break;
            			}
            		}break;
            		
            		
            		
            	}
            	//-------------------------------------------------------------------------------------------------------------
            	//sacar de uma conta poupança
            	case 3:{
            		String numeroConta = JOptionPane.showInputDialog("Digite o numero da conta");
            		Integer NumeroConta= Integer.parseInt(numeroConta);
            		String senha = JOptionPane.showInputDialog("Digite a senha da conta");
            		String valorsacar = JOptionPane.showInputDialog("Digite a quantidade que deseja sacar");
            		float ValorSacar = Float.parseFloat(valorsacar);
            		for(int i=0;i<vetContaP.length;i++) {
            			if(vetContaP[i].getNumero() == NumeroConta && vetContaP[i].getSenha().equalsIgnoreCase(senha)) {
            				vetContaP[i].saca(ValorSacar);
            				JOptionPane.showMessageDialog(null, "R$"+ValorSacar + "sacado com sucesso"+"\n"
            				+"Seu novo saldo e: "+vetContaP[i].getSaldo());
            				break;
            			}
            		}break;
            		
            	}
            	//--------------------------------------------------------------------------------------------------------------
            	//Deposita em uma conta corrente
            	case 4:{
            		String numeroConta = JOptionPane.showInputDialog("Digite o numero da conta");
            		Integer NumeroConta= Integer.parseInt(numeroConta);
            		
            		String ValorDepositar = JOptionPane.showInputDialog("Digite a quantidade que deseja depositar");
            		float ValorDepositado = Float.parseFloat(ValorDepositar);
            		for(int i=0;i<vetContaC.length;i++) {
            			if(vetContaC[i].getNumero() == NumeroConta) {
            				vetContaC[i].setSaldo(vetContaC[i].getSaldo()+ValorDepositado);
            				JOptionPane.showMessageDialog(null, "R$"+ValorDepositado + "Depositado com sucesso"+"\n"
            				+"Seu novo saldo e: "+vetContaC[i].getSaldo());
            				vetContaC[i].AtualizaTransacao();
            				break;
            			}
            		}break;
            		
            	}
            	//---------------------------------------------------------------------------------------------------------------
            	//Deposita em uma conta poupança
            	case 5:{
            		String numeroConta = JOptionPane.showInputDialog("Digite o numero da conta");
            		Integer NumeroConta= Integer.parseInt(numeroConta);
            		
            		String ValorDepositar = JOptionPane.showInputDialog("Digite a quantidade que deseja depositar");
            		float ValorDepositado = Float.parseFloat(ValorDepositar);
            		for(int i=0;i<vetContaP.length;i++) {
            			if(vetContaP[i].getNumero() == NumeroConta) {
            				vetContaP[i].setSaldo(vetContaP[i].getSaldo()+ValorDepositado);
            				JOptionPane.showMessageDialog(null, "R$"+ValorDepositado + "Depositado com sucesso"+"\n"
            				+"Seu novo saldo e: "+vetContaP[i].getSaldo());
            				break;
            			}
            		}break;
            	}
            	//--------------------------------------------------------------------------------------------------------------
            	//Verificar saldo de uma conta corrente
            	case 6:{
            		String numeroConta = JOptionPane.showInputDialog("Digite o numero da conta");
            		Integer NumeroConta= Integer.parseInt(numeroConta);
            		for(int i=0;i<vetContaC.length;i++) {
            			if(vetContaC[i].getNumero() == NumeroConta) {
            				JOptionPane.showMessageDialog(null, "Numero da conta: "+vetContaC[i].getNumero()+"\n"+
            			"Saldo da conta: "+vetContaC[i].getSaldo()+"\n"+"Quantidade de transações realizadas: "+
            						vetContaC[i].getQtdTansacoes()+"\n"+
            			"Cheque especial da conta: "+vetContaC[i].getChequeEspecial());
            				break;
            			}
            		}break;
            	}
            	
            	//------------------------------------------------------------------------------------------------------------------------------
            	//Verificar saldo de uma conta poupança
            	case 7:{
            		String numeroConta = JOptionPane.showInputDialog("Digite o numero da conta");
            		Integer NumeroConta= Integer.parseInt(numeroConta);
            		for(int i=0;i<vetContaP.length;i++) {
            			if(vetContaP[i].getNumero() == NumeroConta) {
            				JOptionPane.showMessageDialog(null, "Numero da conta: "+vetContaP[i].getNumero()+"\n"+
            			"Saldo da conta: "+vetContaP[i].getSaldo()+"\n"+"Taxa de rendimento da conta: "+vetContaP[i].getTaxaRend() );
            			break;
            			}
            		}break;
            	}
            	
            	//----------------------------------------------------------------------------------------------------------------------------
            	//Alterar valor do cheque especial
            	case 8:{
            		String numeroConta = JOptionPane.showInputDialog("Digite o numero da conta");
            		Integer NumeroConta= Integer.parseInt(numeroConta);
            		String senha = JOptionPane.showInputDialog("Digite a senha da conta");
            		String atualizacheque = JOptionPane.showInputDialog("Digite o novo valor do cheque especial da conta");
            		float NovoChequeEspecial = Float.parseFloat(atualizacheque);
            		for(int i=0;i<vetContaC.length;i++) {
            			if(vetContaC[i].getNumero() == NumeroConta && vetContaC[i].getSenha().equalsIgnoreCase(senha)) {
            				vetContaC[i].setChequeEspecial(NovoChequeEspecial);
            				JOptionPane.showMessageDialog(null, "Valor do cheque especial foi atualizado para: "+ vetContaC[i].getChequeEspecial());
            				vetContaC[i].AtualizaTransacao();
            				break;
            			}
            		}break;
            		
            	}
            	
            }
            	
		}while(escolha!=9);
		
	}

}
