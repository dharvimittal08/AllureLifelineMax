
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class DoctorsPersonalDetails extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    
    public DoctorsPersonalDetails() {
        initComponents();
        con= EstConnectionWithDatabase.ConnectDB();
        Get_Data();
    }
private void Get_Data(){
      String sql="select DoctorID as 'Doctor ID', DoctorName as 'Doctor Name',FatherName as 'Father Name',Address,ContacNo as 'Contact No',Email as 'Email ID',Qualifications,Gender,BloodGroup as 'Blood Group',DateOfJoining as 'Joining Date' from Doctor order by DoctorName";        
      try{
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
        }
    }
   
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
try{
            con=EstConnectionWithDatabase.ConnectDB();
            int row= jTable1.getSelectedRow();
            String table_click= jTable1.getModel().getValueAt(row, 0).toString();
            String sql= "select * from Doctor where DoctorID = '" + table_click + "'";
            pst=con.prepareStatement(sql);
            rs=  pst.executeQuery();
            if(rs.next()){
                this.hide();
                NewDoctor_Modification frm = new NewDoctor_Modification();
                frm.setVisible(true);
                String add1=rs.getString("DoctorID");
                frm.txt_doc_Id.setText(add1);
                String add2=rs.getString("Doctorname");
                frm.txt_doc_Name.setText(add2);
                String add3=rs.getString("Fathername");
                frm.txt_doc_Fname.setText(add3);
                String add5=rs.getString("Email");
                frm.txt_doc_E.setText(add5);
                String add6=rs.getString("Qualifications");
                frm.txt_doc_Q.setText(add6);
                String add9=rs.getString("BloodGroup");
                frm.cmb_doc_B.setSelectedItem(add9);
                String add11=rs.getString("Gender");
                frm.cmb_doc_G.setSelectedItem(add11);
                String add14=rs.getString("DateOfJoining");
                frm.txt_doc_D.setText(add14);
                String add15=rs.getString("Address");
                frm.txt_doc_Ad.setText(add15);
                String add16=rs.getString("ContacNo");
                frm.txt_doc_C.setText(add16);
                frm.btn_doc_Update.setEnabled(true);
                frm.btn_doc_Delete.setEnabled(true);
                frm.btn_doc_Save.setEnabled(false);
             
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }       
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {

     
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
            java.util.logging.Logger.getLogger(DoctorsPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorsPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorsPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorsPersonalDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DoctorsPersonalDetails().setVisible(true);
            }
        });
    }

    
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    
}
