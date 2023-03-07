import javax.swing.*;

public class Temperaturas {
    double valor;
    public Temperaturas(){
        String[] opcoes = {"Celsius para Fahrenheit", "Fahrenheit para Celsius"};
        String temperatura = JOptionPane.showInputDialog(
                        null,
                        "Menu\n",
                        "Escolha uma opção",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        opcoes,
                        null)
                .toString();
        String input = JOptionPane.showInputDialog("Insira o Valor:");
        valor = Double.parseDouble(input);

        if (temperatura.equals("Celsius para Fahrenheit")) {
            valor = (valor * 1.8) + 32;
            JOptionPane.showMessageDialog(null, "A temperatura é "+ valor + "F");
        } else if (temperatura.equals("Fahrenheit para Celsius")) {
            valor = (valor - 32)/1.8;
            JOptionPane.showMessageDialog(null, "A temperatura é "+ valor + "C");
        }
    }
}
