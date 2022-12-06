import javax.swing.*;

public class Ejercicio2 {
  public static void main(String[] args) {
    int sm, r, l, a, c, dr, s;

    sm = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sueldo mensual: "));
    r = Integer.parseInt(JOptionPane.showInputDialog("Renta: "));
    l = Integer.parseInt(JOptionPane.showInputDialog("Luz: "));
    a = Integer.parseInt(JOptionPane.showInputDialog("Agua: "));
    c = Integer.parseInt(JOptionPane.showInputDialog("Comida: "));

    // Proceso de datos
    s = r + l + a + c;
    dr = sm - s;

    // Salida de datos
    JOptionPane.showMessageDialog(null, "Dinero restante: " + dr);
  }
}
