import javax.swing.*;

public class ChatFrameExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(null);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the "File" menu
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // Create the "Open" menu item
        JMenuItem openMenuItem = new JMenuItem("OPEN");
        fileMenu.add(openMenuItem);

        // Create the "Save As" menu item
        JMenuItem saveAsMenuItem = new JMenuItem("SAVE AS");
        fileMenu.add(saveAsMenuItem);

        // Create the "Help" menu
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        // Add the menu bar to the frame
        frame.setJMenuBar(menuBar);

        // Create the "ENTER TEXT" label
        JLabel enterTextLabel = new JLabel("ENTER TEXT:");
        enterTextLabel.setBounds(20, 30, 80, 20);
        frame.add(enterTextLabel);

        // Create the text field
        JTextField textField = new JTextField();
        textField.setBounds(100, 30, 200, 20);
        frame.add(textField);

        // Create the "SEND" button
        JButton sendButton = new JButton("SEND");
        sendButton.setBounds(100, 70, 80, 30);
        frame.add(sendButton);

        // Create the "RESET" button
        JButton resetButton = new JButton("RESET");
        resetButton.setBounds(200, 70, 80, 30);
        frame.add(resetButton);

        // Make the frame visible
        frame.setVisible(true);
    }
}
