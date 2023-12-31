
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SC
 */
public class PhoneBook extends javax.swing.JFrame {
    Stack stack = new Stack();
    static Read_Write rw = new Read_Write();
    
    ArrayList <String> searchResult = new ArrayList<>();
    
    
    /**
     * Creates new form PhoneBook
     */
    public PhoneBook() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Favorite = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        Undo = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FavoritesTable = new javax.swing.JTable();
        DeleteFav = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        numField = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        num = new javax.swing.JLabel();
        AddContact = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        searchResultTable = new javax.swing.JTable();
        Search = new javax.swing.JButton();
        searchData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Favorite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-favorite-24.png"))); // NOI18N
        Favorite.setText("Favorite");
        Favorite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FavoriteActionPerformed(evt);
            }
        });

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-save-24.png"))); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-undo-24.png"))); // NOI18N
        Undo.setText("Undo");
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });

        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-trash-16.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Favorite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Undo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Save)
                .addGap(52, 52, 52)
                .addComponent(Favorite)
                .addGap(52, 52, 52)
                .addComponent(Undo)
                .addGap(44, 44, 44)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Contacts", jPanel1);

        FavoritesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(FavoritesTable);

        DeleteFav.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-trash-16.png"))); // NOI18N
        DeleteFav.setText("Delete");
        DeleteFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteFavActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteFav, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(480, Short.MAX_VALUE)
                .addComponent(DeleteFav, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Favorites", jPanel2);

        Name.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Name.setText("Name");

        num.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        num.setText("Contact Number");

        AddContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-add-new-24.png"))); // NOI18N
        AddContact.setText("Add Contact");
        AddContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddContactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddContact, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(AddContact)
                .addGap(113, 113, 113))
        );

        jTabbedPane1.addTab("Add Contact", jPanel3);

        searchResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(searchResultTable);

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-search-24.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Contact");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Search))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(Search)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Search", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddContactActionPerformed
        rw.ll.insertEnd(nameField.getText(), numField.getText());
        rw.ll.traverseForward();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.addRow(new String[]{nameField.getText().trim(),numField.getText().trim()});
        
        
        nameField.setText("");
        numField.setText("");
    }//GEN-LAST:event_AddContactActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        
        if(jTable1.getSelectedRowCount()==1){
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            int index = jTable1.getSelectedRow();
            System.out.println(index);
            model.removeRow(index);
            
            String name,num;
            String[] details = rw.ll.nodeAt(index);
            
            name = details[0];
            num = details[1];
            
            stack.push(name, num);
            stack.peek();
            
            rw.ll.deleteIndex(index+1);

            rw.ll.traverseForward();
            
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void FavoriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FavoriteActionPerformed
        if(jTable1.getSelectedRowCount()==1){
            int index = jTable1.getSelectedRow();
            System.out.println(index);
            String name = (String) jTable1.getValueAt(index, 0);
            String num = (String) jTable1.getValueAt(index, 1);
            
            rw.fav.insertEnd(name, num);
            
            DefaultTableModel favorites = (DefaultTableModel) FavoritesTable.getModel();
            
            favorites.addRow(new String[] {name,num});
            
            rw.fav.printFile("favorites.txt");
            
            System.out.print("Favorites: ");
            rw.fav.traverseForward();
            
        }
    }//GEN-LAST:event_FavoriteActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String input = searchData.getText();
        String output = rw.ll.search(input);
        System.out.println(output);
//--------passing similar search results obtained using rw.ll.SearchAdvanced() and printing in table-------
        DefaultTableModel search = (DefaultTableModel) searchResultTable.getModel();
        
        searchResult.clear();
        search.setRowCount(0);
        
        searchResult = rw.ll.SearchAdvanced(input);
        
        for (int i=0;i<searchResult.size();i+=2) {
               search.addRow(new String[]{searchResult.get(i), searchResult.get(i+1)});
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void DeleteFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteFavActionPerformed
        if(FavoritesTable.getSelectedRowCount()==1){
            
            DefaultTableModel model = (DefaultTableModel) FavoritesTable.getModel();
            
            int index = FavoritesTable.getSelectedRow();
            System.out.println(index);
            model.removeRow(index);
            
            String name,num;
            String[] details = rw.fav.nodeAt(index);
            
            name = details[0];
            num = details[1];
            
            
            rw.fav.deleteIndex(index+1);

            rw.fav.traverseForward();
            
            rw.fav.printFile("favorites.txt");
        }
    }//GEN-LAST:event_DeleteFavActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        rw.ll.printFile("lloutput.txt");
        rw.fav.printFile("favorites.txt");
    }//GEN-LAST:event_SaveActionPerformed

    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        String undoDetails = stack.peek();
        
        if(undoDetails != ""){
            String[] detailsArray = undoDetails.split(",",2);
            stack.pop();
            rw.ll.insertEnd(detailsArray[0], detailsArray[1]);
            model.addRow(detailsArray);
            rw.ll.traverseForward();
            rw.ll.printFile("lloutput.txt");
        }
        else{
            System.out.println("STACK EMPTY! NO CHANGES TO UNDO");
        }

    }//GEN-LAST:event_UndoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        rw.readFile();
        rw.readFavFile();
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
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhoneBook().setVisible(true);
                showEntries();
                showFavEntries();
            }
        });

    }
    public static void showEntries(){
        DefaultTableModel contacts = (DefaultTableModel) jTable1.getModel();
        DefaultTableModel favorites = (DefaultTableModel) FavoritesTable.getModel();
        for(int i=0;i<rw.ll.noOfNodes();i++){
            String[] nameNum = rw.ll.nodeAt(i);
            String name = nameNum[0];
            String num = nameNum[1];
            contacts.addRow(new String[]{name,num});
        }
        
    }
    
    public static void showFavEntries(){
        DefaultTableModel favorites = (DefaultTableModel) FavoritesTable.getModel();
        for(int i=0;i<rw.fav.noOfNodes();i++){
            String[] nameNum = rw.fav.nodeAt(i);
            String name = nameNum[0];
            String num = nameNum[1];
            favorites.addRow(new String[]{name,num});
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddContact;
    private javax.swing.JButton Delete;
    private javax.swing.JButton DeleteFav;
    private javax.swing.JButton Favorite;
    private static javax.swing.JTable FavoritesTable;
    private javax.swing.JLabel Name;
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
    private javax.swing.JButton Undo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel num;
    private javax.swing.JTextField numField;
    private javax.swing.JTextField searchData;
    private javax.swing.JTable searchResultTable;
    // End of variables declaration//GEN-END:variables
}
