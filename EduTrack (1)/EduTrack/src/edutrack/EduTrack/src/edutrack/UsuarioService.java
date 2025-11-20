/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;
 import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author APRENDIZ
 */
public class UsuarioService {
    
    private final List<Usuario> usuarios = new ArrayList<>();

    // Añadir usuario
    public void añadirUsuario(Usuario u) {
        usuarios.add(u);
        System.out.println("Usuario añadido: " + u.getNombre());
    }

    // Editar usuario
    public void editarUsuario(int idUsuario, Usuario nuevo) {

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getIdUsuario() == idUsuario) {
                usuarios.set(i, nuevo);
                System.out.println("Usuario actualizado correctamente.");
                return;
            }
        }

        System.out.println("No se encontró el usuario con ID: " + idUsuario);
    }

    // Eliminar usuario
    public void eliminarUsuario(int idUsuario) {
        usuarios.removeIf(u -> u.getIdUsuario() == idUsuario);
        System.out.println("Usuario eliminado si existía.");
    }

    // Buscar usuario por nombreUsuario o correo o ID
    public Usuario buscarParaLogin(String dato) {

        for (Usuario u : usuarios) {

            if (String.valueOf(u.getIdUsuario()).equals(dato)) return u;
            if (u.getCorreo().equalsIgnoreCase(dato)) return u;
            if (u.getNombre().equalsIgnoreCase(dato)) return u;
        }
        return null;
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}

