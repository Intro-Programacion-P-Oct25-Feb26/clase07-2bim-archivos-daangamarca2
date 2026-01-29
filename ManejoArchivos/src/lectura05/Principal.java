/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;

/**
 *
 * @author A S U S A16
 */
public class Principal {

    public static void main(String[] args) {
        double estadisticas = Procedimiento.obtenerEstadisticas();
        System.out.printf("El promedio de los empleados es: %.2f\n", estadisticas);
    }

}
