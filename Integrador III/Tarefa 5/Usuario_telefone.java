package AgricTrader;

public class Usuario_telefone {
	
	//atributos da classe
	private int fone_id;
	private int usuario_id;
	private String telefone;
	private boolean whatsap;
	
	//construtor da classe
	public Usuario_telefone(int fone_id, int usuario_id, String telefone) {
		super();
		this.fone_id = fone_id;
		this.usuario_id = usuario_id;
		this.telefone = telefone;
	}

	public int getFone_id() {
		return fone_id;
	}

	public void setFone_id(int fone_id) {
		this.fone_id = fone_id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isWhatsap() {
		return whatsap;
	}

	public void setWhatsap(boolean whatsap) {
		this.whatsap = whatsap;
	}
	
	//métodos

	public void Cadastrar () {
		
	}
	
	public void Atualizar () {
		
	}
	
	public void Consultar () {
		
	}
}
