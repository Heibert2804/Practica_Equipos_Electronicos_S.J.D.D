package modelos;

public class EstudianteDiseno extends Persona {

    private String modalidad;
    private int cantidadAsignaturas;
    private String serialEquipo;

    public EstudianteDiseno(
            String cedula,
            String nombre,
            String apellido,
            String telefono,
            String modalidad,
            int cantidadAsignaturas,
            String serialEquipo) {

        super(cedula, nombre, apellido, telefono);

        this.modalidad = modalidad;
        this.cantidadAsignaturas = cantidadAsignaturas;
        this.serialEquipo = serialEquipo;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public int getCantidadAsignaturas() {
        return cantidadAsignaturas;
    }

    public void setCantidadAsignaturas(int cantidadAsignaturas) {
        this.cantidadAsignaturas = cantidadAsignaturas;
    }

    public String getSerialEquipo() {
        return serialEquipo;
    }

    public void setSerialEquipo(String serialEquipo) {
        this.serialEquipo = serialEquipo;
    }

}