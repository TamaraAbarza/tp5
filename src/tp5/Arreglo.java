/*
a) Método sumarLista que reciba por parámetro un arreglo unidimensional de enteros 
y muestre por pantalla la suma y promedio de los mismos.
b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e irregular de enteros y 
retorne el entero más grande que se encuentra en el arreglo.
c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad de vocales que tiene
la cadena.
d) Método cuentaCaracter que reciba por parámetro un String y un caracter, 
luego retorne la cantidad de veces que se repite en la cadena el carácter recibido.
 */
package tp5;


public class Arreglo {
     public void sumarLista(int[] pArreglo) {
        int promedio = 0;
        for (int i : pArreglo) {
            promedio += i;
        }

        System.out.println("La suma del arreglo es: " + promedio + "\nEl promedio es: " + (float) promedio / pArreglo.length);
    }

    public int buscarMayor(int[][] pMatriz) {
        int mayor = pMatriz[0][0];
        for (int i = 0; i < pMatriz.length; i++) {
            for (int j = 0; j < pMatriz[i].length; j++) {
                if (mayor < pMatriz[i][j]) {
                    mayor = pMatriz[i][j];
                }
            }
        }
        return mayor;
    }

    public int cuentaVocales(String pPalabra) {
        int contador = 0;
        for (int i = 0; i < pPalabra.length(); i++) {
            switch (pPalabra.charAt(i)) {
                case 'a':
                    contador++;
                    break;
                case 'e':
                    contador++;
                    break;
                case 'i':
                    contador++;
                    break;
                case 'o':
                    contador++;
                    break;
                case 'u':
                    contador++;
                    break;
            }
        }
        return contador;
    }

    public int cuentaCaracter(String pPalabra, char pLetra) {
        int contador = 0;
        for (int i = 0; i < pPalabra.length(); i++) {
            if (pPalabra.charAt(i) == pLetra) {
                contador++;
            }
        }
        return contador;
    }
}
