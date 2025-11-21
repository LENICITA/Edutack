/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;

/**
 *
 * @author pc
 */
public class Docente extends Usuario {
    
    private String direccion;
    private String materia;
    private int idDocente;

    public Docente(int idUsuario, String nombre, String apellido, String correo, String contraseña,
                   String telefono, boolean estadoCuenta, String fechaRegistro,
                   String documento, String fechaNacimiento, Rol rol, String direccion, String materia, int idDocente) {

        super(idUsuario, nombre, apellido, correo, contraseña, telefono, estadoCuenta,
                fechaRegistro, documento, fechaNacimiento, rol);
        
        this.direccion = direccion;
        this.materia = materia;
        this.idDocente = idDocente;
    }

    Docente(String idUsuario, String nombre, String apellido, String correo, String contraseña, String telefono, boolean estadoCuenta, String fechaRegistro, String documento, String fechaNacimiento, int rol, String direccion, String materia, int idDocente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    
    public String getMateria() { return materia; }
    public void setMateria(String materia) {
        this.materia = materia; 
    }
    public int getIdDocente() { return idDocente; }
    public void setIdDocente(int idDocente) { this.idDocente = idDocente; }
}