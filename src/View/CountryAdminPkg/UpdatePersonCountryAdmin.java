/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.CountryAdminPkg;

import HelperPkg.Helper;
import Roles.Person;
import Roles.PersonDirectory;
import View.ContinentAdminPkg.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class UpdatePersonCountryAdmin extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePersonCountryAdmin
     */
    int index;
    JPanel mainJPanel;
    PersonDirectory pd;
    Person p;
    public UpdatePersonCountryAdmin(JPanel mainJPanel, PersonDirectory pd, int index) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.pd = pd;
        warningLbl.setVisible(false);
        p = pd.getPersons().get(index);
        setData();
    }
    void setData(){
        
        nameTB.setText(p.getName());
        streetAddressTB.setText(p.getStreetAddress());
        cityTB.setText(p.getCity());
        stateTB.setText(p.getState());
        countryTB.setText(p.getCountry());
        zipTB.setText(p.getZipcode());
        phoneTB.setText(p.getPhone());
        faxTB.setText(p.getFax());
        emailTB.setText(p.getEmailAddress());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clearBtn = new javax.swing.JButton();
        createPersonTB = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        countryTB = new javax.swing.JTextField();
        stateTB = new javax.swing.JTextField();
        zipTB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cityTB = new javax.swing.JTextField();
        nameTB = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phoneTB = new javax.swing.JTextField();
        streetAddressTB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        warningLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        emailTB = new javax.swing.JTextField();
        faxTB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clearBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearBtn.setText("Clear ");
        clearBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, -1, -1));

        createPersonTB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        createPersonTB.setText("Update");
        createPersonTB.setPreferredSize(new java.awt.Dimension(150, 50));
        createPersonTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonTBActionPerformed(evt);
            }
        });
        add(createPersonTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        backBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        countryTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(countryTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 253, 159, -1));

        stateTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(stateTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 213, 159, -1));

        zipTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(zipTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 253, 85, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("State");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 216, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fax");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 339, -1, -1));

        cityTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(cityTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 173, 159, -1));

        nameTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(nameTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 89, 159, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Country");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 256, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("City");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Phone");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 299, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 376, -1, -1));

        phoneTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(phoneTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 296, 159, -1));

        streetAddressTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(streetAddressTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 133, 159, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ZipCode");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 256, -1, -1));

        warningLbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        warningLbl.setForeground(new java.awt.Color(255, 0, 0));
        warningLbl.setText("Enter all Input Properly.");
        add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 769, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View/Update Person");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        emailTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(emailTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 376, 159, -1));

        faxTB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(faxTB, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 336, 159, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Street Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        clearFields();
    }//GEN-LAST:event_clearBtnActionPerformed
boolean validateFields(){
        HelperPkg.Helper h = new Helper();
        boolean flag =  h.isStringProper(nameTB.getText(), streetAddressTB.getText(),cityTB.getText(), stateTB.getText(),countryTB.getText(),zipTB.getText(), phoneTB.getText(), faxTB.getText(), emailTB.getText())
                && h.isProperLength(phoneTB.getText(), 10) && h.isProperLength(zipTB.getText(), 5); 
        
        return  flag;
    }
    void clearFields(){
        nameTB.setText("");
        streetAddressTB.setText("");
        cityTB.setText("");
        stateTB.setText("");
        countryTB.setText("");
        zipTB.setText("");
        phoneTB.setText("");
        faxTB.setText("");
        emailTB.setText("");
    }
    private void createPersonTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonTBActionPerformed
        // TODO add your handling code here:
        if(validateFields()){
            warningLbl.setVisible(false);
            p.updatePerson(nameTB.getText(), streetAddressTB.getText(), cityTB.getText(), stateTB.getText(), zipTB.getText(), phoneTB.getText(), faxTB.getText(), emailTB.getText(), countryTB.getText());
            clearFields();
            createPersonTB.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Person Updated Successfully.");
        }
        else{
            warningLbl.setVisible(true);
        }
    }//GEN-LAST:event_createPersonTBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cityTB;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField countryTB;
    private javax.swing.JButton createPersonTB;
    private javax.swing.JTextField emailTB;
    private javax.swing.JTextField faxTB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTB;
    private javax.swing.JTextField phoneTB;
    private javax.swing.JTextField stateTB;
    private javax.swing.JTextField streetAddressTB;
    private javax.swing.JLabel warningLbl;
    private javax.swing.JTextField zipTB;
    // End of variables declaration//GEN-END:variables
}