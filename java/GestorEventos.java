public class GestorEventos {
    private Evento[] eventos;
    private int total;

    public GestorEventos(int maxEventos) {
        eventos = new Evento[maxEventos];
        total = 0;
    }

    public void agregarEvento(Evento evento) {
        if (total < eventos.length) {
            eventos[total] = evento;
            total++;
        } else {
            System.out.println("No se pueden agregar más eventos.");
        }
    }
    
   public void inscribirUsuarioAEvento(Usuario usuario, String nombreEvento) {
    for (int i = 0; i < total; i++) {
        Evento evento = eventos[i];
        if (evento.getNombre().equalsIgnoreCase(nombreEvento)) {
            evento.inscribirUsuario(usuario);
            return;
        }
    }
    System.out.println("Evento no encontrado: " + nombreEvento);
}
    
    public void listarInscritosPorEvento(String nombreEvento) {
    for (int i = 0; i < total; i++) {
        Evento evento = eventos[i];
        if (evento.getNombre().equalsIgnoreCase(nombreEvento)) {
            System.out.println("Participantes en " + evento.getNombre() + ":");
            for (Usuario usuario : evento.getInscritos()) {
                System.out.println(" - " + usuario);
            }
            return;
        }
    }
    System.out.println("Evento no encontrado: " + nombreEvento);
}


    public void listarEventos() {
        for (int i = 0; i < total; i++) {
            System.out.println(eventos[i].getResumen());
        }
    }

    public void mostrarDetalles() {
        for (int i = 0; i < total; i++) {
            System.out.println(eventos[i].getDetalle());
        }
    }
}
  