import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Compra {
    private int id;
    private Cliente cliente; //Esta bien hacer un getCliente desde compra??
    private Date fecha;
    private List<LineaDeCompra> listaDeCompra;

    public List<LineaDeCompra> getLineaDeCompra() {
        return listaDeCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<LineaDeCompra> getListaDeCompra() {
        return listaDeCompra;
    }
    
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);

    public Compra(Cliente cliente) {
        
        if (cliente == null || cliente.estaVacio()) {
            throw new IllegalArgumentException("El cliente no puede estar vacío o incompleto.");
        }
        this.id = ID_GENERATOR.getAndIncrement();
        this.cliente = cliente;
        this.fecha = new  Date();
        this.listaDeCompra = new ArrayList<>();
    }

    public Compra() {
    }

    public Date getFecha() {
        return fecha;
    }

    public List<LineaDeCompra> getListaCompra() {
        return listaDeCompra;
    }

    public void addLineaDeCompra(LineaDeCompra lineaDeCompra) {
        this.listaDeCompra.add(lineaDeCompra);
    }

    
    public Double getTotal(){
        Double total = 0.0;
        for(LineaDeCompra linea : listaDeCompra){
            total = total + linea.getSubTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", fecha=" + fecha + '}';
    }
    
    
}
