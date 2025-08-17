package src.exercicios;

import java.awt.Color;

import javax.swing.*;

public class ex6 {
    public static void main(String[] args) {
        // Criação do frame e suas configurações
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Divisão de Painéis");

        //Painéis e suas configurações
        JPanel esq = new JPanel();
        JPanel dir = new JPanel();

        esq.setBackground(Color.RED);
        dir.setBackground(Color.BLUE);

        JLabel labelEsq = new JLabel("Painel Esquerdo");
        JLabel labelDir = new JLabel("Painel Direito");

        esq.add(labelEsq);
        dir.add(labelDir);

        // Criação do JSplitPane para dividir os painéis
        // Ele permite que o usuário redimensione os painéis arrastando o divisor.
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, esq, dir);
        splitPane.setDividerSize(5); // Define a espessura do divisor

        frame.add(splitPane);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // É necessário colocar a proporção do divisor depois de adicionar os painéis,
        // para que o layout seja atualizado corretamente.
        splitPane.setDividerLocation(0.4); // Define a posição inicial do divisor
    }
}
