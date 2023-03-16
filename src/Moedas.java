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

            String[] opcoes = {"Dolar", "Real", "Euro", "Libra Esterlina", "Peso Argentino", "Peso Chileno"};
            String[] opcoesSemReal = {"Dolar", "Euro", "Libra Esterlina", "Peso Argentino", "Peso Chileno"};

            Object auxiliar = JOptionPane.showInputDialog(
                    null,
                    "Menu\n",
                    "Escolha uma opção",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    null);
            if (auxiliar != null) {
                String moeda1 = auxiliar.toString();
                String moeda2 = "Real";
                if (auxiliar.equals("Real")){
                    Object auxiliar2 = JOptionPane.showInputDialog(
                            null,
                            "Menu\n",
                            "Escolha uma opção",
                            JOptionPane.PLAIN_MESSAGE,
                            null,
                            opcoesSemReal,
                            null);
                    moeda2 = auxiliar2.toString();
                }

                Object input = JOptionPane.showInputDialog("Insira o Valor:");
                if (input != null) {
                    if (!input.toString().equals("")) {
                        valor = Double.parseDouble(input.toString());

                        if (moeda1.equals("Real")){
                            switch (moeda2){
                                case "Dolar" -> JOptionPane.showMessageDialog(null, "US$" + valor * realpdolar);
                                case "Euro" -> JOptionPane.showMessageDialog(null, "€" + valor * realpeuro);
                                case "Libra Esterlina" -> JOptionPane.showMessageDialog(null, "£" + valor * realplibraes);
                                case "Peso Argentino" -> JOptionPane.showMessageDialog(null, "$" + valor * realppesoarg);
                                case "Peso Chileno" -> JOptionPane.showMessageDialog(null, "$" + valor * realppesochil);
                            }
                        } else {
                            switch (moeda1){
                                case "Dolar" -> JOptionPane.showMessageDialog(null, "R$" + valor * dolarpreal);
                                case "Euro" -> JOptionPane.showMessageDialog(null, "R$" + valor * europreal);
                                case "Libra Esterlina" -> JOptionPane.showMessageDialog(null, "R$" + valor * libraespreal);
                                case "Peso Argentino" -> JOptionPane.showMessageDialog(null, "R$" + valor * pesoargpreal);
                                case "Peso Chileno" -> JOptionPane.showMessageDialog(null, "R$" + valor * pesochilpreal);
                            }
                        }
                    }
                    }

            }

        } catch (HeadlessException | NumberFormatException e) {
            return;
        }
    }
}
//como aparecer apenas 2 digitos depois da virgula?
//outra forma de mexer na lista? funcao para retirar a opcao selecionada? teria que usar arraylist?