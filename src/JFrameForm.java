import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameForm {
    public static void main(String[] args) {
        //Janela
        JFrame frame = new JFrame();
        frame.setSize(500, 300);
        frame.setLayout(null);

        //Painel
        JPanel panel = new JPanel();
        panel.setSize(500, 300);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel name = new JLabel();
        name.setText("Nome: ");

        Dimension sized = new Dimension(60, 20);
        JTextField nameField = new JTextField();
        nameField.setPreferredSize(sized);

        JLabel socialReason = new JLabel();
        socialReason.setText("Razão social: ");

        JTextField socialReasonField = new JTextField();
        socialReasonField.setPreferredSize(sized);

        JLabel document = new JLabel();
        document.setText("Documento: ");

        JTextField documentField = new JTextField();
        documentField.setPreferredSize(sized);

        JComboBox options = new JComboBox();
        options.addItem("Física");
        options.addItem("Jurídica");

        options.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (options.getSelectedItem() == "Física"){
                    document.setText("CPF: ");
                }else{
                    document.setText("CNPJ: ");
                }
            }
        });

        JButton show = new JButton("Mostrar");
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Nome: " +
                        nameField.getText());
                JOptionPane.showMessageDialog(null, "Razão Social: " +
                        socialReasonField.getText());
                JOptionPane.showMessageDialog(null, "Documento: " +
                        documentField.getText());
            }
        });

        panel.add(name);
        panel.add(nameField);
        panel.add(socialReason);
        panel.add(socialReasonField);
        panel.add(document);
        panel.add(documentField);
        panel.add(options);
        panel.add(show);

        frame.add(panel);
        frame.setVisible(true);
    }
}
