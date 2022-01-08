/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import connection.LoadData;
import controller.Controller;
import java.util.Date;
import java.util.regex.Matcher;
import model.KhachHang;
import model.TaiKhoan;
import view.DangNhap;

/**
 *
 * @author DELL
 */
public class GiaoDienDangKy extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienDangKy
     */
    public GiaoDienDangKy() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ipEmail = new javax.swing.JTextField();
        ipName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ipSDT = new javax.swing.JTextField();
        ipTenDN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        baoloiSDT = new javax.swing.JLabel();
        baoloimail = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        baoloiName = new javax.swing.JLabel();
        baoloiTenDN = new javax.swing.JLabel();
        ipPass = new javax.swing.JPasswordField();
        baoloiMK = new javax.swing.JLabel();
        baoloiXacThuc = new javax.swing.JLabel();
        ipXacThuc = new javax.swing.JPasswordField();
        jDateNgaySinh = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Kí");
        setLocation(new java.awt.Point(0, 0));

        jLabel1.setText("Tên Đăng Nhập");

        jLabel2.setText("Mật Khẩu");

        jLabel3.setText("Họ và Tên");

        jLabel4.setText("Ngày Sinh");

        ipEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ipEmailMouseClicked(evt);
            }
        });
        ipEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipEmailActionPerformed(evt);
            }
        });

        ipName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ipName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ipNameMouseClicked(evt);
            }
        });

        jLabel5.setText("SDT");

        ipSDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ipSDTMouseClicked(evt);
            }
        });
        ipSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipSDTActionPerformed(evt);
            }
        });

        ipTenDN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ipTenDNMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("ĐĂNG KÍ TÀI KHOẢN");

        jLabel7.setText("Xác thực Mật Khẩu");

        jLabel8.setText("Email");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Lưu đăng kí");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("<HTML><u>Đăng Nhập</u></HTML>");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        baoloiSDT.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        baoloiSDT.setForeground(new java.awt.Color(255, 51, 51));

        baoloimail.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        baoloimail.setForeground(new java.awt.Color(255, 51, 51));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("@gmail.com");

        baoloiName.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        baoloiName.setForeground(new java.awt.Color(255, 51, 51));

        baoloiTenDN.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        baoloiTenDN.setForeground(new java.awt.Color(255, 51, 51));

        ipPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ipPassMouseClicked(evt);
            }
        });

        baoloiMK.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        baoloiMK.setForeground(new java.awt.Color(255, 51, 51));

        baoloiXacThuc.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        baoloiXacThuc.setForeground(new java.awt.Color(255, 51, 51));

        ipXacThuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ipXacThucMouseClicked(evt);
            }
        });

        jDateNgaySinh.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jDateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(baoloiSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(ipSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ipName, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(baoloiName, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(baoloiTenDN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(baoloimail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(baoloiMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(baoloiXacThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ipEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10))
                                            .addComponent(ipTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ipPass, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ipXacThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 9, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(1, 1, 1)
                .addComponent(baoloiName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(ipSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(baoloiSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baoloimail)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addComponent(baoloiTenDN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(1, 1, 1)
                .addComponent(baoloiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ipXacThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baoloiXacThuc)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ipEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipEmailActionPerformed

    private void ipSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipSDTActionPerformed
      
    }//GEN-LAST:event_ipSDTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       if(ipName.getText().length() == 0)
           baoloiName.setText("Họ Tên không được để trống");
        String str = ipSDT.getText();
       if (str.length() != 10) 
            baoloiSDT.setText("Số điện thoại không hợp lệ");
       for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                 baoloiSDT.setText("Số điện thoại không hợp lệ");
        } // TODO add your handling code here:
       
       if(ipEmail.getText().length() == 0)
            baoloimail.setText("Email không hợp lệ");
       
       String name = ipTenDN.getText();
       if(name.length() == 0)
           baoloiTenDN.setText("Tên Đăng Nhập không được để trống");
       else{
           LoadData.loadTableTaiKhoan();
           int index=-1;
            for (TaiKhoan tk : Controller.arrayListTaiKhoan) {
                 if (name.equals(tk.getTenDangNhap().trim())) 
                     index = Controller.arrayListTaiKhoan.indexOf(tk);
            }
            if(index != -1)
                baoloiTenDN.setText("Tên Đăng Nhập đã tồn tại");
       }
       
       if(ipPass.getText().length() ==0)
           baoloiMK.setText("Mật khẩu không được để trống");
       if(!ipXacThuc.getText().equals(ipPass.getText()) ) {
           baoloiXacThuc.setText("Xác thực mật khẩu không trùng khớp");
       }
       TaiKhoan tk = new TaiKhoan(ipTenDN.getText(), ipPass.getText(), "guest");
        Date dateFromDateChooser = jDateNgaySinh.getDate();
        String dateString = String.format("%1$td/%1$tm/%1$tY", dateFromDateChooser);
        KhachHang kh = new KhachHang(ipSDT.getText(),ipName.getText(),ipTenDN.getText(), ipEmail.getText(),dateString);
        
        connection.InsertData.insertTaiKhoan(tk);
        connection.InsertData.insertKhachHang(kh);
        new DangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ipSDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ipSDTMouseClicked
        baoloiSDT.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ipSDTMouseClicked

    private void ipEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ipEmailMouseClicked
        baoloimail.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_ipEmailMouseClicked

    private void ipNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ipNameMouseClicked
        baoloiName.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ipNameMouseClicked

    private void ipTenDNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ipTenDNMouseClicked
        baoloiTenDN.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ipTenDNMouseClicked

    private void ipPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ipPassMouseClicked
        baoloiMK.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ipPassMouseClicked

    private void ipXacThucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ipXacThucMouseClicked
         baoloiXacThuc.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_ipXacThucMouseClicked

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        new DangNhap().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MousePressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienDangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baoloiMK;
    private javax.swing.JLabel baoloiName;
    private javax.swing.JLabel baoloiSDT;
    private javax.swing.JLabel baoloiTenDN;
    private javax.swing.JLabel baoloiXacThuc;
    private javax.swing.JLabel baoloimail;
    private javax.swing.JTextField ipEmail;
    private javax.swing.JTextField ipName;
    private javax.swing.JPasswordField ipPass;
    private javax.swing.JTextField ipSDT;
    private javax.swing.JTextField ipTenDN;
    private javax.swing.JPasswordField ipXacThuc;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
