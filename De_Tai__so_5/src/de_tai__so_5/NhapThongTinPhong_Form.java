package de_tai__so_5;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NhapThongTinPhong_Form extends javax.swing.JFrame {

    DefaultTableModel tableModel;
    int id = 0;
    List<Phong> danhPhong = new ArrayList<>();
    DocGhiFile dc = new DocGhiFile();
    private static final String curentDir = System.getProperty("user.dir");
    private static final String separator = File.separator;
    private static final String PATH_FILE_CSV_Phong = curentDir + separator + "data" + separator + "Phong.csv";
    public static File f = new File(PATH_FILE_CSV_Phong);

    public NhapThongTinPhong_Form() {
        this.dispose();
        initComponents();
        this.setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) tblPhong.getModel();
        
        if (f.exists()) {
            try {
                danhPhong = dc.docFilePhong();
                String ma = danhPhong.get(danhPhong.size() - 1).getMaPhong();
                id = Integer.parseInt(ma.substring(2)) + 1;
                hienTHi(danhPhong);
            } catch (CsvValidationException ex) {
                Logger.getLogger(NhapThongTinPhong_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void resetForm() {
        if (f.exists()) {
            try {
                danhPhong = dc.docFilePhong();
                String ma = danhPhong.get(danhPhong.size() - 1).getMaPhong();
                id = Integer.parseInt(ma.substring(2)) + 1;
                hienTHi(danhPhong);
            } catch (CsvValidationException ex) {
                Logger.getLogger(NhapThongTinPhong_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void hienTHi(List<Phong> phong) {
        tableModel.setRowCount(0);
        for (Phong item : phong) {
            String maPhong = item.getMaPhong();
            int SoTang = item.getSoTang();
            int sucChua = item.getLoaiPhong();
            String trangThai = item.getTrangThai();
            double giaPhong = item.getGiaPhong();
            tableModel.addRow(new Object[]{maPhong, SoTang, sucChua,trangThai, giaPhong});
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
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTrangThai = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSoTang = new javax.swing.JTextField();
        txtGiaPhong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhong = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        ThemPhong = new javax.swing.JButton();
        loaiPhong = new javax.swing.JComboBox<>();
        Luu = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        ChinhSua = new javax.swing.JButton();
        Loc = new javax.swing.JButton();
        SapXep = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        txtTrangThai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTrangThai.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTrangThai.setToolTipText("");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nhập Thông Tin Phòng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(42, 62, 80));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Số Tầng:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Loại Phòng:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Giá Phòng:");

        txtSoTang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSoTang.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSoTang.setToolTipText("");

        txtGiaPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGiaPhong.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtGiaPhong.setToolTipText("");

        tblPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phòng", "Số Tầng ", "Loại Phòng", "Trạng thái", "Giá Phòng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPhong);
        if (tblPhong.getColumnModel().getColumnCount() > 0) {
            tblPhong.getColumnModel().getColumn(0).setResizable(false);
            tblPhong.getColumnModel().getColumn(1).setResizable(false);
            tblPhong.getColumnModel().getColumn(2).setResizable(false);
        }

        ThemPhong.setBackground(new java.awt.Color(204, 204, 204));
        ThemPhong.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ThemPhong.setIcon(new javax.swing.ImageIcon("D:\\img\\thêm.png")); // NOI18N
        ThemPhong.setText("Thêm Phòng");
        ThemPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThemPhongMouseClicked(evt);
            }
        });
        ThemPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemPhongActionPerformed(evt);
            }
        });

        loaiPhong.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        Luu.setBackground(new java.awt.Color(204, 204, 204));
        Luu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Luu.setIcon(new javax.swing.ImageIcon("D:\\img\\save.png")); // NOI18N
        Luu.setText("Lưu ");
        Luu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LuuMouseClicked(evt);
            }
        });
        Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(204, 204, 204));
        Reset.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Reset.setIcon(new javax.swing.ImageIcon("D:\\img\\new.png")); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        ChinhSua.setBackground(new java.awt.Color(204, 204, 204));
        ChinhSua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ChinhSua.setIcon(new javax.swing.ImageIcon("D:\\img\\chinhSua.png")); // NOI18N
        ChinhSua.setText("Chỉnh sửa");
        ChinhSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChinhSuaMouseClicked(evt);
            }
        });
        ChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChinhSuaActionPerformed(evt);
            }
        });

        Loc.setBackground(new java.awt.Color(204, 204, 204));
        Loc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Loc.setIcon(new javax.swing.ImageIcon("D:\\img\\timkiem1.png")); // NOI18N
        Loc.setText("Lọc");
        Loc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LocMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LocMouseEntered(evt);
            }
        });
        Loc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocActionPerformed(evt);
            }
        });

        SapXep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SapXep.setText("Sắp xếp");
        SapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SapXepActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Người");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("VNĐ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoTang, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtGiaPhong, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(loaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1079, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ThemPhong)
                .addGap(122, 122, 122)
                .addComponent(Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(Loc)
                .addGap(163, 163, 163)
                .addComponent(ChinhSua)
                .addGap(176, 176, 176)
                .addComponent(SapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(8, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(184, 184, 184))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoTang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(txtGiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SapXep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChinhSua))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ThemPhong)
                        .addComponent(Luu)
                        .addComponent(Reset)
                        .addComponent(Loc)))
                .addGap(31, 31, 31))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void ThemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemPhongActionPerformed
        String maPhong = "MP" + id++;
        System.out.println(maPhong);
        int soTang = Integer.parseInt(txtSoTang.getText());
        int sucChua = Integer.parseInt(loaiPhong.getSelectedItem().toString());
        double giaPhong = Double.parseDouble(txtGiaPhong.getText());
        String trangThai = "Con Trong";
        Phong phong = new Phong(maPhong, soTang, soTang, trangThai, giaPhong);
        danhPhong.add(phong);
        tableModel.addRow(new Object[]{maPhong, soTang, sucChua, trangThai, giaPhong});
    }//GEN-LAST:event_ThemPhongActionPerformed

    private void ThemPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThemPhongMouseClicked

    }//GEN-LAST:event_ThemPhongMouseClicked

    private void LuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LuuMouseClicked
        f.delete();
        dc.ghiFilePhong(danhPhong);
    }//GEN-LAST:event_LuuMouseClicked

    private void LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuActionPerformed

    }//GEN-LAST:event_LuuActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        txtSoTang.setText("");
        loaiPhong.setSelectedIndex(0);
        txtGiaPhong.setText("");
        resetForm();
    }//GEN-LAST:event_ResetActionPerformed

    private void ChinhSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChinhSuaMouseClicked
        ChinhSuaPhongForm.main();
        this.dispose();
    }//GEN-LAST:event_ChinhSuaMouseClicked

    private void ChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChinhSuaActionPerformed

    }//GEN-LAST:event_ChinhSuaActionPerformed

    private void LocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LocMouseClicked
        LocThongTinPhong.main();
    }//GEN-LAST:event_LocMouseClicked

    private void LocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocActionPerformed

    private void LocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LocMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LocMouseEntered

    private void SapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SapXepActionPerformed
        Collections.sort(danhPhong, new TangComparator());
        hienTHi(danhPhong);
    }//GEN-LAST:event_SapXepActionPerformed

    public static void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NhapThongTinPhong_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChinhSua;
    private javax.swing.JButton Loc;
    private javax.swing.JButton Luu;
    private javax.swing.JButton Reset;
    private javax.swing.JButton SapXep;
    private javax.swing.JButton ThemPhong;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> loaiPhong;
    private javax.swing.JTable tblPhong;
    private javax.swing.JTextField txtGiaPhong;
    private javax.swing.JTextField txtSoTang;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
