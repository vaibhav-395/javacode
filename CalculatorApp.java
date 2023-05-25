package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame {
    private JTextField firstNoTextField;
    private JTextField secondNoTextField;
    private JLabel resultLabel;

    public CalculatorApp() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create text fields for first number, second number, and result
        firstNoTextField = new JTextField(10);
        secondNoTextField = new JTextField(10);
        resultLabel = new JLabel("Result");

        // Create buttons for addition, clear, and exit
        JButton addButton = new JButton("Add");
        JButton clearButton = new JButton("Clear");
        JButton exitButton = new JButton("Exit");

        // Add action listener to the add button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int firstNo = Integer.parseInt(firstNoTextField.getText());
                    int secondNo = Integer.parseInt(secondNoTextField.getText());
                    int result = firstNo + secondNo;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(CalculatorApp.this, "Invalid input. Please enter valid numbers.");
                }
            }
        });

        // Add action listener to the clear button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNoTextField.setText("");
                secondNoTextField.setText("");
                resultLabel.setText("Result");
            }
        });

        // Add action listener to the exit button
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add components to the frame
        add(new JLabel("First Number:"));
        add(firstNoTextField);
        add(new JLabel("Second Number:"));
        add(secondNoTextField);
        add(resultLabel);
        add(addButton);
        add(clearButton);
        add(exitButton);

        pack();
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorApp();
            }
        });
    }
}
