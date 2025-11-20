/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author APRENDIZ
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UsuarioService userService = new UsuarioService();
        Login authService = new Login(userService);

        // Crear un admin por defecto
        Rol rolAdmin = new Rol(1, "ADMIN");
        Administrador admin = new Administrador(
                99, "felipe", "lugo", "admin@mail.com", "admin2",
                "3127136194", true, LocalDate.now(), "1234567890",
                LocalDate.of(1990, 1, 1), rolAdmin
        );

        userService.añadirUsuario(admin);

        System.out.println("================= SISTEMA DE LOGIN =================");

        System.out.print("Usuario / Correo / ID: ");
        String user = sc.nextLine();

        System.out.print("Contraseña: ");
        String pass = sc.nextLine();

        try {
            Usuario logeado = authService.iniciarSesion(user, pass);
            System.out.println("\nBienvenido " + logeado.getNombre() + "!");

            if (logeado.getRol().getNombre().equals("ADMIN")) {
                menuAdmin(sc, userService);
            } else {
                System.out.println("Acceso permitido solo para consulta por ahora.");
            }

        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void menuAdmin(Scanner sc, UsuarioService userService) {
        int opcion = 0;

        while (opcion != 4) {

            System.out.println("\n====== MENÚ ADMINISTRADOR ======");
            System.out.println("1. Añadir usuario");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Listar usuarios");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    añadirUsuarioDesdeConsola(sc, userService);
                    break;
                case 2:
                    System.out.print("ID a eliminar: ");
                    int id = Integer.parseInt(sc.nextLine());
                    userService.eliminarUsuario(id);
                    break;
                case 3:
                    for (Usuario u : userService.listarUsuarios()) {
                        System.out.println(u.getNombre() + " - " + u.getCorreo());
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    public static void añadirUsuarioDesdeConsola(Scanner sc, UsuarioService userService) {
        System.out.println("\n===== REGISTRO DE USUARIO =====");

        System.out.print("ID usuario: ");
        int idUsuario = Integer.parseInt(sc.nextLine());

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Correo: ");
        String correo = sc.nextLine();

        System.out.print("Contraseña: ");
        String contraseña = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Documento: ");
        String documento = sc.nextLine();

        System.out.print("Fecha nacimiento (AAAA-MM-DD): ");
        LocalDate fechaNac = LocalDate.parse(sc.nextLine());

        System.out.println("Rol: 1=Admin, 2=Docente, 3=Estudiante, 4=Padre");
        int r = Integer.parseInt(sc.nextLine());

        Rol rol = new Rol(r, r==1?"ADMIN": r==2?"DOCENTE": r==3?"ESTUDIANTE":"PADRE");

        Usuario nuevo = new Usuario(idUsuario, nombre, apellido, correo, contraseña,
                telefono, true, LocalDate.now(), documento, fechaNac, rol);

        userService.añadirUsuario(nuevo);
    }
}

