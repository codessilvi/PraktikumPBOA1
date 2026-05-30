/* Nama File    : GUISIMPLE1.java
 * Deskripsi    : Proyek 0-3 NetBeans GUI Builder
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 25 Mei 2026
 */
import javax.swing.DefaultListModel;
import java.util.List;
import java.util.ArrayList;

public class GUISIMPLE1 extends javax.swing.JFrame {
    
    DefaultListModel<String> dlm;
    List<String> items = new ArrayList<>();
    String[] datas = {"buku", "meja", "kursi", "tas", "pintu"};
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUISIMPLE1.class.getName());

    // Constructor utama GUI
    // Digunakan untuk inisialisasi komponen dan menampilkan data awal
    public GUISIMPLE1() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.jListItem.setModel(dlm);
        
        for(String data : datas){
            dlm.addElement(data);
        }
        updateJumDataTersimpan();
    }
    
    // Method untuk memperbarui jumlah data yang tersimpan pada label 
    private void updateJumDataTersimpan(){
        jLabelJumlahData.setText(
                "Data tersimpan = " + items.size());
    }
    
    // Method untuk menambahkan item baru ke dalam JList
    private void addItem(String namaItem){
        dlm.addElement(namaItem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList();
        jButtonAdd = new javax.swing.JButton();
        jButtonInsertData = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClearAll = new javax.swing.JButton();
        jLabelNamaItem = new javax.swing.JLabel();
        jTextFieldNamaItem = new javax.swing.JTextField();
        jButtonSaveData = new javax.swing.JButton();
        jLabelJumlahData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        jListItem.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListItem);

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(this::jButtonAddActionPerformed);

        jButtonInsertData.setText("Insert Data");
        jButtonInsertData.addActionListener(this::jButtonInsertDataActionPerformed);

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(this::jButtonUpdateActionPerformed);

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(this::jButtonDeleteActionPerformed);

        jButtonClearAll.setText("Clear All");
        jButtonClearAll.addActionListener(this::jButtonClearAllActionPerformed);

        jLabelNamaItem.setText("Nama Item ");

        jTextFieldNamaItem.addActionListener(this::jTextFieldNamaItemActionPerformed);

        jButtonSaveData.setText("Save Data");
        jButtonSaveData.addActionListener(this::jButtonSaveDataActionPerformed);

        jLabelJumlahData.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDelete)
                            .addComponent(jButtonAdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonUpdate)
                            .addComponent(jButtonClearAll)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNamaItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonSaveData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonInsertData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelJumlahData)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertData)
                    .addComponent(jLabelJumlahData))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSaveData)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNamaItem)
                    .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonUpdate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClearAll))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNamaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaItemActionPerformed
    }//GEN-LAST:event_jTextFieldNamaItemActionPerformed

    // Menambahkan item dari TextField ke JList
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        addItem(jTextFieldNamaItem.getText());
        
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    // Menampilkan kembali data dari List ke JList
    private void jButtonInsertDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataActionPerformed
        dlm.clear();
        for (String item : items) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataActionPerformed

    // Menghapus item yang dipilih dari JList
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        int index = jListItem.getSelectedIndex();
        if(index != -1){
            dlm.removeElementAt(index);
        }
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    // Mengubah item yang dipilih berdasarkan isi TextField
    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int index = jListItem.getSelectedIndex();
        String selected = jTextFieldNamaItem.getText();
        dlm.setElementAt(selected, index);
        
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    // Menghapus seluruh data pada JList
    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        dlm.clear();
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    // Menyimpan seluruh isi JList ke dalam ArrayList
    private void jButtonSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveDataActionPerformed
        if (!items.isEmpty()){
            items.clear();
        }
        
        for(int i = 0; i < dlm.getSize(); i++){
            items.add(dlm.getElementAt(i));
        }
        
        updateJumDataTersimpan();
    }//GEN-LAST:event_jButtonSaveDataActionPerformed

    // Method utama untuk menjalankan program GUI
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new GUISIMPLE1().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertData;
    private javax.swing.JButton jButtonSaveData;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelJumlahData;
    private javax.swing.JLabel jLabelNamaItem;
    private javax.swing.JList jListItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNamaItem;
    // End of variables declaration//GEN-END:variables
}
