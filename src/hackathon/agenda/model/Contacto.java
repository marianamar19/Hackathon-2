package hackathon.agenda.model;

import java.util.Objects;

public class Contacto {

    private static final String PATRON_NOMBRE = "[a-zA-ZáéíóúüñÁÉÍÓÚÜÑ][a-zA-ZáéíóúüñÁÉÍÓÚÜÑ\\s\\-]*";

    private String nombre;
    private String apellido;
    private String telefono;

    // Constructor
    public Contacto(String nombre, String apellido, String telefono) {
        setNombre(nombre);
        setApellido(apellido);
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    // Setters con validación
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (!nombre.trim().matches(PATRON_NOMBRE)) {
            throw new IllegalArgumentException("El nombre solo puede contener letras, espacios y guiones");
        }
        this.nombre = nombre.trim();
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        if (!apellido.trim().matches(PATRON_NOMBRE)) {
            throw new IllegalArgumentException("El apellido solo puede contener letras, espacios y guiones");
        }
        this.apellido = apellido.trim();
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Contacto other = (Contacto) obj;

        return nombre.equalsIgnoreCase(other.nombre) && apellido.equalsIgnoreCase(other.apellido);
    }


    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase(), apellido.toLowerCase());
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido + " | Teléfono: " + telefono;
    }
}
