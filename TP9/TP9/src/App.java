import java.util.List;

public class App {

    public static void main(String[] args) {
        
        Producto yerba = new Producto("Yerba", 1000L, 10, 5000.00 );
        Producto azucar = new Producto("Azucar", 4000L, 10, 1300.00 );
        
        Cliente cliente1= new Cliente("Juan", 20425262840L, "juan@juan.com", "3455226555");
        
        LineaDeCompra linea1 = new LineaDeCompra(2, yerba );
        LineaDeCompra linea2 = new LineaDeCompra(1, azucar );
        
        Compra compra1 = new Compra(cliente1);
        compra1.addLineaDeCompra(linea1);
        compra1.addLineaDeCompra(linea2);
        
        List<LineaDeCompra> compra = compra1.getListaCompra();
        for(LineaDeCompra producto : compra){
            System.out.println(producto.getProducto());
            
        }
        System.out.println(compra1.getTotal());
    }

}
