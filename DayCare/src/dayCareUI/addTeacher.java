/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayCareUI;

import Classes.School;
import Classes.Teacher;
import Classes.TeacherFactory;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import utility.Validation;

/**
 *
 * @author Nithin Bharadwaj
 */
public class addTeacher extends javax.swing.JPanel {

    /**
     * Creates new form addTeacher
     */
    School instance;

    public addTeacher() {
        initComponents();
        instance = School.getInstance();
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
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbDataOfBirth = new javax.swing.JLabel();
        txtDataOfBirth = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtWage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtContactName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCredits = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD TEACHER DETAILS");

        lbName.setText("Name : ");

        lbDataOfBirth.setText("Date of Birth (MM-DD-YYYY) :");

        jLabel2.setText("Wage :");

        jLabel3.setText("Emergency Contact Name :");

        jLabel4.setText("Emergency Phone Number : ");

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Age :");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jLabel6.setText("Credits :");

        jLabel7.setText("ID :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(lbDataOfBirth)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDataOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(txtWage)
                            .addComponent(txtContactName)
                            .addComponent(txtPhoneNumber)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAge)
                            .addComponent(txtCredits)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDataOfBirth)
                            .addComponent(txtDataOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtWage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtContactName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        boolean nameValidation = Validation.validateName(txtName);
        boolean dateOfBirthValidation = Validation.validateDateOfBirth(txtDataOfBirth.getText());
        boolean wageValidation = Validation.validateWage(txtWage);
        boolean contactNameValidation = Validation.validateName(txtContactName);
        boolean contactPhoneValidation = Validation.validatePhoneNumber(txtPhoneNumber);
        boolean ageValidation = Validation.validateAge(txtAge);
        boolean creditsValidation = Validation.validateCredits(txtCredits);
        if (nameValidation && dateOfBirthValidation && wageValidation && contactNameValidation
                && contactPhoneValidation && ageValidation && creditsValidation) {
            String name = txtName.getText();
            String dateOfBirthStr = txtDataOfBirth.getText();
            Date dob = null;
            try {
                dob = new SimpleDateFormat("MM-dd-yyyy").parse(dateOfBirthStr);
            } catch (Exception e) {
                System.err.println("Exception ocurred : " + e);
            }
            int id = Integer.parseInt(txtID.getText());
            int age = Integer.parseInt(txtAge.getText());
            int salary = Integer.parseInt(txtWage.getText());
            int credits = Integer.parseInt(txtCredits.getText());
            String contactName = txtContactName.getText();
            String phoneNumber = txtPhoneNumber.getText();
            JOptionPane.showMessageDialog(this, "Info saved successfully");
            Teacher teacher = TeacherFactory.getObject(id, dob, age, name, credits, salary);
//            100001,20-12-2021,34,Nithin_TEACHER,3,3000
//            String pattern = "MM-dd-yyyy";
//            DateFormat df = new SimpleDateFormat(pattern);
//            String dobValue = df.format(teacher.getDateOfBirth());
//            StringBuilder sb = new StringBuilder();
//            sb.append(Integer.toString(teacher.getId()));
//            sb.append(",");
//            sb.append(dobValue);
//            sb.append(",");
//            sb.append(Integer.toString(teacher.getAge()));
//            sb.append(",");
//            sb.append(teacher.getName());
//            sb.append(",");
//            sb.append(Integer.toString(teacher.getCredits()));
//            sb.append(",");
//            sb.append(Integer.toString(teacher.getSalary()));
//            Path teacherPathToDumpFile = Paths.get("", "src", "Resources", "Teachers.csv");
//            String teacherCsvFile = teacherPathToDumpFile.toAbsolutePath().toString();
//            TeacherFactory.addTeacherObject(teacherCsvFile, sb.toString());
            JOptionPane.showMessageDialog(this, "Added New Teacher to the System Successfully");
        } else {
            String errorMessage = String.format("Teacher info NOT SAVED!!! \n"
                    + "Name valid: %s \n Date of Birth Valid : %s \n"
                    + "Wage Valid : %s\n Contact Name Validation: %s \n"
                    + "contactPhoneValidation Valid : %s \n" + "Age Valid: %s \n"
                    + "Credits Valid : %s \n",
                    nameValidation, dateOfBirthValidation, wageValidation,
                    contactNameValidation, contactPhoneValidation, ageValidation, creditsValidation
            );
            UIManager.put("OptionPane.minimumSize", new Dimension(300, 300));
            JOptionPane.showMessageDialog(this, errorMessage);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDataOfBirth;
    private javax.swing.JLabel lbName;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactName;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtDataOfBirth;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtWage;
    // End of variables declaration//GEN-END:variables
}
