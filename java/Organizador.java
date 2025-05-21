public class Organizador {
    private int id;
    private String nombre;
    private String contacto;
    private String organizacion;


    public Organizador(int id, String nombre, String contacto, String organizacion) {
        this.id = id;
        this.nombre = nombre;
        this.contacto = contacto;
        this.organizacion = organizacion;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

      public String getOrganizacion() {
        return organizacion;
    }

    @Override
    public String toString() {
        return nombre + " - " + organizacion;
    }
}