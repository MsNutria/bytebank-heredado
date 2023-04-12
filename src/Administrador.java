
public class Administrador extends Funcionario implements Autenticable {

	private AutenticacionUtil util;
	
	public Administrador() {
		this.util = new AutenticacionUtil();
	}
	
	@Override
	public double getBonificacion() {
		return this.getSalario();
	}

	@Override
	public void setClave(int clave) {
		this.util.setClave(clave);
		
	}

	@Override
	public boolean autenticar(int clave) {
		return this.util.autenticar(clave);
	}

}
