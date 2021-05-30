package AgricTrader;

public class Cidade {
	
	//atributos da classe
	private String cidade_id;
	private String uf_uf_id;
	private int cotacao_id;
	private String desc_cidade;
	private String uf_id;
	
	//construtor
	public Cidade(String cidade_id, String uf_uf_id, int cotacao_id, String desc_cidade, String uf_id) {
		super();
		this.cidade_id = cidade_id;
		this.uf_uf_id = uf_uf_id;
		this.cotacao_id = cotacao_id;
		this.desc_cidade = desc_cidade;
		this.uf_id = uf_id;
	}

	public String getCidade_id() {
		return cidade_id;
	}

	public void setCidade_id(String cidade_id) {
		this.cidade_id = cidade_id;
	}

	public String getUf_uf_id() {
		return uf_uf_id;
	}

	public void setUf_uf_id(String uf_uf_id) {
		this.uf_uf_id = uf_uf_id;
	}

	public int getCotacao_id() {
		return cotacao_id;
	}

	public void setCotacao_id(int cotacao_id) {
		this.cotacao_id = cotacao_id;
	}

	public String getDesc_cidade() {
		return desc_cidade;
	}

	public void setDesc_cidade(String desc_cidade) {
		this.desc_cidade = desc_cidade;
	}

	public String getUf_id() {
		return uf_id;
	}

	public void setUf_id(String uf_id) {
		this.uf_id = uf_id;
	}
	
	//método consulta cidade
	public void Consultar() {
		
	}
	
	//método insere cidade
	public void Inserir() {
		
	}

}