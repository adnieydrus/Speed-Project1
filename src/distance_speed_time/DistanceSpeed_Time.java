/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance_speed_time;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DistanceSpeed_Time extends javax.swing.JFrame {

    /**
     * Creates new form DistanceSpeed_Time
     */
    public DistanceSpeed_Time() {
        initComponents();
        addButtonGroup();
    }
    
    private void addButtonGroup() {
        buttonGroup1.add(jRadioDistance);
        buttonGroup1.add(jRadioSpeed);
        buttonGroup1.add(jRadioTime);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jlblDisplay3 = new javax.swing.JLabel();
        jlblDisplay2 = new javax.swing.JLabel();
        jlblDisplay1 = new javax.swing.JLabel();
        jbtnReset = new javax.swing.JButton();
        jbtnCovert = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jtxtEnter2 = new javax.swing.JTextField();
        jtxtEnter1 = new javax.swing.JTextField();
        jlblResult = new javax.swing.JLabel();
        jRadioDistance = new javax.swing.JRadioButton();
        jRadioSpeed = new javax.swing.JRadioButton();
        jRadioTime = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 15));
        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblDisplay3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jlblDisplay3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 70, 20));

        jlblDisplay2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlblDisplay2.setPreferredSize(new java.awt.Dimension(10, 2));
        jPanel1.add(jlblDisplay2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 70, 30));

        jlblDisplay1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jlblDisplay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 70, 20));

        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jbtnCovert.setText("Convert");
        jbtnCovert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCovertActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnCovert, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jbtnExit.setText("exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));
        jPanel1.add(jtxtEnter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 80, -1));
        jPanel1.add(jtxtEnter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 80, 30));

        jlblResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jlblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 80, 20));

        jRadioDistance.setText("Distance");
        jPanel1.add(jRadioDistance, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jRadioSpeed.setText("Speed");
        jPanel1.add(jRadioSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jRadioTime.setText("Time");
        jPanel1.add(jRadioTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel1.setText("DISTANCE SPEED TIME CALCULATOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCovertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCovertActionPerformed
        String input1 = jtxtEnter1.getText();
        String input2 = jtxtEnter2.getText();
        double dst1 = Double.parseDouble(input1);
        double dst2 = Double.parseDouble(input2);

        if ((input1.equals("")) || (input2.equals(""))) {
            JOptionPane.showMessageDialog(null, "You must enter value to compute",
                    "DST System", JOptionPane.INFORMATION_MESSAGE);
        } else if (jRadioDistance.isSelected()) {
            distance(dst1, dst2);
        } else if (jRadioSpeed.isSelected()) {
            speed(dst1, dst2);
        } else if (jRadioTime.isSelected()) {
            time(dst1, dst2);
        }
    }//GEN-LAST:event_jbtnCovertActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jlblResult.setText(null);
        jlblDisplay1.setText(null);
        jlblDisplay2.setText(null);
        jlblDisplay3.setText(null);
        jtxtEnter1.setText(null);
        jtxtEnter2.setText(null);
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnExitActionPerformed

    public double distance(double dst2, double dst3) {
        double dst1;
        jlblDisplay1.setText("Distance = ");
        jlblDisplay2.setText("Speed   X");
        jlblDisplay3.setText("Time");
        dst1 = dst2 * dst3;
        String value = String.format("%.2f", dst1);
        jlblResult.setText(value);
        return dst1;
    }

    public double speed(double dst1, double dst3) {
        double dst2;
        jlblDisplay1.setText("Speed = ");
        jlblDisplay2.setText(" Distance  /");
        jlblDisplay3.setText("Time");
        dst2 = dst1 / dst3;
        String value = String.format("%.2f", dst2);
        jlblResult.setText(value);
        return dst2;
    }

    public double time(double dst1, double dst2) {
        double dst3;
        jlblDisplay1.setText("Time  = ");
        jlblDisplay2.setText("Distance   /");
        jlblDisplay3.setText("Speed ");
        dst3 = dst1 / dst2;
        String value = String.format("%.2f", dst3);
        jlblResult.setText(value);
        return dst3;
    }

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
            java.util.logging.Logger.getLogger(DistanceSpeed_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DistanceSpeed_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DistanceSpeed_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DistanceSpeed_Time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DistanceSpeed_Time().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioDistance;
    private javax.swing.JRadioButton jRadioSpeed;
    private javax.swing.JRadioButton jRadioTime;
    private javax.swing.JButton jbtnCovert;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblDisplay1;
    private javax.swing.JLabel jlblDisplay2;
    private javax.swing.JLabel jlblDisplay3;
    private javax.swing.JLabel jlblResult;
    private javax.swing.JTextField jtxtEnter1;
    private javax.swing.JTextField jtxtEnter2;
    // End of variables declaration//GEN-END:variables
}