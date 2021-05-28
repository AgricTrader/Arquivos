package AgricTrader;

public class Usuario {
	
	//atributos da classe
	private  int usuario_id;
	private String cod_login;
	private String senha;
	private String contato;
	private String insc_produtor;
	private String desc_atividade;
	private boolean comprador;
	private boolean produtor;

	//construtor
	public Usuario(int usuario_id, String cod_login, String senha, String contato, String insc_produtor,
			String desc_atividade) {
		super();
		this.usuario_id = usuario_id;
		this.cod_login = cod_login;
		this.senha = senha;
		this.contato = contato;
		this.insc_produtor = insc_produtor;
		this.desc_atividade = desc_atividade;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getCod_login() {
		return cod_login;
	}

	public void setCod_login(String cod_login) {
		this.cod_login = cod_login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getInsc_produtor() {
		return insc_produtor;
	}

	public void setInsc_produtor(String insc_produtor) {
		this.insc_produtor = insc_produtor;
	}

	public String getDesc_atividade() {
		return desc_atividade;
	}

	public void setDesc_atividade(String desc_atividade) {
		this.desc_atividade = desc_atividade;
	}

	public boolean isComprador() {
		return comprador;
	}

	public void setComprador(boolean comprador) {
		this.comprador = comprador;
	}

	public boolean isProdutor() {
		return produtor;
	}

	public void setProdutor(boolean produtor) {
		this.produtor = produtor;
	}
	
	//métodos

	public void EfetuarLogin () {
		
	}
	
	public void Cadastrar () {
		
	}
	
	public void Atualizar () {
		
	}

	@Override
	public String toString() {
		return "Usuario [usuario_id=" + usuario_id + ", cod_login=" + cod_login + ", senha=" + senha + ", contato="
				+ contato + ", insc_produtor=" + insc_produtor + ", desc_atividade=" + desc_atividade + ", comprador="
				+ comprador + ", produtor=" + produtor + "]";
	}


	}
	
	
