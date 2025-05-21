public class Main {
    public static void main(String[] args) {
        Categoria cat1 = new Categoria(1, "Taller de Compostaje Casero");
        Ubicacion ubi1 = new Ubicacion(1, "Presencial", "Centro Verde, Madrid");
        Organizador org1 = new Organizador(1, "Asociacion Huerta Viva", "eco@org.com", "Madrid");

        Categoria cat2 = new Categoria(2, "Jornada de Reforestación");
        Ubicacion ubi2 = new Ubicacion(2, "Presencial", "Parque Natural El Robledal");
        Organizador org2 = new Organizador(2, "Fundación Árbol Vivo", "eco@org.com", "Madrid");

        Categoria cat3 = new Categoria(3, "Feria Sostenible Local");
        Ubicacion ubi3 = new Ubicacion(3, "Presencial", "Plaza Mayor de Alcobendas");
        Organizador org3 = new Organizador(3, "Ayuntamiento de Alcobendas", "eco@org.com", "Alcobendas");

        Categoria cat4 = new Categoria(4, "Conferencia Energías Renovables");
        Ubicacion ubi4 = new Ubicacion(4, "Online - Zoom", " https://zoom.us/j/123456789");
        Organizador org4 = new Organizador(4, "Energía Limpia Global", "eco@org.com", "Madrid");

        Categoria cat5 = new Categoria(5, "EcoTaller de Reciclaje");
        Ubicacion ubi5 = new Ubicacion(5, "Presencial", "Centro Cultural La Estación");
        Organizador org5 = new Organizador(5, "Red Verde", "eco@org.com", "Madrid");

        Categoria cat6 = new Categoria(6, "Conferencia Verde");
        Ubicacion ubi6 = new Ubicacion(6, "Online (Zoom)", "https://zoom.us/j/123456789");
        Organizador org6 = new Organizador(6, "EcoFuture", "eco@org.com", "Madrid");


        Usuario user1 = new Usuario(1, "Lucía Gómez", "lucia@gmail.com");
        Usuario user2 = new Usuario(2, "Pedro Ruiz", "pedro@gmail.com");
        Usuario user3 = new Usuario(3, "Ana Martínez", "Ana@gmail.com"); 
        Usuario user4 = new Usuario(4, "Javier López", "Javier@gmail.com");
        Usuario user5 = new Usuario(5, "María Fernández", "María@gmail.com");
        Usuario user6 = new Usuario(6, "Carlos Pérez", "Carlos@gmail.com");

        

        Evento e1 = new Evento(1, "Taller de Compostaje Casero", "2025-10-20", 3, cat1, ubi1, org1);
        Evento e2 = new Evento(2, "Jornada Reforestación", "2025-08-10", 4, cat2, ubi2, org2);
        Evento e3 = new Evento(3, "Feria Sostenible", "2025-10-05", 2, cat3, ubi3, org3);
        Evento e4 = new Evento(4, "Conferencia Energías Renovables", "2025-09-15", 3, cat4, ubi4, org4);
        Evento e5 = new Evento(5, "EcoTaller de Reciclaje", "2025-07-02", 4, cat5, ubi5, org5);
        Evento e6 = new Evento(6, "Conferencia Verde", "2025-06-15", 2, cat6, ubi6, org6);
        GestorEventos gestor = new GestorEventos(10);
        gestor.agregarEvento(e1);
        gestor.agregarEvento(e2);
        gestor.agregarEvento(e3);
        gestor.agregarEvento(e4);
        gestor.agregarEvento(e5);
        gestor.agregarEvento(e6);
        
      

        gestor.inscribirUsuarioAEvento(user1, "Conferencia Energías Renovables");
        gestor.inscribirUsuarioAEvento(user2, "EcoTaller de Reciclaje");
        gestor.inscribirUsuarioAEvento(user3, "Conferencia Verde");
        gestor.inscribirUsuarioAEvento(user4, "Feria Sostenible");

        gestor.inscribirUsuarioAEvento(user5, "Jornada Reforestación");
        gestor.inscribirUsuarioAEvento(user6, "Taller de Compostaje Casero");

        gestor.listarInscritosPorEvento("Conferencia Energías Renovables");
        gestor.listarInscritosPorEvento("EcoTaller de Reciclaje");
        gestor.listarInscritosPorEvento("Conferencia Verde");
        gestor.listarInscritosPorEvento("Feria Sostenible");
        gestor.listarInscritosPorEvento("Jornada Reforestación");
        gestor.listarInscritosPorEvento("Taller de Compostaje Casero");
        
        


        System.out.println(" Lista de Eventos:");
        gestor.listarEventos();

        System.out.println("\n Detalles:");
        gestor.mostrarDetalles();
    }
}
