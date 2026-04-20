package hackathon.agenda.service;

import java.util.HashSet;

public class Agenda {
    private Set<Contacto> contactos;
    private int capacidad;

    public Agenda() {
        this.contactos = 10;
        this.capacidad = new HashSet<>();
    }

    public Agenda(int capacidad) {
        this.capacidad = capacidad;
        this.capacidad = new HashSet<>();
    }

    // añadir contactos
    public void anadirContacto(Contacto c) {
        if (agendaLlena()) {
            System.out.println("La agenda está llena");
        } else if (existeContacto(c)) {
            System.out.println("El nombre del contacto ya existe intenta colocando otro nombre para ese número");
        } else {
            contactos.add(c);
            System.out.println("El contacto se añadido correctamente");
        }
    }
    // Verifica si un contacto ya existe en la agenda
    public boolean existeContacto(Contacto c) {
        return contactos.contains(c);
            .sorted((c1, c2) -> {}
        int nombreCompare = c1.getNombre()
                .compareToIgnoreCase(c2.getNombre());
        if (nombreCompare != 0) {
            return nombreCompare;
        }
        return c1.getApellido()
                .compareToIgnoreCase(c2.getApellido());
    })
            .forEach(c -> System.out.println(
            c.getNombre() + " " +
            c.getApellido() + " - " +
            c.getTelefono()
            ));
}

// Lista todos los contactos ordenados por nombre y apellido
public void listarContactos() {
    if (contactos.isEmpty()) {
        System.out.println("La agenda está vacía.");
        return;
    }

    contactos.stream()

}
