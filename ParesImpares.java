
package paresimpares;

import java.util.Scanner;

/**
 *
 * @author Brithany Dayanara Vega Cueva
 */
public class ParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // import java.util.Scanner;
                Scanner teclado = new Scanner(System.in)) {
            int[] numeros = new int[20];
            int cantidadPares = 0;
            int cantidadImpares = 0;
            int sumaPares = 0;
            int sumaImpares = 0;
            
            // Ingreso de los 20 números
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                System.out.print("Ingrese el número para la posición "
                        + posicion + ": ");
                numeros[posicion] = teclado.nextInt();
            }
            
            // Clasificación y suma de los números
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                if (numeros[posicion] % 2 == 0) {
                    cantidadPares++;
                    sumaPares = sumaPares + numeros[posicion];
                } else {
                    cantidadImpares++;
                    sumaImpares = sumaImpares + numeros[posicion];
                }
            }
            
            // Presentación de resultados
            System.out.println("\nResultados:");
            System.out.println("Cantidad de números pares: "
                    + cantidadPares);
            System.out.println("Cantidad de números impares: "
                    + cantidadImpares);
            System.out.println("Suma de los números pares: "
                    + sumaPares);
            System.out.println("Suma de los números impares: "
                    + sumaImpares);
        }
    }
}