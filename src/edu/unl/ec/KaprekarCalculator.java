package edu.unl.ec;

public class KaprekarCalculator {

    private static final int CONSTANTE_KAPREKAR = 6174; // Constante de Kaprekar para números de 4 dígitos

    // Metodo de ordenamiento: INSERTION SORT
    public static void insertionSortDigits(char[] digitos) {
        int n = digitos.length;
        for (int i = 1; i < n; ++i) {
            char clave = digitos[i];
            int j = i - 1;

            // Mover los elementos mayores que la clave una posición adelante
            while (j >= 0 && digitos[j] > clave) {
                digitos[j + 1] = digitos[j];
                j = j - 1;
            }
            digitos[j + 1] = clave; // Insertar la clave en su posición correcta
        }
    }

    // Validación para verificar si un número tiene al menos dos dígitos distintos
    public static boolean tieneDigitosDistintos(int n) {
        String s = String.valueOf(n); // Convertir el número a cadena
        char primerDigito = s.charAt(0); // Tomar el primer dígito
        // Verificar si todos los dígitos son iguales al primero
        return !(s.charAt(1) == primerDigito &&
                s.charAt(2) == primerDigito &&
                s.charAt(3) == primerDigito);
    }

    // Convierte un número entero a un arreglo de caracteres (dígitos)
    public static char[] numeroADigitos(int n) {
        // Asegura que el número tenga 4 dígitos rellenando con ceros a la izquierda
        String s = String.format("%04d", n);
        return s.toCharArray(); // Retorna los dígitos como un arreglo de caracteres
    }

    /**
     * Calcula el número de iteraciones necesarias para alcanzar la constante de Kaprekar.
     * También muestra el paso a paso del proceso.
     * @param semilla El número inicial de 4 dígitos.
     * @return El número de iteraciones necesarias.
     */
    public int calcularKaprekar(int semilla) {
        int actual = semilla; // Número actual en el proceso
        int contador = 0; // Contador de iteraciones

        System.out.printf("Proceso para Semilla: %04d%n", semilla);

        // Continuar hasta alcanzar la constante de Kaprekar
        while (actual != CONSTANTE_KAPREKAR) {
            char[] digitos = numeroADigitos(actual); // Convertir el número a dígitos

            // Ordenar los dígitos en orden ascendente usando Insertion Sort
            KaprekarCalculator.insertionSortDigits(digitos);

            // Construir el número ascendente (menor)
            String sAsc = new String(digitos);
            int nAsc = Integer.parseInt(sAsc);

            // Construir el número descendente (mayor) invirtiendo el orden
            StringBuilder sbDesc = new StringBuilder(sAsc).reverse();
            String sDesc = sbDesc.toString();
            int nDesc = Integer.parseInt(sDesc);

            // Realizar la operación de Kaprekar: Mayor - Menor
            actual = nDesc - nAsc;
            contador++; // Incrementar el contador de iteraciones

            // Mostrar el paso a paso de la iteración
            System.out.printf("      [%d] %04d (Mayor a menor) - %04d (Menor a mayor) = %04d%n",
                    contador, nDesc, nAsc, actual);

            // Salir del bucle si el número de iteraciones supera 7 (seguridad)
            if (contador > 500) {
                break;
            }
        }
        return contador; // Retornar el número total de iteraciones
    }
}