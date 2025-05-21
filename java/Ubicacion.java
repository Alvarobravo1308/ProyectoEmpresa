public class Ubicacion {
    private int id;
    private String tipo; // Online o Presencial
    private String detalle;

    public Ubicacion(int id, String tipo, String detalle) {
        this.id = id;
        this.tipo = tipo;
        this.detalle = detalle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getDescripcion() {
        return tipo.equals("Online") ? "Online: " + detalle : "Presencial en: " + detalle;
    }
}