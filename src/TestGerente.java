
public class TestGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		//gerente.setSalario(5000)

		//Funcionario gerente = new Funcionario();
		gerente.setNombre("Marco");
		gerente.setDocumento("4456664");
		gerente.setSalario(6000);
		
		
		gerente.setClave(3333);
		boolean autenticar = gerente.autenticar(3333);
		gerente.setTipo(1);
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.autenticar(3333));
	}
}
