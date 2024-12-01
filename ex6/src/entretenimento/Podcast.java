package entretenimento;

import javax.swing.JOptionPane;

public class Podcast extends Midia {
	private String anfitriao;
	private int episodio;
	
	
	public Podcast(String titulo, int ano, String anfitriao, int episodio) {
		super(titulo, ano);
		this.anfitriao=anfitriao;
		this.episodio=episodio;
	}
	
	
	//getters e setters
	public String getAnfitriao() {
		return anfitriao;
	}
	public void setAnfitriao(String anfitriao) {
		this.anfitriao = anfitriao;
	}
	public int getEpisodio() {
		return episodio;
	}
	public void setEpisodio(int episodio) {
		this.episodio = episodio;
	}


	@Override
	void reproduzir() {
		JOptionPane.showMessageDialog(null, "Tocando podcast: "+ getEpisodio()+"de: "+ getTitulo()+"\n"+"Com: "+ getAnfitriao());
		
	}


	@Override
	void exibirDetalhes() {
		JOptionPane.showMessageDialog(null, "video: "+ getTitulo()+"\n"+"Com: "+ getAnfitriao()+"\n"+"Ano: "+getAno()+"\n"+"De numero: "+getEpisodio());
		
	}
	
	
	@Override
    public String toString() {
        return "Título: " + getTitulo() + ", Anfitrião: " + anfitriao + ", ano: " + getAno() + " Episodio: "+ episodio;
    }
	
	
}
