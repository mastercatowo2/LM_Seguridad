public class MallaDeTurnos {
    private String nombre;
    private String horario;
    private String estado;

    public MallaDeTurnos() {
        // Constructor vacío requerido por Firestore.
    }

    public MallaDeTurnos(String nombre, String horario, String estado) {
        this.nombre = nombre;
        this.horario = horario;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public String getEstado() {
        return estado;
    }
}
