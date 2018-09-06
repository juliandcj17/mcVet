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
public class ListaDoble {
//papi eso no da tfdxsgfdx
    Nodo primero;

    public Nodo desconectar(int contenido) {

        Nodo actual = buscarNodo(contenido);

        if (actual != null) {
            if (actual.getAnterior() == null) {
                primero = actual.getSiguiente();
                primero.setAnterior(null);
            } else if (actual.getSiguiente() == null) {
                actual.getAnterior().setSiguiente(null);
            } else {
                actual.getAnterior().setSiguiente(actual.getSiguiente());
                actual.getSiguiente().setAnterior(actual.getAnterior());
            }
        }
        return actual;
    }

    public void ordenar() throws NoExisteException {

        int longitud = longitud() - 1;

        while (longitud > 0) {
            Nodo i = primero;
            Nodo j = primero.getSiguiente();
            while (j != null) {
                if (i.getContenido() > j.getContenido()) {
                    Nodo desconectado = desconectar(j.getContenido());
                    insertarAntesDe(i.getContenido(), desconectado);
                    j = i.getSiguiente();
                } else {
                    i = j;
                }
                j = i.getSiguiente();
            }
            longitud--;
        }
    }

    // Buscar un elemento ->
    public Nodo buscarNodo(int contenido) {

        Nodo actual = primero;

        while (actual != null && actual.getContenido() != contenido) {
            actual = actual.getSiguiente();
        }

        return actual;
    }

    // Localizar el Ãºltimo elemento ->
    public Nodo localizarUltimo() {

        Nodo actual = primero;

        if (actual != null) {
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
        }

        return actual;
    }

    // Localizar anterior ->
    public Nodo localizarAnterior(int contenido) {

        Nodo actual = buscarNodo(contenido);

        return actual != null ? actual.getAnterior() : actual;
    }

    // Calcular el nÃºmero de los elementos de una lista ->
    public int longitud() {

        Nodo actual = primero;
        int longitud = 0;

        while (actual != null) {
            longitud++;
            actual = actual.getSiguiente();
        }

        return longitud;
    }

    // Insertar un elemento despuÃ©s de uno del que se tiene la referencia ->
    public void insertarDespuesDe(int contenido, Nodo n) throws NoExisteException {

        Nodo actual = buscarNodo(contenido);

        if (actual == null) {
            throw new NoExisteException(contenido);
        } else {
            n.setSiguiente(actual.getSiguiente());
            n.setAnterior(actual);
            if (actual.getSiguiente() != null) {
                actual.getSiguiente().setAnterior(n);
            }
            actual.setSiguiente(n);
        }
    }

    // Insertar un elemento como el primero de la secuencia
    public void insertarAlComienzo(Nodo n) {

        n.setAnterior(null);

        if (primero != null) {
            n.setSiguiente(primero);
            primero.setAnterior(n);
        } else {
            n.setSiguiente(null);
        }
        primero = n;
    }

    // Insertar un elemento antes de uno del que se tiene la referencia
    public void insertarAntesDe(int contenido, Nodo n) throws NoExisteException {

        Nodo actual = buscarNodo(contenido);

        if (actual == null) {
            throw new NoExisteException(contenido);
        } else {
            n.setSiguiente(actual);
            n.setAnterior(actual.getAnterior());
            if (actual.getAnterior() != null) {
                actual.getAnterior().setSiguiente(n);
            } else {
                primero = n;
            }
            actual.setAnterior(n);
        }
    }

    //Mostrar lista
    public void mostrarLista() {

        Nodo actual = primero;

        while (actual != null) {
            System.out.println(actual.getContenido());
            actual = actual.siguiente;
        }
    }

}
