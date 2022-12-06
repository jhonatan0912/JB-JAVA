package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        int cs,b200,b100,b50,b20,b10,m5,m2,m1,r;
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        
        System.out.print("Ingresar Cantidad S/.: ");
        cs=lectura.nextInt();
        
        //Proceso de datos
        
        b200=cs/200;
        r=cs%200;
        
        b100=r/100;
        r=r%100;
        
        b50=r/50;
        r=r%50;
        
        b20=r/20;
        r=r%20;
        
        b10=r/10;
        r=r%10;
        
        m5=r/5;
        r=r%5;
        
        m2=r/2;
        r=r%2;
        
        m1=r/1;
        
        //Salida de datos
        System.out.println("Billetes de S/.200: " + b200);
        
        System.out.println("Billetes de S/.100: " + b100);
        
        System.out.println("Billetes de S/.50: " + b50);
        
        System.out.println("Billetes de S/.20: " + b20);
        
        System.out.println("Billetes de S/.10: " + b10);
        
        System.out.println("Monedas de S/. 5: "+m5);
        
        System.out.println("Monedas de S/. 2: "+m2);
        
        System.out.println("Monedas de S/. 1: "+m1);
    }
    
    
    
}
