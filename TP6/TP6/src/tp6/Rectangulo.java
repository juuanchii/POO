package tp6;

public class Rectangulo extends Figura{
	
	private Float base;
	private Float altura;
	
	public Rectangulo(String nombre, String color, Punto centro, Float base, Float altura) {
		super(nombre, color, centro);
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo(String nombre, String color, Float base, Float altura) {
		super(nombre, color);
		this.base = base;
		this.altura = altura;
	}

	public Float getBase() {
		return base;
	}

	public void setBase(Float base) {
		this.base = base;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
                                this.altura = altura;
	}
        
	public void cambiarTamanio(Float factor) {
			altura = (altura * factor);
			base = base * factor;
	}
	
	public Double perimetro() {
		return (double) (base * 2 + altura * 2);
	}

	@Override
	public Double area() {
		return (double) (base * altura);
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "] " + super.toString();
	}
	
}