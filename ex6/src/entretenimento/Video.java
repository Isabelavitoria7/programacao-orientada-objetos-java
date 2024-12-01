package entretenimento;

import javax.swing.JOptionPane;

public class Video extends Midia{
	
	private String diretor;
	private int duracao;
	
	public Video(String titulo, int ano, String diretor, int duracao) {
		super(titulo, ano);
		this.diretor=diretor;
		this.duracao=duracao;
		
	}
	
	
	//setters e getters
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	@Override
	void reproduzir() {
		JOptionPane.showMessageDialog(null, "Reproduzindo video: "+ getTitulo()+"\n"+"Dirigido por: "+ getDiretor());
		
	}
	@Override
	void exibirDetalhes() {
		JOptionPane.showMessageDialog(null, "video: "+ getTitulo()+"\n"+"Dirigido por: "+ getDiretor()+"\n"+"Ano: "+getAno()+"\n"+"Duracao do video: "+getDuracao());
		
	}
	@Override
    public String toString() {
        return "Título: " + getTitulo() + ", Diretor: " + diretor + ", ano: " + getAno() + " Duracao: "+ duracao;
    }
	
}
