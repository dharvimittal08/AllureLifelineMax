
public class MainDashboard extends javax.swing.JFrame {

    
    public MainDashboard() {
        initComponents();
    }

    
    
    
    private void initComponents() {

        jMenuItemMain11 = new javax.swing.JMenuItem();
        jLabelMain1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuMain1 = new javax.swing.JMenu();
        jMenuItemMain1 = new javax.swing.JMenuItem();
        jMenuItemMain2 = new javax.swing.JMenuItem();
        jMenuItemMain3 = new javax.swing.JMenuItem();
        jMenuMain2 = new javax.swing.JMenu();
        jMenuItemMain6 = new javax.swing.JMenuItem();
        jMenuItemMain7 = new javax.swing.JMenuItem();
        jMenuMain3 = new javax.swing.JMenu();
        jMenuItemMain4 = new javax.swing.JMenuItem();
        jMenuMain5 = new javax.swing.JMenu();
        jMenuMain7 = new javax.swing.JMenu();
        jMenuItemMain8 = new javax.swing.JMenuItem();
        jMenuMain8 = new javax.swing.JMenu();
        jMenuItemMain9 = new javax.swing.JMenuItem();
        jMenuMain9 = new javax.swing.JMenu();
        jMenuItemMain12 = new javax.swing.JMenuItem();
        jMenuMain6 = new javax.swing.JMenu();
        jMenuItemMain10 = new javax.swing.JMenuItem();
        jMenuMain4 = new javax.swing.JMenu();
        jMenuItemMain5 = new javax.swing.JMenuItem();

        jMenuItemMain11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelMain1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.jpeg"))); 
        jMenuMain1.setText("Users");
        jMenuMain1.setFont(new java.awt.Font("Arial", 0, 18)); 
        jMenuMain1.setPreferredSize(new java.awt.Dimension(60, 25));

        jMenuItemMain1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMain1.setText("New User");
        jMenuItemMain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuMain1.add(jMenuItemMain1);

        jMenuItemMain2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMain2.setText("Change Password");
        jMenuItemMain2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuMain1.add(jMenuItemMain2);

        jMenuItemMain3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMain3.setText("Login details");
        jMenuItemMain3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuMain1.add(jMenuItemMain3);

        jMenuBar1.add(jMenuMain1);

        jMenuMain2.setText("Patients");
        jMenuMain2.setFont(new java.awt.Font("Arial", 0, 18)); 
        jMenuMain2.setPreferredSize(new java.awt.Dimension(70, 25));

        jMenuItemMain6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMain6.setText("Registration");
        jMenuItemMain6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenuMain2.add(jMenuItemMain6);

        jMenuItemMain7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMain7.setText("Services");
        jMenuItemMain7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuMain2.add(jMenuItemMain7);

        jMenuBar1.add(jMenuMain2);

        jMenuMain3.setText("Doctors");
        jMenuMain3.setFont(new java.awt.Font("Arial", 0, 18)); 
        jMenuMain3.setPreferredSize(new java.awt.Dimension(71, 25));

        jMenuItemMain4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMain4.setText("Entry");
        jMenuItemMain4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuMain3.add(jMenuItemMain4);

        jMenuBar1.add(jMenuMain3);

        jMenuMain5.setText("Rooms");
        jMenuMain5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenuMain7.setText("Add rooms");

        jMenuItemMain8.setText("Room");
        jMenuItemMain8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenuMain7.add(jMenuItemMain8);

        jMenuMain5.add(jMenuMain7);

        jMenuMain8.setText("Admit");

        jMenuItemMain9.setText("Room");
        jMenuItemMain9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuMain8.add(jMenuItemMain9);

        jMenuMain5.add(jMenuMain8);

        jMenuMain9.setText("Discharge");

        jMenuItemMain12.setText("Room");
        jMenuItemMain12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenuMain9.add(jMenuItemMain12);

        jMenuMain5.add(jMenuMain9);

        jMenuMain6.setText("Billing");

        jMenuItemMain10.setText("Room");
        jMenuItemMain10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenuMain6.add(jMenuItemMain10);

        jMenuMain5.add(jMenuMain6);

        jMenuBar1.add(jMenuMain5);

        jMenuMain4.setText("Help");
        jMenuMain4.setFont(new java.awt.Font("Arial", 0, 18)); 
        jMenuMain4.setPreferredSize(new java.awt.Dimension(60, 25));

        jMenuItemMain5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemMain5.setText("About");
        jMenuItemMain5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuMain4.add(jMenuItemMain5);

        jMenuBar1.add(jMenuMain4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMain1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMain1)
        );

        pack();
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
     AdminDetailsModification ob1=new AdminDetailsModification();
     ob1.setVisible(true);        
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
     AccessToHospEmp ob1=new AccessToHospEmp();
     ob1.setVisible(true);
   
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
     UserLoginData ob1=new UserLoginData();
     ob1.setVisible(true);        
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
    NewDoctor_Modification ob1=new NewDoctor_Modification();
    ob1.setVisible(true);
    
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
  MoreInfoAboutProjectALM ob1=new MoreInfoAboutProjectALM();
  ob1.setVisible(true);

    }

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
    PatientRegestrationDetails ob1=new PatientRegestrationDetails();
    ob1.setVisible(true);

    }

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
   ServicesProvidedAndCharges ob1=new ServicesProvidedAndCharges();
   ob1.setVisible(true);
   
    }

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
  AvailabilityOfRooms_Details obj1=new AvailabilityOfRooms_Details();
  obj1.setVisible(true);

    }

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
    PatientRoomSeviceDetails obj1=new PatientRoomSeviceDetails();
    obj1.setVisible(true);

    }

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
   PatientBillDetails obj1=new PatientBillDetails();
   obj1.setVisible(true);

    }

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {
  PatientsDischargePersonalDetails obj1=new PatientsDischargePersonalDetails();
  obj1.setVisible(true);
  
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
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDashboard().setVisible(true);
            }
        });
    }

    
    private javax.swing.JLabel jLabelMain1;
    private javax.swing.JMenu jMenuMain1;
    private javax.swing.JMenu jMenuMain2;
    private javax.swing.JMenu jMenuMain3;
    private javax.swing.JMenu jMenuMain4;
    private javax.swing.JMenu jMenuMain5;
    private javax.swing.JMenu jMenuMain6;
    private javax.swing.JMenu jMenuMain7;
    private javax.swing.JMenu jMenuMain8;
    private javax.swing.JMenu jMenuMain9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemMain1;
    private javax.swing.JMenuItem jMenuItemMain10;
    private javax.swing.JMenuItem jMenuItemMain11;
    private javax.swing.JMenuItem jMenuItemMain12;
    private javax.swing.JMenuItem jMenuItemMain2;
    private javax.swing.JMenuItem jMenuItemMain3;
    private javax.swing.JMenuItem jMenuItemMain4;
    private javax.swing.JMenuItem jMenuItemMain5;
    private javax.swing.JMenuItem jMenuItemMain6;
    private javax.swing.JMenuItem jMenuItemMain7;
    private javax.swing.JMenuItem jMenuItemMain8;
    private javax.swing.JMenuItem jMenuItemMain9;

}
