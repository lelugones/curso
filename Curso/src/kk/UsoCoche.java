package kk;

public class UsoCoche {

	public static void main(String[] args) {
		
		Coche bmw = new Coche("rojo", 3, 90);
		System.out.println(bmw.getColor());
		System.out.println(bmw.getMarcha());
		System.out.println(bmw.getVelocidad());
		bmw.frenar(10);
		System.out.println(bmw.getVelocidad());
		bmw.acelerar(15);
		System.out.println(bmw.getVelocidad());		
	}

}
