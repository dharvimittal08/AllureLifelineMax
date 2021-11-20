
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class PatientRoomSeviceDetails extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public PatientRoomSeviceDetails() {
        initComponents();
        setLocationRelativeTo(null);
        fillcombo();
        cmb_admit_RoomNo.setSelectedIndex(-1);
        cmb_admit_RoomNo1.setVisible(false);
         Get_Data1();
         GetRecord();
    }
private void fillcombo(){
    
    try{
        con=EstConnectionWithDatabase.ConnectDB();
        String sql= "select distinct RoomNo from Room order by RoomNo";
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        while(rs.next()){
          String add=rs.getString("RoomNo");
          cmb_admit_RoomNo.addItem(add);
          }
       }catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(this,ex); 
       }
}
 private void GetRecord(){
     String sql="select DoctorID as 'Doctor ID', DoctorName as 'Doctor Name' from Doctor order by DoctorName";  
     try{
        con=EstConnectionWithDatabase.ConnectDB();
        pst=con.prepareStatement(sql);
        rs= pst.executeQuery();
        jTablel_admit2.setModel(DbUtils.resultSetToTableModel(rs));
     }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
     }
 }
  private void Get_Data1(){
        String sql="select PatientID as 'Patient ID', PatientName as 'Patient Name',Gen as 'Gender',BG as 'Blood Group' from Patientregistration order by PatientName";
        try{
            con=EstConnectionWithDatabase.ConnectDB();
            pst=con.prepareStatement(sql);
            rs= pst.executeQuery();
            jTablel_admit1.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
         }
    }
  private void Reset(){
    txt_admitDoctorID.setText("");
    txt_admitDoctorName.setText("");
    Patient_admit_ID.setText("");
    txt_admitPatientName.setText("");
    txtBloodGroup_admit.setText("");
    txt_admitGender.setText("");
    txt_admitDisease.setText("");
    txt_AdmitDate.setText("");
    
    txt_admitRemarks.setText("");
    cmb_admit_RoomNo.setSelectedIndex(-1);
    btn_admit_Save.setEnabled(true);
    btn_admit_Update.setEnabled(false);
    btn_admit_Delete.setEnabled(false);
 }
    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jPanel_admit1 = new javax.swing.JPanel();
        jLabel_admit1 = new javax.swing.JLabel();
        jLabel_admit2 = new javax.swing.JLabel();
        jLabel_admit9 = new javax.swing.JLabel();
        jLabel_admit10 = new javax.swing.JLabel();
        Patient_admit_ID = new javax.swing.JTextField();
        txt_admitPatientName = new javax.swing.JTextField();
        jLabel_admit11 = new javax.swing.JLabel();
        jLabel_admit22 = new javax.swing.JLabel();
        txt_admitGender = new javax.swing.JTextField();
        txtBloodGroup_admit = new javax.swing.JTextField();
        jLabel_admit12 = new javax.swing.JLabel();
        jLabel_admit13 = new javax.swing.JLabel();
        jLabel_admit14 = new javax.swing.JLabel();
        jLabel_admit16 = new javax.swing.JLabel();
        jLabel_admit17 = new javax.swing.JLabel();
        txt_admitDoctorID = new javax.swing.JTextField();
        txt_admitDoctorName = new javax.swing.JTextField();
        jScrollPanel_admit1 = new javax.swing.JScrollPane();
        txt_admitRemarks = new javax.swing.JTextArea();
        cmb_admit_RoomNo = new javax.swing.JComboBox();
        cmb_admit_RoomNo1 = new javax.swing.JComboBox();
        txt_AdmitDate = new javax.swing.JTextField();
        txt_admitDisease = new javax.swing.JTextField();
        jScrollPanel_admit2 = new javax.swing.JScrollPane();
        jTablel_admit1 = new javax.swing.JTable();
        jScrollPanel_admit3 = new javax.swing.JScrollPane();
        jTablel_admit2 = new javax.swing.JTable();
        jPanel_admit2 = new javax.swing.JPanel();
        btn_admit_New = new javax.swing.JButton();
        btn_admit_Save = new javax.swing.JButton();
        btn_admit_Delete = new javax.swing.JButton();
        btn_admit_Update = new javax.swing.JButton();
        btnGet_admit_Data = new javax.swing.JButton();

        jPanel_admit1.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Admit Info"));

        jLabel_admit1.setText("Patient ID");

        jLabel_admit2.setText("Patient Name");

        jLabel_admit9.setText("Blood Group");

        jLabel_admit10.setText("Remarks");

        Patient_admit_ID.setEditable(false);

        txt_admitPatientName.setEditable(false);

        jLabel_admit11.setText("Gender");

        jLabel_admit22.setText("(YYYY-MM-DD)");

        txt_admitGender.setEditable(false);

        txtBloodGroup_admit.setEditable(false);

        jLabel_admit12.setText("Disease");

        jLabel_admit13.setText("Admit Date");

        jLabel_admit14.setText("Room No.");

        jLabel_admit16.setText("Doctor ID");

        jLabel_admit17.setText("Doctor Name");

        txt_admitDoctorID.setEditable(false);

        txt_admitDoctorName.setEditable(false);

        txt_admitRemarks.setColumns(20);
        txt_admitRemarks.setRows(5);
        jScrollPanel_admit1.setViewportView(txt_admitRemarks);

        cmb_admit_RoomNo.setEditable(true);
        cmb_admit_RoomNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRoomNoItemStateChanged(evt);
            }
        });
        cmb_admit_RoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoomNoActionPerformed(evt);
            }
        });

        cmb_admit_RoomNo1.setEditable(true);

        txt_AdmitDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdmitDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel_admit1);
        jPanel_admit1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_admit1)
                    .addComponent(jLabel_admit2)
                    .addComponent(jLabel_admit9)
                    .addComponent(jLabel_admit11)
                    .addComponent(jLabel_admit13)
                    .addComponent(jLabel_admit12)
                    .addComponent(jLabel_admit14)
                    .addComponent(jLabel_admit16)
                    .addComponent(jLabel_admit17)
                    .addComponent(jLabel_admit10))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPanel_admit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txt_AdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_admit22))
                        .addComponent(Patient_admit_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_admitPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBloodGroup_admit)
                        .addComponent(txt_admitGender)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cmb_admit_RoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cmb_admit_RoomNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_admitDoctorName)
                        .addComponent(txt_admitDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_admitDisease, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_admit1)
                    .addComponent(Patient_admit_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_admit2)
                    .addComponent(txt_admitPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_admit11)
                    .addComponent(txt_admitGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_admit9)
                    .addComponent(txtBloodGroup_admit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_admit12)
                    .addComponent(txt_admitDisease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_admit13)
                        .addComponent(jLabel_admit22))
                    .addComponent(txt_AdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_admit14)
                    .addComponent(cmb_admit_RoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_admit_RoomNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_admit16)
                    .addComponent(txt_admitDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_admit17)
                    .addComponent(txt_admitDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_admit10)
                    .addComponent(jScrollPanel_admit1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTablel_admit1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablel_admit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPanel_admit2.setViewportView(jTablel_admit1);

        jTablel_admit2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablel_admit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPanel_admit3.setViewportView(jTablel_admit2);

        jPanel_admit2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_admit_New.setText("New");
        btn_admit_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btn_admit_Save.setText("Save");
        btn_admit_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btn_admit_Delete.setText("Delete");
        btn_admit_Delete.setEnabled(false);
        btn_admit_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btn_admit_Update.setText("Update");
        btn_admit_Update.setEnabled(false);
        btn_admit_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnGet_admit_Data.setText("Get Data");
        btnGet_admit_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel_admit2);
        jPanel_admit2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGet_admit_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_admit_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_admit_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_admit_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_admit_New, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_admit_New)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_admit_Save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_admit_Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_admit_Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGet_admit_Data)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_admit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_admit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPanel_admit3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanel_admit2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel_admit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPanel_admit2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPanel_admit3, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_admit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void cmbRoomNoItemStateChanged(java.awt.event.ItemEvent evt) {

    }

    private void cmbRoomNoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        try{
            con=EstConnectionWithDatabase.ConnectDB();
            int row= jTablel_admit1.getSelectedRow();
            String table_click= jTablel_admit1.getModel().getValueAt(row, 0).toString();
            String sql= "select * from PatientRegistration where PatientID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){

                String add1=rs.getString("PatientID");
                Patient_admit_ID.setText(add1);
                String add2=rs.getString("Patientname");
                txt_admitPatientName.setText(add2);
                String add9=rs.getString("BG");
                txtBloodGroup_admit.setText(add9);
                String add11=rs.getString("Gen");
                txt_admitGender.setText(add11);

            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {
        try{
            con=EstConnectionWithDatabase.ConnectDB();
            int row= jTablel_admit2.getSelectedRow();
            String table_click= jTablel_admit2.getModel().getValueAt(row, 0).toString();
            String sql= "select * from Doctor where DoctorID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
                String add1=rs.getString("DoctorID");
                txt_admitDoctorID.setText(add1);
                String add2=rs.getString("Doctorname");
                txt_admitDoctorName.setText(add2);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {
        Reset();
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            con=EstConnectionWithDatabase.ConnectDB();
            if (Patient_admit_ID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Patient ID","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txt_admitPatientName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Patient Name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txt_admitGender.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve Gender","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (txtBloodGroup_admit.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve blood group","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txt_admitDisease.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter disease","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txt_AdmitDate.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter admit date","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (cmb_admit_RoomNo.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select room no.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (txt_admitDoctorID.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please retrieve doctor id","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            if (txt_admitDoctorName.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter retrieve doctor name","Error", JOptionPane.ERROR_MESSAGE);
                return;

            }
            Statement stmt1;
            stmt1= con.createStatement();
            String sql2="Select RoomNo from Room where RoomNo= '" + cmb_admit_RoomNo.getSelectedItem()+ "' and RoomStatus='Booked'";
            rs=stmt1.executeQuery(sql2);
            if(rs.next()){
                JOptionPane.showMessageDialog( this, "Room is already booked","Error", JOptionPane.ERROR_MESSAGE);
                cmb_admit_RoomNo.setSelectedItem("");
                cmb_admit_RoomNo.requestDefaultFocus();
                return;
            }
            Statement stmt;
            stmt= con.createStatement();
            String sql1="Select PatientID,AdmitDate from AdmitPatient_Room where PatientID= '" + Patient_admit_ID.getText() + "' and AdmitDate='" + txt_AdmitDate + "'";
            rs=stmt.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog( this, "Record already exists","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sql= "insert into admitpatient_room(PatientID,Disease,AdmitDate,RoomNo,DoctorID,AP_Remarks)values('"+ Patient_admit_ID.getText() + "','"+ txt_admitDisease.getText() + "','"+ txt_AdmitDate.getText() + "','"+ cmb_admit_RoomNo.getSelectedItem()+ "','" + txt_admitDoctorID.getText() + "','"+ txt_admitRemarks.getText() + "')";

            pst=con.prepareStatement(sql);
            pst.execute();
            String sql3= "update room set RoomStatus='Booked' where RoomNo='" + cmb_admit_RoomNo.getSelectedItem() + "'";
            pst=con.prepareStatement(sql3);
            pst.execute();
            JOptionPane.showMessageDialog(this,"Successfully admitted","Patient",JOptionPane.INFORMATION_MESSAGE);
            btn_admit_Save.setEnabled(false);

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
                String sql= "delete from AdmitPatient_Room where PatientID = " + Patient_admit_ID.getText() + "";
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
            Statement stmt1;
            stmt1= con.createStatement();
            String s= cmb_admit_RoomNo.getSelectedItem().toString();
            String t= cmb_admit_RoomNo1.getSelectedItem().toString();
            if (!t.equals(s)){
                String sql2="Select RoomNo from Room where RoomNo= '" + cmb_admit_RoomNo.getSelectedItem()+ "' and RoomStatus='Booked'";
                rs=stmt1.executeQuery(sql2);
                if(rs.next()){
                    JOptionPane.showMessageDialog( this, "Room is already booked","Error", JOptionPane.ERROR_MESSAGE);
                    cmb_admit_RoomNo.setSelectedItem("");
                    cmb_admit_RoomNo.requestDefaultFocus();
                    return;
                }
            }

            String sql= " update AdmitPatient_Room set  PatientID='"+ Patient_admit_ID.getText() + "',Disease='"+ txt_admitDisease.getText() + "',AdmitDate='"+ txt_AdmitDate.getText() + "',RoomNo='"+ cmb_admit_RoomNo.getSelectedItem()+ "',DoctorID='" + txt_admitDoctorID.getText() + "',AP_Remarks='"+ txt_admitRemarks.getText() + "' where PatientID= " + Patient_admit_ID.getText() + "";
            pst=con.prepareStatement(sql);
            pst.execute();

            if (!t.equals(s)){
                String sql3= "update room set RoomStatus='Booked' where RoomNo='" + cmb_admit_RoomNo.getSelectedItem() + "'";
                pst=con.prepareStatement(sql3);
                pst.execute();
            }

            if (!t.equals(s)){
                String sql4= "update room set RoomStatus='Vacant' where RoomNo='" + cmb_admit_RoomNo1.getSelectedItem() + "'";
                pst=con.prepareStatement(sql4);
                pst.execute();
            }
            JOptionPane.showMessageDialog(this,"Successfully updated","Patient Record",JOptionPane.INFORMATION_MESSAGE);
            btn_admit_Update.setEnabled(false);

        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }

    private void btnGetDataActionPerformed(java.awt.event.ActionEvent evt) {
        this.hide();
        PatientAdmitRoomDetails_1 frm= new PatientAdmitRoomDetails_1();
        frm.setVisible(true);
    }

    private void txtAdmitDateActionPerformed(java.awt.event.ActionEvent evt) {
       
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
            java.util.logging.Logger.getLogger(PatientRoomSeviceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientRoomSeviceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientRoomSeviceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientRoomSeviceDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientRoomSeviceDetails().setVisible(true);
            }
        });
    }

   
    public javax.swing.JTextField Patient_admit_ID;
    public javax.swing.JButton btn_admit_Delete;
    private javax.swing.JButton btnGet_admit_Data;
    private javax.swing.JButton btn_admit_New;
    public javax.swing.JButton btn_admit_Save;
    public javax.swing.JButton btn_admit_Update;
    public javax.swing.JComboBox cmb_admit_RoomNo;
    public javax.swing.JComboBox cmb_admit_RoomNo1;
    private javax.swing.JLabel jLabel_admit1;
    private javax.swing.JLabel jLabel_admit10;
    private javax.swing.JLabel jLabel_admit11;
    private javax.swing.JLabel jLabel_admit12;
    private javax.swing.JLabel jLabel_admit13;
    private javax.swing.JLabel jLabel_admit14;
    private javax.swing.JLabel jLabel_admit16;
    private javax.swing.JLabel jLabel_admit17;
    private javax.swing.JLabel jLabel_admit2;
    public javax.swing.JLabel jLabel_admit22;
    private javax.swing.JLabel jLabel_admit9;
    private javax.swing.JPanel jPanel_admit1;
    private javax.swing.JPanel jPanel_admit2;
    private javax.swing.JScrollPane jScrollPanel_admit1;
    private javax.swing.JScrollPane jScrollPanel_admit2;
    private javax.swing.JScrollPane jScrollPanel_admit3;
    private javax.swing.JTable jTablel_admit1;
    private javax.swing.JTable jTablel_admit2;
    public javax.swing.JTextField txt_AdmitDate;
    public javax.swing.JTextField txtBloodGroup_admit;
    public javax.swing.JTextField txt_admitDisease;
    public javax.swing.JTextField txt_admitDoctorID;
    public javax.swing.JTextField txt_admitDoctorName;
    public javax.swing.JTextField txt_admitGender;
    public javax.swing.JTextField txt_admitPatientName;
    public javax.swing.JTextArea txt_admitRemarks;
  
}
