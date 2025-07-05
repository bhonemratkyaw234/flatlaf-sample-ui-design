/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdminPanels;

import ManagementUi.AdminMain;
import swingComponents.PanelButtons;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

/**
 *
 * @author HP
 */
public class DutyRoster extends javax.swing.JPanel {
    private String userRole;
     
    /**
     * Creates new form DutyRoster
     */
    public DutyRoster(String userRole) {
        
        initComponents();
        DutyRosterTables.setLayout(new CardLayout());
        DutyRosterTables.add(FirstTable, "first");
        
        if("teamleader".equalsIgnoreCase(userRole)) {
            TeamSelectCombo.setEnabled(false);
        }
        
        
    }

  
    
    
    
    public void switchDutyTables(String panelName) {
    CardLayout card = (CardLayout) DutyRosterTables.getLayout();
    card.show(DutyRosterTables, panelName);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DutyRosterInputs = new javax.swing.JPanel();
        FirstInput = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new swingComponents.PanelButtons("rostedsr");
        transparentComboBox1 = new swingComponents.transparentComboBox();
        transparentTextfield2 = new swingComponents.transparentTextfield();
        jLabel8 = new javax.swing.JLabel();
        transparentComboBox2 = new swingComponents.transparentComboBox();
        SecondInput = new javax.swing.JPanel();
        DutyRosterTables = new javax.swing.JPanel();
        FirstTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoster = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnRefresh = new PanelButtons("jdb");
        btnSearch = new swingComponents.PanelButtons("fer");
        jButton9 = new swingComponents.PanelButtons("sster");
        transparentTextfield1 = new swingComponents.transparentTextfield();
        jButton10 = new PanelButtons("er");
        btnAdd = new PanelButtons("rdser");
        btnEdit = new PanelButtons("rster");
        btnRemove = new PanelButtons("dknd");
        jLabel9 = new javax.swing.JLabel();
        TeamSelectCombo = new swingComponents.transparentComboBox();

        setPreferredSize(new java.awt.Dimension(1267, 754));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DutyRosterInputs.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Staff ID    :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Shift Code:");

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton8.setText("Notice!");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        transparentComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CODE:12AM_08AM", "CODE:01AM_09AM", "CODE:02AM_10AM", "CODE:03AM_11AM", "CODE:04AM_12AM", "CODE:05AM_01PM", "CODE:06AM_02PM", "CODE:07AM_03PM", "CODE:08AM_04PM", "CODE:09AM_05PM", "CODE:10AM_06PM", "CODE:11AM_07PM", "CODE:12PM_08PM", "CODE:01PM_09PM", "CODE:02PM_10PM", "CODE:03PM_11PM", "CODE:04PM_12AM", "CODE:05PM_01AM", "CODE:06PM_02AM", "CODE:07PM_03AM", "CODE:08PM_04AM", "CODE:09PM_05AM", "CODE:10PM_06AM", "CODE:11PM_07AM" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Select Team :");

        transparentComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ep", "Network", "Civil", "Programming" }));
        transparentComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transparentComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FirstInputLayout = new javax.swing.GroupLayout(FirstInput);
        FirstInput.setLayout(FirstInputLayout);
        FirstInputLayout.setHorizontalGroup(
            FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstInputLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(transparentTextfield2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transparentComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transparentComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FirstInputLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );
        FirstInputLayout.setVerticalGroup(
            FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstInputLayout.createSequentialGroup()
                .addComponent(jButton8)
                .addGap(48, 48, 48)
                .addGroup(FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(transparentComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(transparentTextfield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FirstInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(transparentComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(353, Short.MAX_VALUE))
        );

        DutyRosterInputs.add(FirstInput, "card2");

        javax.swing.GroupLayout SecondInputLayout = new javax.swing.GroupLayout(SecondInput);
        SecondInput.setLayout(SecondInputLayout);
        SecondInputLayout.setHorizontalGroup(
            SecondInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        SecondInputLayout.setVerticalGroup(
            SecondInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        DutyRosterInputs.add(SecondInput, "card3");

        add(DutyRosterInputs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 410, 540));

        tblRoster.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblRoster);

        javax.swing.GroupLayout FirstTableLayout = new javax.swing.GroupLayout(FirstTable);
        FirstTable.setLayout(FirstTableLayout);
        FirstTableLayout.setHorizontalGroup(
            FirstTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        FirstTableLayout.setVerticalGroup(
            FirstTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FirstTableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout DutyRosterTablesLayout = new javax.swing.GroupLayout(DutyRosterTables);
        DutyRosterTables.setLayout(DutyRosterTablesLayout);
        DutyRosterTablesLayout.setHorizontalGroup(
            DutyRosterTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FirstTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        DutyRosterTablesLayout.setVerticalGroup(
            DutyRosterTablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FirstTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(DutyRosterTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 820, 540));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Duty Roster");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 210, -1));

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 620, 80, -1));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setText(":Search");
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, 80, 30));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setText("<---");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 620, 70, -1));
        add(transparentTextfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 140, -1));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton10.setText("--->");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 70, -1));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 620, 70, -1));

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 620, 70, -1));

        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemove.setText("REMOVE");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 620, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Select Team :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 44, -1, -1));

        TeamSelectCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ep", "Network", "Civil", "Programming" }));
        add(TeamSelectCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       switchDutyTables("first");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      
       switchDutyTables("second");  
                                           
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        JOptionPane.showMessageDialog(this, "1. min_interval (Subsequent shift should be planned by 8 hours interval)\n" +
            "2. roster_interval (Roster planning should be arranged prior to 7 days ahead) ", "Roster Policy!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void transparentComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transparentComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transparentComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DutyRosterInputs;
    private javax.swing.JPanel DutyRosterTables;
    private javax.swing.JPanel FirstInput;
    private javax.swing.JPanel FirstTable;
    private javax.swing.JPanel SecondInput;
    private swingComponents.transparentComboBox TeamSelectCombo;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRoster;
    private swingComponents.transparentComboBox transparentComboBox1;
    private swingComponents.transparentComboBox transparentComboBox2;
    private swingComponents.transparentTextfield transparentTextfield1;
    private swingComponents.transparentTextfield transparentTextfield2;
    // End of variables declaration//GEN-END:variables
}
