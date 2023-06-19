/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Modelo.Contacto;
import java.util.Scanner;
import Modelo.ListaEnlazada;

/**
 *
 * @author USUARIO
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcion;
        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.next();
                    agenda.agregarContacto(nombre, telefono);
                    System.out.println("Contacto agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.next();
                    Contacto contacto = agenda.buscarContacto(nombreBuscar);
                    if (contacto != null) {
                        System.out.println("Contacto encontrado:");
                        System.out.println("Nombre: " + contacto.getNombre());
                        System.out.println("Teléfono: " + contacto.getTelefono());
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.next();
                    agenda.eliminarContacto(nombreEliminar);
                    System.out.println("Contacto eliminado correctamente.");
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }
}