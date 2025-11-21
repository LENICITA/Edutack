/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;


/**
 *
 * @author pc
 */
public class Administrador extends Usuario {
    
    private String direccion;
    private int idAdministrador;

    public Administrador(int idUsuario, String nombre, String apellido, String correo, String contraseña,
                         String telefono, boolean estadoCuenta, String fechaRegistro,
                         String documento, String fechaNacimiento, Rol rol, String direccion, int idAdministrador) {

        super(idUsuario, nombre, apellido, correo, contraseña, telefono, estadoCuenta,
                fechaRegistro, documento, fechaNacimiento, rol);
        
        this.direccion = direccion;
        this.idAdministrador = idAdministrador;
        
    }

    Administrador(String idUsuario, String nombre, String apellido, String correo, String contraseña, String telefono, boolean estadoCuenta, String fechaRegistro, String documento, String fechaNacimiento, int rol, String direccion, int idAdministrador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
     public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    
    public int getIdAdministrador() { return idAdministrador; }
    public void setIdAdministrador(int idAdministrador) { this.idAdministrador = idAdministrador; }
}
