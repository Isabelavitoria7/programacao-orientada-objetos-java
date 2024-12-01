package entretenimento;

import javax.swing.JOptionPane;





public class App {

	public static void main(String[] args) {
		Musica[] vet_musica= new Musica[10];
		Video[] vet_video = new Video[10];
		Podcast[] vet_podcast = new Podcast[10];
		
		
		
		int escolha;
		
		do {
			String[] opcoes = {"Cadastrar uma midia","Listar todas as midias", "Buscar midia por titulo","Reproduzir midia por titulo","Sair"};
			
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
			 	//cadastrar midia
			 	//-------------------------------------------------------------------------------------------------------------------------------------------------------
			 	case 0:{
			 		int escolha2;
			 		do {
			 			
			 		
				 		String[] opcoes2 = {"Cadastrar uma musica","Cadastrar um video", "Cadastrar um podcast","Sair"};
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
				 			//-----------------------------------------------------------------------------------------
				 			//Escolhendo cadstrar uma musica
				 			case 0:
				 				for(int i=0;i<vet_musica.length;i++) {
				 					if(vet_musica[i]==null) {
				 						String titulo = JOptionPane.showInputDialog("Digite o titulo da musica: ");
				 						String ano = JOptionPane.showInputDialog("Digite o ano da musica: ");
				 						Integer Ano = Integer.parseInt(ano);
				 						String artista = JOptionPane.showInputDialog("Digite o artista da musica: ");
				 						String album = JOptionPane.showInputDialog("Digite o album da musica: ");
				 						
				 						vet_musica[i]= new Musica(titulo,Ano,artista,album);
				 						break;
				 					}
				 				}break;
				 			//--------------------------------------------------------------------------------------
				 			//Escolhendo cadastrar um video
				 			case 1:
				 				for(int i=0;i<vet_video.length;i++) {
				 					if(vet_video[i]==null) {
				 						String titulo = JOptionPane.showInputDialog("Digite o titulo do video: ");
				 						String ano = JOptionPane.showInputDialog("Digite o ano do video: ");
				 						Integer Ano = Integer.parseInt(ano);
				 						String diretor = JOptionPane.showInputDialog("Digite o diretor do video: ");
				 						String duracao = JOptionPane.showInputDialog("Digite a duracao do video: ");
				 						Integer Duracao = Integer.parseInt(duracao);
				 						vet_video[i]= new Video(titulo,Ano,diretor,Duracao);
				 						break;
				 					}
				 				}break;
				 				
				 			//---------------------------------------------------------------------------------------
				 			//Escolhendo cadastrar um podcast
				 			case 2:
				 				for(int i=0;i<vet_podcast.length;i++) {
				 					if(vet_podcast[i]==null) {
				 						String titulo = JOptionPane.showInputDialog("Digite o titulo do podcast: ");
				 						String ano = JOptionPane.showInputDialog("Digite o ano do podcast: ");
				 						Integer Ano = Integer.parseInt(ano);
				 						String anfitriao = JOptionPane.showInputDialog("Digite o anfitriao do podcast: ");
				 						String episodio = JOptionPane.showInputDialog("Digite a duracao do podcast: ");
				 						Integer Episodio = Integer.parseInt(episodio);
				 						vet_podcast[i]= new Podcast(titulo,Ano,anfitriao,Episodio);
				 						break;
				 					}
				 				}break;
				 		}
				 	}while(escolha2!=3);
			 		break;
			 	}
			 	//-----------------------------------------------------------------------------------------------------------------------------------------------------	
			 	//Listar todas as midias
			 	case 1:{
			 		
			 		//Listar musicas
			 		
			 		StringBuilder listamusicas = new StringBuilder("Lista de musicas:\n");
                    for (Musica M : vet_musica) {
                        if (M != null) {
                        	listamusicas.append(M.toString()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listamusicas.toString());
                    
                    
                    //Listar videos
                    StringBuilder listavideos = new StringBuilder("Lista de videos:\n");
                    for (Video V : vet_video) {
                        if (V != null) {
                        	listavideos.append(V.toString()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listavideos.toString());
                    
                    
                    //Listar Podcast
                    
                    //cria um objeto do tipo stringbuilde para receber os valores do vetor e armazenar em uma lista que sera mostrada depois de estar cheia
                    
                    StringBuilder listapodcast = new StringBuilder("Lista de podcasts:\n");
                    for (Podcast P : vet_podcast) {
                        if (P != null) {
                        	listapodcast.append(P.toString()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, listapodcast.toString());
                    break;

			 	}
			 	//--------------------------------------------------------------------------------------------------------------------------------------------------------
			 	//Buscar midia por titulo
			 	case 2:{
			 		int escolha3;
					
					do {
						String[] opcoes3 = {"Buscar uma musica","Buscar um video", "Buscar um podcast","Sair"};
						
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
						 	//encontrar musica
						 	case 0:{
						 		String nome = JOptionPane.showInputDialog("Digite o titulo da musica que deseja buscar: ");
						 		for(Musica m:vet_musica) {
						 			if(m!=null && nome.equalsIgnoreCase(m.getTitulo())) {
						 				JOptionPane.showMessageDialog(null, "Titulo: "+ m.getTitulo()+"\n"+
						 						"Ano: "+m.getAno()+"\n"+
						 						"Artista: "+m.getArtista()+"\n"+
						 						"Album: "+m.getArtista());
						 				break;
						 			}else {
						 				JOptionPane.showMessageDialog(null, "Musica nao encontrada");
						 				break;
						 			}
						 		}
						 		break;
						 	}
						 	
						 	//------------------------------------------------------------------------------------------------------
						 	//encontrar video
						 	case 1:{
						 		String nome = JOptionPane.showInputDialog("Digite o titulo da video que deseja buscar: ");
						 		for(Video v:vet_video) {
						 			if(v!=null && nome.equalsIgnoreCase(v.getTitulo())) {
						 				JOptionPane.showMessageDialog(null, "Titulo: "+ v.getTitulo()+"\n"+
						 						"Ano: "+v.getAno()+"\n"+
						 						"Diretor: "+v.getDiretor()+"\n"+
						 						"Duração: "+v.getDuracao());
						 				break;
						 			}else {
						 				JOptionPane.showMessageDialog(null, "Video nao encontrada");
						 				break;
						 			}
						 		}
						 		break;
						 	}
						 	//-----------------------------------------------------------------------------------------------------
						 	//encontrar podcast
						 	case 2:{
						 		String nome = JOptionPane.showInputDialog("Digite o titulo da podcast que deseja buscar: ");
						 		for(Podcast p :vet_podcast) {
						 			if(p!=null && nome.equalsIgnoreCase(p.getTitulo())) {
						 				JOptionPane.showMessageDialog(null, "Titulo: "+ p.getTitulo()+"\n"+
						 						"Ano: "+p.getAno()+"\n"+
						 						"Anfitriao: "+p.getAnfitriao()+"\n"+
						 						"Episodio: "+p.getEpisodio());
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
					
			 	}
			 	//-------------------------------------------------------------------------------------------------------------------------------------------------------------------
			 	//Reproduzir midia por titulo
			 	case 3:{
			 		int escolha4;
					
					do {
						String[] opcoes4 = {"Tocar uma musica","Tocar um video", "Tocar um podcast","Sair"};
						
						 escolha4	 = JOptionPane.showOptionDialog(
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
						 	//encontrar musica
						 	case 0:{
						 		String nome = JOptionPane.showInputDialog("Digite o titulo da musica que deseja tocar: ");
						 		for(Musica m:vet_musica) {
						 			if(m!=null && nome.equalsIgnoreCase(m.getTitulo())) {
						 				m.reproduzir();
						 				break;
						 			}else {
						 				JOptionPane.showMessageDialog(null, "Musica nao encontrada");
						 				break;
						 			}
						 		}
						 		break;
						 	}
						 	//-----------------------------------------------------------------------------------------------------
						 	//------------------------------------------------------------------------------------------------------
						 	//encontrar video
						 	case 1:{
						 		String nome = JOptionPane.showInputDialog("Digite o titulo da video que deseja tocar: ");
						 		for(Video v:vet_video) {
						 			if(v!=null && nome.equalsIgnoreCase(v.getTitulo())) {
						 				v.reproduzir();
						 				break;
						 			}else {
						 				JOptionPane.showMessageDialog(null, "Video nao encontrada");
						 				break;
						 			}
						 		}
						 		break;
						 	}
						 	//-----------------------------------------------------------------------------------------------------
						 	//encontrar podcast
						 	case 2:{
						 		String nome = JOptionPane.showInputDialog("Digite o titulo da podcast que deseja tocar: ");
						 		for(Podcast p :vet_podcast) {
						 			if(p!=null && nome.equalsIgnoreCase(p.getTitulo())) {
						 				p.reproduzir();
						 				break;
						 			}else {
						 				JOptionPane.showMessageDialog(null, "Video nao encontrada");
						 				break;
						 			}
						 		}
						 		break;
						 	}
						 	//-----------------------------------------------------------------------------------------------------
						 }break;
						 
					}while(escolha4!=3);
			 	}
			 	//----------------------------------------------------------------------------------------------------------------------------------------------------------
			 }
			
		}while(escolha!=4 );

	}

}
