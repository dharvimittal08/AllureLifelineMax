
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class PatientRegestrationDetails extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    
    public PatientRegestrationDetails() {
        initComponents();
    }
private void Reset()
{
    txt_pat_Id.setText("");
    txt_pat_Name.setText("");
    txt_pat_Fname.setText("");
    txtContact.setText("");
    txtAdd.setText("");
    txt_pat_Age.setText("");
    txt_pat_Email.setText("");
    txt_pat_Info.setText("");
    cmbBG.setSelectedIndex(-1);
    cmbGender.setSelectedIndex(-1);
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);
    txt_pat_Id.requestDefaultFocus();
}
   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel_reg1 = new javax.swing.JPanel();
        jLabel_reg1 = new javax.swing.JLabel();
        jLabel_reg2 = new javax.swing.JLabel();
        jLabel_reg3 = new javax.swing.JLabel();
        jLabel_reg4 = new javax.swing.JLabel();
        jLabel_reg5 = new javax.swing.JLabel();
        jLabel_reg6 = new javax.swing.JLabel();
        jLabel_reg7 = new javax.swing.JLabel();
        txt_pat_Id = new javax.swing.JTextField();
        txt_pat_Name = new javax.swing.JTextField();
        txt_pat_Fname = new javax.swing.JTextField();
        txtAdd = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txt_pat_Email = new javax.swing.JTextField();
        txt_pat_Age = new javax.swing.JTextField();
        jLabel_reg8 = new javax.swing.JLabel();
        jLabel_reg9 = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        cmbBG = new javax.swing.JComboBox();
        jLabel_reg10 = new javax.swing.JLabel();
        j_reg_ScrollPane1 = new javax.swing.JScrollPane();
        txt_pat_Info = new javax.swing.JTextArea();
        jPanel_reg2 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel_reg1.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Detail's"));

        jLabel_reg1.setText("Patient ID");

        jLabel_reg2.setText("Name");

        jLabel_reg3.setText("Father's Name");

        jLabel_reg4.setText("Address");

        jLabel_reg5.setText("Contact No.");

        jLabel_reg6.setText("Email-id");

        jLabel_reg7.setText("Age");

        txt_pat_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel_reg8.setText("Gender");

        jLabel_reg9.setText("Blood Group");

        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "M", "F" }));

        cmbBG.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));

        jLabel_reg10.setText("Information");

        txt_pat_Info.setColumns(20);
        txt_pat_Info.setRows(5);
        j_reg_ScrollPane1.setViewportView(txt_pat_Info);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel_reg1);
        jPanel_reg1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_reg1)
                    .addComponent(jLabel_reg2)
                    .addComponent(jLabel_reg3)
                    .addComponent(jLabel_reg4)
                    .addComponent(jLabel_reg5)
                    .addComponent(jLabel_reg6)
                    .addComponent(jLabel_reg7)
                    .addComponent(jLabel_reg8)
                    .addComponent(jLabel_reg9)
                    .addComponent(jLabel_reg10))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j_reg_ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_pat_Age, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addComponent(txt_pat_Email, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtContact, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAdd, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_pat_Fname, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_pat_Name, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_pat_Id, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_reg1)
                    .addComponent(txt_pat_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pat_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_reg2))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_pat_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_reg3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_reg4)
                            .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_reg5))
                    .addComponent(txtContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_reg6)
                    .addComponent(txt_pat_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_reg7)
                    .addComponent(txt_pat_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_reg8)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_reg9)
                    .addComponent(cmbBG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_reg10)
                    .addComponent(j_reg_ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel_reg2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnGetData.setText("GetData");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel_reg2);
        jPanel_reg2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnGetData)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_reg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_reg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_reg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jPanel_reg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {
       
    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {
    Reset();        
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
try{
            con=EstConnectionWithDatabase.ConnectDB();
            if (txt_pat_Id.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txt_pat_Name.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter patient name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txt_pat_Fname.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Father's name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtAdd.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           if (txtContact.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter contact no.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
         
            if (txt_pat_Age.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter age","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
             if (cmbGender.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select gender","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmbBG.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select blood group","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
           
          
   Statement stmt;
       stmt= con.createStatement();
       String sql1="Select PatientID from PatientRegistration where PatientID= '" + txt_pat_Id.getText() + "'";
      rs=stmt.executeQuery(sql1);
      if(rs.next()){
        JOptionPane.showMessageDialog( this, "Patient ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        txt_pat_Id.setText("");
        txt_pat_Id.requestDefaultFocus();
       return;
      }
            String sql= "insert into PatientRegistration(PatientID,Patientname,FatherName,Email,ContactNo,Age,Remarks,Gen,BG,Address)values('"+ txt_pat_Id.getText() + "','"+ txt_pat_Name.getText() + "','"+ txt_pat_Fname.getText() + "','"+ txt_pat_Email.getText() + "','"+ txtContact.getText() + "'," + txt_pat_Age.getText() + ",'"+ txt_pat_Info.getText() + "','" + cmbGender.getSelectedItem() + "','"+ cmbBG.getSelectedItem() + "','" + txtAdd.getText() + "')";

            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Registered","Patient",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
                                          

       
    }

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {
this.hide();
PatientsPersonalDetails frm=new PatientsPersonalDetails();
frm.setVisible(true);       
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            con=EstConnectionWithDatabase.ConnectDB();
            String sql= "update PatientRegistration set Patientname='"+ txt_pat_Name.getText() + "',Fathername='"+ txt_pat_Fname.getText() + "',Email='"+ txt_pat_Email.getText() + "',ContactNo='"+ txtContact.getText() + "',Age=" + txt_pat_Age.getText() + ",Remarks='"+ txt_pat_Info.getText() + "',Gen='" + cmbGender.getSelectedItem() + "',BG='"+ cmbBG.getSelectedItem() + "',Address='" + txtAdd.getText() + "' where PatientID='" + txt_pat_Id.getText() + "'";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated","Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }          
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=EstConnectionWithDatabase.ConnectDB();
                String sql= "delete from patientregistration where PatientID = '" + txt_pat_Id.getText() + "'";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }        
    }

    private void formWindowClosed(java.awt.event.WindowEvent evt) {
   
             ;
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientRegestrationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientRegestrationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientRegestrationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientRegestrationDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRegestrationDetails().setVisible(true);
            }
        });
    }

   
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnGetData;
    public javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cmbBG;
    public javax.swing.JComboBox cmbGender;
    private javax.swing.JLabel jLabel_reg1;
    private javax.swing.JLabel jLabel_reg10;
    private javax.swing.JLabel jLabel_reg2;
    private javax.swing.JLabel jLabel_reg3;
    private javax.swing.JLabel jLabel_reg4;
    private javax.swing.JLabel jLabel_reg5;
    private javax.swing.JLabel jLabel_reg6;
    private javax.swing.JLabel jLabel_reg7;
    private javax.swing.JLabel jLabel_reg8;
    private javax.swing.JLabel jLabel_reg9;
    private javax.swing.JPanel jPanel_reg1;
    private javax.swing.JPanel jPanel_reg2;
    private javax.swing.JScrollPane j_reg_ScrollPane1;
    public javax.swing.JTextField txtAdd;
    public javax.swing.JTextField txt_pat_Age;
    public javax.swing.JTextField txtContact;
    public javax.swing.JTextField txt_pat_Email;
    public javax.swing.JTextField txt_pat_Fname;
    public javax.swing.JTextField txt_pat_Id;
    public javax.swing.JTextArea txt_pat_Info;
    public javax.swing.JTextField txt_pat_Name;
   
}
