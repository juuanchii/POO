import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ProductoRepository productoRepository = new ProductoRepository();
        ClienteRepository clienteRepository = new ClienteRepository();
        CompraRepository compraRepository = new CompraRepository();

        ProductoService productoService = new ProductoService(productoRepository);
        ClienteService clienteService = new ClienteService(clienteRepository);
        CompraService compraService = new CompraService(compraRepository, productoService, clienteService);

        try {

            Producto yerba = new Producto("Yerba", 1000L, 10, 5000.00);
            Producto azucar = new Producto("Azucar", 4000L, 10, 1300.00);
            productoService.registrarProducto(yerba);
            productoService.registrarProducto(azucar);

            Cliente cliente1 = new Cliente("Juan", "20425262840", "juan@juan.com", "3455226555");
            clienteService.registrarCliente(cliente1);

            LineaDeCompra linea1 = new LineaDeCompra(2, yerba);
            LineaDeCompra linea2 = new LineaDeCompra(1, azucar);

            Compra compra1 = new Compra(cliente1);
            compra1.addLineaDeCompra(linea1);
            compra1.addLineaDeCompra(linea2);

            compraService.registrarCompra(compra1);

            System.out.println("Compra registrada con éxito:");
            System.out.println("Cliente: " + compra1.getCliente().getNombre());
            System.out.println("Fecha: " + compra1.getFecha());
            System.out.println("Total: $" + compra1.getTotal());
            System.out.println("Detalle de la compra:");
            for (LineaDeCompra linea : compra1.getListaDeCompra()) {
                System.out.println("- Producto: " + linea.getProducto().getNombre() +
                                   ", Cantidad: " + linea.getCantidad() +
                                   ", Subtotal: $" + linea.getSubTotal());
            }

            System.out.println("\nStock actualizado:");
            System.out.println("Yerba: " + productoService.buscarPorNombre("Yerba").getStock());
            System.out.println("Azucar: " + productoService.buscarPorNombre("Azucar").getStock());

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
