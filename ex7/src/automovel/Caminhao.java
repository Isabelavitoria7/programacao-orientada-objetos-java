package automovel;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo implements Financiavel {
	
	public Caminhao(String marca, String modelo, double preco) {
		super(marca,modelo,preco);
	}
	@Override
	public void exibirCondicoesFinanciamento() {
		JOptionPane.showMessageDialog(null, " taxa de juros de 15% sobre o preço total no financiamento");
		
	}

	@Override
	public double calcularParcela(int meses) {
		double preco = getPreco();
		double juros = 0.15;
		
		return (preco+(preco*juros))/meses;
	}

	@Override
	void vender() {
		setModelo(null);
		setMarca(null);
		setPreco(0);
		JOptionPane.showMessageDialog(null, "Caminhão vendido!");
		
	}

	@Override
	void exibirDetalhes() {
		JOptionPane.showMessageDialog(null, "Modelo:"+getModelo()+"\n"+
											"Marca: "+getMarca()+
											"Preco: "+getPreco());
		
	}
	
	@Override
    public String toString() {
        return "Modelo: " + getModelo() + ", Marca: " + getMarca() + ", preco: " + getPreco() ;
    }

}
