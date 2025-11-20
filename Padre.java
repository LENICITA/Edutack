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
// Padre
public class Padre extends Usuario {

    public Padre(String id, String nombre, String correo, String contrasena) {
        super(id, nombre, correo, contrasena, Rol.PADRE);
    }
    
    public List<Observaciones>
                verObservacionesdeHijo(Estudiante hijo) {}
}
