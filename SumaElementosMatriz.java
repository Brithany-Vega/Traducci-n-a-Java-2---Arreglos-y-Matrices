
package sumaelementosmatriz;

import java.util.Scanner;

/**
 *
 * @author Brithany Dayanara Vega Cueva
 */
public class SumaElementosMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // import java.util.Scanner;
                Scanner teclado = new Scanner(System.in)) {
            int[][] matriz = new int[4][4];
            int sumaTotal = 0;
            
            // Ingreso y suma de los elementos
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0;
                        columna < matriz[fila].length;
                        columna++) {
                    
                    System.out.print("Ingrese el número para la posición ["
                            + fila + "][" + columna + "]: ");
                    
                    matriz[fila][columna] = teclado.nextInt();
                    
                    sumaTotal = sumaTotal + matriz[fila][columna];
                }
            }
            
            // Presentación de la matriz
            System.out.println("\nMatriz ingresada:");
            
            for (int[] matriz1 : matriz) {
                for (int columna = 0; columna < matriz1.length; columna++) {
                    System.out.print(matriz1[columna] + "\t");
                }
                System.out.println();
            }

            // Presentación de la suma
            System.out.println("\nSuma total de los elementos: "
                    + sumaTotal);
        }
    }
}