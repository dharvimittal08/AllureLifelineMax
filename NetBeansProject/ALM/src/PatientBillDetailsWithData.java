import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Locale;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
public class PatientBillDetailsWithData extends javax.swing.JFrame
{
    PreparedStatement pst=null;
    Connection con=null;
    ResultSet rs=null;
    public PatientBillDetailsWithData()
    {
        initComponents();
        con= EstConnectionWithDatabase.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
    }
    private void Get_Data()
    {
         try{
                String sql="Select BillNo as 'Bill No.',PatientRegistration.PatientID as 'Patient ID',PatientRegistration.PatientName as 'Patient Name',PatientRegistration.Gen as 'Gender',PatientRegistration.BG as 'Blood Group',Disease,AdmitDate as 'Admit Date',Room.RoomNo as 'Room No',Doctor.DoctorID as 'Doctor ID',DoctorName as 'Doctor Name',DischargeDate as 'Discharge Date',Bill_Room.RoomCharges as 'Room Charges',Bill_Room.ServiceCharges as 'Service Charges',Bill_Room.BillingDate as 'Billing Date',PaymentMode as 'Payement Mode',PaymentModeDetails as 'Payment Mode Details',TotalCharges as 'Total Charges',NoOfDays as 'No. Of Days',TotalRoomCharges as 'Total Room Charges' from Room,Doctor,PatientRegistration,AdmitPatient_Room,DischargePatient_Room,Bill_Room where Room.RoomNo=AdmitPatient_Room.RoomNo and Doctor.DoctorID=AdmitPatient_Room.DoctorID and PatientRegistration.PatientID=AdmitPatient_Room.PatientID  and AdmitPatient_Room.PatientID= DischargePatient_Room.admitID and Bill_Room.DischargeID=DischargePatient_Room.AdmitID  order by Billingdate";
                rs= pst.executeQuery();
                jTable_room1.setModel(DbUtils.resultSetToTableModel(rs));
                pst=con.prepareStatement(sql);
         }catch(Exception e)
         {
            JOptionPane.showMessageDialog(null, e);
          }
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollPane_room1 = new javax.swing.JScrollPane();
        jTable_room1 = new javax.swing.JTable();
        jScrollPane_room1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });
        jTable_room1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_room1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane_room1.setViewportView(jTable_room1);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane_room1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane_room1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );
        pack();
    }
    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        try{
            con=EstConnectionWithDatabase.ConnectDB();
            int row= jTable_room1.getSelectedRow();
            this.hide();
            PatientBillDetails frm = new PatientBillDetails();
            frm.setVisible(true);
            String add= jTable_room1.getModel().getValueAt(row, 0).toString();
            frm.txtBillNo_bill.setText(add);
             String add3= jTable_room1.getModel().getValueAt(row, 1).toString();
            frm.Patient_roomID.setText(add3);
              String add4= jTable_room1.getModel().getValueAt(row, 2).toString();
            frm.txtPatientName_bill.setText(add4);
              String add5= jTable_room1.getModel().getValueAt(row, 3).toString();
            frm.txtGender_bill.setText(add5);
              String add6= jTable_room1.getModel().getValueAt(row, 4).toString();
            frm.txtBloodGroup_bill.setText(add6);
              String add7= jTable_room1.getModel().getValueAt(row, 5).toString();
            frm.txtDisease_bill.setText(add7);
              String add8= jTable_room1.getModel().getValueAt(row, 6).toString();
            frm.txtAdmitDate_bill.setText(add8);
              String add9= jTable_room1.getModel().getValueAt(row, 7).toString();
            frm.txtRoomNo_bill.setText(add9);
              String add10= jTable_room1.getModel().getValueAt(row, 8).toString();
            frm.txtDoctorID_bill.setText(add10);
              String add11= jTable_room1.getModel().getValueAt(row, 9).toString();
            frm.txtDoctorName_bill.setText(add11);
              String add12= jTable_room1.getModel().getValueAt(row, 10).toString();
            frm.txtDischargeDate_bill.setText(add12);
              String add13= jTable_room1.getModel().getValueAt(row, 11).toString();
            frm.txtRoomCharges_bill.setText(add13);
              String add14= jTable_room1.getModel().getValueAt(row, 12).toString();
            frm.txtServiceCharges_bill.setText(add14);
              String add15= jTable_room1.getModel().getValueAt(row, 13).toString();
            frm.txtBillingDate_bill.setText(add15);
              String add16= jTable_room1.getModel().getValueAt(row, 14).toString();
            frm.cmbPaymentMode.setSelectedItem(add16);
              String add17= jTable_room1.getModel().getValueAt(row, 15).toString();
            frm.txtPaymentModeDetails_bill.setText(add17);
             String add18= jTable_room1.getModel().getValueAt(row, 16).toString();
            frm.txtTotalCharges_bill.setText(add18);
             String add21= jTable_room1.getModel().getValueAt(row, 17).toString();
            frm.txtNoOfDays_bill.setText(add21);
             String add22= jTable_room1.getModel().getValueAt(row, 18).toString();
            frm.txtTotalRoomCharges_bill.setText(add22);
            frm.Patient_roomID.setText(add3);
            frm.btnUpdate.setEnabled(true);
            frm.btnDelete.setEnabled(true);
            frm.btnSave.setEnabled(false);
          }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex);
        }       
    }
    public static void main(String args[])
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(PatientBillDetailsWithData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(PatientBillDetailsWithData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
        java.util.logging.Logger.getLogger(PatientBillDetailsWithData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
        java.util.logging.Logger.getLogger(PatientBillDetailsWithData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new PatientBillDetailsWithData().setVisible(true);
            }
        });
    }
    private javax.swing.JTable jTable_room1;
    private javax.swing.JScrollPane jScrollPane_room1;
}