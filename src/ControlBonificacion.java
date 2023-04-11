
public class ControlBonificacion {

		
	private double suma;
	//sobrecarga - overloading: when you have a same method with the same name but different arguments
	
	public double registrarSalario(Funcionario funcionario) {
			this.suma = funcionario.getBonificacion() + this.suma;
			System.out.println("Calculo actual: " + this.suma);
			return this.suma;
			}
	
	
		
	

}
