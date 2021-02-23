/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Local;

/**
 *
 * @author salvarez
 */
@Local
public interface calculadoraEjbLocal {
    
    public int sumar(int x, int y);
    
    public int restar(int x, int y);
    
    public double dividir(double x,double y);
    
    public double multiplicar(int x, int y);
    
}
