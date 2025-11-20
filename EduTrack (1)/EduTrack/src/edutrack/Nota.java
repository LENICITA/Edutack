/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;

/**
 *
 * @author pc
 */
public class Nota {
    // Nota

    private String id;
    private String idEstudiante;
    private String idMateria;
    private double valor;
    private LocalDate fecha;

    public Nota(String id, String idEstudiante, String idMateria, double valor, LocalDate fecha) {
        this.id = id;
        this.idEstudiante = idEstudiante;
        this.idMateria = idMateria;
        this.valor = valor;
        this.fecha = fecha;
    }

    public double getValor() { return valor; }
    public String getIdEstudiante() { return idEstudiante; }
    public String getIdMateria() { return idMateria; }
}

