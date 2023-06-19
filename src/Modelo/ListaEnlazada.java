/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarElemento(Contacto contacto) {
        Nodo nuevoNodo = new Nodo(contacto);
        if (estaVacia()) {
            cabeza = nuevoNodo;
        } else {
            Nodo nodoActual = cabeza;
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nuevoNodo;
        }
    }

    public Contacto buscarElemento(String nombre) {
        if (estaVacia()) {
            return null;
        }
        Nodo nodoActual = cabeza;
        while (nodoActual != null) {
            if (nodoActual.dato.getNombre().equals(nombre)) {
                return nodoActual.dato;
            }
            nodoActual = nodoActual.siguiente;
        }
        return null;
    }

    public void eliminarElemento(String nombre) {
        if (estaVacia()) {
            return;
        }
        if (cabeza.dato.getNombre().equals(nombre)) {
            cabeza = cabeza.siguiente;
            return;
        }
        Nodo nodoActual = cabeza;
        while (nodoActual.siguiente != null) {
            if (nodoActual.siguiente.dato.getNombre().equals(nombre)) {
                nodoActual.siguiente = nodoActual.siguiente.siguiente;
                return;
            }
            nodoActual = nodoActual.siguiente;
        }
    }
}
