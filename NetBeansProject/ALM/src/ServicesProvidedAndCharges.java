
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class ServicesProvidedAndCharges extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    
    public ServicesProvidedAndCharges() {
        initComponents();
         setLocationRelativeTo(null);
         txtServiceID.setVisible(false);
         Get_Data1();
    }
 private void Get_Data1(){
      try{
        con=EstConnectionWithDatabase.ConnectDB();
        String sql="select PatientID as 'Patient ID', PatientName as 'Patient Name' from Patientregistration order by PatientName";
         
         pst=con.prepareStatement(sql);
         rs= pst.executeQuery();
         tblPatient.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}
    }
 private void Reset()
{   
    txtPatientID.setText("");
    txtServiceCharges.setText("");
    txtPatientName.setText("");
    txtServiceDate.setText("");
    txtServiceName.setText("");
    txtSave.setEnabled(true);
    txtUpdate.setEnabled(false);
    txtDelete.setEnabled(false);
  }
   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel_ser1 = new javax.swing.JPanel();
        jLabel_ser1 = new javax.swing.JLabel();
        jLabel_ser2 = new javax.swing.JLabel();
        jLabel_ser3 = new javax.swing.JLabel();
        jLabel_ser4 = new javax.swing.JLabel();
        jLabel_ser5 = new javax.swing.JLabel();
        txtServiceName = new javax.swing.JTextField();
        jLabel_ser36 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtServiceCharges = new javax.swing.JTextField();
        txtServiceDate = new javax.swing.JTextField();
        jPanel_ser2 = new javax.swing.JPanel();
        txtNew = new javax.swing.JButton();
        txtSave = new javax.swing.JButton();
        txtDelete = new javax.swing.JButton();
        txtUpdate = new javax.swing.JButton();
        txtGetData = new javax.swing.JButton();
        j_ser_ScrollPane2 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        txtServiceID = new javax.swing.JTextField();

        jPanel_ser1.setBorder(javax.swing.BorderFactory.createTitledBorder("Services Info"));

        jLabel_ser1.setText("Service Name");

        jLabel_ser2.setText("Service Date");

        jLabel_ser3.setText("Patient ID");

        jLabel_ser4.setText("Patient Name");

        jLabel_ser5.setText("Service Charges");

        txtServiceName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceNameActionPerformed(evt);
            }
        });

        jLabel_ser36.setText("(YYYY-MM-DD)");

        txtPatientID.setEditable(false);

        txtPatientName.setEditable(false);

        txtServiceCharges.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtServiceChargesKeyTyped(evt);
            }
        });

        txtServiceDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel_ser1);
        jPanel_ser1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ser1)
                    .addComponent(jLabel_ser2)
                    .addComponent(jLabel_ser3)
                    .addComponent(jLabel_ser4)
                    .addComponent(jLabel_ser5))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtServiceName)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPatientID, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(txtServiceDate))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel_ser36))
                        .addComponent(txtPatientName))
                    .addComponent(txtServiceCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ser1)
                    .addComponent(txtServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ser2)
                    .addComponent(jLabel_ser36)
                    .addComponent(txtServiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ser3)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ser4)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ser5)
                    .addComponent(txtServiceCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_ser2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtNew.setText("New");
        txtNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewActionPerformed(evt);
            }
        });

        txtSave.setText("Save");
        txtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaveActionPerformed(evt);
            }
        });

        txtDelete.setText("Delete");
        txtDelete.setEnabled(false);
        txtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteActionPerformed(evt);
            }
        });

        txtUpdate.setText("Update");
        txtUpdate.setEnabled(false);
        txtUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdateActionPerformed(evt);
            }
        });

        txtGetData.setText("Get Data");
        txtGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel_ser2);
        jPanel_ser2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtGetData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGetData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientMouseClicked(evt);
            }
        });
        j_ser_ScrollPane2.setViewportView(tblPatient);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel_ser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_ser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtServiceID, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(j_ser_ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel_ser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(j_ser_ScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_ser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtServiceID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }

    private void txtServiceChargesKeyTyped(java.awt.event.KeyEvent evt) {
        
    }

    private void txtNewActionPerformed(java.awt.event.ActionEvent evt) {
        Reset();
    }
    private void txtSaveActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            con=EstConnectionWithDatabase.ConnectDB();
            if (txtServiceName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter service name");
                return;
            }
            if (txtServiceDate.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter service date");
                return;
            }
            if (txtPatientID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve patient id");
                return;
            }
            if (txtServiceCharges.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter service charges");
                return;
            }

            String sql= "insert into Services(ServiceName,ServiceDate,PatientID,ServiceCharges)values('"+ txtServiceName.getText() + "','"+ txtServiceDate.getText() + "','" + txtPatientID.getText() + "'," + txtServiceCharges.getText() + ")";
            pst=con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(this,"Successfully saved","Record",JOptionPane.INFORMATION_MESSAGE);
            txtSave.setEnabled(false);
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void txtDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            int P = JOptionPane.showConfirmDialog(null," Are you sure want to delete ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                con=EstConnectionWithDatabase.ConnectDB();
                String sql= "delete from Services where ServiceID = " + txtServiceID.getText() + "";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted");

                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void txtUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            con=EstConnectionWithDatabase.ConnectDB();
            String sql= "update Services set ServiceName='" + txtServiceName.getText() +"',ServiceDate='" + txtServiceDate.getText()+ "',PatientID='" + txtPatientID.getText() + "',ServiceCharges='" + txtServiceCharges.getText() + "' where ServiceID='" + txtServiceID.getText() + "'";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully updated");
            txtUpdate.setEnabled(false);
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void txtGetDataActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        ServiceData frm= new ServiceData();
        frm.setVisible(true);
    }

    private void tblPatientMouseClicked(java.awt.event.MouseEvent evt) {
        try{
            con=EstConnectionWithDatabase.ConnectDB();
            int row= tblPatient.getSelectedRow();
            String table_click= tblPatient.getModel().getValueAt(row, 0).toString();
            String sql= "select * from PatientRegistration where PatientID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){

                String add1=rs.getString("PatientID");
                txtPatientID.setText(add1);
                String add2=rs.getString("Patientname");
                txtPatientName.setText(add2);

            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void txtServiceNameActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void txtServiceDateActionPerformed(java.awt.event.ActionEvent evt) {
        
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
            java.util.logging.Logger.getLogger(ServicesProvidedAndCharges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServicesProvidedAndCharges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServicesProvidedAndCharges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServicesProvidedAndCharges.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServicesProvidedAndCharges().setVisible(true);
            }
        });
    }

    
    private javax.swing.JLabel jLabel_ser1;
    private javax.swing.JLabel jLabel_ser2;
    private javax.swing.JLabel jLabel_ser3;
    public javax.swing.JLabel jLabel_ser36;
    private javax.swing.JLabel jLabel_ser4;
    private javax.swing.JLabel jLabel_ser5;
    private javax.swing.JPanel jPanel_ser1;
    private javax.swing.JPanel jPanel_ser2;
    private javax.swing.JScrollPane j_ser_ScrollPane2;
    private javax.swing.JTable tblPatient;
    public javax.swing.JButton txtDelete;
    private javax.swing.JButton txtGetData;
    private javax.swing.JButton txtNew;
    public javax.swing.JTextField txtPatientID;
    public javax.swing.JTextField txtPatientName;
    public javax.swing.JButton txtSave;
    public javax.swing.JTextField txtServiceCharges;
    public javax.swing.JTextField txtServiceDate;
    public static javax.swing.JTextField txtServiceID;
    public javax.swing.JTextField txtServiceName;
    public javax.swing.JButton txtUpdate;
    
}
