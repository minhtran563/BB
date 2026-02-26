/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Minh
 */
public class clsCategory {
    int catid;
    String catname;
    int catorder;
    boolean catstatus;

    public clsCategory() {
    }   

    public clsCategory(int catid, String catname, int catorder, boolean catstatus) {
        this.catid = catid;
        this.catname = catname;
        this.catorder = catorder;
        this.catstatus = catstatus;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public int getCatorder() {
        return catorder;
    }

    public void setCatorder(int catorder) {
        this.catorder = catorder;
    }

    public boolean isCatstatus() {
        return catstatus;
    }

    public void setCatstatus(boolean catstatus) {
        this.catstatus = catstatus;
    }
    
    
}
