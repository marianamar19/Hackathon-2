package hackathon.agenda.service;

import hackathon.agenda.model.Contacto;
import java.util.HashSet;
import java.util.Set;

public class Agenda {
    // Atrubutos
    private Set<Contacto> contactos;
    private int capacidad;

    // Constructor
    public Agenda() {
        this.capacidad = 10;
        this.contactos = new HashSet<>();
    }

    // Constructor con capacidad personalizada
    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        this.contactos = new HashSet<>();
    }

    // Añadir contactos
    public void anadirContacto(Contacto c) {
        if (agendaLlena()) { // Llama al metodo agenda
            System.out.println("\nLa agenda está llena");
        } else if (existeContacto(c)) { //Llama al metodo existeContacto
            System.out.println("\nEl contacto ya existe, no se permiten contactos con el mismo nombre y apellido");
        } else {
            contactos.add(c); // Aagrega el contacto c al conjunto contactos
            System.out.println("\nEl contacto se añadido correctamente");
        }
    }

    // Verifica si un contacto ya existe en la agenda
    public boolean existeContacto(Contacto c) {
        return contactos.contains(c);
    }

    // listar contactos
    public void listarContactos(){
            if (contactos.isEmpty()){
                System.out.println("\nAgenda vacia");
            } else {
                System.out.println("\nLista de contactos:");
                for (Contacto contacto : contactos) {
                    System.out.println(contacto);
                }
            }
    }

    // buscar contacto por nombre y apellido
    public void buscarContacto(String nombre, String apellido) {
        boolean encontrado = false;

        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre) && contacto.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("\nContacto encontrado: " + contacto);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nContacto no encontrado");
        }
    }

    // Eliminar contacto
    public void eliminarContacto(Contacto c) {
        if (contactos.remove(c)) {
            System.out.println("\nContacto eliminado correctamente");
        } else {
            System.out.println("\nEl contacto no existe");
        }
    }

    // Verificar si la agenda está llena
    public boolean agendaLlena() {
        return contactos.size() >= capacidad;
    }

    // Espacios libres
    public int espaciosLibres() {
        return capacidad - contactos.size();
    }

}
