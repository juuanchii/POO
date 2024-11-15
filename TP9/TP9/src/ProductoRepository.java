
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductoRepository {
    private Map<String, Producto> productos = new HashMap<>();

    public void guardar(Producto producto) {
        productos.put(producto.getNombre(), producto);
    }

    public Producto buscarPorNombre(String nombre) {
        return productos.get(nombre);
    }
    
    public List<Producto> buscarPorStockBajo() {
        return productos.values().stream()
                .filter(p -> p.getStock() < p.getStockMin())
                .collect(Collectors.toList());
    }
    
    public void actualizar(Producto producto) {
        if (!productos.containsKey(producto.getNombre())) {
            throw new IllegalArgumentException("El producto no existe y no se puede actualizar.");
        }
        productos.put(producto.getNombre(), producto);
    }

    public List<Producto> obtenerTodos() {
        return new ArrayList<>(productos.values());
    }
}
