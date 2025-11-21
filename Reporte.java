/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edutrack;

/**
 *
 * @author pc
 */
public class Reporte {

    public static double calcularPromedio(List<Nota> notas) {
        return notas.stream().mapToDouble(Nota::getValor).average().orElse(0);
    }

    public static long contarInasistencias(List<Asistencia> lista) {
        return lista.stream().filter(a -> !a.isPresente()).count();
    }
}

