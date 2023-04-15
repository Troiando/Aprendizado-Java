package AT5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Incrementador extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton incrementarButton;
    private JButton zerarButton;
    private int valor;

    public Incrementador() {
        super("Incrementador");

        label = new JLabel("Valor: ");
        textField = new JTextField("0");
        textField.setEditable(false);

        incrementarButton = new JButton("Incrementar");
        incrementarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                valor++;
                textField.setText(Integer.toString(valor));
            }
        });

        zerarButton = new JButton("Zerar");
        zerarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                valor = 0;
                textField.setText(Integer.toString(valor));
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(label);
        panel.add(textField);
        panel.add(incrementarButton);
        panel.add(zerarButton);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);

        valor = 0;
    }

    public static void main(String[] args) {
        new Incrementador();
    }
}


