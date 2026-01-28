/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author A S U S A16
 */
public class Proceso {

    public static double obtenerPromedio() {

        double promedio = 0;
        double suma = 0;
        double contador = 0;

        try {
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);

                String valor = linea_partes.get(3);

                double variable = Double.parseDouble(valor);
                suma = suma + variable;
                contador = contador + 1;

            }

            promedio = suma / contador;

            entrada.close();
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
        }
        return promedio;
    }
}
