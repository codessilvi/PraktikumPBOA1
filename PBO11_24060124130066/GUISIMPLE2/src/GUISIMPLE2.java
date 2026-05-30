/* Nama File    : GUISIMPLE1.java
 * Deskripsi    : Proyek 4 NetBeans GUI Builder
 * Pembuat      : Silvani Salsabilla - 24060124130066
 * Tanggal      : Senin, 25 Mei 2026
 */

import javax.swing.DefaultListModel;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class GUISIMPLE2 extends javax.swing.JFrame {
    
    DefaultListModel<String> dlm;
    List<String> items = new ArrayList<>();
    Set<String> itemSet = new HashSet<>();
    Map<Integer, String> itemMap = new HashMap<>();
    String[] datas = {"buku", "meja", "kursi", "tas", "pintu"};
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUISIMPLE2.class.getName());

    // Constructor utama GUI
    // Digunakan untuk menginisialisasi komponen,
    // model JList, dan menampilkan data awal
    public GUISIMPLE2() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        this.jListItem.setModel(dlm);
        
        for(String data : datas){
            dlm.addElement(data);
            updateJumDataTersimpan();
        }
        jLabelJumlahData.setText("Data tersimpan = 0");
        jLabel1.setText("Data Set = 0");
        jLabel2.setText("Data Map = 0");
    }
    
    // Method untuk memperbarui label jumlah data List
    private void updateJumDataTersimpan(){
        jLabelJumlahData.setText(
                "Data tersimpan = " + items.size());
    }
    
    // Method untuk menambahkan item baru ke JList
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
        jButtonSaveList = new javax.swing.JButton();
        jLabelJumlahData = new javax.swing.JLabel();
        jButtonSaveSet = new javax.swing.JButton();
        jButtonSaveMap = new javax.swing.JButton();
        jButtonInsertData1 = new javax.swing.JButton();
        jButtonInsertData2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
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

        jButtonInsertData.setText("<- Insert Data List");
        jButtonInsertData.addActionListener(this::jButtonInsertDataActionPerformed);

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(this::jButtonUpdateActionPerformed);

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(this::jButtonDeleteActionPerformed);

        jButtonClearAll.setText("Clear All");
        jButtonClearAll.addActionListener(this::jButtonClearAllActionPerformed);

        jLabelNamaItem.setText("Nama Item ");

        jTextFieldNamaItem.addActionListener(this::jTextFieldNamaItemActionPerformed);

        jButtonSaveList.setText("Save to List ->");
        jButtonSaveList.addActionListener(this::jButtonSaveListActionPerformed);

        jLabelJumlahData.setText("jLabel1");

        jButtonSaveSet.setText("Save to Set ->");
        jButtonSaveSet.addActionListener(this::jButtonSaveSetActionPerformed);

        jButtonSaveMap.setText("Save to Map ->");
        jButtonSaveMap.addActionListener(this::jButtonSaveMapActionPerformed);

        jButtonInsertData1.setText("<- Insert Data Set");
        jButtonInsertData1.addActionListener(this::jButtonInsertData1ActionPerformed);

        jButtonInsertData2.setText("<- Insert Data Map");
        jButtonInsertData2.addActionListener(this::jButtonInsertData2ActionPerformed);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jButtonClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonSaveSet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSaveList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInsertData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSaveMap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonInsertData1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelJumlahData)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addGap(13, 13, 13)
                        .addComponent(jButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete))
                    .addComponent(jLabelNamaItem)
                    .addComponent(jButtonInsertData2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonClearAll)
                            .addComponent(jButtonAdd)
                            .addComponent(jButtonUpdate)
                            .addComponent(jButtonDelete))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveList)
                            .addComponent(jLabelJumlahData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertData)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveSet)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertData1)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveMap)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInsertData2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNamaItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Event saat TextField ditekan Enter
    private void jTextFieldNamaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaItemActionPerformed
    }//GEN-LAST:event_jTextFieldNamaItemActionPerformed

    // Menambahkan item dari TextField ke JList
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        addItem(jTextFieldNamaItem.getText());
        
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    
    private void jButtonInsertDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataActionPerformed

        for (String item : items) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataActionPerformed

    // Menghapus item yang dipilih dari JList
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        dlm.removeElementAt(index);
        
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    // Mengubah item yang dipilih berdasarkan isi TextField
    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int index = jListItem.getAnchorSelectionIndex();
        String selected = jTextFieldNamaItem.getText();
        dlm.setElementAt(selected, index);
        
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    // Menghapus seluruh item dari JList
    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        dlm.clear();
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    // Menyimpan seluruh isi JList ke dalam ArrayList
    private void jButtonSaveListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveListActionPerformed
        if (!items.isEmpty()){
            items.clear();
        }
        
        for(int i = 0; i < dlm.getSize(); i++){
            items.add(dlm.getElementAt(i));
        }
        
        updateJumDataTersimpan();
    }//GEN-LAST:event_jButtonSaveListActionPerformed

    // Set hanya menyimpan data unik (tanpa duplikat)
    private void jButtonSaveSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveSetActionPerformed
        itemSet.clear();

        for(int i = 0; i < dlm.getSize(); i++){
            itemSet.add(dlm.getElementAt(i));
        }

        System.out.println(itemSet);
        updateJumDataTersimpan();
        jLabel1.setText("Data Set = " + itemSet.size());
    }//GEN-LAST:event_jButtonSaveSetActionPerformed

    // Data disimpan dalam pasangan key dan value
    private void jButtonSaveMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveMapActionPerformed
        itemMap.clear();

        for(int i = 0; i < dlm.getSize(); i++){
            itemMap.put(i, dlm.getElementAt(i));
        }

        System.out.println(itemMap);
        updateJumDataTersimpan();
        jLabel2.setText("Data Map = " + itemMap.size());
        
    }//GEN-LAST:event_jButtonSaveMapActionPerformed

    // Menampilkan data dari Set ke JList
    private void jButtonInsertData1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertData1ActionPerformed
        dlm.clear();

        for(String item : itemSet){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertData1ActionPerformed

    // Menampilkan data dari Map ke JList
    private void jButtonInsertData2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertData2ActionPerformed
        dlm.clear();

        for(String item : itemMap.values()){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertData2ActionPerformed

    // Method utama untuk menjalankan program GUI
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new GUISIMPLE2().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertData;
    private javax.swing.JButton jButtonInsertData1;
    private javax.swing.JButton jButtonInsertData2;
    private javax.swing.JButton jButtonSaveList;
    private javax.swing.JButton jButtonSaveMap;
    private javax.swing.JButton jButtonSaveSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelJumlahData;
    private javax.swing.JLabel jLabelNamaItem;
    private javax.swing.JList jListItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNamaItem;
    // End of variables declaration//GEN-END:variables
}
