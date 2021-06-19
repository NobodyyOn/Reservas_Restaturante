public class Reservas {

    private int documento;
    private double contacto;
    private int cantidad;
    private String nombre;
    private String correo;
    private String fechaReserva;
    private String motivo;
    private String tipoDecoracion;

    public Reservas(){
        documento = 0;
        contacto=0;
        cantidad=0;
        nombre="";
        correo="";
        fechaReserva="";
        motivo="";
        tipoDecoracion="";
    }

    public Reservas(int documento, String nombre, double contacto, String correo, String fechaReserva, int cantidad, String motivo, String tipoDecoracion) {
        this.documento=documento;
        this.contacto=contacto;
        this.cantidad=cantidad;
        this.nombre=nombre;
        this.correo=correo;
        this.fechaReserva=fechaReserva;
        this.motivo=motivo;
        this.tipoDecoracion=tipoDecoracion;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getContacto() {
        return contacto;
    }

    public void setContacto(double contacto) {
        this.contacto = contacto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getTipoDecoracion() {
        return tipoDecoracion;
    }

    public void setTipoDecoracion(String tipoDecoracion) {
        this.tipoDecoracion = tipoDecoracion;
    }
}
