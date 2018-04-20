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
        float matriz[] = new float[5];
        float num2;
        char operacion;
        float resultado;

        do {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println("Ingresar Numeros");
                matriz[i] = reader.nextInt();
            }
        } while (matriz[0] > 100 || matriz[0] < 0);

        do {
            System.out.println("Digite Segundo Número");
            num2 = reader.nextFloat();
        } while (num2 > 100 || num2 < 0);

        System.out.println("Digite Operación (+-/*) ");
        operacion = reader.next().charAt(0);

        switch (operacion) {

            case '+':
                resultado = matriz[0] + num2;
                for (int i = 0; i < matriz.length; i++) {
                    System.out.println(resultado);
                }
        }

    }

}
