package calc_i;

import java.text.DecimalFormat;

import java.util.*;

public class Calc_I {

    public static void main(String[] args) {

        float num1;
        float num2;
        float resultado;
        char operacion;

        Scanner reader = new Scanner(System.in);

        do {
            System.out.println("Digite Primer Número");
            num1 = reader.nextFloat();
        } while (num1 > 100 || num1 < 0);

        do {
            System.out.println("Digite Segundo Número");
            num2 = reader.nextFloat();
        } while (num2 > 100 || num2 < 0);

        System.out.println("Digite Operación (+-/*) ");
        operacion = reader.next().charAt(0);

        switch (operacion) {

            case '+':
                DecimalFormat formateador1 = new DecimalFormat("##.##");
                resultado = num1 + num2;
                System.out.println("El resultado es = " + formateador1.format(resultado));

                // System.out.println("El resultado es = %.2f " + resultado ); 
                // otra forma de limitar decimales
                break;

            case '-':
                DecimalFormat formateador2 = new DecimalFormat("##.##");
                resultado = num1 - num2;
                System.out.println("El resultado es = " + formateador2.format(resultado));
                break;

            case '*':

                DecimalFormat formateador3 = new DecimalFormat("##.##");
                resultado = num1 * num2;
                System.out.println("El resultado es = " + formateador3.format(resultado));

                break;

            case '/':
                DecimalFormat formateador4 = new DecimalFormat("##.##");
                resultado = num1 / num2;
                System.out.println("El resultado es = " + formateador4.format(resultado));

                break;

            default:
                System.out.println("Operación Invalida");
                break;
        }

    }

}
