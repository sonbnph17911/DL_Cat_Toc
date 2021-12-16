/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;
 





import DAO.HoaDonDAO;
import DAO.KhachHangDAO;
import DAO.LichDatDAO;
import HELPER.DateHelper;
import HELPER.DialogHelper;
import HELPER.JdbcHelper;
import HELPER.ShareHelper;
import MODEL.HoaDon;
import MODEL.KhachHang;
import MODEL.LichDat;
import java.awt.CardLayout;
import static java.awt.Color.pink;
import static java.awt.Color.white;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.*;
/**
 *
 * @author levan
 */
public class DatLich extends javax.swing.JPanel {

    /**
     * Creates new form DatLich
     */
    public DatLich() {
        initComponents();
        init();
    }
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {                                         
        // TODO add your handling code here:
    }  
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLichDat = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtTimKiemLichDatTheoMa = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnDanhSachHuyLich = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        rdoNu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();
        dcNgayBatDau = new com.toedter.calendar.JDateChooser();
        dcNgayKetThuc = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        txtTimKiemTheoSoDienThoai = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cbb = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnTaoHoaDon = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLichDat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "TT", "Ngày bắt đầu ", "Ngày cắt", "Ghi chú", "Mã khách hàng", "Người tạo", "Giờ đặt", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLichDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLichDatMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLichDat);
        if (tblLichDat.getColumnModel().getColumnCount() > 0) {
            tblLichDat.getColumnModel().getColumn(0).setResizable(false);
            tblLichDat.getColumnModel().getColumn(1).setResizable(false);
            tblLichDat.getColumnModel().getColumn(2).setResizable(false);
            tblLichDat.getColumnModel().getColumn(3).setResizable(false);
            tblLichDat.getColumnModel().getColumn(4).setResizable(false);
            tblLichDat.getColumnModel().getColumn(5).setResizable(false);
            tblLichDat.getColumnModel().getColumn(6).setResizable(false);
            tblLichDat.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, 260));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Tìm kiếm lịch đặt theo mã khách hàng :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtTimKiemLichDatTheoMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemLichDatTheoMaKeyReleased(evt);
            }
        });
        jPanel2.add(txtTimKiemLichDatTheoMa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 180, 30));

        btnBack.setText("BACK <<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 140, 30));

        btnDanhSachHuyLich.setText("DS lịch đã hủy");
        btnDanhSachHuyLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhSachHuyLichActionPerformed(evt);
            }
        });
        jPanel2.add(btnDanhSachHuyLich, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 120, 30));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 740, 310));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Mã khách hàng :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Họ tên :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Số điện thoại :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Email :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");
        add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Giới tính :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Địa chỉ :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Ngày bắt đầu :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Ngày cắt :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 100, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Ghi chú :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, -1, -1));
        add(txtMaKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 200, 40));
        add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 200, 40));
        add(txtSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 200, 40));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 200, 40));

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtDiaChi);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 190, 60));

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 210, 110));

        dcNgayBatDau.setBackground(new java.awt.Color(255, 255, 255));
        add(dcNgayBatDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, 140, 40));

        dcNgayKetThuc.setBackground(new java.awt.Color(255, 255, 255));
        add(dcNgayKetThuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 140, 40));

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Họ tên ", "Số điện thoại", "Email", "Giới tính", "Địa chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblKhachHang);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 580, 260));

        txtTimKiemTheoSoDienThoai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemTheoSoDienThoaiKeyReleased(evt);
            }
        });
        add(txtTimKiemTheoSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 270, 220, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setText("Tìm kiếm khách hàng theo số điện thoại :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Add.png"))); // NOI18N
        jButton1.setText("ĐẶT LỊCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Notes.png"))); // NOI18N
        jButton2.setText("SỬA LỊCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Delete.png"))); // NOI18N
        jButton3.setText("HỦY LỊCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Refresh.png"))); // NOI18N
        jButton4.setText("TẠO MỚI");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 250, 170));

        cbb.setEditable(true);
        cbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:30", "9:30", "10:30", "11:30", "13:30", "14:30", "15:30", "16:30", "17:30", "19:30", "20:30" }));
        cbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbActionPerformed(evt);
            }
        });
        add(cbb, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 100, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Giờ Đặt");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 50, -1));

        btnTaoHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Create.png"))); // NOI18N
        btnTaoHoaDon.setText("TẠO HÓA ĐƠN");
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });
        add(btnTaoHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 170, 250, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemLichDatTheoMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemLichDatTheoMaKeyReleased
        // TODO add your handling code here:
        fillTableLichDat(true);
    }//GEN-LAST:event_txtTimKiemLichDatTheoMaKeyReleased

    private void txtTimKiemTheoSoDienThoaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemTheoSoDienThoaiKeyReleased
        // TODO add your handling code here:
        fillTableKhachHang();
    }//GEN-LAST:event_txtTimKiemTheoSoDienThoaiKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblLichDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLichDatMouseClicked
        // TODO add your handling code here:
        editLichDat();
        updateStatus(false);
    }//GEN-LAST:event_tblLichDatMouseClicked

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        // TODO add your handling code here:
        editKhachHang();
        updateStatus(false);
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        suaLich();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        huyLich();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LichDat dl=getFormDatLich();
        String sql="select*from lichdat";
        try {
            ResultSet rs=JdbcHelper.executeQuery(sql);
            while(rs.next()){
                Object[] item=new Object[4];
                item[0]=rs.getInt("malichdat");
                item[1]=rs.getString("ngaybatdau");
                item[2]=rs.getString("gioDat");
                item[3]=rs.getString("manhanvien");
                int malichdat=Integer.valueOf(item[0].toString());
                String ngaybatdau=DateHelper.toString(dl.getNgayBatDau(),"yyyy-MM-dd");
                if(dl.getMaNhanVien().equals(item[3].toString())&&ngaybatdau.equals(item[1].toString())&&dl.getGioDat().equals(item[2].toString())
                        ){
                    DialogHelper.alert(this,"Lịch đã có người đặt");
                    return;
                }
            
        }
              taoLichDatVaKhachHang();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbActionPerformed
        
    }//GEN-LAST:event_cbbActionPerformed

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        // TODO add your handling code here:
        int viTri = tblLichDat.getSelectedRow();
        if (viTri == -1) {
            return;
        }
        if (tblLichDat.getValueAt(viTri, 7).toString().equalsIgnoreCase("Đã tạo hóa đơn")) {
            DialogHelper.alert(this, "Lịch này đã có hóa đơn");

        } else {
            taoHoaDon();
        }
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        fillTableLichDat(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDanhSachHuyLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhSachHuyLichActionPerformed
        // TODO add your handling code here:
        fillTableLichDat(false);
    }//GEN-LAST:event_btnDanhSachHuyLichActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDanhSachHuyLich;
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbb;
    private com.toedter.calendar.JDateChooser dcNgayBatDau;
    private com.toedter.calendar.JDateChooser dcNgayKetThuc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTable tblLichDat;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTimKiemLichDatTheoMa;
    private javax.swing.JTextField txtTimKiemTheoSoDienThoai;
    // End of variables declaration//GEN-END:variables
    
    LichDatDAO lddao = new LichDatDAO();
    KhachHangDAO khdao = new KhachHangDAO();
    HoaDonDAO hddao = new HoaDonDAO();
    void init(){
        fillTableLichDat(true);
        fillTableKhachHang();
    }
    void fillTableLichDat(boolean trangthaihuylich){
        DefaultTableModel dtm = (DefaultTableModel) tblLichDat.getModel();
        dtm.setRowCount(0);
        String timKiem = txtTimKiemLichDatTheoMa.getText();
        ArrayList<LichDat> list = lddao.selectByKeyWord(timKiem,trangthaihuylich);
        for (LichDat ld : list) {
            dtm.addRow(new Object[]{ld.getMaLichDat(),ld.getNgayBatDau(),ld.getNgayKeyThuc(),
                ld.getGhiChu(),ld.getMaKhachHang(),ld.getMaNhanVien(),ld.getGioDat(),ld.getTrangThai()});
        }
    }
    void fillTableKhachHang(){
        DefaultTableModel dtm = (DefaultTableModel) tblKhachHang.getModel();
        dtm.setRowCount(0);
        String sdt = txtTimKiemTheoSoDienThoai.getText();
        ArrayList<KhachHang> list = khdao.selectBySDT(sdt);
        for (KhachHang kh : list) {
            dtm.addRow(new Object[]{kh.getMaKhachHang(),kh.getHoTen(),kh.getSoDienThoai(),
                kh.getEmail(),kh.getGioiTinh()? "Nam" : "Nữ",kh.getDiaChi()});
            
        }
    }
    
    
    LichDat getFormDatLich(){
        LichDat dl = new LichDat();
        if (dcNgayBatDau.getDate().equals("")) {
            return null ;
        }
        if (dcNgayKetThuc.getDate().equals("")) {
            return null ;
        }
        if (txtMaKhachHang.getText().equals("")) {
            return null;
        }
        if (dcNgayBatDau.getDate().before(DateHelper.now())) {
            DialogHelper.alert(this, "Không được đặt ngày trong quá khứ");
            return null;
        }
        if (dcNgayKetThuc.getDate().before(DateHelper.now())) {
            DialogHelper.alert(this, "Không được đặt ngày trong quá khứ");
            return null;
        }
        dl.setNgayBatDau(dcNgayBatDau.getDate());
        dl.setNgayKeyThuc(dcNgayKetThuc.getDate());
        dl.setGhiChu(txtGhiChu.getText());
        dl.setMaKhachHang(txtMaKhachHang.getText());
        dl.setMaNhanVien(ShareHelper.user.getMaNhanVien());
        dl.setGioDat(toString().valueOf(cbb.getSelectedItem()));
        dl.setTrangThai("Chưa tạo hóa đơn");
        dl.setTrangThaiHuyLich(true);
        return dl ;
    }
    
    KhachHang getFormKhachHang(){
        KhachHang kh = new KhachHang();
        if (txtMaKhachHang.getText().equals("")) {
            return null;
        }
        if (txtHoTen.getText().equals("")) {
            return null;
        }
        if (txtSoDienThoai.getText().equals("")) {
            return null;
        }
        if (txtEmail.getText().equals("")) {
            return null;
        }
        if (txtDiaChi.getText().equals("")) {
            return null;
        }
        kh.setMaKhachHang(txtMaKhachHang.getText());
        kh.setHoTen(txtHoTen.getText());
        kh.setSoDienThoai(txtSoDienThoai.getText());
        kh.setEmail(txtEmail.getText());
        kh.setDiaChi(txtDiaChi.getText());
        kh.setGioiTinh(rdoNam.isSelected());
        kh.setGhiChu(txtGhiChu.getText());
        return kh;
    }
    
    void clearForm(){
        txtMaKhachHang.setText("");
        txtHoTen.setText("");
        txtSoDienThoai.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        dcNgayBatDau.setDate(DateHelper.now());
        dcNgayKetThuc.setDate(DateHelper.now());
        txtGhiChu.setText("");
        rdoNam.setSelected(true);
    }
    
    
    void editKhachHang(){
        int viTri =tblKhachHang.getSelectedRow();
        if (viTri == -1) {
            return ;
        }
        txtMaKhachHang.setText(tblKhachHang.getValueAt(viTri, 0).toString());
        txtHoTen.setText(tblKhachHang.getValueAt(viTri, 1).toString());
        txtSoDienThoai.setText(tblKhachHang.getValueAt(viTri, 2).toString());
        txtEmail.setText(tblKhachHang.getValueAt(viTri, 3).toString());
        if (tblKhachHang.getValueAt(viTri, 4).toString().equals("Nam")) {
            rdoNam.setSelected(true);
        }else{
            rdoNu.setSelected(true);
        }
        txtDiaChi.setText(tblKhachHang.getValueAt(viTri,5).toString());
    }
    
    void editLichDat(){
        int viTri =tblLichDat.getSelectedRow();
        if (viTri == -1) {
            return ;
        } 
        KhachHang kh = khdao.selectByID((String) tblLichDat.getValueAt(viTri, 4));
        dcNgayBatDau.setDate(DateHelper.toDate(tblLichDat.getValueAt(viTri, 1).toString()));
        dcNgayKetThuc.setDate(DateHelper.toDate(tblLichDat.getValueAt(viTri, 2).toString()));
        txtGhiChu.setText(tblLichDat.getValueAt(viTri, 3).toString());
        txtMaKhachHang.setText(tblLichDat.getValueAt(viTri, 4).toString());
        cbb.setSelectedItem(tblLichDat.getValueAt(viTri, 6).toString());
        txtHoTen.setText(kh.getHoTen());
        txtSoDienThoai.setText(kh.getSoDienThoai());
        txtEmail.setText(kh.getEmail());
        txtDiaChi.setText(kh.getDiaChi());
        if (kh.getGioiTinh()) {
            rdoNam.setSelected(true);
        }else{
            rdoNu.setSelected(true);
        }
        cbb.getSelectedItem();
    }

    void suaLich() {
        LichDat ld = getFormDatLich();
        if (ld == null) {
            return ;
        }
        int viTri = tblLichDat.getSelectedRow();
        if (viTri ==-1) {
            return ;
        }
        ld.setMaLichDat((int) tblLichDat.getValueAt(viTri,0));
        ld.setTrangThai(tblLichDat.getValueAt(viTri, 7).toString());
        try {
            lddao.update(ld);
            DialogHelper.alert(this, "Sửa lịch thành công");
            fillTableLichDat(true);
        } catch (Exception e) {
        }
    }
    void updateStatus(boolean trangThai){
        txtMaKhachHang.setEditable(trangThai);
        txtHoTen.setEditable(trangThai);
        txtSoDienThoai.setEditable(trangThai);
        txtEmail.setEditable(trangThai);
        txtDiaChi.setEditable(trangThai);
    }

    void huyLich() {
        int viTri = tblLichDat.getSelectedRow();
        if (viTri == -1) {
            return ;
        }
        if (tblLichDat.getValueAt(viTri, 7).toString().equalsIgnoreCase("Đã tạo hóa đơn")) {
            DialogHelper.alert(this,"Lịch này đã tạo hóa đơn ");
            return ;
        }
        int maLichDat = (int) tblLichDat.getValueAt(viTri, 0);
        KhachHang kh = khdao.selectByID(tblLichDat.getValueAt(viTri, 4).toString());
        try {
            if (DialogHelper.confirm(this,"Họ tên :"+kh.getHoTen()+"\nSố điện thoại :"+kh.getSoDienThoai()+"\nNgày đặt lịch :"+tblLichDat.getValueAt(viTri,1).toString()
                                +"\nNgày cắt :"+tblLichDat.getValueAt(viTri,2).toString()+"\nGiờ đặt :"
                                +tblLichDat.getValueAt(viTri, 6).toString()+"\nBạn có thực sự muốn hủy lịch này ?")) {
                lddao.huyLich(false, maLichDat);
            DialogHelper.alert(this, "Hủy lịch thành công !");
            fillTableLichDat(true);
            }
        } catch (Exception e) {
        }
    }
        void taodatLich() {
        LichDat ld = getFormDatLich();
        if (ld == null ) {
            return ;
        }
        try {
            lddao.insert(ld);
            DialogHelper.alert(this, "Tạo lịch đặt thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void taoKhachHang(){
        KhachHang kh = getFormKhachHang();
        if (kh == null) {
            return ;
        }
        try {
            if (checkKey() == 0) {
                khdao.insert(kh);
            }else{
                khdao.update(kh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void taoLichDatVaKhachHang(){
        taoKhachHang();
        taodatLich();
        fillTableLichDat(true);
        fillTableKhachHang();
    }
    int checkKey(){
        int kt = 0 ;
        ArrayList<KhachHang> list = khdao.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaKhachHang().equals(txtMaKhachHang.getText())) {
                kt = 1 ;
                break ;
            }
        }
        return kt ;
    }
    void taoHoaDon(){
        HoaDon hd = new HoaDon();
        int viTri = tblLichDat.getSelectedRow();
        if (viTri == -1) {
            return ;
        }
        hd.setNgayLapHoaDon(DateHelper.now());
        hd.setNgayThanhToan(DateHelper.now());
        hd.setMaKhachHang(tblLichDat.getValueAt(viTri,4).toString());
        hd.setMaNhanVien(ShareHelper.user.getMaNhanVien());
        hd.setTrangThai(false);
        try {
            hddao.insert(hd);
            DialogHelper.alert(this, "Tạo hóa đơn thành công");
            lddao.updateStatus("Đã tạo hóa đơn", (Integer) tblLichDat.getValueAt(viTri,0));
            fillTableLichDat(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
