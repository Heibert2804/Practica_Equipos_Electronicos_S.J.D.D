package servicios;
import java.util.Scanner;
import modelos.EstudianteIngenieria;
import validaciones.Validaciones;

public class PruebaIng {

    Scanner sc = new Scanner(System.in);

    Validaciones val = new Validaciones();

    public EstudianteIngenieria crearEstudiante() {

        System.out.println("===== REGISTRO ESTUDIANTE =====");

        System.out.print("Ingrese cédula: ");
        String cedula = val.ValidarCedula(sc);

        System.out.print("Ingrese nombre: ");
        String nombre = val.ValidarTexto(sc);

        System.out.print("Ingrese apellido: ");
        String apellido = val.ValidarTexto(sc);

        System.out.print("Ingrese teléfono: ");
        String telefono = val.ValidarCedula(sc);

        System.out.print("Ingrese semestre: ");
        int semestre = val.ValidarEntero(sc);

        System.out.print("Ingrese promedio: ");
        float promedio = val.ValidarFloat(sc);

        System.out.print("Ingrese serial: ");
        String serial = val.ValidarCedula(sc);

        EstudianteIngenieria estudiante = new EstudianteIngenieria(
                cedula,
                nombre,
                apellido,
                telefono,
                semestre,
                promedio,
                serial
            );
        return estudiante;
    }
}
