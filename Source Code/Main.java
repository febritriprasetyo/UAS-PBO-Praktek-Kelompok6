/**
 *
 * @author febri
 */

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UAS PBO KELOMPOK 6");
        setBackground(new java.awt.Color(41, 54, 63));

        jPanel1.setBackground(new java.awt.Color(41, 54, 63));

        jButton1.setText("All Employees");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Total Monthly Salary for Part Time Staff");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Total Monthly Salary for All Employees");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(51, 255, 204));
        jLabel2.setText("PART A :");

        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setText("PART B :");

        jLabel4.setForeground(new java.awt.Color(51, 255, 204));
        jLabel4.setText("PART C :");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Signika Negative", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 255, 255));
        label1.setText("TEST DATA");

        jButton4.setText("Staff");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Employee Information");

        jButton5.setText("Faculty");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Part Time");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("© Kelompok 6");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6))
                    .addComponent(jButton3))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel4))
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Employee emp [] = new Employee[9];
		emp [0] = (new Staff("Allen", "Paita", "123",'M', 2, 23, 59, 50.00));
		emp [1] = (new Staff("Zapata", "Steven", "456", 'F', 7, 12, 64, 35.00));
		emp [2] = (new Staff("Rios", "Enrique", "789", 'M', 6, 2, 70, 40.00));

		emp [3] = (new Faculty("Johnson", "Anne", "243", 'F', 4, 27, 62, "Ph.D", "Engineering", 3, Faculty.Level.FULL));
		emp [4] = (new Faculty("Bouris", "William", "791", 'F', 3, 14, 75, "Ph.D","English", 1, Faculty.Level.ASSOCIATE_PROFESSOR));
		emp [5] = (new Faculty("Andrade","Christopher", "623", 'F', 5, 22, 80, "MS", "Physical Education", 0, Faculty.Level.ASSISTANT_PROFESSOR));

		emp [6] = (new Partime("Guzman", "Augusto", "455", 'F', 8, 10, 77, 35.00, 30));
		emp [7] = (new Partime("Depirro", "Martin", "678", 'F', 9, 15, 87, 30.00, 15));
		emp [8] = (new Partime("Aldaco", "Marque", "945", 'M', 11, 24, 88, 20.00, 35));
                
                for (Employee emp1 : emp) {
                JOptionPane.showMessageDialog(null, emp1 + "");
            }
    }//GEN-LAST:event_jButton1ActionPerformed
                                        
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
        Employee emp [] = new Employee[9];
		emp [0] = (new Staff("Allen", "Paita", "123",'M', 2, 23, 59, 50.00));
		emp [1] = (new Staff("Zapata", "Steven", "456", 'F', 7, 12, 64, 35.00));
		emp [2] = (new Staff("Rios", "Enrique", "789", 'M', 6, 2, 70, 40.00));

		emp [3] = (new Faculty("Johnson", "Anne", "243", 'F', 4, 27, 62, "Ph.D", "Engineering", 3, Faculty.Level.FULL));
		emp [4] = (new Faculty("Bouris", "William", "791", 'F', 3, 14, 75, "Ph.D","English", 1, Faculty.Level.ASSOCIATE_PROFESSOR));
		emp [5] = (new Faculty("Andrade","Christopher", "623", 'F', 5, 22, 80, "MS", "Physical Education", 0, Faculty.Level.ASSISTANT_PROFESSOR));

		emp [6] = (new Partime("Guzman", "Augusto", "455", 'F', 8, 10, 77, 35.00, 30));
		emp [7] = (new Partime("Depirro", "Martin", "678", 'F', 9, 15, 87, 30.00, 15));
		emp [8] = (new Partime("Aldaco", "Marque", "945", 'M', 11, 24, 88, 20.00, 35));
                double total_part_time = 0.0;

                for (Employee emp1 : emp) {
                if (emp1 instanceof Partime) {
                    total_part_time += emp1.monthlyEarning();
                }
            }
            JOptionPane.showMessageDialog(null, "Total Monthly Salary for Part Time Staff : " + "$" + total_part_time + "\n");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
        Employee emp [] = new Employee[9];
		emp [0] = (new Staff("Allen", "Paita", "123",'M', 2, 23, 59, 50.00));
		emp [1] = (new Staff("Zapata", "Steven", "456", 'F', 7, 12, 64, 35.00));
		emp [2] = (new Staff("Rios", "Enrique", "789", 'M', 6, 2, 70, 40.00));

		emp [3] = (new Faculty("Johnson", "Anne", "243", 'F', 4, 27, 62, "Ph.D", "Engineering", 3, Faculty.Level.FULL));
		emp [4] = (new Faculty("Bouris", "William", "791", 'F', 3, 14, 75, "Ph.D","English", 1, Faculty.Level.ASSOCIATE_PROFESSOR));
		emp [5] = (new Faculty("Andrade","Christopher", "623", 'F', 5, 22, 80, "MS", "Physical Education", 0, Faculty.Level.ASSISTANT_PROFESSOR));

		emp [6] = (new Partime("Guzman", "Augusto", "455", 'F', 8, 10, 77, 35.00, 30));
		emp [7] = (new Partime("Depirro", "Martin", "678", 'F', 9, 15, 87, 30.00, 15));
		emp [8] = (new Partime("Aldaco", "Marque", "945", 'M', 11, 24, 88, 20.00, 35));
                
                double total_salary = 0.0;
                for (Employee emp1 : emp) {
                total_salary += emp1.monthlyEarning();
            }
		JOptionPane.showMessageDialog(null, "Total Monthly Salary for All Employees : " + "$" + total_salary + "\n");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        Employee emp [] = new Employee[3];
		emp [0] = (new Staff("Allen", "Paita", "123",'M', 2, 23, 59, 50.00));
		emp [1] = (new Staff("Zapata", "Steven", "456", 'F', 7, 12, 64, 35.00));
		emp [2] = (new Staff("Rios", "Enrique", "789", 'M', 6, 2, 70, 40.00));

                for (Employee emp1 : emp) {
                JOptionPane.showMessageDialog(this, emp1 + "");
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        Employee emp [] = new Employee[3];	
		emp [0] = (new Faculty("Johnson", "Anne", "243", 'F', 4, 27, 62, "Ph.D", "Engineering", 3, Faculty.Level.FULL));
		emp [1] = (new Faculty("Bouris", "William", "791", 'F', 3, 14, 75, "Ph.D","English", 1, Faculty.Level.ASSOCIATE_PROFESSOR));
		emp [2] = (new Faculty("Andrade","Christopher", "623", 'F', 5, 22, 80, "MS", "Physical Education", 0, Faculty.Level.ASSISTANT_PROFESSOR));

                for (Employee emp1 : emp) {
                JOptionPane.showMessageDialog(null, emp1 + "");
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        Employee emp [] = new Employee[3];	
		emp [0] = (new Partime("Guzman", "Augusto", "455", 'F', 8, 10, 77, 35.00, 30));
		emp [1] = (new Partime("Depirro", "Martin", "678", 'F', 9, 15, 87, 30.00, 15));
		emp [2] = (new Partime("Aldaco", "Marque", "945", 'M', 11, 24, 88, 20.00, 35));
                for (Employee emp1 : emp) {
                JOptionPane.showMessageDialog(this, emp1 + "");
            }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}