/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Nodo {

    public Contacto dato;
    public Nodo siguiente;

    public Nodo(Contacto dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}