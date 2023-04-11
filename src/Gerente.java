
public class Gerente extends Funcionario {
	
	private int clave;
	
	
	public void setClave(int clave) {
		this.clave = clave;
	}
	
    public boolean autenticar(int clave) {
        if (this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }
    
    //Sobreescritura  - overriding de metodo
    public double getBonificacion () {
    	System.out.println("EJECUTANDO DESDE GERENTE");
    	return super.getSalario() + this.getSalario() * 0.05;
    }

}
