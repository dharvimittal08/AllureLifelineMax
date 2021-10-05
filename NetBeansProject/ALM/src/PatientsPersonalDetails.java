import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Connection;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;


public class PatientsPersonalDetails extends javax.swing.JFrame {

PreparedStatement prea_state = null;
Connection conn_ection = null;
ResultSet result_set = null;

    
    public PatientsPersonalDetails() {
        Init_Compo();
        conn_ection = EstConnectionWithDatabase.ConnectDB();
        getdata();
    }
private void getdata(){
           String S_Q_L = "select PatientID as 'Patient ID', PatientName as 'Patient Name',FatherName as 'Father Name',Address,ContactNo as 'Contact No',Email as 'Email ID',Age,Gen as 'Gender',BG as 'Blood Group',Remarks from Patientregistration";
           try{
                prea_state = conn_ection.prepareStatement(S_Q_L);
                result_set = prea_state.executeQuery();
                jTable_pat1.setModel(DbUtils.resultSetToTableModel(result_set));
            }catch(Exception ep){
            JOptionPane.showMessageDialog(null, ep);
          }
    }
    
    
    
    private void Init_Compo() {
        
        jTable_pat1 = new javax.swing.JTable();
        jScrollPanel_pat1 = new javax.swing.JScrollPane();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent event) {
                formWindowClosing(event);
            }
        });
         jScrollPanel_pat1.setViewportView(jTable_pat1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanel_pat1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanel_pat1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );

        jTable_pat1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_pat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent event) {
                jTable1MouseClicked(event);
            }
        });

        pack();
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent event) {
        try{
            conn_ection = EstConnectionWithDatabase.ConnectDB();
            int row = jTable_pat1.getSelectedRow();
            String table_click = jTable_pat1.getModel().getValueAt(row, 0).toString();
            String S_Q_L = "select * from PatientRegistration where PatientID = '" + table_click + "'";
            prea_state = conn_ection.prepareStatement(S_Q_L);
            result_set =  prea_state.executeQuery();
            if(result_set.next()){
                this.hide();
                PatientRegestrationDetails frm = new PatientRegestrationDetails();
                frm.setVisible(true);
                String add2=result_set.getString("Patient Name:");
                frm.txt_pat_Name.setText(add2);
                String add1=result_set.getString("Patient ID:");
                frm.txt_pat_Id.setText(add1);
                String add3=result_set.getString("Father's Name:");
                frm.txt_pat_Fname.setText(add3);
                String add15=result_set.getString("Address:");
                frm.txtAdd.setText(add15);
                String add5=result_set.getString("Email ID:");
                frm.txt_pat_Email.setText(add5);
                int add6 = result_set.getInt("Age:");
                String add= Integer.toString(add6);
                frm.txt_pat_Age.setText(add);
                String add11=result_set.getString("Gender:");
                frm.cmbGender.setSelectedItem(add11);
                String add9=result_set.getString("Blood Group:");
                frm.cmbBG.setSelectedItem(add9);
                String add16=result_set.getString("Contact No:");
                frm.txtContact.setText(add16);
                String add7=result_set.getString("Remarks:");
                frm.txt_pat_Info.setText(add7);
                frm.btnDelete.setEnabled(true);
                frm.btnUpdate.setEnabled(true);
                frm.btnSave.setEnabled(false);
             
            }
        }catch(Exception exep){
            JOptionPane.showMessageDialog(this,exep);
        }        
    }

    private void formWindowClosing(java.awt.event.WindowEvent event) {

     
    }

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (InstantiationException exep) {
            java.util.logging.Logger.getLogger(PatientsPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, exep);
        } 
        catch (ClassNotFoundException exep) {
            java.util.logging.Logger.getLogger(PatientsPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, exep);
        }
        catch (javax.swing.UnsupportedLookAndFeelException exep) {
            java.util.logging.Logger.getLogger(PatientsPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, exep);
        }
        catch (IllegalAccessException exep) {
            java.util.logging.Logger.getLogger(PatientsPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, exep);
        } 
       
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientsPersonalDetails().setVisible(true);
            }
        });
    }

    public javax.swing.JTable jTable_pat1;
    public javax.swing.JScrollPane jScrollPanel_pat1;
    
    
}