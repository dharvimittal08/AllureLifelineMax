import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.text.NumberFormat;
import java.util.Locale;


public class PatientBillDetails extends javax.swing.JFrame {

   Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public PatientBillDetails() {
        initComponents();
        setLocationRelativeTo(null);
        Get_Data1();
    } 
    private void Get_Data1(){
      try{
        con=EstConnectionWithDatabase.ConnectDB();
       String sql="select PatientRegistration.PatientID as 'Patient ID', PatientName as 'Patient Name',sum(serviceCharges) as 'Service Charges' from Services,PatientRegistration where Services.PatientID=PatientRegistration.PatientID group by PatientRegistration.PatientID,PatientName order by PatientName";
         pst=con.prepareStatement(sql);
         rs= pst.executeQuery();
         jTable1_bill.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          }
    }
    private void Reset(){
        txtDoctorID_bill.setText("");
        txtDoctorName_bill.setText("");
        Patient_roomID.setText("");
        txtPatientName_bill.setText("");
        txtBloodGroup_bill.setText("");
        txtTotalCharges_bill.setText("");
        txtBillingDate_bill.setText("");
        cmbPaymentMode.setSelectedIndex(-1);
        txtDischargeDate_bill.setText("");
        txtNoOfDays_bill.setText("");
        txtTotalRoomCharges_bill.setText("");
        txtGender_bill.setText("");
        txtDisease_bill.setText("");
        txtAdmitDate_bill.setText("");
        txtRoomNo_bill.setText("");
        txtServiceCharges_bill.setText("");
        txtRoomCharges_bill.setText("");
        txtPaymentModeDetails_bill.setText("");
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    
    
   
    private void initComponents() {

        jScrollPane1_bill = new javax.swing.JScrollPane();
        jTable1_bill = new javax.swing.JTable();
        jPanel_bill1 = new javax.swing.JPanel();
        jLabel_bill8 = new javax.swing.JLabel();
        jLabel_bill1 = new javax.swing.JLabel();
        jLabel_bill2 = new javax.swing.JLabel();
        txtRoomCharges_bill = new javax.swing.JTextField();
        jLabel_bill3 = new javax.swing.JLabel();
        txtServiceCharges_bill = new javax.swing.JTextField();
        jLabel_bill37 = new javax.swing.JLabel();
        cmbPaymentMode = new javax.swing.JComboBox();
        jLabel_bill4 = new javax.swing.JLabel();
        txtPaymentModeDetails_bill = new javax.swing.JTextField();
        jLabel_bill9 = new javax.swing.JLabel();
        txtTotalCharges_bill = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnGetData = new javax.swing.JButton();
        
        jLabel_bill13 = new javax.swing.JLabel();
        txtTotalRoomCharges_bill = new javax.swing.JTextField();
        txtBillingDate_bill = new javax.swing.JTextField();
        jLabel_bill12 = new javax.swing.JLabel();
        txtNoOfDays_bill = new javax.swing.JTextField();
        jLabel_bill14 = new javax.swing.JLabel();
        txtBillNo_bill = new javax.swing.JTextField();
        Patient_roomID = new javax.swing.JTextField();
        txtPatientName_bill = new javax.swing.JTextField();
        txtAdmitDate_bill = new javax.swing.JFormattedTextField();
        jLabel_bill29 = new javax.swing.JLabel();
        jLabel_bill30 = new javax.swing.JLabel();
        txtGender_bill = new javax.swing.JTextField();
        txtBloodGroup_bill = new javax.swing.JTextField();
        txtDisease_bill = new javax.swing.JTextField();
        txtDoctorID_bill = new javax.swing.JTextField();
        txtDoctorName_bill = new javax.swing.JTextField();
        txtRoomNo_bill = new javax.swing.JTextField();
        jPanel_bill2 = new javax.swing.JPanel();
        jPanel_bill3 = new javax.swing.JPanel();
        jLabel_bill5 = new javax.swing.JLabel();
        jLabel_bill6 = new javax.swing.JLabel();
        jLabel_bill27 = new javax.swing.JLabel();
        jLabel_bill31 = new javax.swing.JLabel();
        jLabel_bill32 = new javax.swing.JLabel();
        jLabel_bill33 = new javax.swing.JLabel();
        jLabel_bill34 = new javax.swing.JLabel();
        jLabel_bill35 = new javax.swing.JLabel();
        jLabel_bill7 = new javax.swing.JLabel();
        txtDischargeDate_bill = new javax.swing.JFormattedTextField();
        jLabel_bill36 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTable1_bill.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1_bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1_bill.setViewportView(jTable1_bill);

        jPanel_bill1.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment Details"));

        jLabel_bill8.setText("Biling");

        jLabel_bill1.setText("Room Charges");

        jLabel_bill2.setText("Payment-Mode");

        txtRoomCharges_bill.setEditable(false);
        txtRoomCharges_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomChargesActionPerformed(evt);
            }
        });
        txtRoomCharges_bill.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtRoomChargesInputMethodTextChanged(evt);
            }
        });

        jLabel_bill3.setText("Service Charges");

        txtServiceCharges_bill.setEditable(false);

        jLabel_bill37.setText("(YYYY-MM-DD)");

        cmbPaymentMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "by Cash", "by DD", "by Check", "by Credit Card", "by Debit Card" }));
        cmbPaymentMode.setSelectedIndex(-1);

        jLabel_bill4.setText("Payment Mode Details");

        jLabel_bill9.setText("Total Charges");

        txtTotalCharges_bill.setEditable(false);

        jLabel_bill12.setText("Number Of Days");

        txtNoOfDays_bill.setEditable(false);
        txtNoOfDays_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoOfDaysActionPerformed(evt);
            }
        });
        txtNoOfDays_bill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoOfDaysKeyTyped(evt);
            }
        });

        jLabel_bill13.setText("Total Room Charges");

        txtTotalRoomCharges_bill.setEditable(false);
        txtTotalRoomCharges_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalRoomChargesActionPerformed(evt);
            }
        });

        txtBillingDate_bill.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBillingDateFocusGained(evt);
            }
        });
        txtBillingDate_bill.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtBillingDateInputMethodTextChanged(evt);
            }
        });
        txtBillingDate_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillingDateActionPerformed(evt);
            }
        });

        jLabel_bill14.setText("Bill No:");

        txtBillNo_bill.setEditable(false);
        txtBillNo_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel_bill1);
        jPanel_bill1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_bill4)
                            .addComponent(jLabel_bill9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_bill3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_bill2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_bill8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRoomCharges_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtServiceCharges_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_bill12)
                            .addComponent(jLabel_bill1))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNoOfDays_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jLabel_bill13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotalRoomCharges_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtBillingDate_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_bill37)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPaymentModeDetails_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbPaymentMode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTotalCharges_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel_bill14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBillNo_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoomCharges_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bill8)
                    .addComponent(jLabel_bill12)
                    .addComponent(txtNoOfDays_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bill13)
                    .addComponent(txtTotalRoomCharges_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_bill3)
                    .addComponent(txtServiceCharges_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bill1)
                    .addComponent(jLabel_bill37)
                    .addComponent(txtBillingDate_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPaymentMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bill2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPaymentModeDetails_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bill4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalCharges_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bill9)
                    .addComponent(jLabel_bill14)
                    .addComponent(txtBillNo_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_bill2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnGetData.setText("GetData");
        btnGetData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel_bill2);
        jPanel_bill2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGetData, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnGetData)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel_bill3.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Info"));

        jLabel_bill5.setText("Patient ID");

        jLabel_bill6.setText("Patient Name");

        jLabel_bill27.setText("Blood Group");

        Patient_roomID.setEditable(false);
        Patient_roomID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientIDActionPerformed(evt);
            }
        });

        txtPatientName_bill.setEditable(false);

        txtAdmitDate_bill.setEditable(false);
        txtAdmitDate_bill.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat(""))));

        jLabel_bill29.setText("Gender");

        jLabel_bill30.setText("(YYYY-MM-DD)");

        txtGender_bill.setEditable(false);

        txtBloodGroup_bill.setEditable(false);

        

        txtDisease_bill.setEditable(false);

        txtDoctorID_bill.setEditable(false);

        txtDoctorName_bill.setEditable(false);
        
        jLabel_bill32.setText("Admit Date");
       
        jLabel_bill31.setText("Disease");

       jLabel_bill33.setText("Room No.");

        jLabel_bill34.setText("Doctor ID");

        jLabel_bill35.setText("Doctor Name");

        txtRoomNo_bill.setEditable(false);

        jLabel_bill7.setText("Discharge Date");

        txtDischargeDate_bill.setEditable(false);
        txtDischargeDate_bill.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabel_bill36.setText("(YYYY-MM-DD)");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); 
        jButton1.setText(">");
        jButton1.setPreferredSize(new java.awt.Dimension(41, 21));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel_bill3);
        jPanel_bill3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_bill5)
                    .addComponent(jLabel_bill6)
                    .addComponent(jLabel_bill27)
                    .addComponent(jLabel_bill31)
                    .addComponent(jLabel_bill33)
                    .addComponent(jLabel_bill34)
                    .addComponent(jLabel_bill35)
                    .addComponent(jLabel_bill29)
                    .addComponent(jLabel_bill32)
                    .addComponent(jLabel_bill7))
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(txtAdmitDate_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_bill30))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(Patient_roomID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPatientName_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBloodGroup_bill)
                        .addComponent(txtGender_bill)
                        .addComponent(txtDoctorName_bill)
                        .addComponent(txtDisease_bill)
                        .addComponent(txtDoctorID_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRoomNo_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDischargeDate_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_bill36)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Patient_roomID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_bill5)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_bill6)
                    .addComponent(txtPatientName_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_bill29)
                    .addComponent(txtGender_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_bill27)
                    .addComponent(txtBloodGroup_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDisease_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bill31))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_bill32)
                    .addComponent(txtAdmitDate_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bill30))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_bill33)
                    .addComponent(txtRoomNo_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_bill34)
                    .addComponent(txtDoctorID_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_bill35)
                    .addComponent(txtDoctorName_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDischargeDate_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bill36)
                    .addComponent(jLabel_bill7))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel_bill3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jPanel_bill2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel_bill1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_bill3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jPanel_bill2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_bill1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        if(Patient_roomID.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Please Enter Patient data first!");
        }
        else{
            try{
            
            con=EstConnectionWithDatabase.ConnectDB();
            int row= jTable1_bill.getSelectedRow();
            String val =jTable1_bill.getModel().getValueAt(row,2).toString();
            txtServiceCharges_bill.setText(val);
           
            int totalRoomCharges = Integer.parseInt(txtTotalRoomCharges_bill.getText());
            int totalCharges = totalRoomCharges + Integer.parseInt(txtServiceCharges_bill.getText());

            txtTotalCharges_bill.setText(Integer.toString(totalCharges));
            
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this,ex);
            }
        }
        
    }

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {
        Reset();
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            con=EstConnectionWithDatabase.ConnectDB();
            if (Patient_roomID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Patient ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtNoOfDays_bill.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter no. of days","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtServiceCharges_bill.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve service charges","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (txtBillingDate_bill.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter billing date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Statement stmt;
            stmt= con.createStatement();
            String sql1="Select DischargeID from Bill_Room where DischargeID= " + Patient_roomID.getText() + "";
            rs=stmt.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog( this, "Record already exists","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql= "insert into Bill_Room(DischargeID,BillingDate,RoomCharges,ServiceCharges,PaymentMode,PaymentModeDetails,TotalCharges,NoOfDays,TotalRoomCharges,BillNo)values(" + Patient_roomID.getText() + ",'"+ txtBillingDate_bill.getText() + "',"+ txtRoomCharges_bill.getText() + ","+ txtServiceCharges_bill.getText() + ",'" + cmbPaymentMode.getSelectedItem()+ "','" + txtPaymentModeDetails_bill.getText() + "',"+ txtTotalCharges_bill.getText() +","+ txtNoOfDays_bill.getText() + "," + txtTotalRoomCharges_bill.getText() + ",'"+txtBillNo_bill.getText()+"')";
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully saved","Record",JOptionPane.INFORMATION_MESSAGE);
            btnSave.setEnabled(false);

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
                String sql= "delete from Bill_Room where BillNo = " + txtBillNo_bill.getText() + "";
                pst=con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                Reset();
            }
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            con=EstConnectionWithDatabase.ConnectDB();
            String sql= "update Bill_Room set DischargeID="+ Patient_roomID.getText() + ",BillingDate='"+ txtBillingDate_bill.getText() + "',RoomCharges="+ txtRoomCharges_bill.getText() + ",ServiceCharges="+ txtServiceCharges_bill.getText() + ",PaymentMode='" + cmbPaymentMode.getSelectedItem()+ "',PaymentModeDetails='" + txtPaymentModeDetails_bill.getText() + "',TotalCharges="+ txtTotalCharges_bill.getText() + ",NoOfDays="+ txtNoOfDays_bill.getText() +",TotalRoomCharges=" + txtTotalRoomCharges_bill.getText() + " where BillNo= " + txtBillNo_bill.getText() +"";  
            pst=con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully Updated","Record",JOptionPane.INFORMATION_MESSAGE);
            btnUpdate.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }
    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        PatientBillDetailsWithData frm= new PatientBillDetailsWithData();
        frm.setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        PatientRoomSeviceDischargeData_2 frm = new PatientRoomSeviceDischargeData_2();
        frm.setVisible(true);
    }

    private void PatientIDActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void txtNoOfDaysKeyTyped(java.awt.event.KeyEvent evt) {

    }

    private void txtNoOfDaysActionPerformed(java.awt.event.ActionEvent evt) {

        double add1 = Double.parseDouble(txtRoomCharges_bill.getText());
        double add = Double.parseDouble(txtNoOfDays_bill.getText());
        double add2= add * add1;
        String add3= Double.toString(add2);
        txtTotalRoomCharges_bill.setText(add3);
        double add4=Double.parseDouble(txtTotalRoomCharges_bill.getText());
        double add5 = Double.parseDouble(txtServiceCharges_bill.getText());
        double add6= add4 + add5;
        String add7= Double.toString(add6);
        txtTotalCharges_bill.setText(add7);
    }

    private void txtRoomChargesInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {

    }

    private void txtRoomChargesActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void txtBillingDateActionPerformed(java.awt.event.ActionEvent evt) {
        
            String date = txtBillingDate_bill.getText().replaceAll("\\D","");
            String BillNo = Patient_roomID.getText().concat(date);
            txtBillNo_bill.setText(BillNo);
    }

    private void txtBillingDateFocusGained(java.awt.event.FocusEvent evt) {
        
        
    }

    private void txtBillingDateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
       
        
        
    }

    private void txtTotalRoomChargesActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void txtBillNoActionPerformed(java.awt.event.ActionEvent evt) {
        
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
            java.util.logging.Logger.getLogger(PatientBillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientBillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientBillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientBillDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientBillDetails().setVisible(true);
            }
        });
    }

     public javax.swing.JFormattedTextField txtAdmitDate_bill;
    public javax.swing.JTextField txtBillNo_bill;
    public javax.swing.JTextField txtBillingDate_bill;
    public javax.swing.JTextField txtBloodGroup_bill;
    public javax.swing.JFormattedTextField txtDischargeDate_bill;
    public javax.swing.JTextField txtPatientName_bill;
    public javax.swing.JTextField txtPaymentModeDetails_bill;
    public javax.swing.JTextField txtRoomCharges_bill;
    public javax.swing.JTextField txtRoomNo_bill;
     public javax.swing.JTextField txtDisease_bill;
    public javax.swing.JTextField txtDoctorID_bill;
    public javax.swing.JTextField txtDoctorName_bill;
    public javax.swing.JTextField txtGender_bill;
    public javax.swing.JTextField txtNoOfDays_bill;
    public javax.swing.JTextField txtServiceCharges_bill;
    public javax.swing.JTextField txtTotalCharges_bill;
    public javax.swing.JTextField txtTotalRoomCharges_bill;
    public javax.swing.JTextField Patient_roomID;
    private javax.swing.JLabel jLabel_bill1;
    private javax.swing.JLabel jLabel_bill12;
    private javax.swing.JLabel jLabel_bill13;
    private javax.swing.JLabel jLabel_bill14;
    private javax.swing.JLabel jLabel_bill2;
    private javax.swing.JLabel jLabel_bill27;
    private javax.swing.JLabel jLabel_bill29;
    private javax.swing.JLabel jLabel_bill3;
    public javax.swing.JLabel jLabel_bill30;
    private javax.swing.JLabel jLabel_bill31;
    private javax.swing.JLabel jLabel_bill32;
    private javax.swing.JLabel jLabel_bill33;
    private javax.swing.JLabel jLabel_bill34;
    private javax.swing.JLabel jLabel_bill35;
    public javax.swing.JLabel jLabel_bill36;
    private javax.swing.JLabel jLabel_bill37;
    private javax.swing.JLabel jLabel_bill4;
    private javax.swing.JLabel jLabel_bill5;
    private javax.swing.JLabel jLabel_bill6;
    private javax.swing.JLabel jLabel_bill7;
    private javax.swing.JLabel jLabel_bill8;
    private javax.swing.JLabel jLabel_bill9;
    private javax.swing.JPanel jPanel_bill1;
    private javax.swing.JPanel jPanel_bill2;
    private javax.swing.JPanel jPanel_bill3;
    private javax.swing.JScrollPane jScrollPane1_bill;
    private javax.swing.JTable jTable1_bill;
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetData;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cmbPaymentMode;
    private javax.swing.JButton jButton1;
    
    
}
