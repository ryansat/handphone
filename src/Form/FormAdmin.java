/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Database.DBConnection;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author HP
 */
public class FormAdmin extends javax.swing.JFrame {

    /** Creates new form FormAdmin */
    public FormAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            initDB();
            try {
                isiGrid();
            } catch (ParseException ex) {
                Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Driver tidak ditemukan", "Error Driver", JOptionPane.ERROR_MESSAGE);

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal Tersambung dengan MySQL", "Error SQL Connection", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tUser = new javax.swing.JTextField();
        tPassword = new javax.swing.JPasswordField();
        tNama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tKode = new javax.swing.JTextField();
        cbAkses = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        tPassword2 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid = new javax.swing.JTable();
        bSimpan = new javax.swing.JButton();
        bBaru = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bTutup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Username :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nama :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Akses :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Kode :");

        tKode.setEditable(false);
        tKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKodeActionPerformed(evt);
            }
        });

        cbAkses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User", " " }));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Ulang Pass :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tPassword)
                    .addComponent(tNama)
                    .addComponent(tUser)
                    .addComponent(tKode, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbAkses, javax.swing.GroupLayout.Alignment.TRAILING, 0, 648, Short.MAX_VALUE)
                    .addComponent(tPassword2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tKode, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(tUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tPassword2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAkses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        grid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        grid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grid);

        bSimpan.setBackground(new java.awt.Color(204, 204, 204));
        bSimpan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bSimpan.setText("Simpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        bBaru.setBackground(new java.awt.Color(204, 204, 204));
        bBaru.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBaru.setText("Baru");
        bBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBaruActionPerformed(evt);
            }
        });

        bHapus.setBackground(new java.awt.Color(204, 204, 204));
        bHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bHapus.setText("Hapus");
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });

        bTutup.setBackground(new java.awt.Color(204, 204, 204));
        bTutup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bTutup.setText("Tutup");
        bTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTutupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(bSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(bBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTutup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        try {
            // TODO add your handling code here:
            simpan();
        } catch (SQLException ex) {
             Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex);
//            try {
//                //JOptionPane.showMessageDialog(this, "Kesalahan SQL : " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
//                simpan();
//            } catch (SQLException ex1) {
//                Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex1);
//            }
        }
    }//GEN-LAST:event_bSimpanActionPerformed

    private void bBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBaruActionPerformed
        // TODO add your handling code here:
         FormMenu fb = new FormMenu();
         fb.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_bBaruActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        try {
            // TODO add your handling code here:
            hapus();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Kesalahan SQL : " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bHapusActionPerformed

    private void gridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() > 1) {
            try {
                isiForm(grid.getValueAt(grid.getSelectedRow(), 0) + "");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Kesalahan SQL : " + ex.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_gridMouseClicked

    private void bTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutupActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_bTutupActionPerformed

    private void tKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKodeActionPerformed
        // TODO add your handling code here:
        FormMenu fb = new FormMenu();
        fb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tKodeActionPerformed



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
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAdmin().setVisible(true);
            }
        });
    }
    
     private void initDB() throws ClassNotFoundException, SQLException {
        this.conn = DBConnection.getInstance().getConnection();

        psInsert = this.conn.prepareStatement("INSERT INTO ADMIN VALUES (?,?,?,?,?)");
         //JOptionPane.showMessageDialog(this, , JOptionPane.ERROR_MESSAGE);
        psUpdate = this.conn.prepareStatement("UPDATE ADMIN SET NAMA=?, USERNAME=?, "
                + "PASSWORD=?, AKSES=? WHERE KODE=?");
        psDelete = this.conn.prepareStatement("DELETE FROM ADMIN WHERE KODE=?");
        psSelectID = this.conn.prepareStatement("SELECT * FROM ADMIN WHERE KODE=?");
        psSelectMAXID = this.conn.prepareStatement("SELECT COUNT(KODE) as KODE FROM ADMIN");
        psSelectAll = this.conn.prepareStatement("SELECT * FROM ADMIN");

    }
    private void simpan() throws SQLException {
        if (!cekIsian()) {
            JOptionPane.showMessageDialog(this, "Lengkapi Isian", "Error Input", JOptionPane.ERROR_MESSAGE);
        } else if (!cekPassword()) {
            JOptionPane.showMessageDialog(this, "Password tidak cocok", "Validasi Password", JOptionPane.ERROR_MESSAGE);
        } else {
            psSelectID.setString(1, tKode.getText());
            ResultSet rs = psSelectID.executeQuery();
           
            if (rs.next()) {
                //jika sudah ada (UPDATE)
                if (JOptionPane.showConfirmDialog(this,
                        "Data sudah ada, \nApakah Ingin di Update?",
                        "Konfirmasi Update", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    psUpdate.setString(1, tKode.getText());
                    psUpdate.setString(2, tUser.getText());
                    psUpdate.setString(3, tPassword.getText());
                    psUpdate.setString(4, tNama.getText());
                    psUpdate.setInt(5, cbAkses.getSelectedIndex());

                    psUpdate.execute();

                    JOptionPane.showMessageDialog(this, "Data Berhasil di Update!");
                    bersih();
                    try {
                        isiGrid();
                    } catch (ParseException ex) {
                        Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            } else {
                //jika belum ada (INSERT)

                psInsert.setString(1, tKode.getText());
                psInsert.setString(2, tUser.getText());
                psInsert.setString(3, tPassword.getText());
                psInsert.setString(4, tNama.getText());
                psInsert.setInt(5, cbAkses.getSelectedIndex());

                psInsert.execute();

                JOptionPane.showMessageDialog(this, "Data Berhasil di Inputkan!");
                bersih();
                try {
                    isiGrid();
                } catch (ParseException ex) {
                    Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }
    private void hapus() throws SQLException {
        psSelectID.setString(1, tKode.getText());
        ResultSet rs = psSelectID.executeQuery();

        if (rs.next()) {
            //jika sudah ada (UPDATE)
            if (JOptionPane.showConfirmDialog(this, "Yakin Ingin Menghapus?",
                    "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    psDelete.setString(1, tKode.getText());
                    psDelete.execute();
                    
                    JOptionPane.showMessageDialog(this, "Data Berhasil dihapus!");
                    bersih();
                    isiGrid();
                } catch (ParseException ex) {
                    Logger.getLogger(FormAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Data Tidak ditemukan");
        }
    }
    
    private boolean cekIsian() {
        return //tKode.getText().length() >0
                tNama.getText().length() > 0
                && tUser.getText().length() > 0
                && tPassword.getText().length() > 0;
    }
    private boolean cekPassword() {
        //return Arrays.equals(tPass1.getPassword(), tPass2.getPassword());
        return tPassword.getText().equals(tPassword2.getText());
    }
    
    protected void bersih() {
        tKode.setText("");
        tUser.setText("");
        tPassword.setText("");
        tPassword2.setText("");
        tNama.setText("");
        cbAkses.setSelectedIndex(0);
    }
    
     private void isiGrid() throws SQLException, ParseException {
        String namaKolom[] = new String[]{"KODE", "PASSWORD", "USERNAME", "NAMA", "AKSES",};

        int baris;
        ResultSet rs = psSelectAll.executeQuery();
        rs.last();
        baris = rs.getRow();
        rs.beforeFirst();

        Object data[][] = new Object[baris][5];
        baris = 0;
        while (rs.next()) {
            data[baris][0] = rs.getString("KODE");
            data[baris][1] = "******";//rs.getString("USERNAME");
            data[baris][2] = rs.getString("PASSWORD");
            data[baris][3] = rs.getString("NAMA");
            data[baris][4] = rs.getInt("AKSES") == 0 ? "Admin" : "User";
            baris++;
        }
        DefaultTableModel model = new DefaultTableModel(data, namaKolom) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        
               

        //grid.setModel(new DefaultTableModel(new String[][] { } , new String[] {"Time", "Description"} ) );
        //grid.setModel(model);
        };
           grid.setModel(model);
        JFormattedTextField ftext = new JFormattedTextField();
        MaskFormatter mask;
        try {
            mask = new MaskFormatter("##:##");
            mask.install(ftext);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        grid.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(ftext));

            //grid.setModel(model);
            int baris1;
            ResultSet rs1 = psSelectMAXID.executeQuery();
            rs1.last();
            baris1 = baris;
            rs1.beforeFirst();
            baris1 = baris1+1;
            tKode.setText(""+baris1);

    }
     
      private void isiForm(String kode) throws SQLException {
        psSelectID.setString(1, kode);
        ResultSet rs = psSelectID.executeQuery();
        if (rs.next()) {
            tKode.setText(rs.getString(1));
            tUser.setText(rs.getString(2));
            tPassword.setText(rs.getString(3));
            tNama.setText(rs.getString(4));
            cbAkses.setSelectedIndex(rs.getInt(5));
        }
        rs.close();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBaru;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bSimpan;
    private javax.swing.JButton bTutup;
    private javax.swing.JComboBox<String> cbAkses;
    private javax.swing.JTable grid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tKode;
    private javax.swing.JTextField tNama;
    private javax.swing.JPasswordField tPassword;
    private javax.swing.JPasswordField tPassword2;
    private javax.swing.JTextField tUser;
    // End of variables declaration//GEN-END:variables

    private Connection conn;

    private PreparedStatement psInsert;
    private PreparedStatement psUpdate;
    private PreparedStatement psDelete;
    private PreparedStatement psSelectID;
    private PreparedStatement psSelectAll;
    private PreparedStatement psSelectMAXID;
}