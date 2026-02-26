/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.clsProduct;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class tbProduct extends DBContext {

    public tbProduct() {
        super();//gọi hàm tạo của lớp cha DBContext để nối CSDL
    }

    public ArrayList<clsProduct> getList() {
        ArrayList<clsProduct> list = new ArrayList<clsProduct>();
        if (this.connection == null) {
            this.errorCode = -1;//lỗi kết nối CSDL
            return null;
        }
        //thực hiện lệnh SELECT để lấy dữ liệu
        String sql = "SELECT P.*, C.catname FROM tbProduct P INNER JOIN tbCategory C ON P.catid=C.catid";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                clsProduct product = new clsProduct();
                product.setPid(rs.getInt("pid"));
                product.setPname(rs.getString("pname"));
                product.setPimage(rs.getString("pimage"));
                product.setPprice(rs.getFloat("pprice"));
                product.setPdescription(rs.getString("pdescription"));
                product.setPstatus(rs.getBoolean("pstatus"));
                product.setCatid(rs.getInt("catid"));
                product.setCatname(rs.getString("catname"));
                list.add(product);//thêm sản phẩm vào danh sách kết quả
            }
        } catch (SQLException ex) {
            this.errorCode = -2;//lỗi SQL
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public boolean Insert(clsProduct p) {

        if (this.connection == null) {
            this.errorCode = -1;
            return false;
        }
        try {
            String sql = "INSERT INTO tbProduct VALUES (?, ?, ?, ?, ?, ?) ";
            PreparedStatement stm = this.connection.prepareStatement(sql);
            stm.setString(1, p.getPname());
            stm.setString(2, p.getPimage());
            stm.setFloat(3, p.getPprice());
            stm.setString(4, p.getPdescription());
            stm.setBoolean(5, p.isPstatus());
            stm.setInt(6, p.getCatid());
            int n = stm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            this.errorCode = -2;
            Logger.getLogger(tbProduct.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }
    
}
