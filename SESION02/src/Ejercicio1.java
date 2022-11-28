import java.util.Scanner;
// import java.math.BigDecimal;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {

        double n1, n2, s, r, m, d, rc, rs, p;
        try (Scanner lectura = new Scanner(System.in)) {
            // entrada de datos
            System.out.println("Numero 1: ");
            n1 = lectura.nextDouble();
            System.out.println("Numero 2: ");
            n2 = lectura.nextDouble();
        }

        // proceso de datos

        s = n1 + n2;
        r = n1 - n2;
        m = n1 * n2;
        d = n1 / n2;

        rs = n1 % n2;
        p = Math.pow(n1, n2);
        rc = Math.sqrt(n1);

        System.out.println("Suma " + s);
        System.out.println("Resta " + r);
        System.out.println("Multiplicación " + m);
        System.out.println("División " + d);
        System.out.println("Residuo " + rs);
        System.out.println("Potencia " + p);
        System.out.println("Razi cuadrada " + rc);
    }
}
