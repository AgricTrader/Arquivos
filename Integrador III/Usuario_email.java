
public class Usuario_email {

	private int email_id;
	
	private int usuario_id;
	
	private String email;

	public Usuario_email(int email_id, int usuario_id, String email) {
		super();
		this.email_id = email_id;
		this.usuario_id = usuario_id;
		this.email = email;
	}

	public int getEmail_id() {
		return email_id;
	}

	public void setEmail_id(int email_id) {
		this.email_id = email_id;
	}

	public int getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
