

public class CompraException extends Exception {
    
    
    private static String Errores[] = {"Error en TimeStamp", "Error con el cliente", "Error con la linea de compra"} ;
    private String name;
    
    public CompraException(String nom){name = nom;}
    
    public CompraException(int numError){ name = Errores[numError]; }

    @Override
    public String toString() {
        return "ERROR COMPRA: " + name ;
    }
    
}