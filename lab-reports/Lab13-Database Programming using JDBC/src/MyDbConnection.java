import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class MyDbConnection {
    static Connection con = null;
    static Statement st = null;
    static ResultSet rs = null;

    public static void main(String[] args) {
        try {
            // loading the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "admin");

            st = con.createStatement();

            // // This resets the entire table and starts IDs back at 1
            // st.executeUpdate("TRUNCATE TABLE userinformation");
            // System.out.println("Table Reset: IDs will now start from 1");

            // inserting data
            // String s = "INSERT INTO userinformation(userName, age, addres) VALUES ('Ram',22, 'Delhi')";
            String s = "INSERT INTO userinformation(userName, age, addres) VALUES ('Tam', 28, 'Mumbai'), ('Shy', 20, 'Mumbai'),('Bay','10','Banglore')";
            
            if (!con.isClosed()) {
                System.out.println("Connection Created");
            }

            int n = st.executeUpdate(s);
            System.out.println("Number of rows inserted=" + n);

            s = "DELETE FROM userinformation WHERE userid=1";
            n = st.executeUpdate(s);
            System.out.println("No. of rows Deleted=" + n);

            // selecting the Data
            s = "select * from userinformation";
            rs = st.executeQuery(s);

            System.out.println("User Id\t\tUserName\tAge\tAddress");

            while (rs.next()) {
                int uid = rs.getInt(1); // getting the index
                String uname = rs.getString("userName"); // get by col name
                int uage = rs.getInt("age");
                String uaddr = rs.getString(4);

                System.out.print(" " + uid + "\t\t" + uname + "\t\t" + uage + "\t" + uaddr);
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("Error in Connection");
            e.printStackTrace();
        } finally {
            try {
                if (st != null)
                    st.close();
                if (rs != null)
                    rs.close();
                if (con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}