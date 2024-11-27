package ex5;

public  class ContaPoupanca extends ContaBancaria {
	private float TaxaRend;
	
	public ContaPoupanca(String senha, int numero, float saldo, float TaxaRend) {
		super(senha, numero, saldo);
		this.TaxaRend=TaxaRend;
	}

	@Override
	void saca(float sacar) {
		if(getSaldo()>=sacar) {
			setSaldo(getSaldo()-sacar);
		}
		
	}

	public float getTaxaRend() {
		return TaxaRend;
	}

	public void setTaxaRend(float taxaRend) {
		TaxaRend = taxaRend;
	}

}
