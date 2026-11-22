
package sumapromedios;

import java.util.Scanner;

/**
 *
 * @author Brithany Dayanara Vega Cueva 
 */
public class SumaPromedios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // import java.util.Scanner;
                Scanner teclado = new Scanner(System.in)) {
            double[] numeros = new double[10];
            double suma = 0;
            double promedio;
            
            // Ingreso y suma de los números
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                System.out.print("Ingrese el número real para la posición "
                        + posicion + ": ");
                
                numeros[posicion] = teclado.nextDouble();
                suma = suma + numeros[posicion];
            }
            
            // Cálculo del promedio
            promedio = suma / numeros.length;
            
            // Resultados
            System.out.println("\nResultados:");
            System.out.println("Suma total: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}