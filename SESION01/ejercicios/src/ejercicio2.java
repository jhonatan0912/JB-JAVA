import java.util.Scanner;

public class ejercicio2 {
     public static void main(String[] args) throws Exception {

        double num1, num2, suma, resta, multiplicacion, division;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Insertar primer numero: ");
        num1 = lectura.nextInt();

        System.out.println("Insertar segundo numero: ");
        num2 = lectura.nextInt();

        // proceso
        suma = num1 + num2;

        resta = num1 - num2;

        multiplicacion = num1 * num2;

        division = num1 / num2;

        System.out.println("Suma : " + suma);
        System.out.println("Resta : " + resta);
        System.out.println("Multiplicacion : " + multiplicacion);
        System.out.println("Division : " + division);

    }
}
