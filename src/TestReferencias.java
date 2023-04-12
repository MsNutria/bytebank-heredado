
public class TestReferencias {

	public static void main(String[] args) {
		
		//The element most general can be adapted to the element more specific
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Miguel");
		
		Gerente gerente = new Gerente ();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
	}
}
