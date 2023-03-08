import javax.swing.*;
import java.awt.*;

public class Temperaturas {
    double valor;
    public Temperaturas(){
        try {
            String[] opcoes = {"Celsius para Fahrenheit", "Fahrenheit para Celsius"};
            Object auxiliar = JOptionPane.showInputDialog(
                    null,
                    "Menu\n",
                    "Escolha uma opção",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    null);
            if (auxiliar != null) {
                String temperatura = auxiliar.toString();
                Object input = JOptionPane.showInputDialog("Insira o Valor:");
                if (input != null) {
                    if (!input.toString().equals("")) {
                        valor = Double.parseDouble(input.toString());

                        if (temperatura.equals("Celsius para Fahrenheit")) {
                            valor = (valor * 1.8) + 32;
                            JOptionPane.showMessageDialog(null, "A temperatura é " + valor + "F");
                        } else if (temperatura.equals("Fahrenheit para Celsius")) {
                            valor = (valor - 32) / 1.8;
                            JOptionPane.showMessageDialog(null, "A temperatura é " + valor + "C");
                        }
                    }
                }
            }
        } catch (HeadlessException e) {
            return;
        } catch (NumberFormatException e) {
            return;
        }
    }
}
