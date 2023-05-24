import javax.swing.*;

public class NumberAdditionGUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Number Addition");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Create the "Number" label
        JLabel numberLabel = new JLabel("Number");
        numberLabel.setBounds(50, 30, 80, 20);
        frame.add(numberLabel);

        // Create the "Addition" label
        JLabel additionLabel = new JLabel("Addition");
        additionLabel.setBounds(100, 30, 80, 20);
        frame.add(additionLabel);

        // Create the "FIRST NUMBER" label
        JLabel firstNumberLabel = new JLabel("FIRST NUMBER:");
        firstNumberLabel.setBounds(50, 70, 100, 20);
        frame.add(firstNumberLabel);

        // Create the first number text field
        JTextField firstNumberField = new JTextField();
        firstNumberField.setBounds(180, 70, 120, 20);
        frame.add(firstNumberField);

        // Create the "SECOND NUMBER" label
        JLabel secondNumberLabel = new JLabel("SECOND NUMBER:");
        secondNumberLabel.setBounds(50, 100, 150, 20);
        frame.add(secondNumberLabel);

        // Create the second number text field
        JTextField secondNumberField = new JTextField();
        secondNumberField.setBounds(180, 100, 120, 20);
        frame.add(secondNumberField);

        // Create the "RESULT" label
        JLabel resultLabel = new JLabel("RESULT:");
        resultLabel.setBounds(50, 130, 60, 20);
        frame.add(resultLabel);

        // Create the result text field
        JTextField resultField = new JTextField();
        resultField.setBounds(180, 130, 120, 20);
        resultField.setEditable(false);
        frame.add(resultField);

        // Create the "ADD" button
        JButton addButton = new JButton("ADD");
        addButton.setBounds(160, 170, 80, 30);
        frame.add(addButton);

        // Create the "CLEAR" button
        JButton clearButton = new JButton("CLEAR");
        clearButton.setBounds(250, 170, 80, 30);
        frame.add(clearButton);

        // Create the "EXIT" button
        JButton exitButton = new JButton("EXIT");
        exitButton.setBounds(300, 220, 80, 30);
        frame.add(exitButton);

        // Make the frame visible
        frame.setVisible(true);
    }
}
