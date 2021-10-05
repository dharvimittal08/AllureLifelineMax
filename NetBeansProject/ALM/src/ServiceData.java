import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;

public class ServiceData extends javax.swing.JFrame {

    PreparedStatement prea_state = null;
    ResultSet result_set = null;
    Connection conn_ection = null;
    
    
    public ServiceData() {
        Init_Compo();
        conn_ection = EstConnectionWithDatabase.ConnectDB();
        getdata();
        
    }
 private void getdata(){
       String sql = "select ServiceID as 'Service ID', ServiceName as 'Service Name',ServiceDate as 'Service Date',PatientRegistration.PatientID as 'Patient ID',PatientName as 'Patient Name',ServiceCharges as 'Service Charges' from PatientRegistration,Services where Services.PatientID=PatientRegistration.PatientID order by PatientName";
       try{         
            prea_state = conn_ection.prepareStatement(sql);
            result_set = prea_state.executeQuery();
            txt_rec_Table.setModel(DbUtils.resultSetToTableModel(result_set));
         }catch(Exception ep){
            JOptionPane.showMessageDialog(null, ep);
            ep.printStackTrace();
          }
 }      
     
    
    private void Init_Compo() {

        txt_rec_Table = new javax.swing.JTable();
        j_rec_ScrollPane1 = new javax.swing.JScrollPane();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        j_rec_ScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent event) {
                jScrollPane1MouseClicked(event);
            }
        });
        j_rec_ScrollPane1.setViewportView(txt_rec_Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j_rec_ScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j_rec_ScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();

        txt_rec_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title-1", "Title-2", "Title-3", "Title-4"
            }
        ));
        txt_rec_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent event) {
                txtTableMouseClicked(event);
            }
        });
        

        pack();
    }

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent event) {

    }

    private void txtTableMouseClicked(java.awt.event.MouseEvent event) {
       try{
            conn_ection = EstConnectionWithDatabase.ConnectDB();
            int row = txt_rec_Table.getSelectedRow();
            String table_click = txt_rec_Table.getModel().getValueAt(row, 0).toString();
            String sql = "Select * from PatientRegistration,Services where Services.PatientID=PatientRegistration.PatientID and ServiceID=" + table_click  + "";
            result_set =  prea_state.executeQuery();
            prea_state = conn_ection.prepareStatement(sql);
            if(result_set.next()){
                this.hide();
                ServicesProvidedAndCharges frm = new ServicesProvidedAndCharges();
                frm.setVisible(true);
                String add4=result_set.getString("Patient ID");
                frm.txtPatientID.setText(add4);
                String add3=result_set.getString("Patient Name");
                frm.txtPatientName.setText(add3);
                String add1=result_set.getString("Service Name");
                frm.txtServiceName.setText(add1);
                int add5 = result_set.getInt("Service ID");
                String add6= Integer.toString(add5);
                frm.txtServiceID.setText(add6);
                int add7 = result_set.getInt("Service Charges");
                String add8= Integer.toString(add7);
                frm.txtServiceCharges.setText(add8);
                String add2=result_set.getString("Service Date");
                frm.txtServiceDate.setText(add2);
                frm.txtSave.setEnabled(false);
                frm.txtDelete.setEnabled(true);
                frm.txtUpdate.setEnabled(true);
            }
          
        }catch(Exception excp){
            JOptionPane.showMessageDialog(this,excp);
        }        
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
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ServiceData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceData().setVisible(true);
            }
        });
    }

    
    
    private javax.swing.JTable txt_rec_Table;
    private javax.swing.JScrollPane j_rec_ScrollPane1;
   
}
