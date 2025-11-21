/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;


/**
 *
 * @author pc
 */
public class Estudiante extends Usuario {

    private int idEstudiante;
    private String grado;
    private String curso;
    private String direccion;

    public Estudiante(int idUsuario, String nombre, String apellido, String correo, String contraseña,
                      String telefono, boolean estadoCuenta, String fechaRegistro,
                      String documento, String fechaNacimiento, Rol rol,
                      int idEstudiante, String grado, String curso, String direccion) {

        super(idUsuario, nombre, apellido, correo, contraseña, telefono, estadoCuenta,
                fechaRegistro, documento, fechaNacimiento, rol);

        this.idEstudiante = idEstudiante;
        this.grado = grado;
        this.curso = curso;
        this.direccion = direccion;
    }

    Estudiante(String idUsuario, String nombre, String apellido, String correo, String contraseña, String telefono, boolean estadoCuenta, String fechaRegistro, String documento, String fechaNacimiento, int rol, String idEstudiante, String grado, String curso, String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public int getIdEstudiante() { return idEstudiante; }
    public void setIdEstudiante(int idEstudiante) { this.idEstudiante = idEstudiante; }

    public String getGrado() { return grado; }
    public void setGrado(String grado) { this.grado = grado; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}