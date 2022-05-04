package tp5;

import java.util.Scanner;

public class Tp5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[4];
        int matriz[][] = new int[2][3];
        Arreglo arreglo1 = new Arreglo();
        String frase;
        
        System.out.print("Ingrese una frase: ");
        frase = entrada.nextLine();
        frase = frase.toLowerCase();
        System.out.println("La cantidad de vocales en la frase es: " + arreglo1.cuentaVocales(frase));
        System.out.print("Ingrese el caracter que quiera contar: ");
        String letra = entrada.nextLine();
        letra=letra.toLowerCase();
        System.out.println("El caracter aparece " + arreglo1.cuentaCaracter(frase, letra.charAt(0)) + " veces dentro de la clase");
        System.out.println("\nLlenar arreglo");
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese un numero para la posicion " + i + " del arreglo: ");
            int n = entrada.nextInt();
            arreglo[i] = n;
        }
        System.out.println("\nLlenar matriz");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un numero para la fila " + i + " de la matriz: ");
                int n = entrada.nextInt();
                matriz[i][j] = n;
            }
            System.out.println("");
        }
        arreglo1.sumarLista(arreglo);
        System.out.println("\nMatrices");
        System.out.println("El numero mayor es: " + arreglo1.buscarMayor(matriz));

    }

}
