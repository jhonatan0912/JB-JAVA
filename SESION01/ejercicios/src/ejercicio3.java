import java.util.Scanner;

public class ejercicio3 {
     public static void main(String[] args) throws Exception {

        double ingreso1, ingreso2, gasto1, gasto2, gasto3, ahorroMensual, ahorroBimestral, ahorroCuatrimestral,
                ahorroAnual;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Insertar ingreso 1: ");
        ingreso1 = lectura.nextDouble();

        System.out.println("Insertar ingreso 2: ");
        ingreso2 = lectura.nextDouble();

        System.out.println("Insertar gasto 1: ");
        gasto1 = lectura.nextDouble();

        System.out.println("Insertar gasto 2: ");
        gasto2 = lectura.nextDouble();

        System.out.println("Insertar gasto 3: ");
        gasto3 = lectura.nextDouble();

        // Proceso
        ahorroMensual = (ingreso1 + ingreso2) - (gasto1 + gasto2 + gasto3);

        ahorroBimestral = ahorroMensual * 2;

        ahorroCuatrimestral = ahorroMensual * 4;

        ahorroAnual = ahorroMensual * 12;

        System.out.println("Ahorro mensual: " + ahorroMensual);
        System.out.println("Ahorro bimestral: " + ahorroBimestral);
        System.out.println("Ahorro cuatrimestral: " + ahorroCuatrimestral);
        System.out.println("Ahorro anual: " + ahorroAnual);
    }
}
