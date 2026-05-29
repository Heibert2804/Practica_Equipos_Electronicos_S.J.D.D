package validaciones;

import java.util.Scanner;

public class Validaciones {

    // VALIDAR ENTEROS
    public int ValidarEntero(Scanner sc) {
        try {
            int numero = Integer.parseInt(sc.nextLine());
            if (numero > 0) {
                return numero;
            } else {
                System.out.println("El número debe ser mayor que cero");
                return ValidarEntero(sc);
            }
        } catch (Exception e) {
            System.out.println("Error. Debe ingresar un número entero");
            System.out.println("Intente nuevamente:");
            return ValidarEntero(sc);
        }
    }
    // VALIDAR DECIMALES
    public float ValidarFloat(Scanner sc) {
        try {
            float numero = Float.parseFloat(sc.nextLine());
            if (numero >= 0) {
                return numero;
            } else {
                System.out.println("El número debe ser positivo");
                return ValidarFloat(sc);
            }
        } catch (Exception e) {
            System.out.println("Error. Debe ingresar un número decimal");
            System.out.println("Intente nuevamente:");
            return ValidarFloat(sc);
        }
    }
    // VALIDAR TEXTO
    public String ValidarTexto(Scanner sc) {
        String texto = sc.nextLine();
        if (texto.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
            return texto;
        } else {
            System.out.println("Error. Solo se permiten letras");
            System.out.println("Intente nuevamente:");
            return ValidarTexto(sc);
        }
    }
    // VALIDAR CEDULA
    public String ValidarCedula(Scanner sc) {
        String cedula = sc.nextLine();
        if (cedula.matches("[0-9]+")) {
            return cedula;
        } else {
            System.out.println("Error. Solo se permiten números");
            System.out.println("Intente nuevamente:");
            return ValidarCedula(sc);
        }
    }
}