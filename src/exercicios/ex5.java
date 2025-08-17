package src.exercicios;

import javax.swing.*;

public class ex5 {

    public static void main(String[] args) {
        // Criação do frame e suas configurações
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Seleção de Gênero");

        JPanel panel = new JPanel();

        // Criação do RadioButtons e do ButtonGroup

        JRadioButton fem = new JRadioButton("Feminino");
        JRadioButton masc = new JRadioButton("Masculino");
        JRadioButton other = new JRadioButton("Outro");

        ButtonGroup group = new ButtonGroup();
        group.add(fem);
        group.add(masc);
        group.add(other);

        // Criação do Button
        JButton button = new JButton("Enviar");

        // Adiciona um ActionListener para o Button, quando selecionado exibir o gênero na tela.
         button.addActionListener(_ -> {
            String genero = "";

            if (!fem.isSelected() && !masc.isSelected() && !other.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Por favor, selecione um gênero.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (fem.isSelected()) {
                genero = "Feminino";
            } else if (masc.isSelected()) {
                genero = "Masculino";
            } else if (other.isSelected()) {
                genero = "Outro";
            }
            JOptionPane.showMessageDialog(frame, "Gênero selecionado: " + genero);
        });

        panel.add(fem);
        panel.add(masc);
        panel.add(other);
        panel.add(button);
        frame.add(panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
