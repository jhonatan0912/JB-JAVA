import javax.swing.*;

public class EjercicioPropuesto1 {
  public static void main(String[] args) {

    double ingresos, egresos, ahorroBimestral, ahorroTrimestral, ahorroCuatrimestral, ahorroAnual;

    ingresos = Double.parseDouble(JOptionPane.showInputDialog("Ingresos: "));
    egresos = Double.parseDouble(JOptionPane.showInputDialog("Egresos: "));

    ahorroBimestral = (ingresos - egresos) * 2;
    ahorroTrimestral = (ingresos - egresos) * 3;
    ahorroCuatrimestral = (ingresos - egresos) * 4;
    ahorroAnual = (ingresos - egresos) * 12;

    JOptionPane.showMessageDialog(null, "El ahorro bimestral es: " + ahorroBimestral);
    JOptionPane.showMessageDialog(null, "El ahorro trimestral es: " + ahorroTrimestral);
    JOptionPane.showMessageDialog(null, "El ahorro cuatrimestral es: " + ahorroCuatrimestral);
    JOptionPane.showMessageDialog(null, "El ahorro anual es: " + ahorroAnual);
  }
}
