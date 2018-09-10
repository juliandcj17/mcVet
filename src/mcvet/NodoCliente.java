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
public class NodoCliente {

    public NodoCliente(int identificacion, String nombre, String direccion, int telefono) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    int identificacion;
    String nombre;
    String direccion;
    int telefono;
    NodoCliente siguiente;





    public int getId() {
        return identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setContenido(int identificacion) {
        this.identificacion = identificacion;
    }

    public NodoCliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }

   public void insertarDespues(NodoCliente n){
       n.siguiente = siguiente;
       siguiente = n;
   }

}
