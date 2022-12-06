
import java.util.Scanner;


public class ejercicio1 {

        public static void main(String[] args) {
        
        
        double compra1, compra2, compra3, compra4, total, promedio;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Insertar compra 1: ");
        compra1 = lectura.nextDouble();

        System.out.println("Insertar compra 2: ");
        compra2 = lectura.nextDouble();

        System.out.println("Insertar compra 3: ");
        compra3 = lectura.nextDouble();

        System.out.println("Insertar compra 4: ");
        compra4 = lectura.nextDouble();

        // Proceso de datos

        total = compra1 + compra2 + compra3 + compra4;

        promedio = total / 4;

        System.out.println("El total es: " + total);
        System.out.println("El promedio es: " + promedio);
    }
}
