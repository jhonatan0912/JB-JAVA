import javax.swing.*;

public class Ejercicio3 {
  public static void main(String[] args) {

    double cd, tc, cs;

    cd = Double.parseDouble(JOptionPane.showInputDialog("Cantidad en dolares: "));
    tc = Double.parseDouble(JOptionPane.showInputDialog("Tipo de cambio: "));

    cs = cd * tc;

    JOptionPane.showMessageDialog(null, "La cantidad en Soles es: " + cs);

  }
}
