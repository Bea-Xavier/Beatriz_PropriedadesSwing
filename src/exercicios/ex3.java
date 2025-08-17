package src.exercicios;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class ex3 {
    public static void main(String[] args) {
        // Criação do frame e suas configurações
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Receita de Bolo de Cenoura");

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setBackground(Color.LIGHT_GRAY);
        Font fonte = new Font("Arial", 0, 12);
        textArea.setFont(fonte);
        textArea.setText(
                " O bolo de cenoura brasileiro, com a massa laranja e uma cobertura de brigadeiro cremosa. Fácil de fazer e sempre um sucesso.\n"
                        + //
                        "\n" + //
                        "Ingredientes\n" + //
                        "Para a Massa:\n" + //
                        "\n" + //
                        "3 cenouras médias (cerca de 300g)\n" + //
                        "\n" + //
                        "3 ovos grandes\n" + //
                        "\n" + //
                        "1 xícara de óleo vegetal\n" + //
                        "\n" + //
                        "2 xícaras de açúcar\n" + //
                        "\n" + //
                        "2 xícaras de farinha de trigo\n" + //
                        "\n" + //
                        "1 colher de sopa de fermento em pó\n" + //
                        "\n" + //
                        "Para a Cobertura de Brigadeiro:\n" + //
                        "\n" + //
                        "1 lata de leite condensado\n" + //
                        "\n" + //
                        "4 colheres de sopa de chocolate em pó 50% cacau\n" + //
                        "\n" + //
                        "1 colher de sopa de manteiga sem sal\n" + //
                        "\n" + //
                        "1 caixinha de creme de leite (opcional, para deixar mais cremoso)\n" + //
                        "\n" + //
                        "Modo de Preparo\n" + //
                        "Pré-aqueça o Forno: Ligue o forno a 180°C e unte e enfarinhe uma forma redonda com um furo no meio.\n"
                        + //
                        "\n" + //
                        "Bata no Liquidificador: Descasque e pique as cenouras. Coloque-as no liquidificador com os ovos e o óleo. Bata bem até obter uma mistura homogênea e sem pedaços de cenoura.\n"
                        + //
                        "\n" + //
                        "Misture os Secos: Em uma tigela grande, misture o açúcar e a farinha de trigo.\n" + //
                        "\n" + //
                        "Combine as Misturas: Despeje a mistura do liquidificador sobre os ingredientes secos e misture delicadamente com um fouet ou colher, até que a massa fique uniforme. Não misture demais. Por último, adicione o fermento em pó e misture apenas o suficiente para incorporá-lo.\n"
                        + //
                        "\n" + //
                        "Asse o Bolo: Transfira a massa para a forma preparada e leve ao forno pré-aquecido por cerca de 40 a 50 minutos. Para saber se está pronto, faça o teste do palito: se sair limpo, pode tirar.\n"
                        + //
                        "\n" + //
                        "Faça a Cobertura: Enquanto o bolo assa, prepare a cobertura. Em uma panela, misture o leite condensado, o chocolate em pó e a manteiga. Leve ao fogo baixo, mexendo sempre, até a mistura engrossar e começar a soltar do fundo da panela (ponto de brigadeiro mole). Se for usar, adicione o creme de leite por último, fora do fogo, para uma cobertura mais fluida.\n"
                        + //
                        "\n" + //
                        "Cubra o Bolo: Espere o bolo esfriar um pouco antes de desenformar. Em seguida, despeje a cobertura de brigadeiro sobre ele, cobrindo bem. Sirva em seguida.\n"
                        + //
                        "\n" + //
                        "Aproveite seu bolo!");

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setViewportView(textArea);

        frame.add(scrollPane);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}


/*Nesse caso, o ScrollPane é usado e necessário para que o usuário role por todo o JTextArea,
(tanto vertical quanto horizontal) perimitindo que ele possa ver todo o seu conteúdo, 
mesmo que ele exceda o tamanho visível.*/