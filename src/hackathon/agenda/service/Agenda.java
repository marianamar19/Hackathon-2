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

    // buscar contacto por nombre
    public void buscarContacto(String nombre) {
        String claveNormalizada = nombre.trim().toLowerCase();
        if (contacts.containsKey(claveNormalizada)) {
            System.out.println("Contacto encontrado '" + nombre + "', numero: " + contacts.get(claveNormalizada).getNumero());
        } else {
            System.out.println("Contacto '" + nombre + "' no encontrado.");
        }
    }
    // Eliminar contacto
    public void eliminarContacto(Contacto c) {
        boolean eliminado = false;

        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(c.getNombre())) {
                contactos.remove(contacto);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            System.out.println("Contacto eliminado correctamente");
        } else {
            System.out.println("El contacto no existe");
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

}

// Lista todos los contactos ordenados por nombre y apellido
public void listarContactos() {
    if (contactos.isEmpty()) {
        System.out.println("La agenda está vacía.");
        return;
    }

    contactos.stream()

}
