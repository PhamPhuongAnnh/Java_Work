package de_tai__so_5;

import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.geometry.Side;

public class ThuNhapForm extends javax.swing.JFrame {

    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV_DATPHONG = curentDir + separator + "data" + separator + "DatPhong.csv";
    private static final String PATH_FILE_CSV_khachHang = curentDir + separator + "data" + separator + "KhachHang.csv";
    private static final String PATH_FILE_CSV_Phong = curentDir + separator + "data" + separator + "Phong.csv";

    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    File fKH = new File(PATH_FILE_CSV_khachHang);
    File fDP = new File(PATH_FILE_CSV_DATPHONG);
    File fP = new File(PATH_FILE_CSV_Phong);

    DocGhiFile dc = new DocGhiFile();
    List<DatPhong> danhSacgDatPhong = new ArrayList<>();
    List<khachHang> danhSachKhaHang = new ArrayList<>();
    List<Phong> danhSachPhong = new ArrayList<>();

    public double tongTien;

    public ThuNhapForm() {
        initComponents();
        if (fKH.exists() && fDP.exists()&&  fP.exists()) {
            try {
                danhSacgDatPhong = dc.docFileDatPhong();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNgay2 = new com.toedter.calendar.JDateChooser();
        HienThi = new javax.swing.JButton();
        txtTongTienNgay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        HienThi1 = new javax.swing.JButton();
        txtTongTienThang = new javax.swing.JTextField();
        txtNgay4 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thu nhập của khách sạn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(42, 62, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nhập ngày: ");

        txtNgay2.setDateFormatString("dd:MM:yyyy HH:mm:ss");

        HienThi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HienThi.setText("Hiển thị ");
        HienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HienThiActionPerformed(evt);
            }
        });

        txtTongTienNgay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTongTienNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienNgayActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nhập tháng:");

        HienThi1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HienThi1.setText("Hiển thị ");
        HienThi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HienThi1ActionPerformed(evt);
            }
        });

        txtTongTienThang.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTongTienThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienThangActionPerformed(evt);
            }
        });

        txtNgay4.setDateFormatString("MM:yyyy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(348, 348, 348)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HienThi1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTongTienThang)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNgay4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTongTienNgay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(txtNgay2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtNgay2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63)
                .addComponent(txtTongTienNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(HienThi1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgay4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(txtTongTienThang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void TongTienNgay() {
        for (DatPhong item : danhSacgDatPhong) {
            if(df.format(item.getNgayTra()).equals(df.format(txtNgay2.getDate()))){
                tongTien += item.getTongTien();
            }
        }

    }

    public void TongTienThang() {
        DateFormat format = new SimpleDateFormat("MM-yyyy");
        for (DatPhong item : danhSacgDatPhong) {
             if(format.format(item.getNgayTra()).equals(format.format(txtNgay4.getDate()))){
                tongTien += item.getTongTien();
            }
            
        }
    }
    private void txtTongTienNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienNgayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTienNgayActionPerformed

    private void HienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HienThiActionPerformed
        TongTienNgay();
        txtTongTienNgay.setText(Double.toString(tongTien));
      
        
    }//GEN-LAST:event_HienThiActionPerformed

    private void HienThi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HienThi1ActionPerformed
        TongTienThang();
//        System.out.println(txtNgay4.getDate());
        txtTongTienThang.setText(Double.toString(tongTien));
    }//GEN-LAST:event_HienThi1ActionPerformed

    private void txtTongTienThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienThangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongTienThangActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThuNhapForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HienThi;
    private javax.swing.JButton HienThi1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser txtNgay2;
    private com.toedter.calendar.JDateChooser txtNgay4;
    private javax.swing.JTextField txtTongTienNgay;
    private javax.swing.JTextField txtTongTienThang;
    // End of variables declaration//GEN-END:variables
}
