
public class Administrador extends Funcionario implements Autenticable {

	@Override
	public double getBonificacion() {
		return 0;
	}

	@Override
	public void setClave(int clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autenticar(int clave) {
		// TODO Auto-generated method stub
		return false;
	}

}
