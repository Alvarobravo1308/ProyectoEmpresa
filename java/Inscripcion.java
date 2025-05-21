public class Inscripcion {
    private Usuario usuario;
    private Evento evento;
    private String fechaInscripcion;

    public Inscripcion(Usuario usuario, Evento evento, String fechaInscripcion) {
        this.usuario = usuario;
        this.evento = evento;
        this.fechaInscripcion = fechaInscripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public String getResumen() {
        return usuario.getNombre() + " inscrito en " + evento.getResumen();
    }
}