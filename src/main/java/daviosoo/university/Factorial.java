package daviosoo.university;

import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero", "Ingresar numero", JOptionPane.PLAIN_MESSAGE));

        long factorial = getFactorial(number);

        JOptionPane.showMessageDialog(null, "El factorial es: " + factorial);
    }

    public static long getFactorial(int number) {
        long result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return result;
    }

}
