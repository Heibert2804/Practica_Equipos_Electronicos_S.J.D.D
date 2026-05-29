package modelos;

public class EstudianteIngenieria extends Persona {


    private int semestre;
    private float promedio;
    private String serialEquipo;

    public EstudianteIngenieria(
            String cedula,
            String nombre,
            String apellido,
            String telefono,
            int semestre,
            float promedio,
            String serialEquipo) {

        super(cedula, nombre, apellido, telefono);

        this.semestre = semestre;
        this.promedio = promedio;
        this.serialEquipo = serialEquipo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getSerialEquipo() {
        return serialEquipo;
    }

    public void setSerialEquipo(String serialEquipo) {
        this.serialEquipo = serialEquipo;
    }

}