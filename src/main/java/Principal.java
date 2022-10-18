package test;

public class Principal {

	public static void main(String[] args) {
		Jugador f1 = new Jugador();
		Jugador f2 = new Jugador("Valeria", 21, "defensa", (short) 4, (byte) 8);
		System.out.println(f1.compareTo(f2) == 9);
		System.out.println(f1.getGolesMarcados());
		System.out.println(f2.getGolesMarcados());
		
	}

}
