package kk;

public class UsoCuenta {

	public static void main(String[] args) {
		
		Cuenta cuentaUno = new Cuenta("Uno Mil", 1000);
		Cuenta cuentaDos = new Cuenta("Dos Mil", 2000);
		Cuenta cuentaTres = new Cuenta("Tres Mil", 3000);

		System.out.println("Cuenta: "+cuentaUno.getNombreTitular());
		System.out.println("Retirar Cuenta? "+cuentaUno.retirar(500));
		System.out.println("Ingresar Cuenta? "+cuentaUno.ingresar(200));
		System.out.println(cuentaUno.toString());
		
		System.out.println(cuentaDos.toString());
		System.out.println(cuentaTres.toString());
	}

}
