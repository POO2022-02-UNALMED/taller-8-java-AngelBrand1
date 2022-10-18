package futbol;
import static java.lang.Math.abs; 

public class Jugador extends Futbolista {
	private short golesMarcados;
	private byte dorsal;

	//constructores
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	//metodos
	public boolean jugarConLasManos() {
		return false;
	}
	
	@Override
	public int compareTo(Object o) {
		Jugador n = (Jugador)o;
		int goles = n.getGolesMarcados() ;
		return abs(this.golesMarcados-goles);
	}
	
	public String toSring() {
		String s = 
				String.format(
						"El futbolista %s tiene %d, y juega de %s con el dorsal %d. Ha marcado %d"
						, this.getNombre(),this.getEdad(),this.getPosicion(),this.dorsal,this.golesMarcados);
		return s;
	}
	//getters and setters

	public short getGolesMarcados() {
		return golesMarcados;
	}

	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}


	
	
}
