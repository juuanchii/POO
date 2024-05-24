package herencia;

public abstract class Figura {
	
	private String nombre;
	private String color;
	private Punto centro;
	
	public Figura(String nombre, String color, Punto centro) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.centro = centro;
	}
	
	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.centro = new Punto (0,0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}
	
	public abstract Double area();

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + ", centro=" + centro + "]";
	}

}
