/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author SeeMonster
 */
public class panelDeposit extends javax.swing.JPanel {

    /**
     * Creates new form panelBalance
     */
    Connection con;
    PreparedStatement ps;
    ResultSet res;
    String curbal = "";
    String accno ;
    public panelDeposit(String accno) {

        this.accno = accno ;
        initComponents();
        returnBalance();
       
    }
    
    //functions
     public void returnBalance(){
            
         con =  DBConnection.connecttoDB();
        try {
            
            ps =   con.prepareStatement("select balance from accounts WHERE accno=?");
            ps.setString(1, accno);
            res = ps.executeQuery();
            if(res.next()){
                curbal = res.getString("balance");
            }
            
            res.close();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(panelDeposit.class.getName()).log(Level.SEVERE, null, ex);
        }
       //show current balance
       balanceLabel.setText("Current Balance :" + curbal );
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
        upbalanceLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textAmount = new javax.swing.JTextField();
        balanceLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDeposit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Deposit Money");

        upbalanceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        upbalanceLabel.setText("Message :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Amount :");

        textAmount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        balanceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balanceLabel.setText("Current Balance :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Enter the amount please ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDeposit)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(upbalanceLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(135, 135, 135)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(balanceLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(69, 69, 69)
                                    .addComponent(textAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(balanceLabel)
                .addGap(4, 4, 4)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(btnDeposit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(upbalanceLabel)
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        // TODO add your handling code here:
        int amount = Integer.parseInt( textAmount.getText() ) ;
        int curbal2 = Integer.parseInt(curbal);
        
        //deposit money
        if(amount > 0){
            
        try {
            con =  DBConnection.connecttoDB();
            ps =   con.prepareStatement("update accounts SET balance=? WHERE accno=?");
            
            int newbal = curbal2 + amount;
            ps.setInt(1, newbal );
            ps.setString(2, this.accno);
            ps.executeUpdate();
            
            ps.close();
            
            ps = con.prepareStatement("insert into transactions(accno,fromaccno,toaccno,deposit,withdraw,transfer,balance ,datetime) VALUES(?,?,?,?,?,?,?,?)");         
            ps.setString(1,this.accno);
            ps.setString(2,this.accno);
            ps.setString(3,this.accno);
            ps.setInt(4,amount);
            ps.setInt(5,0);
            ps.setInt(6,0);
            ps.setInt(7,newbal);
            ps.setString(8,LocalDateTime.now().toString());
            ps.executeUpdate();
            
            ps.close();
            con.close();
            
            textAmount.setText("");
            upbalanceLabel.setText("Message :" +" Balance is updated successfully ...");
        } catch (SQLException ex) {
            Logger.getLogger(panelDeposit.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }else{
            JOptionPane.showMessageDialog(null, "Invalid amount!");
            textAmount.setText("");
        }
        
         returnBalance(); //show new balance
         
         //save money transaction
         
         
    }//GEN-LAST:event_btnDepositActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField textAmount;
    private javax.swing.JLabel upbalanceLabel;
    // End of variables declaration//GEN-END:variables
}
