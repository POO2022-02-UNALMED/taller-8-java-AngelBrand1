package test;
import static java.lang.Math.abs;

import java.lang.Math;
public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String nombre, int edad,  short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}

	
	//constructores 
	
	
	//metodos 
	public String toString() {
		String s = 
				String.format(
						"El futbolista %s tiene %d, y juega de %s con el dorsal %d. Le han marcado %d"
						, this.getNombre(),this.getEdad(),this.getPosicion(),this.dorsal,this.golesRecibidos);
		return s;
	}
	
	public boolean jugarConLasManos() {
		return true;
	}
	
	@Override
	public int compareTo(Futbolista o) {
		Portero n = (Portero)o;
		int goles = n.getGolesRecibidos() ;
		
		return abs(this.golesRecibidos-goles);
	}

	public short getGolesRecibidos() {
		return golesRecibidos;
	}


	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}


	public byte getDorsal() {
		return dorsal;
	}


	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	
	//getters and setters
	
}
