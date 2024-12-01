package automovel;

import javax.swing.JOptionPane;

public class Carro extends Veiculo implements Financiavel{
	public Carro(String marca, String modelo, double preco) {
		super(marca,modelo,preco);
	}
	@Override
	public void exibirCondicoesFinanciamento() {
		JOptionPane.showMessageDialog(null, " A taxa de juros e de 10% sobre o preço total no financiamento");
		
	}

	@Override
	public double calcularParcela(int meses) {
		double preco = getPreco();
		double juros = 0.10;
		return (preco+(preco*juros))/meses;
	}

	@Override
	void vender() {
		setModelo(null);
		setMarca(null);
		setPreco(0);
		JOptionPane.showMessageDialog(null, "Carro vendido!");
		
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
