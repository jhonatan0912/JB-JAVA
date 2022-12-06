import javax.swing.*;

public class EjercicioPropuesto3 {
  public static void main(String[] args) {

    int nota1, nota2, nota3;
    double notaFinal;

    nota1 = Integer.parseInt(JOptionPane.showInputDialog("Nota 1"));
    nota2 = Integer.parseInt(JOptionPane.showInputDialog("Nota 2"));
    nota3 = Integer.parseInt(JOptionPane.showInputDialog("Nota 3"));

    notaFinal = (nota1 * 0.55) + (nota2 * 0.3) + (nota3 * 0.15);

    JOptionPane.showMessageDialog(null, "La nota final es " + notaFinal);
  }
}
