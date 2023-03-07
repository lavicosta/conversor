import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            String[] possibilities = {"Conversor de Moedas", "Conversor de Temperatura"};
            String menu = JOptionPane.showInputDialog(
                            null,
                            "Menu\n",
                            "Escolha uma opção",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            possibilities,
                            null)
                    .toString();

            if (menu.equals("Conversor de Moedas")) {
                Moedas moeda = new Moedas();
            } else if (menu.equals("Conversor de Temperatura")) {
                Temperaturas temperatura = new Temperaturas();
            }

    }
}