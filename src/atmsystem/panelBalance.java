/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

import java.awt.print.PrinterException;
import java.sql.*;
import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author SeeMonster
 */
public class panelBalance extends javax.swing.JPanel {

    String accno;
    Connection con;
    PreparedStatement ps;
    ResultSet res;

    /**
     * Creates new form panelBalance
     */
    public panelBalance(String acc_no) {
       
        this.accno = acc_no;
        initComponents();

    }

    
    public void returnBalance(){
        
            //clear table
       DefaultTableModel dt = ((DefaultTableModel) balanceTable.getModel()) ;
            while(dt.getRowCount()>0)
               dt.removeRow(0);
            //disable editable
            balanceTable.setEnabled(false);
             balanceTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            balanceTable.getColumnModel().getColumn(0).setResizable(true);
        
           try {
            con = DBConnection.connecttoDB();
            ps = con.prepareStatement("select * from accounts WHERE accno=?");
            ps.setString(1, this.accno);
            res = ps.executeQuery();

            int i = 0;
            String balance ="0" ;
            while (res.next()) {

                String rowid = res.getString(1).trim();
                String accno = res.getString(2).trim();
                String fname = res.getString(3).trim();
                String lname = res.getString(4).trim();
                balance = res.getString(5).trim();
                String datetime = res.getString(6).trim();

                //System.out.println(fname);
               
                //table model
                DefaultTableModel dtm = (DefaultTableModel)balanceTable.getModel();
                dtm.setColumnIdentifiers(new String[]{"Row","Account No","Firstname","Lastname","Balance","Date/Time"});
                
                dtm.insertRow(i, new String[]{rowid, accno, fname, lname, balance, datetime});
              
                balanceTable.setModel(dtm);
       
                i++; //insert if there is other rows
            }
           
            labelBalance.setText("Current Balance : " + balance);
            ps.close();
            con.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(panelBalance.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        
        balanceTable = new javax.swing.JTable();
        labelBalance = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonBalance = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Balance");

        jScrollPane2.setAutoscrolls(true);

        balanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Row", "Account No", "First Name", "Last Name", "Balance", "Withdraw", "Deposit", "Date-Time"
            }
        ));
       

        jScrollPane2.setViewportView(balanceTable);

        labelBalance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelBalance.setText("Current Balance :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Details");

        buttonBalance.setText("Print");
        buttonBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBalanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonBalance)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelBalance, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonBalance)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBalanceActionPerformed
        try {
            // TODO add your handling code here:
            
            LocalDate date = LocalDate.now();
            LocalTime time = LocalTime.now();
            balanceTable.print(JTable.PrintMode.FIT_WIDTH, new MessageFormat("Balance Sheet"),
                    new MessageFormat("Date : " +date +" "+time ));
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null, "Cannot be printed "+ex.getMessage());
        }
    }//GEN-LAST:event_buttonBalanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable balanceTable;
    private javax.swing.JButton buttonBalance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelBalance;
    // End of variables declaration//GEN-END:variables
}
