/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek_mini_cafe;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static projek_mini_cafe.konek.getConnection;

public class transaksi extends javax.swing.JFrame {

    konek db = new konek();
    Connection conn = getConnection();
    int k = 0;
    public String mangan = "";
    public String ngombe = "";
    
    private int id;
    String wow = "";
    /**
     * Creates new form transaksi
     */
    public transaksi(int id) {
        initComponents();
        setLocationRelativeTo(null);
        idlapload(idlaporan_trans);
        idtransload(idtrans);
        this.id = id;
        idtrans.setVisible(false);
        pegawai.setText(""+this.id);
        pegawai.setVisible(false);
        //idmakanan.setVisible(false);
        //idminuman.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pegawai = new javax.swing.JTextField();
        idlaporan_trans = new javax.swing.JTextField();
        totalharga = new javax.swing.JTextField();
        bayar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        date = new javax.swing.JTextField();
        nmpega = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbpesanmakan = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbpesanminum = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idtrans = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        Struk = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jScrollPane3.setViewportView(jTextPane1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Tranaksi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel1.setText("Pegawai");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel2.setText("No.");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel5.setText("Tanggal :");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Total Harga  : Rp.");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Pembayaran  : Rp.");

        pegawai.setEditable(false);
        pegawai.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        idlaporan_trans.setEditable(false);
        idlaporan_trans.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        totalharga.setEditable(false);
        totalharga.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        bayar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText(">> Struck ~ ~ ~ ~ ~ ~ ~ ~ ~");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("CETAK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jButton2.setText("Pilih Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        date.setEditable(false);
        date.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        date.setText("System Date");
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        nmpega.setEditable(false);
        nmpega.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setText("C");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tbpesanmakan.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tbpesanmakan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Makanan", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbpesanmakan.setGridColor(new java.awt.Color(255, 255, 255));
        tbpesanmakan.setSelectionBackground(new java.awt.Color(0, 204, 0));
        tbpesanmakan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpesanmakanMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbpesanmakan);

        tbpesanminum.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        tbpesanminum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Minuman", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbpesanminum.setGridColor(new java.awt.Color(255, 255, 255));
        tbpesanminum.setSelectionBackground(new java.awt.Color(0, 204, 0));
        tbpesanminum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbpesanminumMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbpesanminum);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("~ ~ ~ Makanan ~ ~ ~");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("~ ~ ~ Minuman ~ ~ ~");

        idtrans.setEditable(false);
        idtrans.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        Struk.setEditable(false);
        Struk.setColumns(20);
        Struk.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        Struk.setRows(5);
        jScrollPane6.setViewportView(Struk);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setText("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addComponent(idlaporan_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(nmpega, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(idtrans, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton3))
                                        .addComponent(pegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalharga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idlaporan_trans, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idtrans, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pegawai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nmpega, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel mooo = (DefaultTableModel) tbpesanmakan.getModel(); 
        DefaultTableModel moooo = (DefaultTableModel) tbpesanminum.getModel();
        
        if(bayar.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Input pembayaran !!", "", JOptionPane.WARNING_MESSAGE);
        }else{
            
            int makss = 0;
            if(mooo.getRowCount() > moooo.getRowCount()){
                makss = mooo.getRowCount();
            }else{
                makss = moooo.getRowCount();
            }
            for(int ww = 0; ww < makss; ww++){
//              Tabel data makanan
                String a = (String)mooo.getValueAt(ww, 0);
                String c = (String)mooo.getValueAt(ww, 2);
//              Tabel data minuman
                String d = (String)moooo.getValueAt(ww, 0);
                String f = (String)moooo.getValueAt(ww, 2);
                try{
                    String sql = "INSERT INTO transaksi VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    
                    pst.setString(1, pegawai.getText().trim());
                    pst.setString(2, idtrans.getText().trim());
                    pst.setString(3, a);  
                    pst.setString(4, d);  
                    pst.setDate(5, new java.sql.Date(System.currentTimeMillis()));   
                    pst.setString(6, c);
                    pst.setString(7, f);
                    pst.setString(8, totalharga.getText().trim());
                    pst.setString(9, bayar.getText().trim());
                    k = Integer.parseInt(bayar.getText()) - Integer.parseInt(totalharga.getText());
                    pst.setInt(10, k);
                    pst.setString(11, idlaporan_trans.getText());

                    pst.execute();
                    idtransload(idtrans);

                }catch(Exception x){
                    System.out.println(x.getMessage());
                }
                
                
            }
            
            Struck();
            JOptionPane.showMessageDialog(null, "Kembalian Rp." + k);
            idtransload(idtrans);
            
            try{
                Struk.print();
            }catch(PrinterException e){
                JOptionPane.showMessageDialog(null, "ERROR !!");
                //Logger.getLogger(PrinterSys.class.getName()).log(Level.SEVERE, null, e);
            }
            
            JOptionPane.showMessageDialog(null, "Data Saved");
        
        for(int vv = 0; vv < mooo.getRowCount(); vv++ ){
            String im = (String)mooo.getValueAt(vv, 0);
            String jm = (String)mooo.getValueAt(vv, 2);
            try {
                String sql = "UPDATE makanan SET stok_makanan = stok_makanan-" + jm
                        + " WHERE id_makanan = " + im;
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        for(int vv = 0; vv < moooo.getRowCount(); vv++ ){
            String im = (String)moooo.getValueAt(vv, 0);
            String jm = (String)moooo.getValueAt(vv, 2);
            try {
                String sql = "UPDATE minuman SET stok_minuman = stok_minuman-" + jm
                        + " WHERE id_minuman = " + im;
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        
        clear();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new pesanan(this.id).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        clear();
        Struk.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tbpesanmakanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpesanmakanMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tbpesanmakanMouseClicked

    private void tbpesanminumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbpesanminumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbpesanminumMouseClicked

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new transaksi().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Struk;
    private javax.swing.JTextField bayar;
    public static javax.swing.JTextField date;
    private javax.swing.JTextField idlaporan_trans;
    public static javax.swing.JTextField idtrans;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    public static javax.swing.JTextField nmpega;
    public static javax.swing.JTextField pegawai;
    public static javax.swing.JTable tbpesanmakan;
    public static javax.swing.JTable tbpesanminum;
    public static javax.swing.JTextField totalharga;
    // End of variables declaration//GEN-END:variables
private void tableload(JTable jt) {
        DefaultTableModel dt = (DefaultTableModel) jt.getModel();
        dt.setRowCount(0);
        try {
            ResultSet rset = db.getData("SELECT * FROM transaksi order by id_transaksi");
            while(rset.next()){
                Vector v = new Vector();
                v.add(rset.getString(1));
                v.add(rset.getString(2));
                v.add(rset.getString(3));
                v.add(rset.getString(4));
                v.add(rset.getString(5));
                v.add(rset.getString(6));
                v.add(rset.getString(7));
                v.add(rset.getString(8));
                v.add(rset.getString(9));
                v.add(rset.getString(10));
                dt.addRow(v);
            }
        } catch (Exception ex) {
            
        }
    }

    private void clear() {
        idlaporan_trans.setText("");
        date.setText("System Date");
        totalharga.setText("");
        bayar.setText("");
        nmpega.setText("");
        DefaultTableModel ma = (DefaultTableModel)tbpesanmakan.getModel();
        DefaultTableModel mi = (DefaultTableModel)tbpesanminum.getModel();
        for(int x = ma.getRowCount() - 1; x >= 0; x--){
           ma.removeRow(x);
        }
        for(int x = mi.getRowCount() - 1; x >= 0; x--){
           mi.removeRow(x);
        }
    }

    private void Struck(){

        DefaultTableModel def = (DefaultTableModel)tbpesanmakan.getModel(); 
        DefaultTableModel deff = (DefaultTableModel)tbpesanminum.getModel();
        int kem = Integer.parseInt(bayar.getText()) - Integer.parseInt(totalharga.getText());
        int no = def.getRowCount();
        int noo = deff.getRowCount();
        String[] str = new String[no];
        String[] a = new String[no];
        String[] strr = new String[noo];
        String[] b = new String[noo];
            
        Struk.append("\t          -- MINI CAFE -- \n " 
                + "     Jl.Djonjarot Subiantoro DawarBlandong Mojokerto \n"
                + " ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~"
                + " \n\n No. \t\t : " + (Integer.parseInt(idlaporan_trans.getText().trim()) + 1)
                + " \n Pegawai \t\t : " + nmpega.getText().trim() 
                + " \n Tanggal \t\t : " + new java.sql.Date(System.currentTimeMillis())
                + " \n\n >> Makanan \t | Jumlah \n" //" \n\n Nama Makanan \t : " + this.mangan 
        );   
        for(int s = 0; s < def.getRowCount(); s++){
            str[s]=def.getValueAt(s, 1).toString();
            a[s]=def.getValueAt(s, 2).toString();
            Struk.append(" - " + str[s] + "\t | " + a[s] + "\n");
        }
        Struk.append("\n >> Minuman \t | Jumlah \n");   
        for(int s = 0; s < deff.getRowCount(); s++){
            strr[s]=deff.getValueAt(s, 1).toString();
            b[s]=deff.getValueAt(s, 2).toString();
            Struk.append(" - " + strr[s] + "\t | " + b[s] + "\n");
        }
        Struk.append(" \n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~"
                + " \n Harga Total \t : Rp." + totalharga.getText().trim()
                + " \n Pembayaran \t : Rp." + bayar.getText().trim()
                + " \n ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~"
                + " \n *Kembalian \t : Rp." + kem + " \n"
        );
        
    }

    private void idlapload(JTextField jText) {
        try {
            ResultSet rset = db.getData("SELECT max(id_lap) FROM transaksi");
            while(rset.next()){
                int i = rset.getInt(1);
                i += 1;
                jText.setText(String.valueOf(i));
            }
        } catch (Exception ex) {
            
        }
    }
    private void idtransload(JTextField jText) {
        try {
            ResultSet rset = db.getData("SELECT max(id_transaksi) FROM transaksi");
            while(rset.next()){
                int i = rset.getInt(1);
                i += 1;
                jText.setText(String.valueOf(i));
                wow = String.valueOf(i);
            }
        } catch (Exception ex) {
            
        }
    }




}
