/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapolinomio;

/**
 *
 * @author JAVIER1
 */
public class Monomio {
    private Integer coeficiente;
    private Integer exponente;
    
    
    public Monomio(Integer coef, Integer exp){ //constructor para recibir el coeficiente y exponente del monomio
        this.coeficiente=coef;
        this.exponente=exp;
    }
    public Monomio(){ //constructor en caso de que no recibir argumentos
        this(0,0); //se asignará valores por defecto 
    }
    
    
    public void setCoef(Integer c){
        this.coeficiente=c;
    }
    public void setExp(Integer e){
        this.exponente=e;
    }
    public Integer getCoef(){ 
        return this.coeficiente;
    }
    public Integer getExp(){ 
        return this.exponente;
    }
    
    
}
