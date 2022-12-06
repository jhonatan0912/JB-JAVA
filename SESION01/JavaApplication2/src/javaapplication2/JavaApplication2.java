package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        //Declaracion de variables
        String e=new String();
        double ht,th,sb,d,sn;
        Scanner lectura=new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Nombre de empleado: ");
        e=lectura.next();
        
        System.out.print("Horas trabajadas: ");
        ht=lectura.nextDouble();
        
        System.out.print("Tarifa por hora: ");
        th=lectura.nextDouble();
        
        //Proceso de datos
        
        sb=ht*th;
        d=sb*0.13;
        sn=sb-d;
        
        //Salida de datos
        System.out.println("Sueldo basico: "+sb);
        System.out.println("Sueldo basico: "+d);
        System.out.println("Sueldo basico: "+sn);
    }
    
}
