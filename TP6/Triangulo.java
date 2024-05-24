package herencia;

public class Triangulo extends Figura{
	
	private Integer base;
	private Integer altura;

	public Triangulo(String nombre, String color, Integer base, Integer altura) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public Double area() {
		return (double) ((base*altura)/2);
	}

}
