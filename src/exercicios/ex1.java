package src.exercicios;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class ex1 {
    public static void main(String[] args) {
        // Criação do frame e suas configurações
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Botão de Clique");

        // Contador de cliques
        final int[] contador = {0};

        // Criação do painel e suas configurações
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);

        // Criação da borda
        TitledBorder border = BorderFactory.createTitledBorder("Painel de Controle");
        border.setTitleJustification(TitledBorder.CENTER);
        panel.setBorder(border);

        // Criação do botão
        JButton button = new JButton("Clique Aqui");
        button.setBackground(Color.YELLOW);

        button.addActionListener(_ -> {
            JOptionPane.showMessageDialog(frame, "Você clicou no botão " + contador[0] + " vezes! Recebil !! :)");
            contador[0] += 1;
        });

        panel.add(button);

        // Adiciona o painel ao frame e centraliza a janela
        frame.add(panel);
        frame.setLocationRelativeTo(null);

        // Frame visível
        frame.setVisible(true);
    }
}
