import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class loginGUI implements ActionListener {
    private static JLabel label;
    private static JLabel passwordJLabel;
    private static JLabel successJLabel;
    private static JTextField userText;
    private static JPasswordField password;
    private static JButton button;
    private static JLabel contLabel;
    private static JTextField contactNo;
    private static JLabel qualificationJLabel;
    private static JLabel genderJLabel;
    private static JRadioButton male;
    private static JRadioButton female;
    private static JRadioButton other;
    private static String GENDER;
    private static JComboBox<String> dropBox;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(350, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Student Form");
        frame.add(panel);
        panel.setLayout(null);

        label = new JLabel("User");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordJLabel = new JLabel("Password");
        passwordJLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordJLabel);

        password = new JPasswordField(10);
        password.setBounds(100, 50, 165, 25);
        panel.add(password);
        contLabel = new JLabel("Contact No");
        contLabel.setBounds(10, 80, 80, 25);
        panel.add(contLabel);

        contactNo = new JTextField(20);
        contactNo.setBounds(100, 80, 165, 25);
        panel.add(contactNo);

        qualificationJLabel = new JLabel("Qualification");
        qualificationJLabel.setBounds(10, 110, 80, 25);
        panel.add(qualificationJLabel);
        String[] choices = {"B-Tech", "BE", "BCA", "MCA", "MCS"};
        dropBox = new JComboBox<String>(choices);
        dropBox.setBounds(100, 110, 165, 25);
        panel.add(dropBox);
        genderJLabel = new JLabel("Gender");
        genderJLabel.setBounds(10, 140, 80, 25);
        panel.add(genderJLabel);
        ButtonGroup group = new ButtonGroup();
        female = new JRadioButton("Female");
        male = new JRadioButton("Male");
        other = new JRadioButton("Other");
        male.setBounds(100, 140, 80, 25);
        female.setBounds(180, 140, 80, 25);
        other.setBounds(260, 140, 80, 25);
        group.add(male);
        group.add(female);
        group.add(other);
        male.addActionListener(new loginGUI());
        female.addActionListener(new loginGUI());
        other.addActionListener(new loginGUI());
        panel.add(female);
        panel.add(male);
        panel.add(other);
        button = new JButton("SUBMIT");
        button.setBounds(100, 200, 100, 25);

        button.addActionListener(new loginGUI());
        panel.add(button);
        successJLabel = new JLabel("");
        successJLabel.setBounds(10, 250, 300, 25);
        panel.add(successJLabel);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (male.isSelected()) {
            GENDER = "male";
        } else if (female.isSelected()) {
            GENDER = "Female";
        } else {
            GENDER = "Other";
        }
        if (e.getSource() == button) {
            String user = userText.getText();
            String myPass = String.valueOf(password.getPassword());
            String contactNumber = contactNo.getText();
            String qualif = dropBox.getSelectedItem().toString();
            String Gender = GENDER;
            try {
                int parsedPass = Integer.parseInt(myPass);
                int parsedContactNumber = Integer.parseInt(contactNumber);
                backendSQL db = new backendSQL();
                db.database(user, parsedPass, parsedContactNumber, Gender, qualif);
                successJLabel.setText("Login successfull..");
            } catch (NumberFormatException ex) {
                successJLabel.setText("Invalid input format! Try again.");
                System.out.println(ex);
            } catch (Exception ex) {
                successJLabel.setText("Login failed ! Try again.");
                System.out.println(ex);
            }
        }
    }
}



class myException extends Exception {
    public myException(String e) {
        super(e);
    }
}

class backendSQL {
    public void database(String username, int password, long contactNo, String gender, String qualification) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/studentDB", "root", "qwerty@123");
            Statement stmt = con.createStatement();
            String query = "INSERT INTO student (username, password, contactNo, gender) " +
                    "VALUES ('" + username + "','" + password + "','" + String.valueOf(contactNo) + "','" + gender + "')";
            stmt.executeUpdate(query);
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
