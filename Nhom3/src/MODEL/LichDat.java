/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.Date;

/**
 *
 * @author DuongNVPH
 */
public class LichDat {
    private int maLichDat ;
    private Date ngayBatDau ;
    private Date ngayKeyThuc ;
    private String gioDatLich ;
    private String ghiChu ;
    private String maKhachHang ;
    private String maNhanVien ;
    private String trangthai ;
    public LichDat() {
    }

    public LichDat(int maLichDat, Date ngayBatDau, Date ngayKeyThuc, String gioDatLich, String ghiChu, String maKhachHang, String maNhanVien, String trangthai) {
        this.maLichDat = maLichDat;
        this.ngayBatDau = ngayBatDau;
        this.ngayKeyThuc = ngayKeyThuc;
        this.gioDatLich = gioDatLich;
        this.ghiChu = ghiChu;
        this.maKhachHang = maKhachHang;
        this.maNhanVien = maNhanVien;
        this.trangthai = trangthai;
    }

   

    public int getMaLichDat() {
        return maLichDat;
    }

    public void setMaLichDat(int maLichDat) {
        this.maLichDat = maLichDat;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKeyThuc() {
        return ngayKeyThuc;
    }

    public void setNgayKeyThuc(Date ngayKeyThuc) {
        this.ngayKeyThuc = ngayKeyThuc;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getGioDatLich() {
        return gioDatLich;
    }

    public void setGioDatLich(String gioDatLich) {
        this.gioDatLich = gioDatLich;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
}
