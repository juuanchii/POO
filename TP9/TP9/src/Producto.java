public class Producto {
    
    private String nombre;
    private Long  stock;
    private  int stockMin;
    private Double precio;

    public Producto(String nombre, Long stock, int stockMin, Double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.stockMin = stockMin;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public Long getStock() {
        return stock;
    }

    public int getStockMin() {
        return stockMin;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", stock=" + stock + ", stockMin=" + stockMin + ", precio=" + precio + '}';
    }
    
}
