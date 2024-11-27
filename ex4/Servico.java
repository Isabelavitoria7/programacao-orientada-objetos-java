package ex4;

public class Servico extends Produto {
	
	private double ValorHora;
	
	public Servico(double ValorHora, int codigo, String nome) {
		super(codigo,nome);
		this.ValorHora=ValorHora;
	}

	public double getValorHora() {
		return ValorHora;
	}

	public void setValorHora(double valorHora) {
		ValorHora = valorHora;
	}
	
}
