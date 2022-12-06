package javaapplication1;
// java.util.Scanner permite la entrada de datos por teclado
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {

    //declarar variables
    int vt1,vt2,vt3;
    double sueldoMensual,pagoTotal,comision;
    String vendedor=new String();
    Scanner lectura=new Scanner(System.in);
    
    //entrada de datos
    System.out.println("Nombre de Vendedor1: ");
    vendedor = lectura.next();
    
    System.out.println("Sueldo Mensual:");
    sueldoMensual = lectura.nextDouble();
    
    System.out.println("Venta 1:");
    vt1 = lectura.nextInt();

    System.out.println("Venta 2:");
    vt2 = lectura.nextInt();

    System.out.println("Venta 3:");
    vt3 = lectura.nextInt();    
    
    //proceso de datos
    comision=(vt1+vt2+vt3)*0.10;
    pagoTotal=sueldoMensual+comision;
    
    //salida de datos
    System.out.println("El sueldo mensual del vendedor es :" + pagoTotal);
    System.out.println("La comision recibida es  :" + comision);
    }
        
}
