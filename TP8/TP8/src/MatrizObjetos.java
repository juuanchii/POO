
import java.util.*;

public class MatrizObjetos {
    
    static int max_filas = 200;
    static int max_cols = 200;
    private Vector cuerpo[];

    MatrizObjetos(int filas, int columnas ) throws MatrizException {
        if(columnas > max_cols) {
            throw new MatrizException("Exede la cantidad de colimnas");
        } else if (filas > max_filas){
            throw new MatrizException("Exede la cantidad de filas");
        } else {
            cuerpo = new Vector[filas];
            for(int i=0; i<filas; i++) cuerpo[i] = new Vector<Object>(columnas);
        }
    }
    
    public void setRowCol(int fila, int col, Object obj) throws MatrizException {
        
        if (fila > cuerpo.length){
            throw new MatrizException("Posicion de fila invalida");
        } else if (col > cuerpo[fila].capacity()){
            throw new MatrizException("Posicion de columna invalido");
        } else {
            cuerpo[fila].add(col, obj);
        }
    }
    
    public Object getRowCol(int fila, int col) throws MatrizException{
        Object obj = new Object();
        
        try{
            obj = cuerpo[fila].elementAt(col);
        }catch(Exception e){
            throw new MatrizException(2);
        } 
        return obj;
    }
    
    public String toString(){
        String staux = new String("");
            for(int i=0;i<cuerpo.length;i++)
                for(int j=0;j< cuerpo[i].size();j++){
                    staux = staux + cuerpo[i].elementAt(j);
                }
            return staux;
      }
 }

