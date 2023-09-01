package daviosoo.university;

import javax.swing.*;

public class MultiplyTable {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Ingresar numero", JOptionPane.PLAIN_MESSAGE));

        String message = "";
        for (int i = 0; i <= 10; i++) {
            message += number + "x" + i + "=" + number * i + "\n";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
