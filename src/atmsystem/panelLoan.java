/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsystem;

import java.awt.PrintJob;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.*;
import java.text.MessageFormat;

import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javax.print.PrintException;

/**
 *
 * @author SeeMonster
 */
public class panelLoan extends javax.swing.JPanel {

    double intrate, loanamount, noofyears, paypermonth, totalpay;
    String accno;
    String  datetime = LocalDateTime.now().toString();;

    /**
     * Creates new form panelBalance
     */
    public panelLoan(String accno) {

        this.accno = accno;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        textintrate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textloanamount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textnoOfYears = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textpayPerMonth = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textpayTotal = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPaneInvoice = new javax.swing.JTextPane();
        btnLoan = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblmessage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Loan Panel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Interest Rate :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Enter interest rate(ifor 5% type 5 ),amount of loan and number of years ");

        textintrate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textintrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textintrateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Amount :");

        textloanamount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textloanamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textloanamountActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Number Of Years :");

        textnoOfYears.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textnoOfYears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnoOfYearsActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Payment per Month :");

        textpayPerMonth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textpayPerMonth.setEnabled(false);
        textpayPerMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpayPerMonthActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Total Payment :");

        textpayTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textpayTotal.setEnabled(false);
        textpayTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpayTotalActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 102, 255));
        jLabel12.setText("You need to pay the amount of money calculated below");

        textPaneInvoice.setEnabled(false);
        jScrollPane1.setViewportView(textPaneInvoice);

        btnLoan.setText("Loan");
        btnLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoanActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.setEnabled(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Invoice");

        btnCalc.setText("Calculate");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 102, 255));
        jLabel13.setText("press Calculate to see preview of Loan,press Clear to clear form,");

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 102, 255));
        jLabel14.setText("press Loan to get  tha loan and then press Print to get the Invoice");

        lblmessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmessage.setText("Message:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(29, 29, 29)
                                    .addComponent(textnoOfYears, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                        .addComponent(textintrate, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textloanamount, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(47, 47, 47)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textpayPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textpayTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(lblmessage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnClear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalc)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLoan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPrint))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLoan)
                            .addComponent(btnClear)
                            .addComponent(btnPrint)
                            .addComponent(btnCalc)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textintrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(textloanamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(textnoOfYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(textpayPerMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(textpayTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmessage)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textintrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textintrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textintrateActionPerformed

    private void textloanamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textloanamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textloanamountActionPerformed

    private void textnoOfYearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnoOfYearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnoOfYearsActionPerformed

    private void textpayPerMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpayPerMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpayPerMonthActionPerformed

    private void textpayTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpayTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpayTotalActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:

        textintrate.setText("");
        textloanamount.setText("");
        textnoOfYears.setText("");
        textpayPerMonth.setText("");
        textpayTotal.setText("");
        textPaneInvoice.setText("");
        lblmessage.setText("Message :");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoanActionPerformed

        if (!textPaneInvoice.getText().isEmpty()) {
            try {
                // insert a new row into db table:

                Connection con = DBConnection.connecttoDB();
                PreparedStatement ps = con.prepareStatement("insert into loans(accno ,int_rate ,num_of_years ,amount_of_loan ,montly_payment ,total_payment ,datetime ) VALUES(?,?,?,?,?,?,?)");
                ps.setString(1, this.accno);
                ps.setDouble(2, intrate);
                ps.setDouble(3, noofyears);
                ps.setDouble(4, loanamount);
                ps.setString(5, String.format("%.2f",paypermonth) );
                ps.setString(6, String.format("%.2f",totalpay));
                ps.setString(7, datetime);
                ps.executeUpdate();

                ps.close();
                con.close();

                lblmessage.setText("Message :Your loan request is taken into consider.");
                btnPrint.setEnabled(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(panelLoan.class.getName()).log(Level.SEVERE, null, ex);
            }


    }//GEN-LAST:event_btnLoanActionPerformed
    else {

            lblmessage.setText("Message:Fill the form fields then press Calculate");

        }
    }


    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed

        lblmessage.setText("Message :");
        if ((!textintrate.getText().isEmpty())
                && (!textloanamount.getText().isEmpty())
                && (!textnoOfYears.getText().isEmpty())) {

           

            // TODO add your handling code here:
            intrate = Double.parseDouble(textintrate.getText());
            loanamount = Double.parseDouble(textloanamount.getText());
            noofyears = Double.parseDouble(textnoOfYears.getText());

            //monthly interest rate
            totalpay = (loanamount * Math.pow(1 + intrate / 1200, 12 * noofyears));
            paypermonth = totalpay / (12 * noofyears);
            textpayTotal.setText(String.format("$ %.2f", totalpay));
            textpayPerMonth.setText(String.format("$ %.2f", paypermonth));

            //fill invoice 
            String str = "";

            str += "........ XYZ BANK........\n";
            str += "Interest Rate(annually) :\t..." + intrate + "\n";
            str += "Loan Amount :\t..." + loanamount + "\n";
            str += "Number Of Years :\t..." + noofyears + "\n";
            str += "Payment per Month :\t..." + String.format("$ %.2f", paypermonth) + "\n";
            str += "Total Payment :\t..." + String.format("$ %.2f", totalpay) + "\n";
            str += "Date/Time :\t..." + datetime + "\n\n";
            str += "........ Enjoy the Money !........";

            textPaneInvoice.setText(str);
            textPaneInvoice.setSize(350, 300);
    }//GEN-LAST:event_btnCalcActionPerformed
        else {
            lblmessage.setText("Fill the form fields then press Calculate");
        }

    }
    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // print invoice
        PrinterJob pjob = PrinterJob.getPrinterJob();
        Printable p = textPaneInvoice.getPrintable(
                new MessageFormat("INVOICE OF LOAN BY XYZ BANK"),
                new MessageFormat(""));
        pjob.setPrintable(p);
        
        boolean printAccepted = pjob.printDialog();
        if(printAccepted){
            
            try {
                
                pjob.print();
                btnClear.doClick();
                
            } catch (PrinterException ex) {
                Logger.getLogger(panelLoan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        

    }//GEN-LAST:event_btnPrintActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLoan;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblmessage;
    private javax.swing.JTextPane textPaneInvoice;
    private javax.swing.JTextField textintrate;
    private javax.swing.JTextField textloanamount;
    private javax.swing.JTextField textnoOfYears;
    private javax.swing.JTextField textpayPerMonth;
    private javax.swing.JTextField textpayTotal;
    // End of variables declaration//GEN-END:variables
}
