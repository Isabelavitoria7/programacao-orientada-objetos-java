package ex5;

public class ContaCorrente extends ContaBancaria {
	private int QtdTansacoes;
	private float ChequeEspecial;
	public ContaCorrente(String senha, int numero, float saldo, int QtdTransacoes, float ChequeEspecial) {
		super(senha, numero, saldo);
		this.QtdTansacoes=QtdTransacoes;
		this.ChequeEspecial=ChequeEspecial;
	}

	@Override
	void saca(float sacar) {
		if(this.ChequeEspecial+getSaldo()>=sacar) {
			setSaldo(getSaldo()-sacar);
		}
		
	}

	//getters e setters
	public int getQtdTansacoes() {
		return QtdTansacoes;
	}

	public void setQtdTansacoes(int qtdTansacoes) {
		QtdTansacoes = qtdTansacoes;
	}

	public float getChequeEspecial() {
		return ChequeEspecial;
	}

	public void setChequeEspecial(float chequeEspecial) {
		ChequeEspecial = chequeEspecial;
	}
	
	public void AtualizaTransacao() {
		this.QtdTansacoes++;
	}

}
