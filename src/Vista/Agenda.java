/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Contacto;
import Modelo.ListaEnlazada;

/**
 *
 * @author USUARIO
 */
public class Agenda {

    private ListaEnlazada contactos;

    public Agenda() {
        contactos = new ListaEnlazada();
    }

    public void agregarContacto(String nombre, String telefono) {
        Contacto contacto = new Contacto(nombre, telefono);
        contactos.agregarElemento(contacto);
    }

    public Contacto buscarContacto(String nombre) {
        return contactos.buscarElemento(nombre);
    }

    public void eliminarContacto(String nombre) {
        contactos.eliminarElemento(nombre);
    }
}
