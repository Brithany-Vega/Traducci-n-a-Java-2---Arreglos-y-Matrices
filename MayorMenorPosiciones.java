
package mayormenorposiciones;

import java.util.Scanner;

/**
 *
 * @author Brithany Dayanara Vega Cueva 
 */
public class MayorMenorPosiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // import java.util.Scanner;
                Scanner teclado = new Scanner(System.in)) {
            int[] numeros = new int[15];
            int mayor;
            int menor;
            int posicionMayor = 0;
            int posicionMenor = 0;
            
            // Ingreso de los 15 números
            for (int posicion = 0; posicion < numeros.length; posicion++) {
                System.out.print("Ingrese el número para la posición "
                        + posicion + ": ");
                numeros[posicion] = teclado.nextInt();
            }
            
            // Inicialización con el primer número del arreglo
            mayor = numeros[0];
            menor = numeros[0];
            
            // Búsqueda del número mayor y del número menor
            for (int posicion = 1; posicion < numeros.length; posicion++) {
                if (numeros[posicion] > mayor) {
                    mayor = numeros[posicion];
                    posicionMayor = posicion;
                }
                
                if (numeros[posicion] < menor) {
                    menor = numeros[posicion];
                    posicionMenor = posicion;
                }
            }
            
            // Presentación de resultados
            System.out.println("\nResultados:");
            System.out.println("Número mayor: " + mayor);
            System.out.println("Posición del número mayor: " + posicionMayor);
            System.out.println("Número menor: " + menor);
            System.out.println("Posición del número menor: " + posicionMenor);
        }
    }
}