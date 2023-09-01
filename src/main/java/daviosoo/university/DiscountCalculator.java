package daviosoo.university;

import javax.swing.*;

public class DiscountCalculator {
    public static void main(String[] args) {
        double productPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del producto", "Ingresar precio", JOptionPane.PLAIN_MESSAGE));
        double discountPercent = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el descuento del producto", "Ingresar descuento", JOptionPane.PLAIN_MESSAGE));

        double discountValue = getDiscountValue(productPrice, discountPercent);
        double finalPrice = productPrice - discountValue;

        JOptionPane.showMessageDialog(null, "El descuento es de: " + discountValue + ". El total a pagar es: " + finalPrice);
    }
    private static double getDiscountValue(double price, double discountPercent) {
        return price * (discountPercent / 100);
    }

}
