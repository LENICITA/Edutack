/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;
import java.time.LocalDate

/**
 *
 * @author pc
 */
public class Reporte {

    private int IdReporte;
    private String tipoReporte;
    private String descripcion;
    private LocalDate fechaemision;
    private String estado;
    private Docente docente;
   
    public Reporte(String tipoReporte, String descripcion, Docente docente) {
        this.tipoReporte = tipoReporte;
        this.descripcion = descripcion;
        this.docente = docente;
        this.fechaemision = LocalDate.now();
        this.estado = estado;
    }
    
    public void 
  aprobarReporte(Administrador)
} 

