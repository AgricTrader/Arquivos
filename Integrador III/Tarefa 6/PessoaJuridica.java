package AgricTrader;

public class PessoaJuridica {
	
	//atributos da classe
	
	private String cnpj;
	
	private int insc_estadual;

	//construtor
	public PessoaJuridica(String cnpj, int insc_estadual) {
		super();
		this.cnpj = cnpj;
		this.insc_estadual = insc_estadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getInsc_estadual() {
		return insc_estadual;
	}

	public void setInsc_estadual(int insc_estadual) {
		this.insc_estadual = insc_estadual;
	}
	
	//métodos
	public void EfetuarLogin () {
		
	}
	
	public void Cadastrar () {
		
	}
	
	public void Atualizar () {
		
	}	

}
