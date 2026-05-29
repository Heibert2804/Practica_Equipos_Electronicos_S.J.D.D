package principal;

import modelos.EstudianteIngenieria;
import servicios.PruebaIng;

public class Main {
    public static void main(String[] args) {

        PruebaIng prueba = new PruebaIng();
        EstudianteIngenieria estudiante = prueba.crearEstudiante();

        System.out.println("\n===== ESTUDIANTE CREADO =====");

        System.out.println("Nombre: " + estudiante.getNombre());

        System.out.println("Promedio: " + estudiante.getPromedio());
    }
}