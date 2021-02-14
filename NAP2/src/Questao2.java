
public class Questao2 extends javax.swing.JFrame {

    public Questao2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        num3 = new javax.swing.JTextField();
        labelNum1 = new javax.swing.JLabel();
        labemNum2 = new javax.swing.JLabel();
        labelNum3 = new javax.swing.JLabel();
        lblS = new javax.swing.JLabel();
        labelSoma = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        labelSub = new javax.swing.JLabel();
        lblM = new javax.swing.JLabel();
        labelMedia = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(147, 160, 185));

        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        labelNum1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelNum1.setText("Número 1");

        labemNum2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labemNum2.setText("Número 2");

        labelNum3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labelNum3.setText("Número 3");

        lblS.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblS.setText("Soma:");

        labelSoma.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        labelSoma.setForeground(new java.awt.Color(255, 0, 0));

        lblSub.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblSub.setText("Subtração:");

        labelSub.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        labelSub.setForeground(new java.awt.Color(255, 0, 0));

        lblM.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lblM.setText("Média:");

        labelMedia.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        labelMedia.setForeground(new java.awt.Color(255, 0, 0));

        btnCalc.setBackground(new java.awt.Color(204, 204, 204));
        btnCalc.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNum1))
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labemNum2))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNum3)
                            .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelSub, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnCalc)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNum1)
                    .addComponent(labemNum2)
                    .addComponent(labelNum3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnCalc)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblS)
                    .addComponent(labelSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSub)
                    .addComponent(labelSub, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblM)
                    .addComponent(labelMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed

    }//GEN-LAST:event_num2ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed

    }//GEN-LAST:event_num1ActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        int A1 = Integer.parseInt(num1.getText());
        int A2 = Integer.parseInt(num2.getText());
        int A3 = Integer.parseInt(num3.getText());
        int soma = A1 + A2 + A3;
        int sub = A1 - A2 - A3;
        int media = (A1 + A2 + A3) / 3;
        labelSoma.setText(Integer.toString(soma));
        labelSub.setText(Integer.toString(sub));
        labelMedia.setText(Integer.toString(media));


    }//GEN-LAST:event_btnCalcActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed

    }//GEN-LAST:event_num3ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questao2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel labelMedia;
    private javax.swing.JLabel labelNum1;
    private javax.swing.JLabel labelNum3;
    private javax.swing.JLabel labelSoma;
    private javax.swing.JLabel labelSub;
    private javax.swing.JLabel labemNum2;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblS;
    private javax.swing.JLabel lblSub;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JTextField num3;
    // End of variables declaration//GEN-END:variables
}
