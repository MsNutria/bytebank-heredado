
public interface Autenticable {
	
	//In a interface all the interfaces are abstract even the methods.
	public void setClave(int clave);
	
    public boolean autenticar(int clave);
}
