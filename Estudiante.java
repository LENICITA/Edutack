/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;
import java.util.List;
import edutrack.Observaciones;

/**
 *
 * @author pc
 */
public class Estudiante extends Usuario{

 
    private int id_estudiante;           
    private String nombre;
    private String apellido;
    private String correo_institucional;
    private String contraseña;
    private String telefono;
    private String estado_cuenta;
    private String fecha_registro;
    private String documento;
    private String fecha_nacimiento;
    private String grado;
    private String curso;
    private String direccion;
    private int id_usuario; 


    public Estudiante(int id_estudiante, String nombre, String apellido,
                      String correo_institucional, String contraseña, String telefono,
                      String estado_cuenta, String fecha_registro, String documento,
                      String fecha_nacimiento, String grado, String curso,
                      String direccion, int id_usuario) {

        this.id_estudiante = id_estudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo_institucional = correo_institucional;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.estado_cuenta = estado_cuenta;
        this.fecha_registro = fecha_registro;
        this.documento = documento;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grado = grado;
        this.curso = curso;
        this.direccion = direccion;
        this.id_usuario = id_usuario;
        
        public List<Observaciones>
                verObservaciones() {}
    }