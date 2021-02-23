/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author salvarez
 */
@Stateless
public class calculadoraEjb implements calculadoraEjbLocal{

    @Override
    public int sumar(int x, int y) {
       return x + y;
    }

    @Override
    public int restar(int x, int y) {
       return x - y;
    }

    @Override
    public double dividir(double x, double y) {
       return x / y;
    }

    @Override
    public double multiplicar(int x, int y) {
       return x * y;
    }
    
}
