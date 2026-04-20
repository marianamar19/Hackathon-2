gitpackage hackathon.agenda.app;


public class agendaMain {
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
                agenda.añadirContacto(new Contacto(nombre, telefono));
                break;
            case 2:
                System.out.print("Nombre: ");
                nombre = sc.nextLine();
                Contacto c = new Contacto(nombre, "");
                System.out.println(agenda.existeContacto(c) ? "El contacto existe." : "El contacto no existe.");
                break;
            case 3:
                agenda.listarContactos();
                break;
            case 4:
                System.out.print("Nombre: ");
                nombre = sc.nextLine();
                agenda.buscaContacto(nombre);
                break;
            case 5:
                System.out.print("Nombre: ");
                nombre = sc.nextLine();
                agenda.eliminarContacto(new Contacto(nombre, ""));
                break;
            case 6:
                System.out.println(agenda.agendaLlena() ? "La agenda está llena." : "La agenda no está llena.");
                break;
            case 7:
                System.out.println("Espacios libres: " + agenda.espaciosLibres());
                break;
            case 8:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    } while (opcion != 8);

        sc.close();
}
