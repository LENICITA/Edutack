/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;

import java.time.LocalDate;

/**
 *
 * @author pc
 */
public class Administrador extends Usuario {
    
    private String direccion;
    private int idAdministrador;

    public Administrador(int idUsuario, String nombre, String apellido, String correo, String contraseña,
                         String telefono, boolean estadoCuenta, LocalDate fechaRegistro,
                         String documento, LocalDate fechaNacimiento, Rol rol) {

        super(idUsuario, nombre, apellido, correo, contraseña, telefono, estadoCuenta,
                fechaRegistro, documento, fechaNacimiento, rol);
        
        this.direccion = direccion;
         this.idAdministrador = idAdministrador;
        
    }
    
     public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    
    public int getIdAdministrador() { return idAdministrador; }
    public void setIdAdministrador(int idAdministrador) { this.idAdministrador = idAdministrador; }
}
