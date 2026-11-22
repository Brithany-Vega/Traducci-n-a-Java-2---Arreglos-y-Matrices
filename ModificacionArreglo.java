
package modificacionarreglo;

import java.util.Scanner;

/**
 *
 * @author Brithany Dayanara Vega Cueva 
 */
public class ModificacionArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // import java.util.Scanner;
                Scanner teclado = new Scanner(System.in)) {
            int[] numeros = new int[12];
            int numeroIngresado;
            
            // Ingreso, validación y modificación de los números
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                
                do {
                    System.out.print("Ingrese un número positivo para la posición "
                            + posicion + ": ");
                    numeroIngresado = teclado.nextInt();
                    
                    if (numeroIngresado <= 0) {
                        System.out.println(
                                "Error: el número debe ser mayor que cero.");
                    }
                    
                } while (numeroIngresado <= 0);
                
                numeros[posicion] = numeroIngresado + posicion;
            }
            
            // Presentación del arreglo modificado
            System.out.println("\nArreglo modificado:");
            
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                System.out.println("Posición " + posicion
                        + ": " + numeros[posicion]);
            }
        }
    }
}