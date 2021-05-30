package AgricTrader;

public class Produtos {
	
	//atributos da classe
	private int produto_id;
	private int usuario_id;
	private String desc_produto;
	private String unidade_medida;
	private String safra;
	private String desc_detalhada;
	private String certificacao;
	private boolean organico;
	
	//construtor

	public Produtos(int produto_id, int usuario_id, String desc_produto, String unidade_medida, String safra,
			String desc_detalhada, String certificacao) {
		super();
		this.produto_id = produto_id;
		this.usuario_id = usuario_id;
		this.desc_produto = desc_produto;
		this.unidade_medida = unidade_medida;
		this.safra = safra;
		this.desc_detalhada = desc_detalhada;
		this.certificacao = certificacao;
	}
	

	public int getProduto_id() {
		return produto_id;
	}

	public void setProduto_id(int produto_id) {
		this.produto_id = produto_id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getDesc_produto() {
		return desc_produto;
	}

	public void setDesc_produto(String desc_produto) {
		this.desc_produto = desc_produto;
	}

	public boolean isOrganico() {
		return organico;
	}

	public void setOrganico(boolean organico) {
		this.organico = organico;
	}

	public String getSafra() {
		return safra;
	}

	public void setSafra(String safra) {
		this.safra = safra;
	}

	public String getDesc_detalhada() {
		return desc_detalhada;
	}

	public void setDesc_detalhada(String desc_detalhada) {
		this.desc_detalhada = desc_detalhada;
	}

	public String getCertificacao() {
		return certificacao;
	}

	public void setCertificacao(String certificacao) {
		this.certificacao = certificacao;
		
	}
	
	public String getUnidade_medida() {
		return unidade_medida;
	}


	public void setUnidade_medida(String unidade_medida) {
		this.unidade_medida = unidade_medida;
	}


	//métodos
	public void Inserir () {
	}
	
	public void Atualizar () {
		
	}
	
	public void Consultar () {
		
	}
	
	public void FiltrarOrganico () {
		
	}
	
	public void FiltrarLocalProducao () {
		
	}
	
	public void FiltrarSafra () {
		
	}

	@Override
	public String toString() {
		return "Produtos [produto_id=" + produto_id + ", usuario_id=" + usuario_id + ", desc_produto=" + desc_produto
				+ ", unidade_medida=" + unidade_medida + ", safra=" + safra + ", desc_detalhada=" + desc_detalhada
				+ ", certificacao=" + certificacao + ", organico=" + organico + "]";
	}

}
