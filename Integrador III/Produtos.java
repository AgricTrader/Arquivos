
public class Produtos {
	
	private int produto_id;
	
	private int usuario_id;
	
	private String desc_produto;
	
	private boolean organico;
	
	private String unidade_id;
	
	private String safra;
	
	private String desc_detalhada;
	
	private String certificacao;

	public Produtos(int produto_id, int usuario_id, String desc_produto, boolean organico, String unidade_id,
			String safra, String desc_detalhada, String certificacao) {
		super();
		this.produto_id = produto_id;
		this.usuario_id = usuario_id;
		this.desc_produto = desc_produto;
		this.organico = organico;
		this.unidade_id = unidade_id;
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

	public String getUnidade_id() {
		return unidade_id;
	}

	public void setUnidade_id(String unidade_id) {
		this.unidade_id = unidade_id;
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
	
	

}
