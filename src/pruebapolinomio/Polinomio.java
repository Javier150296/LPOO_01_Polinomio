/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapolinomio;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author JAVIER1
 */
public class Polinomio {
    private LinkedList<Monomio> polinomio=new LinkedList<> ();
    
    
    private int getTamanio(){
        return polinomio.size();
    }
    private LinkedList<Monomio> getList(){
        return polinomio;
    }
    private void setPolinomio(LinkedList<Monomio> nuevoPolinomio){
        this.polinomio=nuevoPolinomio;
    }
    
     public void insertarMonomio(Integer coef, Integer expo){
        Monomio nuevo=new Monomio(coef,expo);
        polinomio.add(nuevo);
    }
     
    private void ordenarPolinomio(){
        Collections.sort(this.getList(),new MonomioComparator());
    }
    
    public void mostrarPolinomio(){
        int cantidad=polinomio.size();
        for(int i=0;i<cantidad;i++){
            if(polinomio.get(i).getCoef()>=0 && i>0)
                System.out.print(" + ");
            System.out.print(polinomio.get(i).getCoef()+"x^"+polinomio.get(i).getExp());
        }
    }
    
    public void simplificarPolinomio(){
        int cantidad=getTamanio();
        
        for(int i=0;i<cantidad;i++){
            for(int j=i+1;j<cantidad;j++){
                    if(compararMonomio(polinomio.get(i),polinomio.get(j))){
                        polinomio.remove(j);
                  }
                cantidad=getTamanio();
            }
            cantidad=getTamanio();
        }
        for(int i=getTamanio()-2;i>0;i--){
            if(compararMonomio(polinomio.get(i),polinomio.get(getTamanio()-1)))
                        polinomio.remove(getTamanio()-1);
        }
        ordenarPolinomio();
    }
    
    private boolean compararMonomio(Monomio comparacion, Monomio actual){
        if(Objects.equals(comparacion.getExp(), actual.getExp())){
            comparacion.setCoef(comparacion.getCoef()+actual.getCoef());
            return true;
        }else
            return false;
    }
    
    public void sumarPolinomio(Polinomio sumando){
       
        for(int i=0;i<sumando.getTamanio();i++){
            polinomio.add(sumando.getList().get(i));
        }
        simplificarPolinomio();
    }
    
    public void restarPolinomio(Polinomio sustraendo){
        int cantidad=sustraendo.getTamanio();
        for(int i=0;i<cantidad;i++){
            sustraendo.getList().get(i).setCoef(sustraendo.getList().get(i).getCoef()*-1);
        }
        sumarPolinomio(sustraendo);
    }
    
    public Polinomio multiplicarPolinomio(Polinomio multiplicando){
        LinkedList<Monomio> listProducto;
        listProducto=new LinkedList<> ();
        Polinomio producto=new Polinomio();
        Integer coeficiente, exponente;
       
        for (int i=0;i<getTamanio();i++){
            for(int j=0;j<multiplicando.getTamanio();j++){
                coeficiente=polinomio.get(i).getCoef()*multiplicando.getList().get(j).getCoef();
                exponente=polinomio.get(i).getExp()+multiplicando.getList().get(j).getExp();
                listProducto.add(new Monomio(coeficiente, exponente));
            }
        }
        producto.setPolinomio(listProducto);
        producto.simplificarPolinomio();
        return producto;
    }
    
    
}
