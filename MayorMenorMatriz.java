
package mayormenormatriz;

import java.util.Scanner;

/**
 *
 * @author Brithany Dayanara Vega Cueva
 */
public class MayorMenorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // import java.util.Scanner;
                Scanner teclado = new Scanner(System.in)) {
            int[][] matriz = new int[5][5];
            int mayor;
            int menor;
            
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
            
            // Inicialización con el primer elemento
            mayor = matriz[0][0];
            menor = matriz[0][0];
            
            // Búsqueda del mayor y del menor
            for (int[] matriz1 : matriz) {
                for (int columna = 0; columna < matriz1.length; columna++) {
                    if (matriz1[columna] > mayor) {
                        mayor = matriz1[columna];
                    }
                    if (matriz1[columna] < menor) {
                        menor = matriz1[columna];
                    }
                }
            }
            
            // Presentación de resultados
            System.out.println("\nResultados:");
            System.out.println("Mayor valor: " + mayor);
            System.out.println("Menor valor: " + menor);
        }
    }
}