
package matrizmodificada;

import java.util.Scanner;

/**
 *
 * @author Brithany Dayanara Vega Cueva
 */
public class MatrizModificada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // import java.util.Scanner;
                Scanner teclado = new Scanner(System.in)) {
            int[][] matriz = new int[3][5];
            int numeroIngresado;
            int modificacion;
            
            // Ingreso y modificación de los números
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0;
                        columna < matriz[fila].length;
                        columna++) {
                    
                    System.out.print("Ingrese el número para la posición ["
                            + fila + "][" + columna + "]: ");
                    
                    numeroIngresado = teclado.nextInt();
                    
                    modificacion = fila * columna;
                    
                    matriz[fila][columna] =
                            numeroIngresado + modificacion;
                }
            }
            
            // Impresión de la matriz resultante
            System.out.println("\nMatriz modificada:");
            
            for (int[] matriz1 : matriz) {
                for (int columna = 0; columna < matriz1.length; columna++) {
                    System.out.print(matriz1[columna] + "\t");
                }
                System.out.println();
            }
        }
    }
}