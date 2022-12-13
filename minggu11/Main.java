import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

package driver.postgresql.core.SqlCommand;

//import org.postgresql.core.SqlCommand;


public class Main{
    public static void main(String[] args) throws Exception {
        String hostname = "localhost";
        String port = "5432";
        String dbname = "db_cattyhollic";
        String username = "postgres";
        String password = "password";

        String url = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbname;
        try {
            Connection Conn = DriverManager.getConnection(url,username,password);
            System.out.println("Koneksi Berhasil.");

            Statement s = Conn.createStatement();

            //String sql = "UPDATE barang SET namabarang = 'Keyboard' WHERE kodebarang = 2";

            //boolean result = s.execute(sql);

            String sql = "SELECT * FROM tbl_user";

            try {
                ResultSet result = s.executeQuery(sql);

                int i = 0;

                while(result.next()) {
                    System.out.println((i+1) + ". Nama Barang : " + result.getString("namauser"));
                    i++;
                }
                System.out.println("Query Berhasil.");
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Query Gagal.");
            }

            Conn.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Koneksi Gagal.");
            System.out.println(e.getMessage());
        }
    }
}