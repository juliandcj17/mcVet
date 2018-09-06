/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcvet;

/**
 *
 * @author Julian
 */
public class NodoExisteException extends Exception {

    private static final long serialVersionUID = 30458906028790159L;

    public NodoExisteException(int contenido) {

        super("El elemento con el cÃ³digo " + contenido + "no existe");
    }
}
