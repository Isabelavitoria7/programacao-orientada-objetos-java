package entretenimento;

import javax.swing.JOptionPane;

public class Musica extends Midia {

	private String artista;
	private String album;
	
	public Musica(String titulo,int ano, String artista, String album) {
		super(titulo, ano);
		this.artista=artista;
		this.album=album;
	}
	
	
	
	

	
	//getters e setters
	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
	
	@Override
	void reproduzir() {
		JOptionPane.showMessageDialog(null, "Tocando musica: "+ getTitulo()+"\n"+"Artista: "+ getArtista());
		
	}

	@Override
	void exibirDetalhes() {
		JOptionPane.showMessageDialog(null, "musica: "+ getTitulo()+"\n"+"Artista: "+ getArtista()+"\n"+"Ano: "+getAno()+"\n"+"Album: "+getAlbum());
		
	}
	
	@Override
    public String toString() {
        return "Título: " + getTitulo() + ", Artista: " + artista + ", ano: " + getAno() + " Album: "+ album;
    }

}
