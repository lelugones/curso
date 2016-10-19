package kk;

public class Cuenta {
	
	private String nombreTitular;
	private int saldo;
	
	public Cuenta(String nombreTitular, int saldo) {
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
	}
	
	public boolean ingresar(int cantidad){
		boolean ingresado = false;
		
		if(cantidad > 0){
			saldo = saldo + cantidad;
			ingresado = true;
		} else {
			ingresado = false;
		}
		return ingresado;
	}
	
	public boolean retirar(int cantidad){
		boolean retirado = false;
		
		if(cantidad > 0 && saldo >= cantidad){
			saldo = saldo - cantidad;
			retirado = true;
		} else {
			retirado = false;
		}
		return retirado;
	}
	
	public boolean transferir(int cantidad, Cuenta unaCuenta){
		boolean transferido = false;
		
		if(cantidad > 0 && saldo >= cantidad){
			retirar(cantidad);
			unaCuenta.setSaldo(unaCuenta.getSaldo() + cantidad);
			transferido = true;
		} else {
			transferido = false;
		}
		return transferido;
	}
	
	public String toString(){
		String resultado = "";
		resultado = "Cuenta Titular: "+getNombreTitular()+" Saldo: "+getSaldo();
		return resultado;		
	}
	
	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
}
