import java.sql.*;

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
