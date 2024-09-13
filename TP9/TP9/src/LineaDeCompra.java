public class LineaDeCompra {
    private int cantidad;
    private Producto producto;

    public LineaDeCompra(int cantidad, Producto producto) {
        if(cantidad < 0 || cantidad > producto.getStock()){
            throw new IllegalArgumentException("Cantidad de productos invalidos o sin stock.");
        }
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubTotal() {
        return producto.getPrecio() * this.cantidad;
    }
    
    @Override
    public String toString() {
        return "LineaDeCompra{" + "cantidad=" + cantidad + '}';
    }

    
}
