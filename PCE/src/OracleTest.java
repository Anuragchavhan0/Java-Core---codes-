
import java.sql.Connection;
import java.sql.DriverManager;

public class OracleTest {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
        String user = "system";
        String password = "oracle";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to Oracle Database!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

