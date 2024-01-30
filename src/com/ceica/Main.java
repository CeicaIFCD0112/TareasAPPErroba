import com.ceica.Controladores.AlmacenController;
import com.ceica.Controladores.LoginController;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        String usr,pass;
        AlmacenController almacen=new AlmacenController();
        Scanner leer=new Scanner(System.in);
        System.out.println("Bienvenido a AppAlmacen");
        System.out.println(".... Enter para empezar");
        leer.nextLine();
        do{
            System.out.println("Login de AppAlmacen");
            System.out.print("Introduce Usuario: ");
            usr=leer.nextLine();
            System.out.print("Introduce password");
            pass=leer.nextLine();
            if(LoginController.login(usr,pass)){
                System.out.println("Estoy en TareasAPPErroba");
                menuPrincipalAlmacen(leer,almacen);

            }else{
                System.out.println("Usuario o Contraseña incorrecta");
            }
        }while(true);
    }

    private static void menuPrincipalAlmacen(Scanner leer, AlmacenController almacen) {
        String op="";
        String menuPrincipal= """
                1. Usuarios
                2. Tareas
                3. Salir
                """;
        do{
            System.out.println(menuPrincipal);
            op=leer.nextLine();
            switch (op){
                case "1":
                    subMenuUsuarios(leer,almacen);
                    break;
                case "2":
                    subMenuTasks(leer,almacen);
                    break;
                case "3":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(! "3".equals(op));
    }

    private static void subMenuUsuarios(Scanner leer, AlmacenController almacen) {
        String op;
        String menuUsuarios= """
                1. Nuevo usuario
                2. Cambiar usuario
                3. Borrar usuario
                4. Ver usuarios
                5. Volver al menú anterior
                """;
        do{
            System.out.println(menuUsuarios);
            op=leer.nextLine();
            switch (op){
                case "1":
                    nuevoUsuario(leer,almacen);
                    break;
                case "2":
                    editarUsuario(leer,almacen);
                    break;
                case "3":
                    deleteUsuario(leer,almacen);
                    break;
                case "4":
                    verUsuario(leer,almacen);
                    break;
                case "5":
                    System.out.println(almacen.verPiezas());
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }while(! "6".equals(op));
    }

    private static void nuevoUsuario(Scanner leer, AlmacenController almacen) {

    }

    private static void editarUsuario(Scanner leer, AlmacenController almacen) {

    }

    private static void deleteUsuario(Scanner leer, AlmacenController almacen) {

    }

    private static void verUsuario(Scanner leer, AlmacenController almacen) {

    }

    private static void subMenuTasks(Scanner leer, AlmacenController almacen) {
        String op;
        String menuUsuarios= """
                1. Nueva tarea
                2. Cambiar tarea
                3. Borrar tarea
                4. Ver tareas
                5. Volver al menú anterior
                """;
        do{
            System.out.println(menuUsuarios);
            op=leer.nextLine();
            switch (op){
                case "1":
                    nuevaTask(leer,almacen);
                    break;
                case "2":
                    editarTask(leer,almacen);
                    break;
                case "3":
                    deleteTask(leer,almacen);
                    break;
                case "4":
                    verTask(leer,almacen);
                    break;
                case "5":
                    System.out.println(almacen.verPiezas());
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        }while(! "6".equals(op));
    }

    private static void nuevaTask(Scanner leer, AlmacenController almacen) {

    }

    private static void editarTask(Scanner leer, AlmacenController almacen) {

    }

    private static void deleteTask(Scanner leer, AlmacenController almacen) {

    }

    private static void verTask(Scanner leer, AlmacenController almacen) {

    }
}