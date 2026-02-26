/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.clsCategory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Minh
 */
public class tbCategory extends DBContext {

    public tbCategory() {
        super();
    }

    public ArrayList<clsCategory> getList() {
        ArrayList<clsCategory> list = new ArrayList<clsCategory>();
        if (this.connection == null) {
            this.errorCode = -1;
            return null;
        }

        try {
            String sql = "SELECT * FROM tbCategory ";
            PreparedStatement stm = this.connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
            clsCategory cat = new clsCategory();
            cat.setCatid(rs.getInt("catid"));
            cat.setCatname(rs.getString("catname"));
            cat.setCatorder(rs.getInt("catorder"));
            cat.setCatstatus(rs.getBoolean("catstatus"));
            list.add(cat);}

        } catch (SQLException ex) {
            this.errorCode = -2;
            Logger.getLogger(tbCategory.class.getName()).log(Level.SEVERE, null, ex);
            }
            return list;
        }
    }
