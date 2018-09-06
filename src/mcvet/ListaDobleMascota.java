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
public class ListaDobleMascota {

    NodoMascota primero;

    // Buscar un elemento ->
    public NodoMascota buscarMascota(int identificacion) {

        NodoMascota actual = primero;

        while (actual != null && actual.getId() != identificacion) {
            actual = actual.getSiguiente();
        }

        return actual;
    }
    
    // Localizar el Ãºltimo elemento ->
    public NodoMascota localizarUltimo() {

        NodoMascota actual = primero;

        if (actual != null) {
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
        }

        return actual;
    }

    // Localizar anterior ->
    public NodoMascota localizarAnterior(int identificacion) {

        NodoMascota actual = buscarMascota(identificacion);

        return actual != null ? actual.getAnterior() : actual;
    }

    // Calcular el nÃºmero de los elementos de una lista ->
    public int longitud() {

        NodoMascota actual = primero;
        int longitud = 0;

        while (actual != null) {
            longitud++;
            actual = actual.getSiguiente();
        }

        return longitud;
    }

    // Insertar un elemento despuÃ©s de uno del que se tiene la referencia ->
    public void insertarDespuesDe(int identificacion, NodoMascota n) throws NoExisteException {
        //Validamos que la mascota no exista en la listaDoble
        if (buscarMascota(n.getId()) != null) {
            System.out.println("La mascota ya existe en la lista"); 
        } else {
            NodoMascota actual = buscarMascota(identificacion);

            if (actual == null) {
                  throw new NoExisteException(identificacion);
            } else {
                  n.setSiguiente(actual.getSiguiente());
                  n.setAnterior(actual);
                  if (actual.getSiguiente() != null) {
                  actual.getSiguiente().setAnterior(n);
            }
                 actual.setSiguiente(n);
            }
        }
        
    }

    // Insertar un elemento como el primero de la secuencia
    public void insertarAlComienzo(NodoMascota n) {
        //Validamos que la mascota no exista en la listaDoble
        if (buscarMascota(n.getId()) != null) {
            System.out.println("La mascota ya existe en la lista"); 
        } else {
            n.setAnterior(null);

             if (primero != null) {
                 n.setSiguiente(primero);
                 primero.setAnterior(n);
             } else {
                    n.setSiguiente(null);
                }
            primero = n;
        }
        
    }

    // Insertar un elemento antes de uno del que se tiene la referencia
    public void insertarAntesDe(int contenido, NodoMascota n) throws NoExisteException {
        //Validamos que la mascota no exista en la listaDoble
        if (buscarMascota(n.getId()) != null) {
            System.out.println("La mascota ya existe en la lista"); 
        } else {
            NodoMascota actual = buscarMascota(contenido);

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

    }

    //Mostrar lista
    public void mostrarLista() {

        NodoMascota actual = primero;

        while (actual != null) {
            System.out.println(actual.getId());
            actual = actual.siguiente;
        }
    }

}
