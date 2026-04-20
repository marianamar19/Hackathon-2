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


}
