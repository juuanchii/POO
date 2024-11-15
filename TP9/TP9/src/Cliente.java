
import java.util.concurrent.atomic.AtomicInteger;

public class Cliente {
    private int id;
    private String nombre;
    private String cuit;
    private String email;
    private String numCelular;
    private Compra compra;
    
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    public Cliente(String nombre, String cuit, String email, String numCelular) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.nombre = nombre;
        this.cuit = cuit;
        this.email = email;
        this.numCelular = numCelular;
        //Cual seria la mejor manera de lanzar los mensajes de las exceptions?¿¿
        if (estaVacio()) {
            throw new IllegalArgumentException("El cliente no puede estar vacío o incompleto.");
        }
    }

    public Cliente() {
    }
    
    public boolean estaVacio() {
        return (id == 0) &&
               (nombre == null || nombre.isEmpty()) &&
               (cuit == null) &&
               (email == null || email.isEmpty()) &&
               (numCelular == null || numCelular.isEmpty());
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public String getEmail() {
        return email;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", cuit=" + cuit + ", email=" + email + ", numCelular=" + numCelular + '}';
    }
    
    
}
