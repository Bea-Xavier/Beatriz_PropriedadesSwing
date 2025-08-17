package src.exercicios;

import java.awt.FlowLayout;
import javax.swing.*;

public class ex7 {
    public static void main(String[] args) {
        // Criação do frame e suas configurações
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setTitle("Seleção de Países");

        // Painel principal com BoxLayout vertical
        // Para deixar o label de instrução e comboBox acima do label de exibição do país selecionado
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        // Painel superior com FlowLayout (horizontal)
        // Para centralizar o label de instrução e o comboBox
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout(FlowLayout.CENTER));

        // Label de instrução
        JLabel country = new JLabel("Selecione um país:");

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Brasil");
        comboBox.addItem("Argentina");
        comboBox.addItem("Chile");
        comboBox.setSelectedIndex(1);

        panelSuperior.add(country);
        panelSuperior.add(comboBox);

        JLabel showCountry = new JLabel();
        // Deixa o label de exibição centralizado em relação aos outros componentes
        showCountry.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        // Adiciona um ItemListener ao comboBox para atualizar o label de exibição
        // quando o usuário selecionar um país diferente
        comboBox.addItemListener(_ -> {
            String select = (String) comboBox.getSelectedItem();
            showCountry.setText("País selecionado: " + select);
        });

        panelPrincipal.add(panelSuperior);
        panelPrincipal.add(showCountry);

        frame.add(panelPrincipal);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

// Nesse caso o ItemListener é usado para detectar quando o usuário seleciona um país diferente no JComboBox,
// e atualizar o JLabel com o país selecionado.
