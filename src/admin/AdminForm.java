/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;
import produk.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;
import login.LoginnForm;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import login.Dashboard;
import supplier.SupplierForm;
import transaksi.TransaksiForm;

/**
 *
 * @author user
 */
public class AdminForm extends javax.swing.JFrame {
    
    /**
     * Creates new form MainMenu
     */
    
    java.sql.Connection con = Koneksi.ConnectionDB();
    
    public AdminForm() {
        initComponents();
        buka_tabel();
        comboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namaAdmin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        alamatAdmin = new javax.swing.JTextField();
        ttlAdmin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jenkelAdmin = new javax.swing.JComboBox<>();
        tableBarang = new javax.swing.JScrollPane();
        tabelAdmin = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        usernameAdmin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordAdmin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        btnAdmin1 = new javax.swing.JButton();
        btnProduk = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("MenuFrame"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 80, 150));
        jLabel1.setText("ADMIN TOKO");

        jLabel2.setText("NAMA ADMIN");

        jLabel3.setText("ALAMAT ADMIN");

        jLabel4.setText("JENIS KELAMIN");

        jLabel5.setText("TTL");

        jenkelAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenkelAdminActionPerformed(evt);
            }
        });

        tabelAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAMA", "ALAMAT", "JENIS KELAMIN", "TTL", "USERNAME", "PASSWORD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelAdmin.setRowHeight(30);
        tabelAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelAdminMouseClicked(evt);
            }
        });
        tableBarang.setViewportView(tabelAdmin);

        btnSimpan.setBackground(new java.awt.Color(15, 80, 150));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("SIMPAN");
        btnSimpan.setBorder(null);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(200, 0, 0));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("HAPUS");
        btnHapus.setBorder(null);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(70, 70, 70));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.setBorder(null);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        usernameAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameAdminKeyTyped(evt);
            }
        });

        jLabel6.setText("USERNAME");

        passwordAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordAdminActionPerformed(evt);
            }
        });
        passwordAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordAdminKeyTyped(evt);
            }
        });

        jLabel7.setText("PASSWORD");

        jLabel8.setForeground(new java.awt.Color(200, 0, 0));
        jLabel8.setText("* Maximal 10 Karakter");

        jLabel9.setForeground(new java.awt.Color(200, 0, 0));
        jLabel9.setText("* Maximal 10 Karakter");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passwordAdmin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(usernameAdmin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ttlAdmin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jenkelAdmin, javax.swing.GroupLayout.Alignment.LEADING, 0, 335, Short.MAX_VALUE)
                                .addComponent(alamatAdmin, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(namaAdmin, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tableBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alamatAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)
                        .addComponent(jenkelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ttlAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tableBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(15, 80, 150));
        jPanel1.setPreferredSize(new java.awt.Dimension(1126, 50));

        btnDashboard.setBackground(new java.awt.Color(20, 80, 160));
        btnDashboard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("DASHBOARD");
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnAdmin1.setBackground(new java.awt.Color(20, 80, 160));
        btnAdmin1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdmin1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin1.setText("ADMIN");
        btnAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmin1ActionPerformed(evt);
            }
        });

        btnProduk.setBackground(new java.awt.Color(20, 80, 160));
        btnProduk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnProduk.setForeground(new java.awt.Color(255, 255, 255));
        btnProduk.setText("PRODUK");
        btnProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdukActionPerformed(evt);
            }
        });

        btnSupplier.setBackground(new java.awt.Color(20, 80, 160));
        btnSupplier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSupplier.setForeground(new java.awt.Color(255, 255, 255));
        btnSupplier.setText("SUPPLIER");
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(843, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnSupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

        // Validasi Input
        if (!isValidString(namaAdmin.getText())) {
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong.");
            return;
        }
        if (!isValidString(alamatAdmin.getText())) {
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong.");
            return;
        }
        if (!isValidString(ttlAdmin.getText())) {
            JOptionPane.showMessageDialog(null, "Ttl tidak boleh kosong.");
            return;
        }
        if (!isValidString(usernameAdmin.getText())) {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong.");
            return;
        }
        if (!isValidString(passwordAdmin.getText())) {
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong.");
            return;
        }
        
        
        
        try {
            String jeniskelamin = jenkelAdmin.getSelectedItem().toString().trim();

            // Perhatikan bahwa kolom id_admin tidak termasuk dalam daftar kolom
            String sql = "INSERT INTO tb_admin (nama_admin, alamat_admin, jenkel_admin, ttl_admin, username_admin,password_admin) VALUES"
                    + "(?, ?, ?, ?,?,?)";
            
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, namaAdmin.getText());
            pst.setString(2, alamatAdmin.getText());
            pst.setString(3, jeniskelamin);
            pst.setString(4, ttlAdmin.getText());
            pst.setString(5, usernameAdmin.getText());
            pst.setString(6, passwordAdmin.getText());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Admin Berhasil Disimpan");
            namaAdmin.setText("");
            alamatAdmin.setText("");
            ttlAdmin.setText("");
            usernameAdmin.setText("");
            passwordAdmin.setText("");

            // Set focus
            namaAdmin.requestFocusInWindow();

            buka_tabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin Menghapus ' " + namaAdmin.getText() + "'", " Konfirmasi Hapus ",
                JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            try {
               
                String sql = "DELETE FROM tb_admin WHERE nama_admin= '" + namaAdmin.getText().trim() + " '; " ;
                java.sql.PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();

                JOptionPane.showMessageDialog(null, "Data Admin Dihapus");
                namaAdmin.setText("");
                alamatAdmin.setText("");
                ttlAdmin.setText("");
                usernameAdmin.setText("");
                passwordAdmin.setText("");
                namaAdmin.enable();
                namaAdmin.requestFocusInWindow();
                buka_tabel();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,
                        "Proses hapus gagal/koneksi gagal .. ");
                System.out.println(e.getMessage());

            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tabelAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelAdminMouseClicked

        int row = tabelAdmin.getSelectedRow();
        namaAdmin.setText(tabelAdmin.getModel().
                getValueAt(row, 1).toString());
        alamatAdmin.setText(tabelAdmin.getModel().
                getValueAt(row, 2).toString());
        ttlAdmin.setText(tabelAdmin.getModel().
                getValueAt(row, 4).toString());
        usernameAdmin.setText(tabelAdmin.getModel().
                getValueAt(row, 5).toString());
        passwordAdmin.setText(tabelAdmin.getModel().
                getValueAt(row, 6).toString());
        
    }//GEN-LAST:event_tabelAdminMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // Validasi Input
        if (!isValidString(namaAdmin.getText())) {
            JOptionPane.showMessageDialog(null, "Nama tidak boleh kosong.");
            return;
        }
        if (!isValidString(alamatAdmin.getText())) {
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong.");
            return;
        }
        if (!isValidString(ttlAdmin.getText())) {
            JOptionPane.showMessageDialog(null, "Ttl tidak boleh kosong.");
            return;
        }
        if (!isValidString(usernameAdmin.getText())) {
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong.");
            return;
        }
        if (!isValidString(passwordAdmin.getText())) {
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong.");
            return;
        }
        try {
            
            String sql = "UPDATE tb_admin SET "
                    + "nama_admin="   + "'" + namaAdmin.getText() + "',"
                    + "alamat_admin=" + "'" + alamatAdmin.getText() + "',"
                    + "jenkel_admin=" + "'" +  jenkelAdmin.getSelectedItem().toString() + "',"
                    + "ttl_admin="    + "'" + ttlAdmin.getText() + "',"
                    + "username_admin=" + "'" + usernameAdmin.getText() + "',"
                    + "password_admin=" + "'" + passwordAdmin.getText() + "'"
                    + "WHERE nama_admin=" + "'" + namaAdmin.getText() + "';";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Data berhasil di Edit");
            namaAdmin.setText("");
            alamatAdmin.setText("");
            ttlAdmin.setText("");
            usernameAdmin.setText("");
            passwordAdmin.setText("");
            namaAdmin.setEnabled(true);
            namaAdmin.requestFocusInWindow();
            buka_tabel();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Proses edit gagal .. ");
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void passwordAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordAdminActionPerformed

    private void jenkelAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenkelAdminActionPerformed
       
        
    }//GEN-LAST:event_jenkelAdminActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        Dashboard activityDashboard = new Dashboard();

        activityDashboard.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmin1ActionPerformed
        AdminForm activityAdmin = new AdminForm();

        activityAdmin.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnAdmin1ActionPerformed

    private void btnProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdukActionPerformed
        ProdukForm activityProduk = new ProdukForm();

        activityProduk.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnProdukActionPerformed

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
        SupplierForm activitySupplier = new SupplierForm();

        activitySupplier.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void usernameAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameAdminKeyTyped
        if (usernameAdmin.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_usernameAdminKeyTyped

    private void passwordAdminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordAdminKeyTyped
        if (passwordAdmin.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_passwordAdminKeyTyped

    private void comboBox(){
        try {
            
            String sql = "SHOW COLUMNS FROM tb_admin LIKE 'jenkel_admin'";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            java.sql.ResultSet cek = pst.executeQuery();

            if (cek.next()) {
                String enumValue = cek.getString("Type");
                enumValue = enumValue.replace("enum(", "")
                        .replace(")", "").replace("'", "");

                String[] values = enumValue.split(",");

                DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

                for (String value : values) {
                    model.addElement(value.trim());
                }
                jenkelAdmin.setModel(model);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatAdmin;
    private javax.swing.JButton btnAdmin1;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnProduk;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JComboBox<String> jenkelAdmin;
    private javax.swing.JTextField namaAdmin;
    private javax.swing.JTextField passwordAdmin;
    private javax.swing.JTable tabelAdmin;
    private javax.swing.JScrollPane tableBarang;
    private javax.swing.JTextField ttlAdmin;
    private javax.swing.JTextField usernameAdmin;
    // End of variables declaration//GEN-END:variables


    private void buka_tabel() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("NAMA");
        model.addColumn("ALAMAT");
        model.addColumn("JENIS KELAMIN");
        model.addColumn("TTL");
        model.addColumn("USERNAME");
        model.addColumn("PASSWORD");

        // menampilkan data kedalam table
        try {
            String sql = "SELECT id_admin, nama_admin, alamat_admin, jenkel_admin, ttl_admin, username_admin, password_admin FROM tb_admin";
            
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{
                    res.getInt("id_admin"),
                    res.getString("nama_admin"),
                    res.getString("alamat_admin"),
                    res.getString("jenkel_admin"),
                    res.getString("ttl_admin"),
                    res.getString("username_admin"),
                    res.getString("password_admin")
                });
            }
            tabelAdmin.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private boolean isValidString(String input) {
        return input != null && !input.trim().isEmpty();
    }
    
    
    //end 
    }
