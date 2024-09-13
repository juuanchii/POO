public class TP8 {

    public static void main(String[] args) {
        try {
            MatrizObjetos matriz = new MatrizObjetos (100, 50);
            String st1 = new String(" esto es un String ");
            Integer entero = new Integer(10);
            matriz.setRowCol(0, 0, st1);
            matriz.setRowCol(1, 0, entero);
            
            
            matriz.setRowCol(10, 0, st1);
            System.out.println(matriz.getRowCol(10, 0));
            System.out.println(matriz);
        }catch(MatrizException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
