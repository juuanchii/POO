package tp6;

public class Punto {

	private Integer coordenadaX; 
	private Integer coordenadaY;
	
	public Punto(Integer coordenadaX, Integer coordenadaY) {
		super();
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public Integer getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(Integer coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public Integer getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(Integer coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	@Override
	public String toString() {
		return "Punto [X=" + coordenadaX + ", Y=" + coordenadaY + "]";
	}
	
	
}
