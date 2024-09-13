
package tp5;

public class Naipe {
    private Integer numero;
    private Familia palo;

    public Naipe() {
    }
    
    public Naipe(Integer numero, Familia palo) {
        if(numero>0 && numero <13){
            this.numero = numero;
            this.palo = palo;
        }
    }
    
    public Boolean isNaipeEmpty(){
        return this.numero == null || this.palo == null;
    }

    public Integer getNumero() {
        return numero;
    }

    public Familia getPalo() {
        return palo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setPalo(Familia palo) {
        this.palo = palo;
    }
    
    public Boolean equals(Naipe naipe){
        return this.numero.equals(naipe.getNumero()) && this.palo.equals(naipe.getPalo());
    }

    @Override
    public String toString() {
        return "Naipe{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
}
