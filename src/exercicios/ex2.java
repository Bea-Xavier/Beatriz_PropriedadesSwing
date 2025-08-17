package src.exercicios;

import java.awt.Image;
import java.awt.Color;
import javax.swing.*;

public class ex2 {
    public static void main(String[] args) {
        // Criação do frame e suas configurações
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Navegação por Abas");

        // Configuração que deixa todos os painéis com a mesma cor
        UIManager.put("Panel.background", new Color(133, 159, 202));

        // Aba 1
        JPanel configuracoes = new JPanel();
        JLabel label1 = new JLabel("Bem-vindo(a) as configurações!");
        configuracoes.add(label1);

        // Aba 2
        JPanel perfil = new JPanel();
        JLabel nome = new JLabel("Insira seu nome:");
        JTextField campoNome = new JTextField(15);
        campoNome.setBackground(new Color(241, 241, 241));
        // Criação do ícone de perfil
        ImageIcon perfilIcon = new ImageIcon("src/imagens/perfil.png");
        // Ajusta o tamanho do ícone
        Image img = perfilIcon.getImage();
        Image newImg = img.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(newImg);
        JLabel icon = new JLabel(resizedIcon);
        perfil.add(icon);
        perfil.add(nome);
        perfil.add(campoNome);

        // Aba 3
        JPanel ajuda = new JPanel();
        JPanel painelAjuda = new JPanel();
        painelAjuda.setLayout(new BoxLayout(painelAjuda, BoxLayout.Y_AXIS));
        JLabel label2 = new JLabel("Insira suas dúvidas aqui.");
        label2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        JTextArea campoDuvidas = new JTextArea(4, 15);
        campoDuvidas.setBackground(new Color(241, 241, 241));
        painelAjuda.add(label2);
        painelAjuda.add(campoDuvidas);
        ajuda.add(painelAjuda);

        JTabbedPane abas = new JTabbedPane();
        abas.setBackground(new Color(83, 129, 204));
        abas.addTab("Configurações", configuracoes);
        abas.addTab("Perfil", perfil);
        abas.addTab("Ajuda", ajuda);

        frame.add(abas);
        frame.setLocationRelativeTo(null);

        // Frame visível
        frame.setVisible(true);

    }
}
