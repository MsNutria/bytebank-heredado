
public class TestCuenta {

	public static void main(String[] args) {
		//El constructor tiene el mismo nombre que la clase 
		CuentaCorriente cc = new CuentaCorriente(1,1);
		CuentaAhorros ca = new CuentaAhorros(2,3);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
		
	}
}
