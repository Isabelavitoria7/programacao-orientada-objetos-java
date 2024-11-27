package ex4;

public class Produto {
	private int codigo;
	private String nome;
	
	
	public Produto(int codigo, String nome) {
		this.codigo=codigo;
		this.nome=nome;
	}
	
	//getters
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	//setters
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}

}
