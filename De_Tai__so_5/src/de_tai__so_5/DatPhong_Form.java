/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de_tai__so_5;

import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DatPhong_Form extends javax.swing.JFrame {

    DefaultTableModel tableModel;
    int id = 0;
    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV_DATPHONG = curentDir + separator + "data" + separator + "DatPhong.csv";
    private static final String PATH_FILE_CSV_khachHang = curentDir + separator + "data" + separator + "KhachHang.csv";
    private static final String PATH_FILE_CSV_Phong = curentDir + separator + "data" + separator + "Phong.csv";

    DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    DocGhiFile dc = new DocGhiFile();
    List<DatPhong> danhSachDatPhong = new ArrayList<>();
    List<khachHang> danhSachKhaHang = new ArrayList<>();
    List<Phong> danhSachPhong = new ArrayList<>();

    File fKH = new File(PATH_FILE_CSV_khachHang);
    File fDP = new File(PATH_FILE_CSV_DATPHONG);
    File fP = new File(PATH_FILE_CSV_Phong);

    public DatPhong_Form() {
        initComponents();
        this.setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tblDatPhong.getModel();

        if (fDP.exists()) {
            try {
                danhSachDatPhong = dc.docFileDatPhong();
                String ma = danhSachDatPhong.get(danhSachDatPhong.size() - 1).getMaDatPhong();
                id = Integer.parseInt(ma.substring(3)) + 1;
            } catch (CsvValidationException ex) {
                Logger.getLogger(HoaDon_form.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(HoaDon_form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (fKH.exists()) {
            try {
                danhSachKhaHang = dc.docFile();

            } catch (CsvValidationException ex) {
                Logger.getLogger(HoaDon_form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (fP.exists()) {
            try {
                danhSachPhong = dc.docFilePhong();
            } catch (CsvValidationException ex) {
                Logger.getLogger(HoaDon_form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public int extractNumber(String str) {
        if (str == null) {
            return -1;
        }
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char dt = str.charAt(i);
            if (dt == '0' || dt == '1' || dt == '2' || dt == '3' || dt == '4' || dt == '5' || dt == '6' || dt == '7' || dt == '8' || dt == '9') {
                found = true;
                break;
            }
        }
        if (found == false) {
            return 1;
        } else {
            return 0;
        }
    }

    public void hienThi(List<DatPhong> danhSachDatPhong) {
        tableModel.setRowCount(0);
        for (DatPhong item : danhSachDatPhong) {
            String maDatPhong = item.getMaDatPhong();
            String maphong = item.getMaPhong();
            String maKhachHang = item.getMaKhachHang();
            Date ngayDat = item.getNgayDat();
            String ngayDat1 = df.format(ngayDat);
            Date ngayTra = item.getNgayTra();
            String ngayTra1 = df.format(ngayTra);
            double tongTien = item.getTongTien();
            tableModel.addRow(new Object[]{maDatPhong, maphong, maKhachHang, ngayDat1, ngayTra1, tongTien});
        }
    }

    public void chuyenTrangThai(List<Phong> DanhSachDatPhong) {
        for (Phong item : DanhSachDatPhong) {
            if (item.getMaPhong().equals(txtMaPhong.getText())) {
                item.setTrangThai("Da Dat");
            }
        }
        fP.delete();
        dc.ghiFilePhong(danhSachPhong);
    }

    public void kiemTraMaPhong() {
        boolean flag = false;
        for (Phong item : danhSachPhong) {
            if (item.getMaPhong().equals(txtMaPhong.getText())) {
                flag = true;
            }
        }
        if (flag == false) {
            JOptionPane.showMessageDialog(rootPane, "Phòng không tồn tại. Mời nhập lại vd: MP1");
            txtMaPhong.requestFocus();
        }
    }

    public void kiemTraMaKhachHang() {
        boolean flag = false;
        for (khachHang item : danhSachKhaHang) {
            if (item.getMaKhachHang().equals(txtMaKhachHang.getText())) {
                flag = true;
            }
        }
        if (flag == false) {
            JOptionPane.showMessageDialog(rootPane, "Khách Hàng không tồn tại. Mời nhập lại vd: KH1");
            txtMaPhong.requestFocus();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatPhong = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnDatPhong = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        btnLuuFile = new javax.swing.JButton();
        txtNgayTra = new com.toedter.calendar.JDateChooser();
        txtNgayDat = new com.toedter.calendar.JDateChooser();
        btnChinhSua = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Đặt Phòng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(48, 62, 80));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnReset.setBackground(new java.awt.Color(204, 204, 204));
        btnReset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon("D:\\img\\new.png")); // NOI18N
        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tblDatPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblDatPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ĐP", "Mã Phòng", "Mã KH", "Ngày Đặt", "Ngày Trả", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatPhong);
        if (tblDatPhong.getColumnModel().getColumnCount() > 0) {
            tblDatPhong.getColumnModel().getColumn(0).setMaxWidth(80);
            tblDatPhong.getColumnModel().getColumn(1).setMaxWidth(80);
            tblDatPhong.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày Đặt:");

        txtMaPhong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaPhongFocusLost(evt);
            }
        });
        txtMaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhongActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã Phòng:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ngày Trả:");

        btnDatPhong.setBackground(new java.awt.Color(204, 204, 204));
        btnDatPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDatPhong.setIcon(new javax.swing.ImageIcon("D:\\img\\thêm.png")); // NOI18N
        btnDatPhong.setText("Đặt Phòng");
        btnDatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatPhongActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã Khách Hàng:");

        txtMaKhachHang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaKhachHangFocusLost(evt);
            }
        });
        txtMaKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKhachHangActionPerformed(evt);
            }
        });

        btnLuuFile.setBackground(new java.awt.Color(204, 204, 204));
        btnLuuFile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLuuFile.setIcon(new javax.swing.ImageIcon("D:\\img\\save.png")); // NOI18N
        btnLuuFile.setText("Lưu ");
        btnLuuFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuFileMouseClicked(evt);
            }
        });
        btnLuuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuFileActionPerformed(evt);
            }
        });

        txtNgayTra.setDateFormatString("dd-MM-yyyy HH:mm:ss");

        txtNgayDat.setDateFormatString("dd-MM-yyyy HH:mm:ss");

        btnChinhSua.setBackground(new java.awt.Color(204, 204, 204));
        btnChinhSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnChinhSua.setIcon(new javax.swing.ImageIcon("D:\\img\\chinhSua.png")); // NOI18N
        btnChinhSua.setText("Chỉnh sửa ");
        btnChinhSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChinhSuaMouseClicked(evt);
            }
        });
        btnChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSuaActionPerformed(evt);
            }
        });

        btnThanhToan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThanhToan.setText("Thanh Toán");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNgayTra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNgayDat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDatPhong)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnLuuFile, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(btnReset)
                        .addGap(110, 110, 110)
                        .addComponent(btnChinhSua)
                        .addGap(94, 94, 94)
                        .addComponent(btnThanhToan)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNgayDat, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnDatPhong)
                    .addComponent(btnLuuFile)
                    .addComponent(btnChinhSua)
                    .addComponent(btnThanhToan))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void resetForm() {
        if (fKH.exists() && fDP.exists() && fP.exists()) {
            try {
                danhSachDatPhong = dc.docFileDatPhong();
                hienThi(danhSachDatPhong);
                String ma = danhSachDatPhong.get(danhSachDatPhong.size() - 1).getMaDatPhong();
                id = Integer.parseInt(ma.substring(3)) + 1;
            } catch (CsvValidationException ex) {
                Logger.getLogger(HoaDon_form.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(HoaDon_form.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                danhSachKhaHang = dc.docFile();
            } catch (CsvValidationException ex) {
                Logger.getLogger(HoaDon_form.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                danhSachPhong = dc.docFilePhong();
            } catch (CsvValidationException ex) {
                Logger.getLogger(HoaDon_form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMaPhong.setText("");
        txtMaKhachHang.setText("");
        Date date = java.util.Calendar.getInstance().getTime();
        txtNgayDat.setDate(date);
        txtNgayTra.setDate(date);
        resetForm();
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtMaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhongActionPerformed
        //xử lý ngoại lệ 
    }//GEN-LAST:event_txtMaPhongActionPerformed

    public double tongTien(double thoiGian, double giaPhong) {
        double tongTien = 0;
        if (thoiGian < 24) {
            if (thoiGian > 0 && thoiGian <= 2) {
                tongTien = giaPhong * 15 / 100;
            } else if (thoiGian > 2 && thoiGian <= 5) {
                tongTien = giaPhong * 25 / 100;
            } else if (thoiGian > 5) {
                tongTien = giaPhong * thoiGian * 10 / 100;
            }
        } else if (thoiGian >= 24) {
            int a = (int) (thoiGian / 24);
            double b = thoiGian - (double) 24 * a;
            System.out.println(a);
            if (b > 0 && b <= 2) {
                tongTien = giaPhong * 15 / 100 + giaPhong * a;
            } else if (b > 2 && b <= 5) {
                tongTien = giaPhong * 25 / 100 + giaPhong * a;
            } else if (b > 5) {
                tongTien = giaPhong * 10 / 100 * b + giaPhong * a;
            } else if (b == 0) {
                tongTien = giaPhong * a;
            }
        }

        return tongTien;
    }
    private void btnDatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatPhongActionPerformed

        String MaDatPhong = "MDP" + id++;
        String MaPhong = txtMaPhong.getText();
        chuyenTrangThai(danhSachPhong);
        String maKhachHang = txtMaKhachHang.getText();
        Date NgayDat = txtNgayDat.getDate();
        String ngayDat = df.format(NgayDat);
        Date NgayTra = txtNgayTra.getDate();
        String ngayTra = df.format(NgayTra);
        //////////lam tien
        long a = NgayTra.getTime() - NgayDat.getTime();
        double phut = a / (60 * 1000) % 60;
        double gio = a / (60 * 60 * 1000);
        double thoiGian = phut / 60 + gio;
        System.out.println(thoiGian);
        double giaPhong = 0;
        for (Phong item : danhSachPhong) {
            if (item.getMaPhong().equals(txtMaPhong.getText())) {
                giaPhong = item.getGiaPhong();
            }
        }
        System.out.println(giaPhong);
        double TongTIen = tongTien(thoiGian, giaPhong);
        ////////////////////////
        System.out.println(TongTIen);

        DatPhong datPhong = new DatPhong(MaDatPhong, MaPhong, maKhachHang, NgayDat, NgayTra, TongTIen);
        danhSachDatPhong.add(datPhong);
        tableModel.addRow(new Object[]{MaDatPhong, MaPhong, maKhachHang, ngayDat, ngayTra, TongTIen});

    }//GEN-LAST:event_btnDatPhongActionPerformed

    private void txtMaKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKhachHangActionPerformed

    }//GEN-LAST:event_txtMaKhachHangActionPerformed

    private void btnLuuFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuFileMouseClicked
        fDP.delete();
        dc.ghiFileDatPhong(danhSachDatPhong);
        JOptionPane.showMessageDialog(rootPane, "Lưu thành công");
    }//GEN-LAST:event_btnLuuFileMouseClicked

    private void btnLuuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuFileActionPerformed

    }//GEN-LAST:event_btnLuuFileActionPerformed

    private void btnChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSuaActionPerformed
        ChinhSuaDatPhong.main();
    }//GEN-LAST:event_btnChinhSuaActionPerformed

    private void btnChinhSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChinhSuaMouseClicked

    }//GEN-LAST:event_btnChinhSuaMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked

    }//GEN-LAST:event_btnResetMouseClicked
//kiểm tra ngoại lệ
    private void txtMaPhongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaPhongFocusLost
        kiemTraMaPhong();
    }//GEN-LAST:event_txtMaPhongFocusLost

    private void txtMaKhachHangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaKhachHangFocusLost
        kiemTraMaKhachHang();
    }//GEN-LAST:event_txtMaKhachHangFocusLost

    public static void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatPhong_Form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChinhSua;
    private javax.swing.JButton btnDatPhong;
    private javax.swing.JButton btnLuuFile;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblDatPhong;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaPhong;
    private com.toedter.calendar.JDateChooser txtNgayDat;
    private com.toedter.calendar.JDateChooser txtNgayTra;
    // End of variables declaration//GEN-END:variables
}
