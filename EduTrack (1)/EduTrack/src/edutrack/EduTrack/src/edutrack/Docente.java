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
public class Docente extends Usuario {
    
    private String direccion;
    private String materia;
    private int idDocente;

    public Docente(int idUsuario, String nombre, String apellido, String correo, String contraseña,
                   String telefono, boolean estadoCuenta, LocalDate fechaRegistro,
                   String documento, LocalDate fechaNacimiento, Rol rol) {

        super(idUsuario, nombre, apellido, correo, contraseña, telefono, estadoCuenta,
                fechaRegistro, documento, fechaNacimiento, rol);
        
        this.direccion = direccion;
        this.materia = materia;
        this.idDocente = idDocente;
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