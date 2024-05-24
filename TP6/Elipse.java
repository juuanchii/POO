package herencia;

public class Elipse extends Figura{
	
	private Integer radioMayor;
	private Integer radioMenor;
	
	public Elipse(String nombre, String color, Punto centro, Integer radioMayor, Integer radioMenor) {
		super(nombre, color, centro);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}
	
	public Elipse(String nombre, String color, Integer radioMayor, Integer radioMenor) {
		super(nombre, color);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	public Integer getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(Integer radioMayor) {
		this.radioMayor = radioMayor;
	}

	public Integer getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(Integer radioMenor) {
		this.radioMenor = radioMenor;
	}

	@Override
	public Double area() {
		return Math.PI * (radioMayor * radioMenor);
	}

	@Override
	public String toString() {
		return "Elipse [radioMayor=" + radioMayor + ", radioMenor=" + radioMenor + "] " + super.toString();
	}

	
	

}
