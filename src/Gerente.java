
public class Gerente extends Funcionario implements Autenticable {
	
	
	@Override
    //Sobreescritura  - overriding de metodo
    public double getBonificacion () {
    	System.out.println("EJECUTANDO DESDE GERENTE");
    	return 2000;
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
