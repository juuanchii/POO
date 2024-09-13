
public class MatrizException extends Exception {
    
    private static String Errores[] = {"Excede las columnas", "Excede  las filas", "Error al recuperar objeto de matriz" } ;
    private String name;
    
    public MatrizException(String nom){name = nom;}
    
    public MatrizException(int numError){ name = Errores[numError]; }

    @Override
    public String toString() {
        return "ERROR MATRIZ: " + name ;
    }
    
}

