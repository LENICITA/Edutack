/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;

/**
 *
 * @author APRENDIZ
 */
public class Login {
    
    private final UsuarioService usuarioService;

    public Login (UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public Usuario iniciarSesion(String usuarioOcorreoOID, String contraseña) {

        Usuario u = usuarioService.buscarParaLogin(usuarioOcorreoOID);

        if (u == null) {
            throw new RuntimeException("Usuario no encontrado.");
        }

        if (!u.getContraseña().equals(contraseña)) {
            throw new RuntimeException("Contraseña incorrecta.");
        }

        if (!u.isEstadoCuenta()) {
            throw new RuntimeException("La cuenta está inactiva.");
        }

        return u; // Inicio de sesión exitoso
    }
}
