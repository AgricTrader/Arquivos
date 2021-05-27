
public class Usuario_endereco {
	
	private int endreco_id;
	
	private int usuario_id;
	
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	private String bairro;
	
	private String cidade_id;
	
	private String uf_id;
	
	private String cep;
	
	private boolean correspondencia;
	
	private boolean producao;

	public Usuario_endereco(int endreco_id, int usuario_id, String logradouro, String numero, String complemento,
			String bairro, String cidade_id, String uf_id, String cep, boolean correspondencia, boolean producao) {
		super();
		this.endreco_id = endreco_id;
		this.usuario_id = usuario_id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade_id = cidade_id;
		this.uf_id = uf_id;
		this.cep = cep;
		this.correspondencia = correspondencia;
		this.producao = producao;
	}

	public int getEndreco_id() {
		return endreco_id;
	}

	public void setEndreco_id(int endreco_id) {
		this.endreco_id = endreco_id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade_id() {
		return cidade_id;
	}

	public void setCidade_id(String cidade_id) {
		this.cidade_id = cidade_id;
	}

	public String getUf_id() {
		return uf_id;
	}

	public void setUf_id(String uf_id) {
		this.uf_id = uf_id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public boolean isCorrespondencia() {
		return correspondencia;
	}

	public void setCorrespondencia(boolean correspondencia) {
		this.correspondencia = correspondencia;
	}

	public boolean isProducao() {
		return producao;
	}

	public void setProducao(boolean producao) {
		this.producao = producao;
	}
	
	

}
