/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;

/**
 *
 * @author pc
 */
public abstract class Usuario {
     protected String id;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contrasena;
    protected String direccion;
    protected Rol rol;

    public Usuario(String id, String nombre, String apellido, String correo, String contrasena, String direccion, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.rol = rol;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido () { return apellido;}
    public String getCorreo() { return correo; }
    public String getContrasena() {return contrasena; }
    public String getDireccion () {return direccion; }
    public Rol getRol() { return rol; }

    public boolean verificarContrasena(String contrasena) {
        return contrasena.equals(contrasena);
    }
}
