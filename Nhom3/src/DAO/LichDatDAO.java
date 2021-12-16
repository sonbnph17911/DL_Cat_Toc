/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO; 



import HELPER.JdbcHelper;
import MODEL.LichDat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DuongNVPH
 */
public class LichDatDAO implements HairSalonDAO<LichDat,Integer>{
    String insert = "insert into lichdat(ngaybatdau,ngayketthuc,ghichu,makhachhang,manhanvien,gioDat,trangthai,trangthaihuylich) values(?,?,?,?,?,?,?,?)";
    String update = "update lichdat set ngaybatdau=?,ngayketthuc=?,ghichu=?,makhachhang=?,manhanvien=?,gioDat=?,trangthai=?,trangthaihuylich=? where malichdat=?";
    String delete = "delete from lichdat where malichdat=?";
    String select_by_id = "select * from lichdat where malichdat=?";
    String select_all = "select * from lichdat";
    
    public ArrayList<Integer> selectYears(){
        String sql = "select  distinct year(ngaybatdau) from lichdat order by year(ngaybatdau) desc ";
        ArrayList<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql);
            while(rs.next()){
                Integer nam = rs.getInt(1);
                list.add(nam);
            }
        } catch (Exception e) {
        }
        return list ;
    }
    public void huyLich(boolean trangThaiHuyLich ,Integer madl) throws SQLException{
        String sql = "Update lichdat set trangthaihuylich=? where malichdat=?";
        JdbcHelper.executeUpdate(sql, trangThaiHuyLich,madl);
    }
    public ArrayList<LichDat> selectByKeyWord(String keyword , boolean trangThaiHuyLich){
        String sql = "Select * from lichdat where makhachhang LIKE ? and trangthaihuylich = ? order by ngaybatdau desc ";
        return selectBySQL(sql, "%"+keyword+"%",trangThaiHuyLich);
    }
    public ArrayList<LichDat> updateStatus(String trangthai,Integer malichdat){
        String sql = "update lichdat set trangthai=? where malichdat=?";
        return selectBySQL(sql, trangthai,malichdat);
    }
    
    private ArrayList<LichDat> selectBySQL(String sql , Object...args){
        ArrayList<LichDat> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.executeQuery(sql, args);
            while (rs.next()) {                
                LichDat model = new LichDat();
                model.setMaLichDat(rs.getInt("malichdat"));
                model.setNgayBatDau(rs.getDate("ngaybatdau"));
                model.setNgayKeyThuc(rs.getDate("ngayketthuc"));
                model.setGhiChu(rs.getString("ghichu"));
                model.setMaKhachHang(rs.getString("makhachhang"));
                model.setMaNhanVien(rs.getString("manhanvien"));
                model.setGioDat(rs.getString("gioDat"));
                model.setTrangThai(rs.getString("trangthai"));
                model.setTrangThaiHuyLich(rs.getBoolean("trangthaihuylich"));
                list.add(model);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) { 
        }
        return list ;
    }

    @Override
    public void insert(LichDat model) {
        try {
            JdbcHelper.executeUpdate(insert, model.getNgayBatDau(),model.getNgayKeyThuc()
                    ,model.getGhiChu(),model.getMaKhachHang(),model.getMaNhanVien(),model.getGioDat(),model.getTrangThai(),model.getTrangThaiHuyLich());
        } catch (SQLException ex) {
            Logger.getLogger(LichDatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(LichDat model) {
        try {
            JdbcHelper.executeUpdate(update, model.getNgayBatDau(),model.getNgayKeyThuc()
                    ,model.getGhiChu(),model.getMaKhachHang(),model.getMaNhanVien(),model.getGioDat(),model.getTrangThai(),model.getTrangThaiHuyLich(),model.getMaLichDat());
        } catch (SQLException ex) {
            Logger.getLogger(LichDatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            JdbcHelper.executeUpdate(delete, id);
        } catch (SQLException ex) {
            Logger.getLogger(LichDatDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public LichDat selectByID(Integer id) {
        ArrayList<LichDat> list = new ArrayList<>();
        list = selectBySQL(select_by_id, id);
        return list.isEmpty() ? null : list.get(0) ;
    }

    @Override
    public ArrayList<LichDat> selectAll() {
        return selectBySQL(select_all);
    }
}
