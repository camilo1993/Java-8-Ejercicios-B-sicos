package calc_i;

import java.util.*;

public class Calc_I {

    public static void main(String[] args) {

        float num1;
        float num2;
        float resultado;
        char operacion;

        Scanner reader = new Scanner(System.in);

        System.out.println("Digite Primer Número");
        num1 = reader.nextFloat();

        System.out.println("Digite Segundo Número");
        num2 = reader.nextFloat();

        System.out.println("Digite Operación");
        operacion = reader.next().charAt(0);

        switch (operacion) {

            case '+':

                resultado = num1 + num2;
                System.out.println("El resultado es = " + resultado);
                break;

            case '-':

                resultado = num1 - num2;
                System.out.println("El resultado es = " + resultado);
                break;

            case '*':

                resultado = num1 * num2;
                System.out.println("El resultado es = " + resultado);
                break;

            case '/':

                resultado = num1 / num2;
                System.out.println("El resultado es = " + resultado);
                break;

            default:
                System.out.println("Operación Invalida");
                break;
        }

    }

}
