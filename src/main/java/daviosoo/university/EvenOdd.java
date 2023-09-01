package daviosoo.university;

import javax.swing.*;

public class EvenOdd {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Ingresar numero", JOptionPane.PLAIN_MESSAGE));

        boolean isEven = number % 2 == 0;

        if (isEven) {
            JOptionPane.showMessageDialog(null, "El numero es par");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es impar");
        }
    }
}
