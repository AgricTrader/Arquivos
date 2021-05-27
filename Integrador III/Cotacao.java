
public class Cotacao {
	
	private int cotacao_id;
	
	private String cidade_id;
	
	private String desc_produto;
	
	private String uf_id;
	
	private float vlr;
	
	private DateTime data_entrada;

	public Cotacao(String cidade_id, String desc_produto, String uf_id, float vlr, DateTime data_entrada) {
		super();
		this.cidade_id = cidade_id;
		this.desc_produto = desc_produto;
		this.uf_id = uf_id;
		this.vlr = vlr;
		this.data_entrada = data_entrada;
	}

	public int getCotacao_id() {
		return cotacao_id;
	}

	public void setCotacao_id(int cotacao_id) {
		this.cotacao_id = cotacao_id;
	}

	public String getDesc_produto() {
		return desc_produto;
	}

	public void setDesc_produto(String desc_produto) {
		this.desc_produto = desc_produto;
	}

	public String getUf_id() {
		return uf_id;
	}

	public void setUf_id(String uf_id) {
		this.uf_id = uf_id;
	}

	public float getVlr() {
		return vlr;
	}

	public void setVlr(float vlr) {
		this.vlr = vlr;
	}

	public DateTime getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(DateTime data_entrada) {
		this.data_entrada = data_entrada;
	}
	
	
	
	

}
