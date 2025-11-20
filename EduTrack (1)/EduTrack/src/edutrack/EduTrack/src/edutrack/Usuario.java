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
public class Usuario {

    protected int idUsuario;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contraseña;
    protected String telefono;
    // true = activo, false = inactivo
    protected boolean estadoCuenta;        
    protected LocalDate fechaRegistro;
    protected String documento;
    protected LocalDate fechaNacimiento;
    protected Rol rol;

    public Usuario() {}

    public Usuario(int idUsuario, String nombre, String apellido, String correo, String contraseña,
                   String telefono, boolean estadoCuenta, LocalDate fechaRegistro,
                   String documento, LocalDate fechaNacimiento, Rol rol) {

        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo  = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.estadoCuenta = estadoCuenta;
        this.fechaRegistro = fechaRegistro;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
    }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public boolean isEstadoCuenta() { return estadoCuenta; }
    public void setEstadoCuenta(boolean estadoCuenta) { this.estadoCuenta = estadoCuenta; }

    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }
}
