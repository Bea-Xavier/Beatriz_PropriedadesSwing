package src.exercicios;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

public class ex4 {
    public static void main(String[] args) {
        // Criação do frame e suas configurações
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Data de Nascimento");

        JPanel panel = new JPanel();

        try {
            JLabel label = new JLabel("Insira a data de nascimento:");
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.setPlaceholderCharacter('_');

            /*A formatação com o MaskFormatter nesse caso, é necessário para que o usuário possa entender
            e inserir corretamente a informação necessária, nesse caso, uma data de nascimento.
            Porém, como sugere o nome, é apenas uma máscara (para visualização), no momento de salvar os dados,
            será salvo como uma String normal, sem a máscara aplicada. */

            // Criação do JFormattedTextField(permite formatação do campo) com a máscara definida.
            JFormattedTextField data = new JFormattedTextField(mask);

            // Adiciona um ActionListener para a entrada de data, quando pressionado enter exibir a data na tela.
            data.addActionListener(_ -> {
                String valor = data.getText();
                JOptionPane.showMessageDialog(frame, "Data inserida: " + valor);
                
            });

            panel.add(label);
            panel.add(data);
        } catch (java.text.ParseException e) {
            JLabel error = new JLabel("Erro na formatação da data");
            panel.add(error);
        }

        /*É necessário o bloco de comando Try-Catch, pois o MaskFormatter pode lançar uma exceção se 
        a máscara não for válida, e será preciso tratar esse erro.*/

        frame.add(panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}