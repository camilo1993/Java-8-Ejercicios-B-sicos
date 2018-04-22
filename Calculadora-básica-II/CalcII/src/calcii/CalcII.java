/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcii;

import java.util.Scanner;

/**
 *
 * @author kamilo
 */
public class CalcII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        float arreglo1[] = new float[5];
        float arreglo2[] = new float[5];
        char operacion;
        float resultado[] = new float[5];;

        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese Numeros arreglo 1: " + i);
                arreglo1[i] = reader.nextInt();
            } while (arreglo1[i] > 100 || arreglo1[i] < 0);

        }

        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese Numeros arreglo 2: " + i);
                arreglo2[i] = reader.nextInt();
            } while (arreglo2[i] > 100 || arreglo2[i] < 0);
        }

        System.out.println("Digite Operación (+-/*) ");
        operacion = reader.next().charAt(0);

        switch (operacion) {

            case '+':
                for (int i = 0; i < 5; i++) {
                    resultado[i] = arreglo1[i] + arreglo2[i];
                    System.out.println("Resultado : %.2f" + resultado[i]);
                }
                break;
            case '-':

                for (int i = 0; i < 5; i++) {
                    resultado[i] = arreglo1[i] - arreglo2[i];
                    System.out.println("Resultado : %.2f" + resultado[i]);
                }
                break;

            case '*':

                for (int i = 0; i < 5; i++) {
                    resultado[i] = arreglo1[i] * arreglo2[i];
                    System.out.println("Resultado : %.2f" + resultado[i]);
                }
                break;

            case '/':
                for (int i = 0; i < 5; i++) {
                    resultado[i] = arreglo1[i] / arreglo2[i];
                    System.out.println("Resultado : %.2f" + resultado[i]);
                }
                break;

            default:
                System.out.println("Operación Invalida");
                break;
        }

    }

}
