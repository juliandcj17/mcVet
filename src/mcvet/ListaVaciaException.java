/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcvet;

/**
 *
 * @author s101e2
 */
public class ListaVaciaException extends Exception{
    
    private static final long serialVersionUID = 30458906028790000L;
    
    public ListaVaciaException() {

        super("La lista se encuentra vacía.");
    }

    
}
