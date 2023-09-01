package daviosoo.university;

import javax.swing.*;

public class VocalCounter {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog(null, "Ingrese una palabra", "Ingresar palabra", JOptionPane.PLAIN_MESSAGE);

        int vocalQuantity = vocalCounter(word);

        JOptionPane.showMessageDialog(null, "La cantidad de vocales que tiene la palabra " + word + " es: " + vocalQuantity);
    }

    public static int vocalCounter (String word) {
        int counter = 0;
        for (int i = 0; i <= word.length() - 1; i++) {
            char letter = word.charAt(i);
            switch (letter) {
                case 'a':
                    counter++;
                    break;

                case 'e':
                    counter++;
                    break;

                case 'i':
                    counter++;
                    break;

                case 'o':
                    counter++;
                    break;

                case 'u':
                    counter++;
                    break;

                default:
                    break;
            }
        }
        return counter;
    }
}
