
public class SistemaInterno {
	
	private int clave = 12345;

	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.autenticar(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso :-)");
			return true;
		} else {
			System.out.println("Error login");
			return false;
		} 
	}
	
}
