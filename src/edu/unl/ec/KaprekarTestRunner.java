package edu.unl.ec;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class KaprekarTestRunner {

    public static void main(String[] args) {
        KaprekarCalculator calculator = new KaprekarCalculator();
        Set<Integer> semillasUsadas = new HashSet<>();
        Random rand = new Random();
        int cantidadPruebas = 10;
        boolean algunaSupero500 = false; // Bandera para verificar si alguna semilla supera 500 iteraciones

        System.out.println(" Pruebas de la Constante de Kaprekar (Algoritmo: Insertion Sort)");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < cantidadPruebas; i++) {
            int semilla;
            // Generación y Validación de semilla
            do {
                semilla = rand.nextInt(9000) + 1000;
            } while (!semillasUsadas.add(semilla) || !KaprekarCalculator.tieneDigitosDistintos(semilla));

            // Ejecución del cálculo y muestra del paso a paso
            int iteraciones = calculator.calcularKaprekar(semilla);

            // Verificar si la semilla supera las 500 iteraciones
            if (iteraciones > 500) {
                algunaSupero500 = true;
                System.out.printf("La semilla %04d superó las 500 iteraciones con un total de %d iteraciones.%n",
                        semilla, iteraciones);
            }

            // Mostrar resumen final
            System.out.printf("Prueba %d Finalizada: Semilla = %04d | Iteraciones Totales = %d%n",
                    (i + 1), semilla, iteraciones);
            System.out.println("---------------------------------------------------------------");
        }

        // Mostrar mensaje final según el resultado
        if (!algunaSupero500) {
            System.out.println("Ninguna semilla superó las 500 iteraciones.");
        }
    }
}