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
public class PruebaPolinomio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Polinomio prueba=new Polinomio();
        Polinomio prueba2=new Polinomio();
        Polinomio resultado=new Polinomio();
        
        System.out.println("Polinomio 1");
        System.out.println("***********");
        prueba.insertarMonomio(4,2);
        prueba.insertarMonomio(2,2);
        prueba.insertarMonomio(3,1);
        prueba.insertarMonomio(6,2);
        prueba.insertarMonomio(2,3);
        prueba.insertarMonomio(-1,2);
        prueba.insertarMonomio(6,3);
        
        prueba.mostrarPolinomio();
        System.out.println("\n***********");
        prueba.simplificarPolinomio();
        prueba.mostrarPolinomio();
        
        System.out.print("\n\n");
        
        System.out.println("Polinomio 2");
        System.out.println("***********");
        prueba2.insertarMonomio(1,2);
        prueba2.insertarMonomio(2,3);
        prueba2.insertarMonomio(3,2);
        prueba2.insertarMonomio(-3,3);
        prueba2.insertarMonomio(2,3);
        prueba2.insertarMonomio(1,2);
        prueba2.insertarMonomio(6,3);
        
        prueba2.mostrarPolinomio();
        System.out.println("\n***********");
        prueba2.simplificarPolinomio();
        prueba2.mostrarPolinomio();
        
        System.out.print("\n\n");
        
        System.out.println("\nSuma Polinomio 1 + Polinomio 2");
        prueba.sumarPolinomio( prueba2);
        System.out.println("*******");
        prueba.mostrarPolinomio();
        
        System.out.print("\n\n");
        
        System.out.println("\nResta Polinomio 1 - Polinomio 2");
        prueba.restarPolinomio(prueba2);
        System.out.println("*******");
        prueba.mostrarPolinomio();
        
        System.out.println("\nMultiplicación Polinomio 1 * Polinomio 2");
        resultado=prueba.multiplicarPolinomio(prueba2);
        System.out.println("*******");
        resultado.mostrarPolinomio();
    }
    
}
