import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

 
public class Koneksi {
   private static Connection koneksi;

private void tampilDataFromUser(){

          DefaultTableModel model = new DefaultTableModel();
          model.addColumn("UserID");
          model.addColumn("Email");
          model.addColumn("NamaLengkap");
          model.addColumn("Alamat");
          jTable1.setModel(model);

          

          try{

              Statement stat = konek.createStatement();

              ResultSet data = stat.executeQuery("SELECT * FROM Peminjaman");

              while (data.next()) {

                  model.addRow(new Object[] {
                  data.getString("PeninjamanID"),
                  data.getString("UserID"),
                  data.getString("Buku"),
                  data.getString("TanggalPeminjaman"),
                  data.getString("Tanggal Penegembalian"),
                  data.getString("StatusPeminjaman"),

              });

              jTable2.setMode1(model);

              }

          } catch (Exception e) {

              System.err.println("Terjadi Kesalahan :" + e);

          }

}

}
