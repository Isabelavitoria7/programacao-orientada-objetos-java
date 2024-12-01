package automovel;

import javax.swing.JOptionPane;





public class App {

	public static void main(String[] args) {
		Carro[] vet_carro = new Carro[10];
		Moto[] vet_moto = new Moto[10];
		Caminhao[] vet_caminhao = new Caminhao[10];
		
		
		int escolha;
		do {
			//criando menu de opcoes
			String[] opcoes = {"Cadastrar um veículo","Listar todos os veículos ","Buscar veículo por modelo",
					"Exibir condições de financiamento de um veículo","Sair"};
			
			escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu de opções",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[4]);
			
			switch(escolha) {
				//--------------------------------------------------------------------------------------------------
			 	//Cadastrar um veiculo
				case 0:{
					int escolha2;
					do {
					String[] opcoes2 = {"Cadastrar carro","Cadastrar moto","Cadastrar caminhao","Sair"};
					
					 	escolha2 = JOptionPane.showOptionDialog(
		                    null,
		                    "Escolha uma opção:",
		                    "Menu de opções",
		                    JOptionPane.DEFAULT_OPTION,
		                    JOptionPane.INFORMATION_MESSAGE,
		                    null,
		                    opcoes2,
		                    opcoes2[3]);
					 	
					 	
					 	switch(escolha2) {
					 	//cadastrando carro
					 	//-----------------------------------------------------------------------
					 		case 0:{
					 			for(int i=0;i<vet_carro.length;i++) {
					 				if(vet_carro[i]==null) {
					 					String modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
						 				String marca = JOptionPane.showInputDialog("Digite o marca do carro: ");
						 				String preco = JOptionPane.showInputDialog("Digite o preco do carro: ");
						 				double Preco = Double.parseDouble(preco);
						 				
						 				vet_carro[i]= new Carro(modelo,marca,Preco);
						 				break;
					 				}
					 				
					 			}break;
					 		}
					 	//------------------------------------------------------------------------------
					 	//cadastrando moto
					 	case 1:{
					 		for(int i=0;i<vet_moto.length;i++) {
					 			if(vet_moto[i]==null) {
					 				String modelo = JOptionPane.showInputDialog("Digite o modelo da moto: ");
						 			String marca = JOptionPane.showInputDialog("Digite o marca da moto: ");
						 			String preco = JOptionPane.showInputDialog("Digite o preco da moto: ");
						 			double Preco = Double.parseDouble(preco);
						 			
						 			vet_moto[i]= new Moto(modelo,marca,Preco);
						 			break;
					 				}
					 			
					 			}break;
					 		}
					 	//cadastrando caminhao
					 	case 2:{
					 		for(int i=0;i<vet_caminhao.length;i++) {
					 			if(vet_caminhao[i]==null) {
					 				String modelo = JOptionPane.showInputDialog("Digite o modelo do caminhao: ");
						 			String marca = JOptionPane.showInputDialog("Digite o marca do caminhao: ");
						 			String preco = JOptionPane.showInputDialog("Digite o preco do caminhao: ");
						 			double Preco = Double.parseDouble(preco);
						 			
						 			vet_caminhao[i]= new Caminhao(modelo,marca,Preco);
						 			break;
					 				}
					 			
					 			}break;
					 		}
						 //-----------------------------------------------------------------------	
					 	}
					 	
					 	
					 	
					}while(escolha2!=3);
					break;
					//------------------------------------------------------------------------------
				}
				//---------------------------------------------------------------------------------------------------
				//Listar todos os veiculos
				case 1:{

			 		//listar carros
			 		StringBuilder listacarros = new StringBuilder("Lista de veiculos:\n");
                    for (Carro C : vet_carro) {
                        if (C != null) {
                        	listacarros.append(C.toString()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listacarros.toString());
                    
                    
                    //Listar motos
                    StringBuilder listamotos = new StringBuilder("Lista de motos:\n");
                    for (Moto M : vet_moto) {
                        if (M != null) {
                        	listamotos.append(M.toString()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listamotos.toString());
                    
                    
                    //Listar caminhao
                    
                    StringBuilder listacaminhao = new StringBuilder("Lista de caminhoes:\n");
                    for (Caminhao Ca : vet_caminhao) {
                        if (Ca != null) {
                        	listacaminhao.append(Ca.toString()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listacaminhao.toString());
                    break;
				}
				//----------------------------------------------------------------------------------------------------
				//Buscar veiculo por modelo
				case 2:{
					int escolha3;
					
					do {
						String[] opcoes3 = {"Buscar um carro","Buscar uma moto", "Buscar um caminhao","Sair"};
						
						 escolha3 = JOptionPane.showOptionDialog(
				                    null,
				                    "Escolha uma opção:",
				                    "Menu de opções",
				                    JOptionPane.DEFAULT_OPTION,
				                    JOptionPane.INFORMATION_MESSAGE,
				                    null,
				                    opcoes3,
				                    opcoes3[3]);
						 
						 switch(escolha3){
						 	//------------------------------------------------------------------------------------------------------
						 	//encontrar carro
						 	case 0:{
						 		String nome = JOptionPane.showInputDialog("Digite o modelo do carro que deseja buscar: ");
						 		for(Carro C:vet_carro) {
						 			if(C!=null && nome.equalsIgnoreCase(C.getModelo())) {
						 				JOptionPane.showMessageDialog(null, "Modelo: "+ C.getModelo()+"\n"+
						 						"Marca: "+C.getMarca()+"\n"+
						 						"Preco: "+C.getPreco()+"\n");
						 				break;
						 			}else {
						 				JOptionPane.showMessageDialog(null, "Carro nao encontrado");
						 				break;
						 			}
						 		}
						 		break;
						 	}
						 	
						 	//------------------------------------------------------------------------------------------------------
						 	//encontrar moto
						 	case 1:{
						 		String nome = JOptionPane.showInputDialog("Digite o modelo da moto que deseja buscar: ");
						 		for(Moto M:vet_moto) {
						 			if(M!=null && nome.equalsIgnoreCase(M.getModelo())) {
						 				JOptionPane.showMessageDialog(null, "Modelo: "+ M.getModelo()+"\n"+
						 						"Marca: "+M.getMarca()+"\n"+
						 						"Preco: "+M.getPreco()+"\n");
						 				break;
						 			}else {
						 				JOptionPane.showMessageDialog(null, "Moto nao encontrada");
						 				break;
						 			}
						 		}
						 		break;
						 	}
						 	//-----------------------------------------------------------------------------------------------------
						 	//encontrar caminhao
						 	case 2:{
						 		String nome = JOptionPane.showInputDialog("Digite o modelo d caminhao que deseja buscar: ");
						 		for(Caminhao Ca :vet_caminhao) {
						 			if(Ca!=null && nome.equalsIgnoreCase(Ca.getModelo())) {
						 				JOptionPane.showMessageDialog(null,
						 						"Modelo: "+Ca.getModelo()+"\n"+
						 						"Marca: "+Ca.getMarca()+"\n"+
						 						"Preco: "+Ca.getPreco());
						 				break;
						 			}else {
						 				JOptionPane.showMessageDialog(null, "Video nao encontrada");
						 				break;
						 			}
						 		}
						 		break;
						 	}
						 }
						 break;
					}while(escolha3!=3);
					break;
				}
				//--------------------------------------------------------------------------------------------------
				//Exibir condicoes de financiamento
				case 3:{
					int escolha4;
					
					do {
						String[] opcoes4 = {" Exibir condições de fin. de um carro"," Exibir condições de fin. de uma moto",
											" Exibir condições de fin. de um caminhao","Sair"};
						
						 escolha4 = JOptionPane.showOptionDialog(
				                    null,
				                    "Escolha uma opção:",
				                    "Menu de opções",
				                    JOptionPane.DEFAULT_OPTION,
				                    JOptionPane.INFORMATION_MESSAGE,
				                    null,
				                    opcoes4,
				                    opcoes4[3]);
						 
						 switch(escolha4){
						 	//------------------------------------------------------------------------------------------------------
						 	//Exibir detalhes de um carro
						 	case 0:{
						 		String nome = JOptionPane.showInputDialog("Digite o modelo do carro que deseja financiar: ");
						 		String meses = JOptionPane.showInputDialog("Digite a quantidade para o financiamento: ");
						 		Integer Meses = Integer.parseInt(meses);
						 		for(Carro C:vet_carro) {
						 			if(C!=null && nome.equalsIgnoreCase(C.getModelo())) {
						 				C.exibirCondicoesFinanciamento();
						 				JOptionPane.showMessageDialog(null, "O valor da parcela sera de "+ C.calcularParcela(Meses));
						 				int comprar;
						 				do {
						 					String[] escolher = {"Sim","Não"};
						 					comprar = JOptionPane.showOptionDialog(
								                    null,
								                    "Deseja comprar?",
								                    "Menu de opções",
								                    JOptionPane.DEFAULT_OPTION,
								                    JOptionPane.INFORMATION_MESSAGE,
								                    null,
								                    escolher,
								                    escolher[1]);
						 					if(comprar==0) {
						 						C.vender();
						 						break;
						 					}else {
						 						break;
						 					}
						 					
						 				}while(comprar!=1);
						 				break;
						 			}else {
						 				JOptionPane.showMessageDialog(null, "Carro nao encontrado");
						 				break;
						 			}
						 		}
						 		break;
						 	}
						 	
						 	//------------------------------------------------------------------------------------------------------
						 	//Exibir detalhes de uma moto
						 	case 1:{
						 		String nome = JOptionPane.showInputDialog("Digite o modelo da moto que deseja financiar: ");
						 		String meses = JOptionPane.showInputDialog("Digite a quantidade para o financiamento: ");
						 		Integer Meses = Integer.parseInt(meses);
						 		for(Moto M:vet_moto) {
						 			if(M!=null && nome.equalsIgnoreCase(M.getModelo())) {
						 				M.exibirCondicoesFinanciamento();
						 				JOptionPane.showMessageDialog(null, "O valor da parcela sera de "+ M.calcularParcela(Meses));
						 				int comprar;
						 				do {
						 					String[] escolher = {"Sim","Não"};
						 					comprar = JOptionPane.showOptionDialog(
								                    null,
								                    "Deseja comprar?",
								                    "Menu de opções",
								                    JOptionPane.DEFAULT_OPTION,
								                    JOptionPane.INFORMATION_MESSAGE,
								                    null,
								                    escolher,
								                    escolher[1]);
						 					if(comprar==0) {
						 						M.vender();
						 						break;
						 					}else {
						 						break;
						 					}
						 					
						 				}while(comprar!=1);
						 				break;
						 			}else {
						 				JOptionPane.showMessageDialog(null, "Moto nao encontrada");
						 				break;
						 			}
						 		}
						 		break;
						 	}
						 	//-----------------------------------------------------------------------------------------------------
						 	//encontrar caminhao
						 	case 2:{
						 		String nome = JOptionPane.showInputDialog("Digite o modelo do caminhao que deseja financiar: ");
						 		String meses = JOptionPane.showInputDialog("Digite a quantidade para o financiamento: ");
						 		Integer Meses = Integer.parseInt(meses);
						 		for(Caminhao Ca:vet_caminhao) {
						 			if(Ca!=null && nome.equalsIgnoreCase(Ca.getModelo())) {
						 				Ca.exibirCondicoesFinanciamento();
						 				JOptionPane.showMessageDialog(null, "O valor da parcela sera de "+ Ca.calcularParcela(Meses));
						 				int comprar;
						 				do {
						 					String[] escolher = {"Sim","Não"};
						 					comprar = JOptionPane.showOptionDialog(
								                    null,
								                    "Deseja comprar?",
								                    "Menu de opções",
								                    JOptionPane.DEFAULT_OPTION,
								                    JOptionPane.INFORMATION_MESSAGE,
								                    null,
								                    escolher,
								                    escolher[1]);
						 					if(comprar==0) {
						 						Ca.vender();
						 						break;
						 					}else {
						 						break;
						 					}
						 					
						 				}while(comprar!=1);
						 				break;
						 			}else {
						 				JOptionPane.showMessageDialog(null, "Caminhao nao encontrado");
						 				break;
						 			}
						 		}
						 		break;
						 	}
						 	//--------------------------------------------------------------------------------------------------------
						 }
						 break;
					}while(escolha4!=3);
				}
				//---------------------------------------------------------------------------------------------------
			}
			
		}while(escolha!=4);
		

	}

}
