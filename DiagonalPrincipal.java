
package diagonalprincipal;

import java.util.Scanner;

/**
 *
 * @author Brithany Dayanara Vega Cueva
 */
public class DiagonalPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // import java.util.Scanner;
                Scanner teclado = new Scanner(System.in)) {
            int[][] matriz = new int[4][4];
            int sumaDiagonal = 0;
            
            // Ingreso de los elementos de la matriz
            for (int fila = 0; fila < matriz.length; fila++) {
                for (int columna = 0;
                        columna < matriz[fila].length;
                        columna++) {
                    
                    System.out.print("Ingrese el número para la posición ["
                            + fila + "][" + columna + "]: ");
                    
                    matriz[fila][columna] = teclado.nextInt();
                }
            }
            
            // Presentación y suma de la diagonal principal
            System.out.println("\nElementos de la diagonal principal:");
            
            for (int posicion = 0; posicion < matriz.length; posicion++) {
                System.out.print(matriz[posicion][posicion] + " ");
                
                sumaDiagonal = sumaDiagonal
                        + matriz[posicion][posicion];
            }
            
            System.out.println("\nSuma de la diagonal principal: "
                    + sumaDiagonal);
        }
    }
}