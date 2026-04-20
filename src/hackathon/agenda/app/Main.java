package hackathon.agenda.app;

import hackathon.agenda.model.Contacto;
import hackathon.agenda.service.Agenda;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda(); // agenda con tamaño por defecto

        int opcion;
        do {
            System.out.println("\n--- MENÚ AGENDA ---");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Existe contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Buscar contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Agenda llena");
            System.out.println("7. Espacios libres");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    agenda.anadirContacto(new Contacto(nombre, telefono));
                    break;
                case 2:
                    System.out.print("\nNombre: ");
                    nombre = sc.nextLine();
                    Contacto c = new Contacto(nombre, "");
                    System.out.println(agenda.existeContacto(c) ? "\nEl contacto existe." : "\nEl contacto no existe.");
                    break;
                case 3:
                    agenda.listarContactos();
                    break;
                case 4:
                    System.out.print("\nNombre: ");
                    nombre = sc.nextLine();
                    agenda.buscarContacto(nombre);
                    break;
                case 5:
                    System.out.print("\nNombre: ");
                    nombre = sc.nextLine();
                    agenda.eliminarContacto(new Contacto(nombre, ""));
                    break;
                case 6:
                    System.out.println(agenda.agendaLlena() ? "\nLa agenda está llena" : "\nLa agenda no está llena");
                    break;
                case 7:
                    System.out.println("\nEspacios libres: " + agenda.espaciosLibres());
                    break;
                case 8:
                    System.out.println("\nSaliendo...");
                    break;
                default:
                    System.out.println("\nOpción inválida");
            }
        } while (opcion != 8);

        sc.close();
    }


}
