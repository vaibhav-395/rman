import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingCalculator extends JFrame {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] operatorButtons;
    private JButton clearButton;
    private JButton equalsButton;

    private double firstNumber;
    private String operator;

    public SwingCalculator() {
        setTitle("Swing Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create the text field
        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        // Create the panel for number buttons
        JPanel numberPanel = new JPanel();
        numberPanel.setLayout(new GridLayout(4, 3));

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new NumberButtonListener());
            numberPanel.add(numberButtons[i]);
        }

        clearButton = new JButton("C");
        clearButton.addActionListener(new ClearButtonListener());
        numberPanel.add(clearButton);

        add(numberPanel, BorderLayout.CENTER);

        // Create the panel for operator buttons
        JPanel operatorPanel = new JPanel();
        operatorPanel.setLayout(new GridLayout(4, 1));

        operatorButtons = new JButton[4];
        operatorButtons[0] = new JButton("+");
        operatorButtons[1] = new JButton("-");
        operatorButtons[2] = new JButton("*");
        operatorButtons[3] = new JButton("/");

        operatorPanel.add(operatorButtons[0]);
        operatorPanel.add(operatorButtons[1]);
        operatorPanel.add(operatorButtons[2]);
        operatorPanel.add(operatorButtons[3]);

        for (JButton button : operatorButtons) {
            button.addActionListener(new OperatorButtonListener());
        }

        add(operatorPanel, BorderLayout.EAST);

        // Create the equals button
        equalsButton = new JButton("=");
        equalsButton.addActionListener(new EqualsButtonListener());
        add(equalsButton, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private class NumberButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();
            textField.setText(textField.getText() + buttonText);
        }
    }

    private class ClearButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("");
        }
    }

    private class OperatorButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton) e.getSource();
            String buttonText = button.getText();
            firstNumber = Double.parseDouble(textField.getText());
            operator = buttonText;
            textField.setText("");
        }
    }

    private class EqualsButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double secondNumber = Double.parseDouble(textField.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
            }

            textField.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        SwingCalculator calculator = new SwingCalculator();
    }
}
