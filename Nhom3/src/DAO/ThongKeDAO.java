/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import HELPER.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DuongNVPH
 */
public class ThongKeDAO {
    private ArrayList<Object[]> getListOfArray(String sql ,String[] cols,Object... args){
        try {
            ArrayList<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {                
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null ;
    }
    
    public ArrayList<Object[]> getThongKeDoanhThu(Date nam){
        String sql = "{CALL sp_thongkedoanhthu (?)}";
        String[] cols = {"hoadon","DoanhThu"};
        return this.getListOfArray(sql,cols, nam);
    }
    
    public ArrayList<Object[]> getThongKeGiamGia(Date nam){
        String sql = "{CALL sp_thongketiengiam (?)}";
        String[] cols = {"hoadon","giamgia"};
        return this.getListOfArray(sql,cols, nam);
    }
    
    public ArrayList<Object[]> getThongKeTongTien(Date nam){
        String sql = "{CALL sp_thongketongtien (?)}";
        String[] cols = {"hoadon","tongtien"};
        return this.getListOfArray(sql,cols, nam);
    }
    
     
}
