
package tp6;

public class Circulo extends Elipse {

            public Circulo(String nombre, String color, Punto centro, Integer radio) {
                    super(nombre, color, centro, radio, radio);
             }

            public Circulo(String nombre, String color, Integer radio) {
                    super(nombre, color, radio, radio);
                    
            }
            
        public String toString() {
                return "Circulo [radio=" + this.getRadioMenor() + "] " + super.toString();
    
        }    
}
