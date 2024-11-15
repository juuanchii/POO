
import java.util.Date;
import java.util.List;

public class CompraService {
    private CompraRepository compraRepository;
    private ProductoService productoService;
    private ClienteService clienteService;

    public CompraService(CompraRepository compraRepository, ProductoService productoService, ClienteService clienteService) {
        this.compraRepository = compraRepository;
        this.productoService = productoService;
        this.clienteService = clienteService;
    }

    public void registrarCompra(Compra compra) throws CompraException {
        Cliente cliente = clienteService.buscarClientePorCuit(compra.getCliente().getCuit());
        if (cliente == null) {
            throw new CompraException("El cliente no existe.");
        }
        compra.setFecha(new Date());

        for (LineaDeCompra linea : compra.getListaCompra()) {
            Producto producto = productoService.buscarPorNombre(linea.getProducto().getNombre());
            if (producto == null || linea.getCantidad() <= 0 || linea.getCantidad() > producto.getStock()) {
                throw new CompraException("Error en la cantidad o en el stock del producto.");
            }
            producto.setStock(producto.getStock() - linea.getCantidad());
            productoService.actualizar(producto);
        }
        compraRepository.guardar(compra);
    }

    public List<Compra> obtenerComprasPorCliente(Cliente cliente) {
        return compraRepository.buscarPorCliente(cliente);
    }
}
