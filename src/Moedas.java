import javax.swing.*;
import java.awt.*;

public class Moedas {
    public Moedas() {
        //valores de cada moeda
        double valor;
        double dolarpreal = 5.19;
        double europreal = 5.50;
        double libraespreal = 6.17;
        double pesoargpreal = 0.026;
        double pesochilpreal = 0.0065;
        double realpdolar = 0.19;
        double realpeuro = 0.18;
        double realplibraes = 0.16;
        double realppesoarg = 38.40;
        double realppesochil = 154.39;
        try {
        String[] opcoes = {"Dolar para Real", "Euro para Real", "Libra Esterlina para Real",
                "Peso Argentino para Real", "Peso Chileno para Real", "Real para Dolar", "Real para Euro",
                "Real para Libra Esterlina", "Real para Peso Argentino", "Real para Peso Chileno"};
        Object auxiliar = JOptionPane.showInputDialog(
                null,
                "Menu\n",
                "Escolha uma opção",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                null);
        if (auxiliar != null) {
            String moeda = auxiliar.toString();
            Object input = JOptionPane.showInputDialog("Insira o Valor:");
            if (input != null) {
                if (!input.toString().equals("")) {
                    valor = Double.parseDouble(input.toString());

                    switch (moeda) {
                        case "Dolar para Real" -> JOptionPane.showMessageDialog(null, "R$" + valor * dolarpreal);
                        case "Euro para Real" -> JOptionPane.showMessageDialog(null, "R$" + valor * europreal);
                        case "Libra Esterlina para Real" -> JOptionPane.showMessageDialog(null, "R$" + valor * libraespreal);
                        case "Peso Argentino para Real" -> JOptionPane.showMessageDialog(null, "R$" + valor * pesoargpreal);
                        case "Peso Chileno para Real" -> JOptionPane.showMessageDialog(null, "R$" + valor * pesochilpreal);
                        case "Real para Dolar" -> JOptionPane.showMessageDialog(null, "R$" + valor * realpdolar);
                        case "Real para Euro" -> JOptionPane.showMessageDialog(null, "R$" + valor * realpeuro);
                        case "Real para Libra Esterlina" -> JOptionPane.showMessageDialog(null, "R$" + valor * realplibraes);
                        case "Real para Peso Argentino" -> JOptionPane.showMessageDialog(null, "R$" + valor * realppesoarg);
                        case "Real para Peso Chileno" -> JOptionPane.showMessageDialog(null, "R$" + valor * realppesochil);
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

