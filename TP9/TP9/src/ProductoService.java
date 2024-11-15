
import java.util.List;

public class ProductoService {
    private ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public void registrarProducto(Producto producto) throws ProductoException {
        if (producto.getNombre().length() < 2) {
            throw new ProductoException("El nombre del producto debe tener al menos 2 caracteres.");
        }
        if (producto.getStock() < 0) {
            throw new ProductoException("El stock no puede ser negativo.");
        }
        if (producto.getPrecio() <= 0) {
            throw new ProductoException("El precio debe ser positivo.");
        }
        productoRepository.guardar(producto);
    }
    
    public Producto buscarPorNombre(String nombre){
        return productoRepository.buscarPorNombre(nombre);
    }
     public void actualizar(Producto producto){
         productoRepository.actualizar(producto);
     }

    public List<Producto> obtenerProductosConStockBajo() {
        return productoRepository.buscarPorStockBajo();
    }
}
