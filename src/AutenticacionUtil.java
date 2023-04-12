
public class AutenticacionUtil {

	private int clave;
	
	public boolean autenticar(int clave) {
		return this.clave == clave;
	}
	
	public void setClave(int clave) {
		this.clave = clave;
	}
}