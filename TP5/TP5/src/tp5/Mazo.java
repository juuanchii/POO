/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class Mazo {
    private List<Naipe> naipes;
    
    public Mazo(){
        this.naipes = new ArrayList<>();
        inicializar();
    }

    public List<Naipe> getNaipes() {
        return naipes;
    }
    
    public void inicializar() {
        for(int i=1; i<=12;i++) {
            naipes.add(new Naipe(i, Familia.BASTO));
            naipes.add(new Naipe(i, Familia.ORO));
            naipes.add(new Naipe(i, Familia.ESPADA));
            naipes.add(new Naipe(i, Familia.COPA));
        }
    }
    
    public void barajar(){
        Collections.shuffle(naipes);
    }
    
    public Naipe getNaipeArriba() {
        if(naipes.isEmpty()){
            return new Naipe();
        } else {
        return naipes.removeFirst();
        }
    }
    
    public Naipe getNaipeAbajo() {
        if(naipes.isEmpty()){
            return new Naipe();
        } else {
        return naipes.removeLast();
        }
    }
    
    public Naipe getNaipeAleatorio() {
        Random rand = new Random();
        int index = rand.nextInt(naipes.size());
        return naipes.get(index);
    }
    
    public Integer getSize() {
        return naipes.size();
    }
    
    public void cortar(Integer x) {
        if(x>0 && x<naipes.size()){
            List<Naipe> a = naipes.subList(0, x-1);
            List<Naipe> b = naipes.subList(x, naipes.size());
            b.addAll(a);
            naipes = b;
        }
    }

    @Override
    public String toString() {
        return "Mazo{" + "naipes=" + naipes + '}';
    }
    
    
}
