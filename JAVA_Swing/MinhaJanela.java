package JAVA_Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaJanela {
    public static void main(String[] args) {
        // Criar a janela principal
        JFrame frame = new JFrame("Calculadora de Soma");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Usar posicionamento absoluto

        // Campo de texto 1
        JTextField campo1 = new JTextField();
        campo1.setBounds(30, 30, 100, 25);
        frame.add(campo1);

        // Campo de texto 2
        JTextField campo2 = new JTextField();
        campo2.setBounds(150, 30, 100, 25);
        frame.add(campo2);

        // Botão de soma
        JButton botaoSomar = new JButton("Somar");
        botaoSomar.setBounds(90, 70, 100, 30);
        frame.add(botaoSomar);

        // Rótulo de resultado
        JLabel resultado = new JLabel("Resultado: ");
        resultado.setBounds(90, 110, 150, 25);
        frame.add(resultado);

        // Ação do botão
        botaoSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campo1.getText());
                    int num2 = Integer.parseInt(campo2.getText());
                    int soma = num1 + num2;
                    resultado.setText("Resultado: " + soma);
                } catch (NumberFormatException ex) {
                    resultado.setText("Digite números válidos!");
                }
            }
        });

        // Tornar visível
        frame.setVisible(true);
    }
}