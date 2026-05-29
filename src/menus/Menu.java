package menus;
import java.util.Scanner;
import validaciones.Validaciones;
public class Menu {
    Scanner sc = new Scanner(System.in);
    Validaciones v = new Validaciones();
    public void menupricipal(){
        boolean seguir = true;
        Menu m = new Menu();
        int opt = 0;
        while (seguir) {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE PRÉSTAMOS SAN JUAN DE DIOS ---");
            System.out.println("1. Estudiantes de Ingeniería");
            System.out.println("2. Estudiantes de Diseño");
            System.out.println("3. Imprimir inventario total");
            System.out.println("4. Salir del programa");
            System.out.print("Seleccione una opción: ");
            opt = v.ValidarEntero(sc); 
            switch (opt) {
                case 1:
                    m.Submenu("Ingenieria");
                    break;
                case 2:
                    m.Submenu("Diseno");
                    break;
                case 3:
                    System.out.println("En mantenimiento");
                    break;
                case 4:
                    System.out.println("Saliendo sistema");
                    System.out.println("Sistema cerrado");
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        }
    }
    private void Submenu(String facultad) {
        boolean seguir2 = true;
        int opcion = 0;
        while (seguir2) {
            System.out.println("\n--- MENÚ DE " + facultad.toUpperCase() + " ---");
            System.out.println("1. Registrar préstamo"); 
            System.out.println("2. Modificar préstamo"); 
            System.out.println("3. Devolución de equipo"); 
            System.out.println("4. Buscar equipo"); 
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            opcion = v.ValidarEntero(sc); 

            switch (opcion) {
                case 1:
                    System.out.println("Registrando préstamo para " + facultad);
                    break;
                case 2:
                    System.out.println("Modificando préstamo para " + facultad);
                    break;
                case 3:
                    System.out.println("Procesando devolución para " + facultad);
                    break;
                case 4:
                    System.out.println("Buscando equipo para " + facultad);
                    break;
                case 5:
                    System.out.println("Volviendo...");
                    seguir2 = false;
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }
        }
    }
    
}
