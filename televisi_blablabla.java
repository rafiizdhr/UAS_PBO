
package uas;


import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class televisi_blablabla extends javax.swing.JFrame {

    private void kosongform() {
        txtnamasiaran.setEditable(true);
        txtnamasiaran.setText(null);
        cbjamsiaran.setSelectedItem(this);
        rbberita.setSelected(false);
        rbolahraga.setSelected(false);
        rbhiburan.setSelected(false);
        rbfilm.setSelected(false);
        rbanakanak.setSelected(false);
        rbpendidikan.setSelected(false);
        txtdurasisiaran.setText(null);
        cbsalurantv.setSelectedItem(this);
    }
    
    private void tampil_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Nama Siaran");
        model.addColumn("Jam Siaran");
        model.addColumn("Jenis Siaran");
        model.addColumn("Durasi Siaran");
        model.addColumn("Saluran TV");
        
        String cari = txtcari.getText();
                
        try{
            int no = 1;
            String sql = "SELECT * FROM tbtelevisi WHERE nama_siaran LIKE '%" + cari + "%' OR jam_siaran LIKE '%" + cari + "%' OR jenis_siaran LIKE '%" + cari + "%' OR durasi_siaran LIKE '%" + cari + "%' OR saluran_siaran LIKE '%" + cari + "%'";

            java.sql.Connection conn = (java.sql.Connection)konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)});
                
            }
            tabeltelevisi.setModel(model);
            
        }catch(SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
   
    public televisi_blablabla() {
        initComponents();
        tampil_data();
        kosongform();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnamasiaran = new javax.swing.JTextField();
        txtdurasisiaran = new javax.swing.JTextField();
        cbjamsiaran = new javax.swing.JComboBox<>();
        cbsalurantv = new javax.swing.JComboBox<>();
        rbberita = new javax.swing.JRadioButton();
        rbolahraga = new javax.swing.JRadioButton();
        rbhiburan = new javax.swing.JRadioButton();
        rbanakanak = new javax.swing.JRadioButton();
        rbpendidikan = new javax.swing.JRadioButton();
        rbfilm = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeltelevisi = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtcari = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi televisi blablabla");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PROGRAM TELEVISI BLABLABLA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 6, -1, -1));

        jLabel2.setText("Nama Siaran ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 68, -1, -1));

        jLabel3.setText("Jam Siaran    ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 102, -1, -1));

        jLabel4.setText("Jenis Siaran ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 135, -1, -1));

        jLabel5.setText("Durasi Siaran ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 169, -1, -1));

        jLabel6.setText("Saluran TV ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 203, -1, -1));

        txtnamasiaran.setToolTipText("");
        getContentPane().add(txtnamasiaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 65, 171, -1));
        getContentPane().add(txtdurasisiaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 166, 146, -1));

        cbjamsiaran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagi", "Siang", "Sore", "Malam" }));
        getContentPane().add(cbjamsiaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 99, 100, -1));

        cbsalurantv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TvOne", "TVRI", "TransTV", "RCTI", "GLOBAL TV", "ANTV", "Trans 7" }));
        getContentPane().add(cbsalurantv, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 200, 100, -1));

        rbberita.setText("Berita");
        getContentPane().add(rbberita, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 133, 58, -1));

        rbolahraga.setText("Olahraga");
        getContentPane().add(rbolahraga, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 133, 76, -1));

        rbhiburan.setText("Hiburan");
        getContentPane().add(rbhiburan, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 133, -1, -1));

        rbanakanak.setText("Anak-anak");
        getContentPane().add(rbanakanak, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 133, -1, -1));

        rbpendidikan.setText("Pendidikan");
        getContentPane().add(rbpendidikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 133, -1, -1));

        rbfilm.setText("Film");
        getContentPane().add(rbfilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 133, -1, -1));

        tabeltelevisi.setModel(new javax.swing.table.DefaultTableModel(
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
        tabeltelevisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeltelevisiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeltelevisi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 340, 698, 150));

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 90, -1));

        btnubah.setText("UBAH");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });
        getContentPane().add(btnubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 80, -1));

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 90, -1));

        btnbatal.setText("BATAL");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 250, 75, -1));

        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 75, -1));

        jButton1.setText("LOGOUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 160, -1));

        btncari.setText("CARI");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
        kosongform();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        try{
            String jenis = "";
            
            if (rbberita.isSelected()) {
                jenis = rbberita.getText();
            } else if (rbolahraga.isSelected()) {
                jenis = rbolahraga.getText();
            } else if (rbhiburan.isSelected()) {
                jenis = rbhiburan.getText();
            } else if (rbfilm.isSelected()) {
                jenis = rbfilm.getText();
            } else if (rbanakanak.isSelected()) {
                jenis = rbanakanak.getText();
            } else if (rbpendidikan.isSelected()) {
                jenis = rbpendidikan.getText();
            }
            
            String sql = "INSERT INTO tbtelevisi VALUES ('"+txtnamasiaran.getText()+"','"+cbjamsiaran.getSelectedItem()+"','"+ jenis +"','"+txtdurasisiaran.getText()+"','"+cbsalurantv.getSelectedItem()+"')";
            java.sql.Connection conn = (java.sql.Connection)konfig.configDB();  
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(this, "Proses Simpan Berhasil.");
            tampil_data();
            kosongform();

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void tabeltelevisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeltelevisiMouseClicked
        // TODO add your handling code here:
        int baris = tabeltelevisi.rowAtPoint(evt.getPoint());
        
        String nama_siaran = tabeltelevisi.getValueAt(baris, 1).toString();
        txtnamasiaran.setText(nama_siaran);
        
        String jam_siaran = tabeltelevisi.getValueAt(baris, 2).toString();
        cbjamsiaran.setSelectedItem(jam_siaran);
        
        String jenis_siaran = tabeltelevisi.getValueAt(baris, 3).toString();
        if (jenis_siaran.equals("Berita")) {
            rbberita.setSelected(true);
        } else if (jenis_siaran.equals("Olahraga")) {
            rbolahraga.setSelected(true);
        } else if (jenis_siaran.equals("Hiburan")) {
            rbhiburan.setSelected(true);
        } else if (jenis_siaran.equals("Film")) {
            rbfilm.setSelected(true);
        } else if (jenis_siaran.equals("Anak-anak")) {
            rbanakanak.setSelected(true);
        } else if (jenis_siaran.equals("Pendidikan")) {
            rbpendidikan.setSelected(true);
        }
        
        String durasi_siaran = tabeltelevisi.getValueAt(baris, 4).toString();
        txtdurasisiaran.setText(durasi_siaran);
        
        String saluran_tv = tabeltelevisi.getValueAt(baris, 5).toString();
        cbsalurantv.setSelectedItem(saluran_tv);
    }//GEN-LAST:event_tabeltelevisiMouseClicked

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        // TODO add your handling code here:
        try{
            String jenis = "";
            
            if (rbberita.isSelected()) {
                jenis = rbberita.getText();
            } else if (rbolahraga.isSelected()) {
                jenis = rbolahraga.getText();
            } else if (rbhiburan.isSelected()) {
                jenis = rbhiburan.getText();
            } else if (rbfilm.isSelected()) {
                jenis = rbfilm.getText();
            } else if (rbanakanak.isSelected()) {
                jenis = rbanakanak.getText();
            } else if (rbpendidikan.isSelected()) {
                jenis = rbpendidikan.getText();
            }
            
            String sql = "UPDATE tbtelevisi SET nama_siaran='"+txtnamasiaran.getText()+"',jam_siaran='"+cbjamsiaran.getSelectedItem()+"',jenis_siaran='"+ jenis +"',durasi_siaran='"+txtdurasisiaran.getText()+"',saluran_siaran='"+cbsalurantv.getSelectedItem()+"' WHERE nama_siaran = '"+txtnamasiaran.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Ubah Berhasil.");
            
            
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_data();
        kosongform();
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM tbtelevisi WHERE nama_siaran='"+txtnamasiaran.getText()+"'";
            java.sql.Connection conn = (java.sql.Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Hapus Berhasil.");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_data();
        kosongform();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        loginform back = new loginform();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
        tampil_data();
    }//GEN-LAST:event_btncariActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new televisi_blablabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JComboBox<String> cbjamsiaran;
    private javax.swing.JComboBox<String> cbsalurantv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbanakanak;
    private javax.swing.JRadioButton rbberita;
    private javax.swing.JRadioButton rbfilm;
    private javax.swing.JRadioButton rbhiburan;
    private javax.swing.JRadioButton rbolahraga;
    private javax.swing.JRadioButton rbpendidikan;
    private javax.swing.JTable tabeltelevisi;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtdurasisiaran;
    private javax.swing.JTextField txtnamasiaran;
    // End of variables declaration//GEN-END:variables
}
