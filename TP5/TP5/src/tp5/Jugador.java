package tp5;

public class Jugador {
    
    private String nombre;
    private Naipe naipe_elegido;

    public Jugador(String nombre, Naipe naipe_elegido) {
        this.nombre = nombre;
        this.naipe_elegido = naipe_elegido;
    }

    public String getNombre() {
        return nombre;
    }

    public Naipe getNaipe_elegido() {
        return naipe_elegido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNaipe_elegido(Naipe naipe_elegido) {
        this.naipe_elegido = naipe_elegido;
    }
    
    public void setNaipe_aleatorio(Mazo mazo){
         this.naipe_elegido = mazo.getNaipeAleatorio();
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", naipe_elegido=" + naipe_elegido + '}';
    }
    
    
}
