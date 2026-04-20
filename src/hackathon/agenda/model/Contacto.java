package hackathon.agenda.model;

import java.util.Objects;

public class Contacto {

    private String nombre;
    private String telefono;

    // Constructor
    public Contacto(String nombre, String telefono) {
        setNombre(nombre);
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setters con validación
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Contacto other = (Contacto) obj;

        return nombre.equalsIgnoreCase(other.nombre);
    }


    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase());
    }


    @Override
    public String toString() {
        return "Nombre=' " + nombre + "| telefono='" + telefono;
    }
}
