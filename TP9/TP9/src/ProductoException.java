

public class ProductoException extends Exception {
    
    
    private static String Errores[] = {"Nombre del producto inválido", "Error con el stock", "Precio inválido"} ;
    private String name;
    
    public ProductoException(String nom){name = nom;}
    
    public ProductoException(int numError){ name = Errores[numError]; }

    @Override
    public String toString() {
        return "ERROR PROUCTO: " + name ;
    }
    
}
