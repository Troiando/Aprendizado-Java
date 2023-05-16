package JogodaMemoria;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.net.URL;

public class JogoDaMemoria extends JFrame implements ActionListener {

    private ArrayList<ImageIcon> imagens;
    private ArrayList<JButton> botoes;
    private JButton primeiroBotao, segundoBotao;
    private int paresEncontrados;
    private int tentativas;
    private JLabel labelParesEncontrados;
    private JLabel labelTentativas;

    public JogoDaMemoria() {
        // Configurações da janela
        setTitle("Jogo da Memória");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
       

        // Painel principal
        JPanel painelPrincipal = new JPanel(new BorderLayout());
        getContentPane().add(painelPrincipal);

        // Painel do tabuleiro
        JPanel painelTabuleiro = new JPanel(new GridLayout(4, 5));
        painelPrincipal.add(painelTabuleiro, BorderLayout.CENTER);

        // Botões do tabuleiro
        botoes = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ImageIcon imagem = new ImageIcon("imagem" + i + ".png");
            for (int j = 0; j < 2; j++) {
                JButton botao = new JButton(imagem);
                botao.addActionListener(this);
                botoes.add(botao);
            }
        }
        Collections.shuffle(botoes);

        // Adiciona os botões ao painel do tabuleiro
        for (JButton botao : botoes) {
            painelTabuleiro.add(botao);
        }

        // Painel de informações
        JPanel painelInfo = new JPanel(new FlowLayout());
        painelPrincipal.add(painelInfo, BorderLayout.SOUTH);

        // Labels de pares encontrados e tentativas
        labelParesEncontrados = new JLabel("Pares encontrados: 0");
        painelInfo.add(labelParesEncontrados);

        labelTentativas = new JLabel("Tentativas: 0");
        painelInfo.add(labelTentativas);

        // Configurações adicionais
        paresEncontrados = 0;
        tentativas = 0;
        primeiroBotao = null;
        segundoBotao = null;
       
        
        
        // Configurações da janela
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        JButton botao = (JButton) e.getSource();

        if (primeiroBotao == null) {
            primeiroBotao = botao;
            primeiroBotao.setEnabled(false);
        } else if (segundoBotao == null) {
            segundoBotao = botao;
            segundoBotao.setEnabled(false);

            // Verifica se os botões são iguais
            if (primeiroBotao.getIcon().equals(segundoBotao.getIcon())) {
                primeiroBotao = null;
                segundoBotao = null;
                paresEncontrados++;
                somM("Certo");

                // Verifica se o jogo terminou
                if (paresEncontrados == 10) {
                    JOptionPane.showMessageDialog(this, "Parabéns,você venceu!");
                   //
                    System.exit(0);
                    }
                    } else {
                    Timer timer = new Timer(1000, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    primeiroBotao.setEnabled(true);
                    segundoBotao.setEnabled(true);
                    primeiroBotao = null;
                    segundoBotao = null;
                   //
                    }
                    });
                    timer.setRepeats(false);
                    timer.start();
                    }
                    tentativas++;
                    labelParesEncontrados.setText("Pares encontrados: " + paresEncontrados);
                    labelTentativas.setText("Tentativas: " + tentativas);
                }
            }
        
            public void somM(String Movie) {
                URL url = JogoDaMemoria.class.getResource(Movie + ".wav");
                AudioClip audioM = Applet.newAudioClip(url);
                audioM.play();
            }
            
            public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        new JogoDaMemoria();
                    }
                });
            }
        }
        
        
            