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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LocThongTinPhong extends javax.swing.JFrame {

    DefaultTableModel tableModel;
    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV_Phong = curentDir + separator + "data" + separator + "Phong.csv";
    private static final String PATH_FILE_CSV_DATPHONG = curentDir + separator + "data" + separator + "DatPhong.csv";
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    DocGhiFile dc = new DocGhiFile();
    List<Phong> danhPhong = new ArrayList<>();
    File f = new File(PATH_FILE_CSV_Phong);
    File fDP = new File(PATH_FILE_CSV_DATPHONG);
    List<DatPhong> danhSachDatPhong = new ArrayList<>();

    public LocThongTinPhong() {
        initComponents();
        tableModel = (DefaultTableModel) jTable1.getModel();
        try {
            danhSachDatPhong = dc.docFileDatPhong();
        } catch (CsvValidationException ex) {
            Logger.getLogger(LocThongTinPhong.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(LocThongTinPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTimMA = new javax.swing.JTextField();
        ButunReset4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        timSoTang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TimTrangThai = new javax.swing.JComboBox<>();
        HTSoTang = new javax.swing.JButton();
        HTtrangThai = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNgayTra = new com.toedter.calendar.JDateChooser();
        HTNgayTra = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtLoaiPhong = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        HTloaiPhong = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tìm Kiếm thông tin ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(48, 62, 80));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nhập mã Phòng:");

        txtTimMA.setToolTipText("");
        txtTimMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimMAActionPerformed(evt);
            }
        });

        ButunReset4.setBackground(new java.awt.Color(204, 204, 204));
        ButunReset4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButunReset4.setIcon(new javax.swing.ImageIcon("D:\\img\\hienthi.png")); // NOI18N
        ButunReset4.setText("Hiển thị");
        ButunReset4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButunReset4MouseClicked(evt);
            }
        });
        ButunReset4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButunReset4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phòng", "Số Tầng", "Loại Phòng", "Trạng thái ", "Giá"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nhập số tâng:");

        timSoTang.setToolTipText("");
        timSoTang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                timSoTangFocusLost(evt);
            }
        });
        timSoTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timSoTangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nhập trạng thái:");

        TimTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Con Trong", "Da Dat", "Dat Truoc" }));

        HTSoTang.setBackground(new java.awt.Color(204, 204, 204));
        HTSoTang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HTSoTang.setIcon(new javax.swing.ImageIcon("D:\\img\\hienthi.png")); // NOI18N
        HTSoTang.setText("Hiển thị");
        HTSoTang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HTSoTangMouseClicked(evt);
            }
        });
        HTSoTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTSoTangActionPerformed(evt);
            }
        });

        HTtrangThai.setBackground(new java.awt.Color(204, 204, 204));
        HTtrangThai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HTtrangThai.setIcon(new javax.swing.ImageIcon("D:\\img\\hienthi.png")); // NOI18N
        HTtrangThai.setText("Hiển thị");
        HTtrangThai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HTtrangThaiMouseClicked(evt);
            }
        });
        HTtrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTtrangThaiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Loại Phòng:");

        txtNgayTra.setDateFormatString("dd-MM-yyyy HH:mm:ss");

        HTNgayTra.setBackground(new java.awt.Color(204, 204, 204));
        HTNgayTra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HTNgayTra.setIcon(new javax.swing.ImageIcon("D:\\img\\hienthi.png")); // NOI18N
        HTNgayTra.setText("Hiển thị");
        HTNgayTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HTNgayTraMouseClicked(evt);
            }
        });
        HTNgayTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTNgayTraActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nhập ngày trả:");

        txtLoaiPhong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Người");

        HTloaiPhong.setBackground(new java.awt.Color(204, 204, 204));
        HTloaiPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HTloaiPhong.setIcon(new javax.swing.ImageIcon("D:\\img\\hienthi.png")); // NOI18N
        HTloaiPhong.setText("Hiển thị");
        HTloaiPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HTloaiPhongMouseClicked(evt);
            }
        });
        HTloaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HTloaiPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timSoTang)
                    .addComponent(TimTrangThai, 0, 261, Short.MAX_VALUE)
                    .addComponent(txtTimMA)
                    .addComponent(txtNgayTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGap(91, 91, 91)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButunReset4)
                    .addComponent(HTSoTang)
                    .addComponent(HTtrangThai)
                    .addComponent(HTNgayTra)
                    .addComponent(HTloaiPhong))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimMA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButunReset4)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timSoTang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(HTSoTang)))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(HTtrangThai))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HTNgayTra)
                    .addComponent(txtNgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLoaiPhong)
                        .addComponent(jLabel7)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(HTloaiPhong)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimMAActionPerformed

    }//GEN-LAST:event_txtTimMAActionPerformed

    private void ButunReset4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButunReset4MouseClicked

        try {

            List<Phong> list = dc.docFilePhong();
            boolean flag = false;
            tableModel.setRowCount(0);

            for (Phong item : list) {
                if (item.getMaPhong().equals(txtTimMA.getText())) {
                    flag = true;
                    String maPhong = item.getMaPhong();
                    int soTang = item.getSoTang();
                    int loai = item.getLoaiPhong();
                    String trangThai = item.getTrangThai();
                    double gia = item.getGiaPhong();
                    tableModel.addRow(new Object[]{maPhong, soTang, loai, trangThai, gia});
                }
            }

            if (flag == false) {
                JOptionPane.showMessageDialog(rootPane, "Phòng không tồn tại");
            }
        } catch (CsvValidationException ex) {
            Logger.getLogger(ChinhSuaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButunReset4MouseClicked

    private void ButunReset4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButunReset4ActionPerformed

    }//GEN-LAST:event_ButunReset4ActionPerformed

    private void timSoTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timSoTangActionPerformed

    }//GEN-LAST:event_timSoTangActionPerformed

    private void HTSoTangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HTSoTangMouseClicked
        try {

            List<Phong> list = dc.docFilePhong();
            boolean flag = false;
            tableModel.setRowCount(0);

            for (Phong item : list) {
                if (item.getSoTang() == Integer.parseInt(timSoTang.getText())) {
                    flag = true;
                    String maPhong = item.getMaPhong();
                    int soTang = item.getSoTang();
                    int loai = item.getLoaiPhong();
                    String trangThai = item.getTrangThai();
                    double gia = item.getGiaPhong();
                    tableModel.addRow(new Object[]{maPhong, soTang, loai, trangThai, gia});
                }
            }

            if (flag == false) {
                JOptionPane.showMessageDialog(rootPane, "Số tầng khồn tồn tại");
            }
        } catch (CsvValidationException ex) {
            Logger.getLogger(ChinhSuaForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_HTSoTangMouseClicked

    private void HTSoTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTSoTangActionPerformed

    }//GEN-LAST:event_HTSoTangActionPerformed

    private void HTtrangThaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HTtrangThaiMouseClicked
        try {

            List<Phong> list = dc.docFilePhong();
            boolean flag = false;
            tableModel.setRowCount(0);
            for (Phong item : list) {
                if (item.getTrangThai().equals(TimTrangThai.getSelectedItem())) {
                    flag = true;
                    String maPhong = item.getMaPhong();
                    int soTang = item.getSoTang();
                    int loai = item.getLoaiPhong();
                    String trangThai = item.getTrangThai();
                    double gia = item.getGiaPhong();
                    tableModel.addRow(new Object[]{maPhong, soTang, loai, trangThai, gia});
                }
            }

            if (flag == false) {
                JOptionPane.showMessageDialog(rootPane, "Không có phòng thuộc trạng thái trên");
            }
        } catch (CsvValidationException ex) {
            Logger.getLogger(ChinhSuaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HTtrangThaiMouseClicked

    private void HTtrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTtrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HTtrangThaiActionPerformed

    private void HTNgayTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HTNgayTraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HTNgayTraMouseClicked

    private void HTNgayTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTNgayTraActionPerformed
        try {

            List<Phong> list = dc.docFilePhong();

            boolean flag = false;
            tableModel.setRowCount(0);
            
            for (DatPhong item : danhSachDatPhong){
                if (df.format(item.getNgayTra()).equals(df.format(txtNgayTra.getDate()))) {
                    flag = true;
                    for (Phong itemPhong : list) {
                        if (item.getMaPhong().equals(itemPhong.getMaPhong())) {
                            String maPhong = itemPhong.getMaPhong();
                            int soTang = itemPhong.getSoTang();
                            int loai = itemPhong.getLoaiPhong();
                            String trangThai = itemPhong.getTrangThai();
                            double gia = itemPhong.getGiaPhong();
                            tableModel.addRow(new Object[]{maPhong, soTang, loai, trangThai, gia});
                        }
                    }

                }
            }

            if (flag == false) {
                JOptionPane.showMessageDialog(rootPane, "Không có phòng thuộc trạng thái trên");
            }
        } catch (CsvValidationException ex) {
            Logger.getLogger(ChinhSuaForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_HTNgayTraActionPerformed

    private void HTloaiPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HTloaiPhongMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HTloaiPhongMouseClicked

    private void HTloaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HTloaiPhongActionPerformed
         try {

            List<Phong> list = dc.docFilePhong();
            boolean flag = false;
            tableModel.setRowCount(0);
            for (Phong item : list) {
                if (item.getTrangThai().equals(txtLoaiPhong.getSelectedItem())) {
                    flag = true;
                    String maPhong = item.getMaPhong();
                    int soTang = item.getSoTang();
                    int loai = item.getLoaiPhong();
                    String trangThai = item.getTrangThai();
                    double gia = item.getGiaPhong();
                    tableModel.addRow(new Object[]{maPhong, soTang, loai, trangThai, gia});
                }
            }

            if (flag == false) {
                JOptionPane.showMessageDialog(rootPane, "Không có loại phòng cần tìm");
            }
        } catch (CsvValidationException ex) {
            Logger.getLogger(ChinhSuaForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HTloaiPhongActionPerformed

    private void timSoTangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timSoTangFocusLost
         if (isNumeric(timSoTang.getText()) == false) {
            JOptionPane.showMessageDialog(rootPane, "Nhập số tâng đúng định dạng");
            timSoTang.requestFocus();
        }
    }//GEN-LAST:event_timSoTangFocusLost

    public static void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocThongTinPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButunReset4;
    private javax.swing.JButton HTNgayTra;
    private javax.swing.JButton HTSoTang;
    private javax.swing.JButton HTloaiPhong;
    private javax.swing.JButton HTtrangThai;
    private javax.swing.JComboBox<String> TimTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField timSoTang;
    private javax.swing.JComboBox<String> txtLoaiPhong;
    private com.toedter.calendar.JDateChooser txtNgayTra;
    private javax.swing.JTextField txtTimMA;
    // End of variables declaration//GEN-END:variables
}
