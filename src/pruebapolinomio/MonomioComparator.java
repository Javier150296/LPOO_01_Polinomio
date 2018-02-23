/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapolinomio;

import java.util.Comparator;

/**
 *
 * @author JAVIER1
 */
public class MonomioComparator implements Comparator<Monomio> {

    @Override
    public int compare(Monomio o1, Monomio o2) {
        return o1.getExp().compareTo(o2.getExp());
    }
    
}
