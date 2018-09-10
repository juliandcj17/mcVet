/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcvet;

import static mcvet.Formularios.Principal.nuevoCliente;


/**
 *
 * @author Julian
 */
public class LCliente {

    NodoCliente primero;

    public void insertarEnOrden(NodoCliente n) throws NoExisteException, NodoExisteException {
        if (primero != null) {
            if (buscarCliente(n.getId()) == null) {
                if (n.getId() < primero.getId()) {
                    insertarAlComienzo(n);
                } else {
                    NodoCliente actual = primero;
                    NodoCliente siguiente = primero.getSiguiente();
                    while (siguiente != null) {
                        if (n.getId() > actual.getId() && n.getId() < siguiente.getId()) {
                            insertarDespuesDe(actual.getId(), n);
                            break;
                        } else {
                            actual = siguiente;
                            siguiente = siguiente.getSiguiente();
                        }
                    }
                    if (siguiente == null) {
                        insertarDespuesDe(actual.getId(), n);
                    }
                }
            } else {
                throw new NodoExisteException(n.getId());
            }
        } else {
            insertarAlComienzo(n);
        }
    }

    // Buscar un cliente en la lista
    public NodoCliente buscarCliente(int contenido) {

        NodoCliente actual = nuevoCliente.primero;

        while (actual != null && actual.getId() != contenido) {
            actual = actual.getSiguiente();
        }

        return actual;
    }

    // Localizar el último elemento
    public NodoCliente localizarUltimo() throws ListaVaciaException {
        if (nuevoCliente.primero == null) {
            throw new ListaVaciaException();
        } else {
            NodoCliente actual = nuevoCliente.primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            return actual;
        }
    }

    // Localizar anterior
    public NodoCliente localizarAnterior(int contenido){
            NodoCliente anterior = null;
            NodoCliente actual = primero;
            while (actual != null && actual.getId() != contenido) {
            anterior = actual;
            actual = actual.getSiguiente();
            }
            return actual != null ? anterior : null;
    }

    // Calcular el número de los elementos de una lista
    public int longitud() {

        NodoCliente actual = primero;
        int longitud = 0;

        while (actual != null) {
            longitud++;
            actual = actual.getSiguiente();
        }

        return longitud;
    }

    // Insertar un elemento después de uno del que se tiene la referencia
    public void insertarDespuesDe(int identificacion, NodoCliente n) throws NoExisteException {
        //Validamos que el ciente no exista en la lista
        if (buscarCliente(n.getId()) != null) {
            System.out.println("El cliente ya existe en la lista"); 
        } else { //Si el cliente no existe pasamos a buscar el nodo que nos referencia para insertarlo antes
            NodoCliente anterior = buscarCliente(identificacion);
            if (anterior == null) {
                 throw new NoExisteException(identificacion);
            } else {
                anterior.insertarDespues(n);
            }
        }
        
    }
    
     // Insertar un elemento como el primero de la secuencia
    public void insertarAlComienzo(NodoCliente n) {
        //Validamos que el ciente no exista en la lista
        if (buscarCliente(n.getId()) != null) {
            System.out.println("El cliente ya existe en la lista"); 
        } else {
            n.setSiguiente(nuevoCliente.primero);
            nuevoCliente.primero = n;
        }
    }

    // Mostar todos las identificaciones de la lista
    public void mostrarLista() { //TOCA MODIFICARLO TODO PARA PODER MOSTRAR LOS ELEMENTOS EN LA TABLA

        NodoCliente actual = primero;

        while (actual != null) {
            System.out.println(actual.getId());
            actual = actual.getSiguiente();
        }
    }

    public void insertarAlFinal(NodoCliente n) throws ListaVaciaException {
        //Validamos que el ciente no exista en la lista
        if (buscarCliente(n.getId()) != null) {
            System.out.println("El cliente ya existe en la lista"); 
        } else {
            NodoCliente ultimo = localizarUltimo();
            n.setSiguiente(null);
            ultimo.setSiguiente(n);
        }
        
    }

    // Insertar un elemento antes de uno del que se tiene la referencia
    public void insertarAntesDe(int codigo, NodoCliente n) throws NoExisteException{
        //Validamos que el ciente no exista en la lista
        if (buscarCliente(n.getId()) != null) {
            System.out.println("El cliente ya existe en la lista"); 
        } else {
            NodoCliente anterior = localizarAnterior(codigo);
            if (anterior == null) {
                 throw new NoExisteException(codigo);
            } else {
                anterior.insertarDespues(n);
            }
        }
       
    }

    public void invertirLista() throws ListaVaciaException {
        NodoCliente cabeza = primero;
        int i = longitud() - 1;
        while (i > 0) {
            NodoCliente cola = localizarUltimo();
            NodoCliente anteriorCabeza = localizarAnterior(cabeza.getId());
            NodoCliente anteriorCola = localizarAnterior(cola.getId());

            cola.setSiguiente(cabeza);

            if (anteriorCabeza != null) {
                anteriorCabeza.setSiguiente(cola);
            } else {
                cola.setSiguiente(cabeza);
                primero = cola;
            }
            anteriorCola.setSiguiente(null);
            i--;
        }

    }

}
