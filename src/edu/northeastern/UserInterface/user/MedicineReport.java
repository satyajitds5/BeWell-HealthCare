/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.northeastern.UserInterface.user;

import edu.northeastern.Business.EcoSystem;

import edu.northeastern.Business.UserAcc.UserAcc;
import edu.northeastern.Business.WorkQueue.Req_Medicine;
import edu.northeastern.Business.WorkQueue.Req_MedicineDir;
import edu.northeastern.Business.userR.User;
import edu.northeastern.Utility.Notification;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author satyajitdas
 */
public class MedicineReport extends javax.swing.JPanel {

    EcoSystem system;
    JPanel rightSidePanel;
    /**
     * Creates new form BloodDonations
     * 
     * @param system
     * @param rightSidePanel
     */

    UserAcc userAcc;

    public MedicineReport(JPanel rightSidePanel, EcoSystem system, UserAcc userAcc) {
        initComponents();
        this.rightSidePanel = rightSidePanel;
        this.system = system;
        this.userAcc = userAcc;
        displayTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPharma = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextMedicine = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCost = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        collectOrder = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Report Medicine");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tblPharma.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "ID", "Doctor Name", "Pharmacy", "Status"
                }));
        tblPharma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPharmaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPharma);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 540));

        jTextMedicine.setColumns(20);
        jTextMedicine.setRows(5);
        jTextMedicine.setPreferredSize(new java.awt.Dimension(200, 100));
        jScrollPane2.setViewportView(jTextMedicine);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 440, 140));

        txtCost.setColumns(20);
        txtCost.setRows(5);
        txtCost.setPreferredSize(new java.awt.Dimension(200, 100));
        jScrollPane3.setViewportView(txtCost);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 440, 150));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Total Cost :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 180, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("List of all Medicines :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 270, -1));

        collectOrder.setBackground(new java.awt.Color(10, 132, 255));
        collectOrder.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        collectOrder.setForeground(new java.awt.Color(255, 255, 255));
        collectOrder.setText("Collect the Order");
        collectOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectOrderActionPerformed(evt);
            }
        });
        jPanel1.add(collectOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 630, 210, 39));

        cancelButton.setBackground(new java.awt.Color(255, 55, 95));
        cancelButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel the Order");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, 200, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1148, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
    }// </editor-fold>//GEN-END:initComponents

    private void tblPharmaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tblPharmaMouseClicked
        // TODO add your handling code here:
        txtCost.setText("");
        jTextMedicine.setText("");

        DefaultTableModel table = (DefaultTableModel) tblPharma.getModel();
        int selectedRow = tblPharma.getSelectedRow();
        int sRow = Integer.parseInt(table.getValueAt(selectedRow, 0).toString());

        Req_MedicineDir medDir = system.getMedicineReqDir();
        ArrayList<Req_Medicine> listorder = medDir.getMedReqDir();
        int l = listorder.size();
        for (int i = 0; i < l; i++) {
            Req_Medicine medReq = listorder.get(i);
            if (sRow == medReq.getId()) {
                Map<String, String> orderMap = medReq.getMedOrderlist();
                int count = 1;
                for (String key : orderMap.keySet()) {
                    jTextMedicine.append("Item " + count + " : " + key + " Quantity : " + orderMap.get(key) + "\n");
                    count++;

                }
                Map<String, String> orderMap2 = medReq.getMedCostlist();
                int n = 0;
                for (String key : orderMap2.keySet()) {

                    n = n + (Integer.parseInt(orderMap2.get(key)));

                }
                txtCost.append(String.valueOf(n));

            }
        }
    }// GEN-LAST:event_tblPharmaMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:

    }// GEN-LAST:event_jScrollPane1MouseClicked

    private void collectOrderActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_collectOrderActionPerformed
        // TODO add your handling code here:
        orderCollection();

    }// GEN-LAST:event_collectOrderActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:

        cancelOrder();

    }// GEN-LAST:event_cancelButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton collectOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextMedicine;
    private javax.swing.JTable tblPharma;
    private javax.swing.JTextArea txtCost;
    // End of variables declaration//GEN-END:variables

    private void displayTable() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        Req_MedicineDir medDir = system.getMedicineReqDir();
        ArrayList<Req_Medicine> order = medDir.getMedReqDir();
        int l = order.size();
        User r = (User) userAcc;
        for (int i = 0; i < l; i++) {
            Req_Medicine reqMed = order.get(i);
            if (reqMed.getPatientId().matches(r.getUserId())) {
                DefaultTableModel table = (DefaultTableModel) tblPharma.getModel();
                String s1 = String.valueOf(reqMed.getId());

                String s[] = { s1, reqMed.getDoctorName(), reqMed.getPharmaName(), reqMed.getStatus() };
                table.addRow(s);

            }
        }

    }

    private void orderCollection() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        DefaultTableModel t2 = (DefaultTableModel) tblPharma.getModel();
        int selectedRow = tblPharma.getSelectedRow();
        if (selectedRow >= 0) {
            int s = Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
            System.out.println("id" + s);
            Req_MedicineDir dire = system.getMedicineReqDir();
            ArrayList<Req_Medicine> order = dire.getMedReqDir();
            int u = order.size();

            for (int i = 0; i < u; i++) {
                Req_Medicine o = order.get(i);
                if (s == o.getId()/* &&o.getStatus().matches("Deliver Man Assigned") */) {
                    if (o.getStatus().matches("Ready for pickup")) {
                        o.setStatus("Order Recieved");
                        JOptionPane.showMessageDialog(null, "Order Received, Successfully.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Move!!");

                    }
                }
            }
            tblPharma.setModel(new DefaultTableModel(null, new String[] { "ID", "Doctor Name", "Pharmacy", "Status" }));
            displayTable();
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }

    }

    public void sendmail(String subject, String content) {
        Notification notification = new Notification();
        String toEmail = "satyajitds5@gmail.com";
        String emailSubject = subject;
        String emailContent = content;
        notification.sendMail(toEmail, emailSubject, emailContent);
    }

    private void cancelOrder() {
        // throw new UnsupportedOperationException("Not supported yet."); // Generated
        // from
        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        DefaultTableModel t2 = (DefaultTableModel) tblPharma.getModel();
        int selectedRow = tblPharma.getSelectedRow();
        if (selectedRow >= 0) {
            int s = Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
            System.out.println("id" + s);
            Req_MedicineDir dire = system.getMedicineReqDir();
            ArrayList<Req_Medicine> order = dire.getMedReqDir();

            int u = order.size();

            for (int i = 0; i < u; i++) {
                Req_Medicine o = order.get(i);
                if (s == o.getId()/* &&o.getStatus().matches("Deliver Man Assigned") */) {
                    if (!o.getStatus().matches("Order Recieved")) {
                        o.setStatus("Cancelled");
                        String subject = "Request Cancelled";
                        String content = "Medicine request was cancelled.";
                        sendmail(subject, content);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong Move!!");

                    }

                }
            }
            tblPharma.setModel(new DefaultTableModel(null, new String[] { "ID", "Doctor Name", "Pharmacy", "Status" }));
            displayTable();
        } else {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }

    }
}
