import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;

public class UserLoginData extends javax.swing.JFrame {

PreparedStatement prea_state = null;
Connection conn_ection = null;
ResultSet result_set = null;
   
    public UserLoginData() {
        Init_Comp();
        conn_ection = EstConnectionWithDatabase.ConnectDB();
        getData();
    }
    private void getData(){
        String S_Q_L = "select user_name as 'User Name', password as 'Password' from users order by user_name";
          try{
         prea_state = conn_ection.prepareStatement(S_Q_L);
         result_set = prea_state.executeQuery();
         User_table_login.setModel(DbUtils.resultSetToTableModel(result_set));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}
    }

   
    
    
    private void Init_Comp() {
        
        User_table_login = new javax.swing.JTable();
        jScroll_login_Pane1 = new javax.swing.JScrollPane();
       

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        User_table_login.setModel(new javax.swing.table.DefaultTableModel(
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
        jScroll_login_Pane1.setViewportView(User_table_login);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScroll_login_Pane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScroll_login_Pane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
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
        } 
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserLoginData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginData().setVisible(true);
            }
        });
    }

    
    
    private javax.swing.JScrollPane jScroll_login_Pane1;
    private javax.swing.JTable User_table_login;
    
}
