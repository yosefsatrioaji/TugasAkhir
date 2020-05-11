import static java.awt.image.ImageObserver.HEIGHT;
import java.util.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yosef
 */
public class ProgramUtama extends javax.swing.JFrame {
    SetterGetter halo = new SetterGetter();
    ShowData show = new ShowData();

    /**
     * Creates new form ProgramUtama
     */
    public ProgramUtama() {
        initComponents();
        penting.setActionCommand("Penting");
        gapenting.setActionCommand("Ga Penting");
        penting.setSelected(true);
    }
    
    void MatkulList(String matkul1,String matkul2,String matkul3,String matkul4,String matkul5,String matkul6,String matkul7,String matkul8,String matkul9, String matkul10,String matkul11,String matkul12){
        ArrayList<String> matkul = new ArrayList<>();
        Iterator<String> iter;
        listmatkul.removeAllItems();
        matkul.add("Pilih Matkul...");
        matkul.add(matkul1);
        matkul.add(matkul2);
        matkul.add(matkul3);
        matkul.add(matkul4);
        matkul.add(matkul5);
        matkul.add(matkul6);
        matkul.add(matkul7);
        matkul.add(matkul8);
        matkul.add(matkul9);
        matkul.add(matkul10);
        matkul.add(matkul11);
        matkul.add(matkul12);
        iter=matkul.iterator();
        while(iter.hasNext()){
            listmatkul.addItem(iter.next());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        status = new javax.swing.ButtonGroup();
        deadline = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        namatgs = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        listmatkul = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        semester = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        keterangan = new javax.swing.JTextArea();
        clear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        penting = new javax.swing.JRadioButton();
        gapenting = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Tugas", "Semester", "Matkul", "Deadline", "Status", "Keterangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List Tugas dan Deadline");

        jLabel2.setText("Nama Tugas");

        namatgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namatgsActionPerformed(evt);
            }
        });

        jLabel3.setText("Matkul");

        listmatkul.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Matkul..." }));

        jLabel4.setText("Matkul Semester");

        semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Semester...", "1", "2", "3", "4", "5", "6", "7", "8", "Matkul Pilihan Genap", "Matkul Pilihan Ganjil", "Lainnya" }));
        semester.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semesterItemStateChanged(evt);
            }
        });

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        jLabel5.setText("Deadline");

        jLabel6.setText("Keterangan");

        keterangan.setColumns(20);
        keterangan.setRows(5);
        jScrollPane2.setViewportView(keterangan);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jLabel7.setText("Status");

        status.add(penting);
        penting.setText("Tugas Penting");

        status.add(gapenting);
        gapenting.setText("Tugas Ga Penting");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(namatgs, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(semester, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(listmatkul, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(penting)
                                    .addComponent(gapenting)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(remove))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addComponent(clear)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namatgs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listmatkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(penting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gapenting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add)
                            .addComponent(remove))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namatgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namatgsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namatgsActionPerformed

    private void semesterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semesterItemStateChanged
        // TODO add your handling code here:
        if (semester.getSelectedItem().equals("1")){
            MatkulList("Bahasa Indonesia","Bahasa Inggris","Dasar Komputer dan Pemrograman","Fisika Dasar 1","Kalkulus 1","Olah Raga","Pancasila","Pendidikan Agama","Teknologi Informasi","","","");
        }
        else if (semester.getSelectedItem().equals("2")){
            MatkulList("Algoritma dan Pemrograman","Elektronika Dasar","Fisika Dasar 2","Kalkulus 2","Kewarganegaraan","Konsep Jaringan Komputer","Praktikum DKP","Praktikum Fisdas 1","Sistem Digital","","","");
        }
        else if (semester.getSelectedItem().equals("3")){
            MatkulList("Dasar Sistem Kendali","Kewirausahaan","Matematika Teknik","Organisasi Komputer","Pengantar Perangkat Bergerak","Praktikum Fisdas 2","Praktikum Sisdig","Sistem Operasi","Struktur Data","Teknik Antarmuka dan Periferal","Teknik Mikroprosesor","");

        }
        else if (semester.getSelectedItem().equals("4")){
            MatkulList("Arsitektur Komputer","Jaringan Komputer 1","Kecakapan Antar Personal","Kriptografi","Metodologi Penelitian","Pemrograman Bergerak","Praktikum TAP","Praktikum TM","Sistem Basis Data","Teknik Telekomunikasi Seluler","Tranduser dan Sensor","");
        }
        else if (semester.getSelectedItem().equals("5")){
            MatkulList("Bahasa Pemrograman Rakitan","Jaringan Komputer 2","Metode Numerik","Pemrograman Berorientasi Obyek","Praktikum Jarkom 1","Praktikum PPB","Praktikum SBD","Probabilitas dan Statistik","Rekayasa Perangkat Lunak","Robotika","Sistem Digital Lanjut","Sistem Tertanam");
        }
        else if (semester.getSelectedItem().equals("6")){
            MatkulList("Etika Profesi","Jaringan Komputer Lanjut","Kerja Praktek","Multimedia","Praktikum Jarkom 2","Praktikum Robotika","Praktikum RPL","Praktikum Sisdig Lanjut","Rekayasa Perangkat Lunak Berbasis Komponen","Sistem Operasi Waktu Nyata","","");
        }
        else if (semester.getSelectedItem().equals("7")){
            MatkulList("Interaksi Manusia dan Komputer","Manajemen Trafik","Pemrograman Jaringan","Praktikum Jarkom Lanjut","Praktikum Multimedia","Praktikum RPL Berbasis Komponen","","","","","","");
        }
        else if (semester.getSelectedItem().equals("8")){
            MatkulList("Kuliah Kerja Lapangan","Kuliah Kerja Nyata","Tugas Akhir","","","","","","","","","");
        }
        else if (semester.getSelectedItem().equals("Matkul Pilihan Genap")){
            MatkulList("Desain Sistem VLSI","Jaringan Syaraf Tiruan","Keamanan Jaringan Komputer","Kecerdasan Buatan","Logika Fuzzy","Pemrograman Game","Pemrograman Java","Pengolahan Citra dan Pengenalan Pola","Perencanaan Strategis Sistem dan Teknologi Informasi","Sistem Informasi","Sistem Terintegrasi","Telekomunikasi Satelit");
        }
        else if (semester.getSelectedItem().equals("Matkul Pilihan Ganjil")){
            MatkulList("Data Mining","Grafika Komputer","Keamanan Sistem Informasi","Pemrograman Basis Data","Pemrograman Berorientasi Objek Lanjut","Pengenalan Ucapan","Pengolahan Paralel","Pengolahan Sinyal","Perancangan Mikroprosesor","Sistem Tertanam dan Terdistribusi","","");
        }
        else {
           MatkulList("Lainnya","","","","","","","","","","",""); 
        }
    }//GEN-LAST:event_semesterItemStateChanged

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        namatgs.setText(namatgs.getText());
        halo.setNama(namatgs.getText());
        String Semester = semester.getSelectedItem().toString();
        halo.setSemester(Semester);
        String Matkul = listmatkul.getSelectedItem().toString();
        halo.setMatkul (Matkul);
        String Deadline = ((JTextField)deadline.getDateEditor().getUiComponent()).getText();
        halo.setDeadline(Deadline);
        keterangan.setText(keterangan.getText());
        halo.setKeterangan(keterangan.getText());
        String Status = status.getSelection().getActionCommand();
        halo.setStatus(Status);
        if (namatgs.getText().trim().isEmpty()|| Semester=="Pilih Semester..." || Matkul=="Pilih Matkul..." || Deadline.trim().isEmpty() || keterangan.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "ISI DENGAN LENGKAP", "WARNING", HEIGHT);
        }
        else {
            JOptionPane.showMessageDialog(null, "data berhasil ditambahkan", "SUCCESSFULLY", HEIGHT);
            DefaultTableModel model= (DefaultTableModel) list.getModel();
            model.addRow(new Object[]{halo.getNama(),halo.getSemester(),halo.getMatkul(),halo.getDeadline(),halo.getStatus(),halo.getKeterangan()});
        }
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) list.getModel();
        if (model.getRowCount()>=1){
            model.removeRow(0);
        }
        else {
        }
    }//GEN-LAST:event_removeActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        namatgs.setText("");
        deadline.setDate(null);
        semester.setSelectedItem("Pilih Semester...");
        keterangan.setText("");
        penting.setSelected(true);
    }//GEN-LAST:event_clearActionPerformed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        // TODO add your handling code here:
        int index = list.getSelectedRow();
        DefaultTableModel model= (DefaultTableModel) list.getModel();
        
        String Nama = model.getValueAt(index, 0).toString();
        halo.setNama(Nama);
        String Semester = model.getValueAt(index, 1).toString();
        halo.setSemester(Semester);
        String Matkul = model.getValueAt(index, 2).toString();
        halo.setMatkul(Matkul);
        String Deadline = model.getValueAt(index, 3).toString();
        halo.setDeadline(Deadline);
        String Status = model.getValueAt(index, 4).toString();
        halo.setStatus(Status);
        String Keterangan = model.getValueAt(index, 5).toString();
        halo.setKeterangan(Keterangan);
        
        show.setVisible(true);
        show.pack();
        show.setLocationRelativeTo(null);
        show.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        show.Nama.setText(halo.getNama());
        show.Semester.setText(halo.getSemester());
        show.Matkul.setText(halo.getMatkul());
        show.Deadline.setText(halo.getDeadline());
        show.Status.setText(halo.getStatus());
        show.Keterangan.setText(halo.getKeterangan());
    }//GEN-LAST:event_listMouseClicked

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
            java.util.logging.Logger.getLogger(ProgramUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private com.toedter.calendar.JDateChooser deadline;
    private javax.swing.JRadioButton gapenting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea keterangan;
    public javax.swing.JTable list;
    private javax.swing.JComboBox<String> listmatkul;
    private javax.swing.JTextField namatgs;
    private javax.swing.JRadioButton penting;
    private javax.swing.JButton remove;
    private javax.swing.JComboBox<String> semester;
    private javax.swing.ButtonGroup status;
    // End of variables declaration//GEN-END:variables
}