//Create 3 students mark statement records using jdbc.

package Day12;

import java.sql.*;

public class Sql {
    public String name;
    public int tamil, english, maths;

    public Sql(String name, int tamil, int english, int maths) {
        this.name = name;
        this.tamil = tamil;
        this.english = english;
        this.maths = maths;
    }

    public static String tableCreate() {
        return "CREATE TABLE IF NOT EXISTS Students (Name VARCHAR(255), Tamil INT, English INT, Maths INT)";
    }

    public String insert() {
        return "INSERT INTO Students (Name, Tamil, English, Maths) VALUES ('" + name + "', " + tamil + ", " + english + ", " + maths + ")";
    }

    public static void main(String[] args) {
        Statement stmt = null;
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC", "root", "");
            stmt = con.createStatement();
            String createTableSQL = tableCreate();
            stmt.executeUpdate(createTableSQL);
            Sql[] students = {
                    new Sql("Sanjay B", 60, 50, 70),
                    new Sql("Kavin Kumar", 85, 78, 90),
                    new Sql("Arun Raj", 72, 68, 80)
            };
            for (Sql student : students) {
                String insertSQL = student.insert();
                int rowsAffected = stmt.executeUpdate(insertSQL);
                System.out.println("Record inserted successfully for " + student.name + ". Rows affected: " + rowsAffected);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

