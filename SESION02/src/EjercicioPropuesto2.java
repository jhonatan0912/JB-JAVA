import javax.swing.*;

public class EjercicioPropuesto2 {
  public static void main(String[] args) {
    double interes, tasa, periodo, montoTotal, capital, cuota;

    capital = Double.parseDouble(JOptionPane.showInputDialog("Insertar capital: "));
    tasa = Double.parseDouble(JOptionPane.showInputDialog("Insertar tasa: "));
    periodo = Double.parseDouble(JOptionPane.showInputDialog("Insertar periodo: "));

    interes = capital * tasa * periodo;
    montoTotal = capital * interes;
    cuota = montoTotal / periodo;

    JOptionPane.showMessageDialog(null, "El interes es: " + interes);
    JOptionPane.showMessageDialog(null, "El monto total es: " + montoTotal);
    JOptionPane.showMessageDialog(null, "La cuota es: " + cuota);
  }
}
