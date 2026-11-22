
package ingresovisualizacion;

import java.util.Scanner;

/**
 *
 * @author Brithany Dayanara Vega Cueva
 */
public class IngresoVisualizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // import java.util.Scanner;
                Scanner teclado = new Scanner(System.in)) {
            int[] numeros = new int[10];
            
            // Ingreso de los números
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                System.out.print("Ingrese el número para la posición "
                        + posicion + ": ");
                numeros[posicion] = teclado.nextInt();
            }
            
            // Visualización de los números almacenados
            System.out.println("\nValores almacenados:");
            
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                System.out.println("Posición " + posicion
                        + ": " + numeros[posicion]);
            }
        }
    }
}