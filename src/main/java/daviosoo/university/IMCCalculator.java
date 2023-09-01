package daviosoo.university;

import javax.swing.*;

public class IMCCalculator {
    public static void main(String[] args) {
        int height = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su altura en cm", "Ingresar altura", JOptionPane.PLAIN_MESSAGE));
        double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su peso en kg", "Ingresar peso", JOptionPane.PLAIN_MESSAGE));

        double imc = getImc((double) height /100, weight);

        JOptionPane.showMessageDialog(null, "Su IMC es de: " + imc);
    }

    private static double getImc(double height, double weight) {
        return weight / Math.pow(height, 2);
    }
}
