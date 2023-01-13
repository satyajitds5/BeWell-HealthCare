/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.northeastern.UserInterface.PandemicCenter;

import edu.northeastern.Business.EcoSystem;
import edu.northeastern.Business.PandemicCenter.PandemicCenter;
import edu.northeastern.Business.PandemicCenter.PandemicCenter_Dir;
import edu.northeastern.Business.UserAcc.UserAcc;
import edu.northeastern.Business.WorkQueue.OutbreakTracer;
import edu.northeastern.Business.WorkQueue.OutbreakTracerDir;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author altaf
 */
public class PandemicDisplay extends javax.swing.JPanel {

    private UserAcc userAcc;
    private EcoSystem system;
    private JPanel container;
    /**
     * Creates new form PandemicView
     * @param userProcessContainer
     * @param userAcc
     * @param ecosystem
     */
    public PandemicDisplay(JPanel userProcessContainer, UserAcc userAcc,EcoSystem ecosystem) {
        initComponents();
        this.system = ecosystem;
        this.container = userProcessContainer;
        this.userAcc = userAcc;
        populate_table();
//        Time();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        setResult = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 249, 251));
        setPreferredSize(new java.awt.Dimension(1160, 750));

        jPanel1.setBackground(new java.awt.Color(250, 249, 251));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Covid Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 31, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Location", "Status", "Response"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 853, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        setResult.setBackground(new java.awt.Color(10, 132, 255));
        setResult.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        setResult.setForeground(new java.awt.Color(255, 255, 255));
        setResult.setText("Set Result");
        setResult.setBorder(null);
        setResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setResultActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Positive", "Negative" }));

        jLabel2.setFont(new java.awt.Font("SF Pro Text", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(73, 84, 90));
        jLabel2.setText("Set Label");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(460, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(setResult, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(setResult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 850, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setResultActionPerformed
        // TODO add your handling code here:
        result();
    }//GEN-LAST:event_setResultActionPerformed

    public void populate_table()
    {
        OutbreakTracerDir OTDir = system.getOutbreakStatusDir();
        ArrayList<OutbreakTracer> OTLog= OTDir.getOutbreakLog();
        int size = OTLog.size();
        for(int i=0;i<size;i++)
        {
            OutbreakTracer outBreak = OTLog.get(i);
            PandemicCenter bb=(PandemicCenter)(userAcc);
            if(outBreak.getTestCenter().matches(bb.getName()))
            {
            
                DefaultTableModel table2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(outBreak.getId());
                
                
                String s[]={s1,outBreak.getStatus(),outBreak.getUserName(),outBreak.getTemp(),outBreak.getContact(),outBreak.getSymptoms(),outBreak.getPositive(), outBreak.getAppDate(),outBreak.getResult()};
                table2.addRow(s);
            
            }
         
            
        }
    }

    
    public void result()
      {   
        DefaultTableModel table2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
          if(selectedRow>=0)
              {

              int rowId =Integer.parseInt(table2.getValueAt(selectedRow, 0).toString());
             
              OutbreakTracerDir OTDir = system.getOutbreakStatusDir();
              ArrayList<OutbreakTracer> OTLog = OTDir.getOutbreakLog();
              int size = OTLog.size();
              for(int i=0;i<size;i++)
              {
                  OutbreakTracer outBreak = OTLog.get(i);
                  if(rowId== outBreak.getId())
                  {
                      if(outBreak.getResult().matches("NA"))
                      {
                      if(outBreak.getStatus().matches("Appoinment Booked"))
                      {
                          outBreak.setResult(jComboBox1.getSelectedItem().toString());
                          outBreak.setStatus("Done");
                      }
                      else
                      {
                          JOptionPane.showMessageDialog(null,"Appoinment Canceled");
                      }
                      }


                  }


              }
              jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Status","Name","Temperature","Contact","Symptoms","Postive","Date","Result"}));
              populate_table();



              }
          else
          {
              JOptionPane.showMessageDialog(null,"Row Not selected");
          }           
    }

  
    
    // OutbreakTracer
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton setResult;
    // End of variables declaration//GEN-END:variables
}
