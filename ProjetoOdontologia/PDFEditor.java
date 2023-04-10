package ProjetoOdontologia;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PDFEditor {
    private JFrame frame;
    private JPanel panel;
    private JButton createButton;
    private JButton editButton;
    private JButton saveButton;
    private JButton searchButton;
    private JTextArea textArea;
    private File currentFile;
    private String searchText;

    public PDFEditor() {
        frame = new JFrame("Editor de PDF");
        panel = new JPanel();
        createButton = new JButton("Criar");
        editButton = new JButton("Editar");
        saveButton = new JButton("Salvar");
        searchButton = new JButton("Buscar");
        textArea = new JTextArea(20, 40);
        currentFile = null;
        searchText = null;
    }

    public void createAndShowGUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createPDF();
            }
        });

        editButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editPDF();
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                savePDF();
            }
        });

        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchText = JOptionPane.showInputDialog(frame, "Digite o texto a ser buscado:");
                searchPDF();
            }
        });

        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(createButton);
        panel.add(editButton);
        panel.add(saveButton);
        panel.add(searchButton);
        panel.add(scrollPane);
        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }

    private void createPDF() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooser.getSelectedFile();
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(currentFile));
                document.open();
                document.add(new Paragraph(textArea.getText()));
                document.close();
                JOptionPane.showMessageDialog(frame, "Documento PDF criado e salvo com sucesso.");
            } catch (FileNotFoundException | DocumentException e) {
                JOptionPane.showMessageDialog(frame, "Erro ao criar o documento PDF.");
                e.printStackTrace();
            }
        }
    }

    private void editPDF() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooser.getSelectedFile();
            try {
                PdfReader reader = new PdfReader(currentFile.getAbsolutePath());
                int numPages = reader.getNumberOfPages();
                StringBuilder text = new StringBuilder();
                for (int i = 1; i <= numPages; i++) {
                    text.append(PdfTextExtractor.getTextFromPage(reader, i));
                }
                textArea.setText(text.toString());
                reader.close();
                JOptionPane.showMessageDialog(frame, "Documento PDF aberto para edição.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(frame, "Erro ao abrir o documento PDF para edição.");
                e.printStackTrace();
            }
        }
    }

    private void savePDF() {
        if (currentFile != null) {
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(currentFile));
                document.open();
                document.add(new Paragraph(textArea.getText()));
                document.close();
                JOptionPane.showMessageDialog(frame, "Alterações salvas com sucesso.");
            } catch (FileNotFoundException | DocumentException e) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar o documento PDF.");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Não há nenhum documento PDF aberto para salvar.");
        }
    }

    private void searchPDF() {
        if (currentFile != null && searchText != null) {
            try {
                PdfReader reader = new PdfReader(currentFile.getAbsolutePath());
                int numPages = reader.getNumberOfPages();
                StringBuilder result = new StringBuilder();
                for (int i = 1; i <= numPages; i++) {
                    String text = PdfTextExtractor.getTextFromPage(reader, i);
                    if (text.contains(searchText)) {
                        result.append("Página ").append(i).append(": ").append(text).append("\n");
                    }
                }
                if (result.length() > 0) {
                    textArea.setText(result.toString());
                } else {
                    textArea.setText("Nenhum resultado encontrado para o texto \"" + searchText + "\".");
                }
                reader.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(frame, "Erro ao buscar o texto no documento PDF.");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(frame, "Não há nenhum documento PDF aberto ou texto de busca especificado.");
        }
    }

    public static void main(String[] args) {
        PDFEditor editor = new PDFEditor();
        editor.createAndShowGUI();
    }
}

               
