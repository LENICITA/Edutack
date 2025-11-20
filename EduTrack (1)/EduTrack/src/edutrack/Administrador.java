/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;

/**
 *
 * @author pc
 */
public class Administrador extends Usuario{
    private String idAdministrador;
    private String correoinstitucional;
    private String contrasena;
    private String telefono;
    private String estadocuenta;
    private String fecharegistro;
    private String direccion;
    private String idUsuario;
    
    public Administrador (String idAdministrador, String nombre, String apellido,
            String correoinstitucional, String contrasena, String telefono, String estadocuenta, 
            String fecharegistro, String direccion, String idUsuario)
    {
      this.idAdministrador = idAdministrador;
      this.correoinstitucional = correoinstitucional;
      this.contrasena = contrasena;
      this.telefono = telefono;
      this.estadocuenta = estadocuenta;
      this.fecharegistro = fecharegistro;
      this.direccion = direccion; 
      this.idUsuario = idUsuario;
    }
    
    public String getIdAdministrador()
    { return idAdministrador;}
    public String getCorreoinstitucional()
    { return correoinstitucional; }
    public String getContrasena()
    {return contrasena; }
    public String telefono()
    { return telefono; }
    public String estadocuenta()
    { return estadocuenta; }
     public String fecharegistro()
    { return fecharegistro; }
      public String direccion()
    { return direccion; }
       public String idUsuario()
    { return idUsuario; }

}
