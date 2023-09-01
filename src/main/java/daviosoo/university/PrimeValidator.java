package daviosoo.university;

import javax.swing.*;

public class PrimeValidator {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Ingresar numero", JOptionPane.PLAIN_MESSAGE));

        boolean isNotPrime = false;

        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                isNotPrime = true;
                break;
            }
        }

        if (isNotPrime) {
            JOptionPane.showMessageDialog(null, "El numero no es primo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es primo");
        }
    }
}
