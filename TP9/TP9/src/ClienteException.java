

public class ClienteException extends Exception {
    
    
    private static String Errores[] = {"Nombre inválido", "CUIT inválido", "Email inválido" , "Celular invalido"} ;
    private String name;
    
    public ClienteException(String nom){name = nom;}
    
    public ClienteException(int numError){ name = Errores[numError]; }

    @Override
    public String toString() {
        return "ERROR CLIENTE: " + name ;
    }
    
}


