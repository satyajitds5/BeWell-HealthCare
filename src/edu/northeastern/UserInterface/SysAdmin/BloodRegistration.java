/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.northeastern.UserInterface.SysAdmin;

/**
 *
 * @author altaf
 */
import edu.northeastern.Business.EcoSystem;
import edu.northeastern.Business.BloodBank.BloodWork;
import edu.northeastern.Business.BloodBank.BloodWorkDirectory;
import edu.northeastern.Utility.MapCoordinates;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class BloodRegistration extends javax.swing.JPanel {

    /**
     * Creates new form BloodRegistration
     */
    EcoSystem system;
    JPanel rightSidePanel;
    MapCoordinates locationPoint;

    public BloodRegistration(EcoSystem system, JPanel rightSidePanel, MapCoordinates locationPoint) {
        initComponents();
        this.system = system;
        this.rightSidePanel = rightSidePanel;
        this.locationPoint = locationPoint;
        this.setSize(1160, 750);
        displayTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        userNameTextField4 = new javax.swing.JTextField();
        userNameTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        userNameTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        userNameTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        locationInputField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(35, 36, 41));
        setPreferredSize(new java.awt.Dimension(1160, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(35, 36, 41));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Dashboard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Location", "User ID", "Password", "Phone Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 630));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 580, 630));

        jPanel7.setBackground(new java.awt.Color(35, 36, 41));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addButton.setBackground(new java.awt.Color(10, 132, 255));
        addButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(null);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel7.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 140, 39));

        updateButton.setBackground(new java.awt.Color(94, 92, 230));
        updateButton.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel7.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 140, 39));

        deleteButton.setBackground(new java.awt.Color(255, 55, 95));
        deleteButton.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel7.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 140, 39));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Name");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 220, -1));

        userNameTextField4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, 40));

        userNameTextField5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 420, 40));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("User ID");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 220, -1));

        userNameTextField6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 420, 40));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Password");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Phone Number");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 220, -1));

        userNameTextField7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jPanel7.add(userNameTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 420, 40));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Location");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        locationInputField.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        locationInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationInputFieldActionPerformed(evt);
            }
        });
        jPanel7.add(locationInputField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 420, 40));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Create/Modify User Details");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 470, 50));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 470, 630));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:

        if (userNameTextField4.getText().isEmpty() || locationInputField.getText().isEmpty() || userNameTextField5.getText().isEmpty() || userNameTextField7.getText().isEmpty() || userNameTextField6.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
            return;
        }
        String name = (userNameTextField4.getText());
        String location = (locationInputField.getText());
        String pwd = (userNameTextField6.getText());
        String userId = (userNameTextField5.getText());
        String phoneNum = (userNameTextField7.getText());

//              BloodWorkDirectory bloodbankDir = system.getBloodBankDir();
//            ArrayList<BloodWork> list=bloodbankDir.getBloodWorkList();
//            int z= list.size();
//            for(int i=0;i<z;i++)
//            {
//                BloodWork c = list.get(i);
//                c.getUserName();
//                if(c.getUserName().matches(userId))
//                {
//                    JOptionPane.showMessageDialog(null, "User name already exists");
//                    userNameTextField5.setText("");
//                    return;
//                }
//            }
        if (!system.getUserAccDir().checkIfUsernameIsUnique(userId)) {
            JOptionPane.showMessageDialog(null, "User name already exists");
            userNameTextField5.setText("");
            return;
        }

        if (!userNameTextField7.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
            JOptionPane.showMessageDialog(null, " 10 digit phone number");
            userNameTextField7.setText("");
            return;
        }

        if (!userNameTextField6.getText().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")) {
            JOptionPane.showMessageDialog(null, "Password is in incorrect \nFormat. Should be minimum 8 in length "
                    + "with one upper case, one lower case, one digit and one special character");
            userNameTextField6.setText("");
            return;
        }

        BloodWork doc = new BloodWork(name, location, userId, pwd, phoneNum);
        system.getUserAccDir().addAccount(doc);
        system.getBloodBankDir().addBloodWork(doc);

        displayTable();

        locationInputField.setText("");
        userNameTextField4.setText("");
        userNameTextField5.setText("");
        userNameTextField6.setText("");
        userNameTextField7.setText("");


    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String username = userNameTextField5.getText();
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int sRow = jTable1.getSelectedRow();
        if (sRow >= 0) {

            String value = (String) jTable1.getValueAt(sRow, 2);
            BloodWorkDirectory doctorDirectory = system.getBloodBankDir();
            ArrayList<BloodWork> list = doctorDirectory.getBloodWorkList();
            int listsize = list.size();

            if (!username.matches(value)) {
                JOptionPane.showMessageDialog(null, "Cannot Update User ID , it is unique!!");
                locationInputField.setText("");
                userNameTextField4.setText("");
                userNameTextField5.setText("");
                userNameTextField6.setText("");
                userNameTextField7.setText("");
                return;
            }
            if (userNameTextField4.getText().isEmpty() || locationInputField.getText().isEmpty() || userNameTextField5.getText().isEmpty() || userNameTextField7.getText().isEmpty() || userNameTextField6.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "please enter all mandatory fields");
                return;
            }
            if (!userNameTextField7.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                JOptionPane.showMessageDialog(null, " 10 digit phone number");
                userNameTextField7.setText("");
                return;
            }

            if (!userNameTextField6.getText().matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")) {
                JOptionPane.showMessageDialog(null, "Password is in incorrect \nFormat. Should be minimum 8 in length "
                        + "with one upper case, one lower case, one digit and one special character");
                userNameTextField6.setText("");
                return;
            }

            for (int i = 0; i < listsize; i++) {
                BloodWork doc = list.get(i);

                if (doc.getUserName().matches(username)) {
                    if (!userNameTextField7.getText().matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")) {
                        JOptionPane.showMessageDialog(null, " 10 digit phone number");
                        userNameTextField7.setText("");
                        return;
                    }

                    doc.setUserNames(userNameTextField4.getText());
                    doc.setUserLocation(locationInputField.getText());
                    doc.setUserPhone(userNameTextField7.getText());
                    doc.setUserId(userNameTextField5.getText());
                    doc.setPassword(userNameTextField6.getText());

                }
//             else {
//                JOptionPane.showMessageDialog(null, "Cannot Update User ID , it is unique!!");
//            }
            }
            displayTable();

            locationInputField.setText("");
            userNameTextField4.setText("");
            userNameTextField5.setText("");
            userNameTextField6.setText("");
            userNameTextField7.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String username = userNameTextField5.getText();
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int sRow = jTable1.getSelectedRow();
        if (sRow >= 0) {

            String value = (String) table.getValueAt(sRow, 3);
            BloodWorkDirectory doctorDirectory = system.getBloodBankDir();
            ArrayList<BloodWork> list = doctorDirectory.getBloodWorkList();
            int z = list.size();
            for (int i = 0; i < z; i++) {
                BloodWork d = list.get(i);
                if (d.getUserName().matches(username)) {
                    doctorDirectory.removeBloodWork(d);
                    system.getUserAccDir().removeccount(d);

                    break;
                }

            }
            displayTable();
            locationInputField.setText("");
            userNameTextField4.setText("");
            userNameTextField5.setText("");
            userNameTextField6.setText("");
            userNameTextField7.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Row!!");
        }

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Person from table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            userNameTextField4.setText(table.getValueAt(selectedRow, 0).toString());
            locationInputField.setText(table.getValueAt(selectedRow, 1).toString());
            userNameTextField5.setText(table.getValueAt(selectedRow, 2).toString());
            userNameTextField6.setText(table.getValueAt(selectedRow, 3).toString());
            userNameTextField7.setText(table.getValueAt(selectedRow, 4).toString());

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void locationInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationInputFieldActionPerformed

    public void populateLongituteLatitude(MapCoordinates locationPoint) {
        this.locationPoint = locationPoint;
        locationInputField.setText(locationPoint.getLatitudeCoordinate() + ", " + locationPoint.getLongitudeCoordinate());
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField locationInputField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField userNameTextField4;
    private javax.swing.JTextField userNameTextField5;
    private javax.swing.JTextField userNameTextField6;
    private javax.swing.JTextField userNameTextField7;
    // End of variables declaration//GEN-END:variables
 private void displayTable() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        BloodWorkDirectory docDir = system.getBloodBankDir();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (BloodWork doc : docDir.getBloodWorkList()) {
            Object[] row = new Object[6];
            row[0] = doc.getUserNames();
            row[1] = doc.getUserLocation();
            row[2] = doc.getUserId();
            row[3] = doc.getPassword();
            row[4] = doc.getUserPhone();

            model.addRow(row);

        }

    }
}