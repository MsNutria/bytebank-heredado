
public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario miguel = new Contador();
		miguel.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		Contador alex = new Contador();
		alex.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(miguel);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alex);
		
	}
}
