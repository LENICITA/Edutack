/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;

public class Asistencia {

    private String id_asistencia;
    private String id_estudiante;
    private String id_docente;
    private String fecha_asistencia;
    private String estado;

    public Asistencia(String id_asistencia, String id_estudiante, String id_docente,
                      String fecha_asistencia, String estado) {
        this.id_asistencia = id_asistencia;
        this.id_estudiante = id_estudiante;
        this.id_docente = id_docente;
        this.fecha_asistencia = fecha_asistencia;
        this.estado = estado;
    }

    public String getId_asistencia() { return id_asistencia; }
    public String getId_estudiante() { return id_estudiante; }
    public String getId_docente() { return id_docente; }
    public String getFecha_asistencia() { return fecha_asistencia; }
    public String getEstado() { return estado; }
}

