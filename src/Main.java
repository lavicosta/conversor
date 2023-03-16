import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            init();
        }

    public static void init(){
        Object[] options = { "Confirmar", "Cancelar" };
        int option;
        do {

            String[] conversoes = {"Conversor de Moedas", "Conversor de Temperatura"};
            Object auxiliar = JOptionPane.showInputDialog(
                            null,
                            "Menu\n",
                            "Escolha uma opção",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            conversoes,
                            null);
            if (auxiliar != null) {
                String menu = auxiliar.toString();

                if (menu.equals("Conversor de Moedas")) {
                    Moedas moeda = new Moedas();
                    option = JOptionPane.showOptionDialog(null, "Clique Confirmar para continuar", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                } else if (menu.equals("Conversor de Temperatura")) {
                    Temperaturas temperatura = new Temperaturas();
                    option = JOptionPane.showOptionDialog(null, "Clique Confirmar para continuar", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                } else {
                    option = 1;
                }
            } else {
                option = JOptionPane.showOptionDialog(null, "Clique Confirmar para continuar", "Informação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            }
        } while (option == 0);
    }
}