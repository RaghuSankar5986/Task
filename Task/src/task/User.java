package task;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class User extends javax.swing.JFrame {

    Connection Con=null;
    ResultSet Rs=null;
    Statement St=null;
    public User() {
        initComponents();
        ShowCustomers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CNameTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AddressTb = new javax.swing.JTextField();
        GenderCb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerList = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        EdtBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        PhoneTb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        SearchTb = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        DOB = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel1)
                .addContainerGap(537, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        CNameTb.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        CNameTb.setForeground(new java.awt.Color(51, 51, 51));
        CNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNameTbActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Gender");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Phone");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Address");

        AddressTb.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        AddressTb.setForeground(new java.awt.Color(51, 51, 51));

        GenderCb.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        GenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        CustomerList.setBackground(new java.awt.Color(0, 102, 102));
        CustomerList.setFont(new java.awt.Font("Yu Gothic Light", 0, 12)); // NOI18N
        CustomerList.setForeground(new java.awt.Color(255, 255, 255));
        CustomerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone", "Gender", "Adress", "Date Of Birth"
            }
        ));
        CustomerList.setGridColor(new java.awt.Color(0, 51, 51));
        CustomerList.setRowHeight(32);
        CustomerList.setRowMargin(1);
        CustomerList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CustomerList);

        AddBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EdtBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        EdtBtn.setText("Edit");
        EdtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EdtBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Name");

        PhoneTb.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        PhoneTb.setForeground(new java.awt.Color(51, 51, 51));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Yu Gothic Light", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Date Of Birth");

        SearchTb.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        SearchTb.setForeground(new java.awt.Color(51, 51, 51));
        SearchTb.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                SearchTbCaretUpdate(evt);
            }
        });
        SearchTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTbActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Refreash");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CNameTb)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(GenderCb, 0, 240, Short.MAX_VALUE)
                            .addComponent(PhoneTb)
                            .addComponent(AddressTb, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(AddBtn)
                                .addGap(61, 61, 61)
                                .addComponent(EdtBtn))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(DeleteBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(SearchTb, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addGap(46, 46, 46))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(3, 3, 3)
                        .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(AddressTb, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdtBtn)
                            .addComponent(AddBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SearchTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(DeleteBtn)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnMouseClicked

    private void ShowCustomers()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from Customer ");
            CustomerList.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    private void Search()
    {
        try
        {
            Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from Customer where CustName like '"+SearchTb.getText()+"%'");
            CustomerList.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }    
    int Cid;
    private void CountCustomers()
    {
        try
        {
            St=Con.createStatement();
            Rs=St.executeQuery("select Max(CustNum) from Customer");
            Rs.next();
            Cid=Rs.getInt(1)+1;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        if(CNameTb.getText().isEmpty()||GenderCb.getSelectedIndex()==-1||PhoneTb.getText().isEmpty()||AddressTb.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(this,"Missing Data!!!");
      }
      else{
          try
          {   
          String TheDOB=DOB.getDate().toString().substring(1,14);
          CountCustomers();
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","");
          PreparedStatement Save =Con.prepareStatement("insert into Customer values(?,?,?,?,?,?)");
          Save.setInt(1, Cid);
          Save.setString(2, CNameTb.getText().toString());
          Save.setString(3, PhoneTb.getText().toString());
          Save.setString(4, GenderCb.getSelectedItem().toString());
          Save.setString(5, AddressTb.getText().toString());
          Save.setString(6,TheDOB);
          int row=Save.executeUpdate();
          JOptionPane.showMessageDialog(this, "Customer Added");
          ShowCustomers();
          Con.close();
          }
              catch (SQLException ex) 
              {
              JOptionPane.showMessageDialog(this, ex);    
              }
      }
      
    }//GEN-LAST:event_AddBtnActionPerformed
    int Key=0;
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        if(Key==0)
      {
          JOptionPane.showMessageDialog(this,"Select a Customers!!!");
      }
      else{
          try
          {   
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","");
          PreparedStatement Save =Con.prepareStatement("delete from Customer where CustNum = ?");
          Save.setInt(1, Key);
          int row=Save.executeUpdate();
          JOptionPane.showMessageDialog(this, "Customer Deleted");
          ShowCustomers();
          Con.close();
               
          }
              catch (Exception ex) 
              {
              JOptionPane.showMessageDialog(this, ex);    
              }
      }
      
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void CustomerListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerListMouseClicked
         DefaultTableModel model=(DefaultTableModel)CustomerList.getModel();
        int MyIndex=CustomerList.getSelectedRow();
        Key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        CNameTb.setText(model.getValueAt(MyIndex,1).toString());
        PhoneTb.setText(model.getValueAt(MyIndex,2).toString());
        GenderCb.setSelectedItem(model.getValueAt(MyIndex,3).toString());
        AddressTb.setText(model.getValueAt(MyIndex,4).toString());
    }//GEN-LAST:event_CustomerListMouseClicked

    private void EdtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EdtBtnMouseClicked
        if(CNameTb.getText().isEmpty()||GenderCb.getSelectedIndex()==-1||PhoneTb.getText().isEmpty()||AddressTb.getText().isEmpty())
      {
          JOptionPane.showMessageDialog(this,"Missing Data!!!");
      }
      else{
          try
          {   
          String TheDOB=DOB.getDate().toString().substring(1,14);
          CountCustomers();
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","");
          PreparedStatement Save =Con.prepareStatement("Update Customer set custname=?,custphone=?,custgen=?,custadd=?,custdob=? where custnum=?");
          Save.setInt(6, Key);
          Save.setString(1, CNameTb.getText().toString());
          Save.setString(2, PhoneTb.getText().toString());
          Save.setString(3, GenderCb.getSelectedItem().toString());
          Save.setString(4, AddressTb.getText().toString());
          Save.setString(5,TheDOB);
          int row=Save.executeUpdate();
          JOptionPane.showMessageDialog(this, "Customer Updated");
          ShowCustomers();
          Con.close();
          }
              catch (SQLException ex) 
              {
              JOptionPane.showMessageDialog(this, ex);    
              }
      }
      
    }//GEN-LAST:event_EdtBtnMouseClicked

    private void SearchTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTbActionPerformed
        
    }//GEN-LAST:event_SearchTbActionPerformed

    private void SearchTbCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_SearchTbCaretUpdate
        Search();
    }//GEN-LAST:event_SearchTbCaretUpdate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ShowCustomers();
        SearchTb.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CNameTbActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField AddressTb;
    private javax.swing.JTextField CNameTb;
    private javax.swing.JTable CustomerList;
    private com.toedter.calendar.JDateChooser DOB;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EdtBtn;
    private javax.swing.JComboBox<String> GenderCb;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JTextField SearchTb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
