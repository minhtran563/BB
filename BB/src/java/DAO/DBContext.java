package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext {
    public Connection connection;
    public int errorCode; //-1: lỗi kết nối CSDL, -2: Lỗi thực thi SQL, 0: Không có lỗi....
    public DBContext() {
        //@Students: You are not allowed to edit this method  
        try {
            String user ="sa";
            String pass = "123456";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=DemoJDBC;trustServerCertificate=true";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getErrorCode() {
        return errorCode;
    }
    
}
