package FinalProject;

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMainBG = new javax.swing.JPanel();
        panelTransaction = new javax.swing.JPanel();
        lTransaction = new javax.swing.JLabel();
        panelSignOut = new javax.swing.JPanel();
        lSignOut = new javax.swing.JLabel();
        imageHomeBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Menu");
        setMaximumSize(new java.awt.Dimension(750, 500));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setName("Home Menu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(750, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        panelMainBG.setLayout(null);

        panelTransaction.setBackground(new java.awt.Color(255, 255, 255));

        lTransaction.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lTransaction.setForeground(new java.awt.Color(51, 51, 51));
        lTransaction.setText(" Transaction");

        javax.swing.GroupLayout panelTransactionLayout = new javax.swing.GroupLayout(panelTransaction);
        panelTransaction.setLayout(panelTransactionLayout);
        panelTransactionLayout.setHorizontalGroup(
            panelTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lTransaction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panelTransactionLayout.setVerticalGroup(
            panelTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lTransaction, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelMainBG.add(panelTransaction);
        panelTransaction.setBounds(550, 50, 100, 30);

        panelSignOut.setBackground(new java.awt.Color(255, 255, 255));

        lSignOut.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        lSignOut.setForeground(new java.awt.Color(51, 51, 51));
        lSignOut.setText("Sign-Out");

        javax.swing.GroupLayout panelSignOutLayout = new javax.swing.GroupLayout(panelSignOut);
        panelSignOut.setLayout(panelSignOutLayout);
        panelSignOutLayout.setHorizontalGroup(
            panelSignOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSignOutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lSignOut)
                .addGap(14, 14, 14))
        );
        panelSignOutLayout.setVerticalGroup(
            panelSignOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lSignOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelMainBG.add(panelSignOut);
        panelSignOut.setBounds(660, 50, 80, 30);

        imageHomeBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePack/750x500_HomeBG.png"))); // NOI18N
        panelMainBG.add(imageHomeBG);
        imageHomeBG.setBounds(0, 0, 750, 500);

        getContentPane().add(panelMainBG);
        panelMainBG.setBounds(0, 0, 750, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageHomeBG;
    private javax.swing.JLabel lSignOut;
    private javax.swing.JLabel lTransaction;
    private javax.swing.JPanel panelMainBG;
    private javax.swing.JPanel panelSignOut;
    private javax.swing.JPanel panelTransaction;
    // End of variables declaration//GEN-END:variables
}
