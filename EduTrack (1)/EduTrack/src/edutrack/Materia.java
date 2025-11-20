/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;

/**
 *
 * @author pc
 */

 public class Materia {

    private String id;
    private String nombre;
    private String idDocente;

    public Materia(String id, String nombre, String idDocente) {
        this.id = id;
        this.nombre = nombre;
        this.idDocente = idDocente;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getIdDocente() { return idDocente; }
}
