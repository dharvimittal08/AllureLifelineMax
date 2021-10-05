import java.sql.PreparedStatement;
import java.sql.Connection;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.*;


public class AdministratorLogin extends javax.swing.JFrame {

    
    public AdministratorLogin() {
        Init_Compo();
    }

    
    
    
    private void Init_Compo() {

        
        txt_details_Username = new javax.swing.JTextField();
        jButton_details1 = new javax.swing.JButton();

        jLabel_details_1 = new javax.swing.JLabel();
        jLabel_details_2 = new javax.swing.JLabel();
        jPassword_details = new javax.swing.JPasswordField();
        
        jLabel_details_2.setFont(new java.awt.Font("Arial", 0, 19)); 
        jLabel_details_2.setText("Password:");

        jLabel_details_1.setFont(new java.awt.Font("Arial", 0, 19)); 
        jLabel_details_1.setText("Username:");

        

        jButton_details1.setText("OK");
        jButton_details1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent event) {
                jButton1ActionPerformed(event);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_details_2)
                    .addComponent(jLabel_details_1))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_details_Username)
                    .addComponent(jPassword_details, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_details1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_details_2)
                    .addComponent(jPassword_details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_details_1)
                    .addComponent(txt_details_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton_details1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
       Connection conn_ection=null;
       ResultSet result_set=null;
       PreparedStatement prea_state=null;
       if (txt_details_Username.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Enter username");
           return;
        }
    
        if (jPassword_details.getText().equals("")) {
           JOptionPane.showMessageDialog( this, "Enter password");
           return;
          
            }
        conn_ection=EstConnectionWithDatabase.ConnectDB();
        String sq1= "select * from users where user_name= '" + txt_details_Username.getText() + "' and password ='" + jPassword_details.getText() + "'";
        try{
            prea_state = conn_ection.prepareStatement(sq1);
            result_set = prea_state.executeQuery();
            if (result_set.next()){
             this.hide();
             MainDashboard frm=new MainDashboard();
             frm.setVisible(true);
           }
           else{
              JOptionPane.showMessageDialog(null, "Incorrect Password...Try again !!!");
          }
        }catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
                  
    }
    }
   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministratorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }  
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorLogin().setVisible(true);
            }
        });
    }

   
   
    private javax.swing.JLabel jLabel_details_1;
    private javax.swing.JTextField txt_details_Username;
    private javax.swing.JPasswordField jPassword_details;
    private javax.swing.JButton jButton_details1;
    private javax.swing.JLabel jLabel_details_2;
   
}
