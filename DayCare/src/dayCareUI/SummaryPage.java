/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayCareUI;

import static Classes.Demo.studentRatioRules;
import Classes.School;
import Classes.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nithin Bharadwaj
 */
public class SummaryPage extends javax.swing.JPanel {

    /**
     * Creates new form SummaryPage
     */
    School instance;
    public SummaryPage() {
        initComponents();
        instance = School.getInstance();
        Map<String, Integer> studentDistribution = this.getAgeDistribution(instance.getStudentlist());
        Map<String, Integer> groupDistribution = this.getGroupsDistribution(studentDistribution);
        this.populateTable(groupDistribution);
    }

    public Map<String, Integer> getAgeDistribution(List<Student> studentList){
        Map<String, Integer> studentDistribution = new HashMap<String, Integer>();
        for(Student pk : studentList){
            if (studentDistribution.containsKey(pk.getAgeGroup())) {

                studentDistribution.put(pk.getAgeGroup(),
                        studentDistribution.get(pk.getAgeGroup()) + 1);
            }
            else {
 
                studentDistribution.put(pk.getAgeGroup(), 1);
            }
            
        }
        return studentDistribution;
    }
    
    public Map<String, Integer> getGroupsDistribution(Map<String, Integer> studentDistribution){
        Map<String, Integer> groupDistribution = new HashMap<String, Integer>();
        
        for (Map.Entry entry : studentDistribution.entrySet()) {
            int maxSize = studentRatioRules.get(entry.getKey());
            System.out.println("Processing for Key : " + entry.getKey());
                groupDistribution.put(entry.getKey().toString(),
                     1 + (Integer.parseInt(entry.getValue().toString())/ maxSize));   
        }
        return groupDistribution;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSummary = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tblSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Age(Months)", "Number of Groups"
            }
        ));
        jScrollPane1.setViewportView(tblSummary);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SUMMARY PAGE ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(Map<String, Integer> groupDistribution){
        DefaultTableModel dtm = (DefaultTableModel) tblSummary.getModel();
        dtm.setRowCount(0);
        for (Map.Entry entry : groupDistribution.entrySet()) {
            Object [] row = new Object[2];
            row[0] = entry.getKey().toString();
            row[1] = entry.getValue().toString();
            dtm.addRow(row);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSummary;
    // End of variables declaration//GEN-END:variables
}
