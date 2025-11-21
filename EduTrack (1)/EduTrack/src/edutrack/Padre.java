/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;


/**
 *
 * @author pc
 */
// Padre
public class Padre extends Usuario {
    
    private int idPadre;
    private String ocupacion;
    private int idEstudianteAsociado;
     private String direccion;
    

    public Padre(int idUsuario, String nombre, String apellido, String correo, String contraseña,
                 String telefono, boolean estadoCuenta, String fechaRegistro,
                 String documento, String fechaNacimiento, Rol rol, int idPadre, String ocupacion, int idEstudianteAsociado, String direccion) {

        super(idUsuario, nombre, apellido, correo, contraseña, telefono, estadoCuenta,
                fechaRegistro, documento, fechaNacimiento, rol);
        
        this.idPadre = idPadre;
        this.ocupacion = ocupacion;
        this.idEstudianteAsociado = idEstudianteAsociado;
        this.direccion = direccion;
                
        
    }

    Padre(String idUsuario, String nombre, String apellido, String correo, String contraseña, String telefono, boolean estadoCuenta, String fechaRegistro, String documento, String fechaNacimiento, int rol, int idPadre, String ocupacion, int idEstudianteAsociado, String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    public int getIdPadre() { return idPadre; }
    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre; 
    }
    public String getOcupacion() { return ocupacion; }
    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion; 
    }

    public int getIdEstudianteAsociado() { return idEstudianteAsociado; }
    public void setIdEstudianteAsociado(int idEstudianteAsociado) {
        this.idEstudianteAsociado = idEstudianteAsociado;
    }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}
