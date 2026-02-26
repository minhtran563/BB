
import DAO.DBContext;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class TestConnect {
    public static void main(String[] args) {
        DBContext db = new DBContext();
        if(db.connection==null)
            System.out.println("Lỗi KẾT NỐI CSDL");
        else
            System.out.println("Kết nối thành công!");
    }
}
