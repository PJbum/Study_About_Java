package lab11;

import java.sql.*;

public class BookViewer {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/library";
        String username = "root";
        String password = "tmxkzmfovmxm1!";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");

            while (rs.next()) {
                int id = rs.getInt("book_id");
                String title = rs.getString("title");
                System.out.println("Book ID: " + id + ", Title: " + title);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("not found driver");
        } catch (SQLException e) {
            System.out.println("connection failed");
        }
    }
}
