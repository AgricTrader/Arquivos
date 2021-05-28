package AgricTrader;
import java.time.LocalDate;

public class Proposta {
	
	//atributos da classe
	private int proposta_id;
	private int usuario_id;
	private int usu_usuario_id;
	private int usuario_destino_id;
	private int usuario_comprador_id;
	private LocalDate data_envio;
	private float vlr;
	public LocalDate data_aceitacao;
	private int avaliacao_produtor;
	private int avaliacao_comprador;

	//construtor
	public Proposta(int proposta_id, int usuario_id, int usu_usuario_id, int usuario_destino_id,
			int usuario_comprador_id, LocalDate data_envio, float vlr, LocalDate data_aceitacao, int avaliacao_produtor,
			int avaliacao_comprador) {
		super();
		this.proposta_id = proposta_id;
		this.usuario_id = usuario_id;
		this.usu_usuario_id = usu_usuario_id;
		this.usuario_destino_id = usuario_destino_id;
		this.usuario_comprador_id = usuario_comprador_id;
		this.data_envio = data_envio;
		this.vlr = vlr;
		this.data_aceitacao = data_aceitacao;
		this.avaliacao_produtor = avaliacao_produtor;
		this.avaliacao_comprador = avaliacao_comprador;
	}

	public int getProposta_id() {
		return proposta_id;
	}

	public void setProposta_id(int proposta_id) {
		this.proposta_id = proposta_id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public int getUsu_usuario_id() {
		return usu_usuario_id;
	}

	public void setUsu_usuario_id(int usu_usuario_id) {
		this.usu_usuario_id = usu_usuario_id;
	}

	public int getUsuario_destino_id() {
		return usuario_destino_id;
	}

	public void setUsuario_destino_id(int usuario_destino_id) {
		this.usuario_destino_id = usuario_destino_id;
	}

	public int getUsuario_comprador_id() {
		return usuario_comprador_id;
	}

	public void setUsuario_comprador_id(int usuario_comprador_id) {
		this.usuario_comprador_id = usuario_comprador_id;
	}

	public float getVlr() {
		return vlr;
	}

	public void setVlr(float vlr) {
		this.vlr = vlr;
	}


	public int getAvaliacao_produtor() {
		return avaliacao_produtor;
	}

	public void setAvaliacao_produtor(int avaliacao_produtor) {
		this.avaliacao_produtor = avaliacao_produtor;
	}

	public int getAvaliacao_comprador() {
		return avaliacao_comprador;
	}

	public void setAvaliacao_comprador(int avaliacao_comprador) {
		this.avaliacao_comprador = avaliacao_comprador;
	}

	public LocalDate getData_envio() {
		return data_envio;
	}

	public void setData_envio(LocalDate data_envio) {
		this.data_envio = data_envio;
	}

	public LocalDate getData_aceitacao() {
		return data_aceitacao;
	}

	public void setData_aceitacao(LocalDate data_aceitacao) {
		this.data_aceitacao = data_aceitacao;
	}
	
	//metodos

	public void EnviarProposta () {
		
	}
	
	public void AceitarProposta () {
		
	}
	
	public void AvaliarComprador () {
		
	}
	
	public void AvaliarVendedor () {
		
	}

	@Override
	public String toString() {
		return "Proposta [proposta_id=" + proposta_id + ", usuario_id=" + usuario_id + ", usu_usuario_id="
				+ usu_usuario_id + ", usuario_destino_id=" + usuario_destino_id + ", usuario_comprador_id="
				+ usuario_comprador_id + ", data_envio=" + data_envio + ", vlr=" + vlr + ", data_aceitacao="
				+ data_aceitacao + ", avaliacao_produtor=" + avaliacao_produtor + ", avaliacao_comprador="
				+ avaliacao_comprador + "]";
	}

}
