import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameColors {
    public static void main(String[] args) {
        //Janela
        JFrame frame = new JFrame();
        frame.setSize(500, 300);
        frame.setLayout(null);

        //Painel
        JPanel panel = new JPanel();
        panel.setSize(400, 200);
        panel.setLayout(new FlowLayout());

        //Botão Azul
        JButton blueButton = new JButton("Azul");

        //Botão Amarelo
        JButton yellowButton = new JButton("Amarelo");

        //Botão Vermelho
        JButton redButton = new JButton("Vermelho");

        //Botão Fechar
        JButton closeButton = new JButton("Fechar");

        //Adicionando ao painel
        panel.add(closeButton);
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(yellowButton);

        //Adicionando o painel à janela e tornando ela visível
        frame.add(panel);
        frame.setVisible(true);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        yellowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame yellowFrame = new JFrame("FrmAmarelo");
                yellowFrame.setSize(500, 300);;
                yellowFrame.getContentPane().setBackground(Color.yellow);
                yellowFrame.setVisible(true);
            }
        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame blueFrame = new JFrame("FrmAzul");
                blueFrame.setSize(500, 300);;
                blueFrame.getContentPane().setBackground(Color.blue);
                blueFrame.setVisible(true);
            }
        });

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame redFrame = new JFrame("FrmVermelho");
                redFrame.setSize(500, 300);;
                redFrame.getContentPane().setBackground(Color.red);
                redFrame.setVisible(true);
            }
        });
    }
}
