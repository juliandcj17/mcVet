/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcvet;

/**
 *
 * @author s214e9
 */
public class NodoMascota {
        
        int identificacion;
        String nombre;
        String raza;
        String color;
        NodoMascota siguiente;
        NodoMascota anterior;
	
	public int getId() {
		return identificacion;
	}

	public String getNombre() {
		return nombre;
	}


	public String getRaza() {
		return raza;
	}

	public NodoMascota(int id, String nombre, String raza, String color) {
		this.identificacion = id;
                this.nombre = nombre;
		this.raza = raza;
		this.color = color;
	}
	
	public NodoMascota getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoMascota siguiente) {
		this.siguiente = siguiente;
	}
        public NodoMascota getAnterior(){
            return anterior;
        }
        
        public void setAnterior(NodoMascota anterior){
            this.anterior = anterior;
        }
}
