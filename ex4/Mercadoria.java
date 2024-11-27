package ex4;

public class Mercadoria extends Produto{
	private double peso;
	
	
	public Mercadoria(double peso, int codigo, String nome) {
		//aqui para incializar o construtor, primeiro temos que inicializar o construtor da classe pai
		super(codigo,nome);
		this.peso=peso;
		
	}
	
	//getters
	public double getPeso() {
		return this.peso;
	}
	
	//setters
	public void setPeso(double peso) {
		this.peso=peso;
	}
	
	
}
