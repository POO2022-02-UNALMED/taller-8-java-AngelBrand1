package futbol;
public abstract class Futbolista implements Comparable<Object> {
	private String nombre;
	private int edad;
	private String posicion;
	//constructor
	public Futbolista(String nombre, int edad, String posicion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}
	
	public Futbolista() {
		this("maradona",30,"delantero");
	}
	
	//metodos
	public boolean equals(Futbolista f) {
		return(this==f);
	}
	
	public String toString() {
		String s = 
				String.format(
				"El futbolista %s tiene %d, y juega de %s"
				,this.nombre,this.edad,this.posicion);
				
		return s;
	}
	
	public abstract boolean jugarConLasManos();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
}

