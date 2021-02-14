
public class Questao3 extends javax.swing.JFrame {

    public Questao3() {
        initComponents();
    }
    int[] vetor = new int[6];
    int entrada;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelS = new javax.swing.JLabel();
        bntV = new javax.swing.JButton();
        entradaV = new javax.swing.JTextField();
        labelAviso = new javax.swing.JLabel();
        labelTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        labelS.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N

        bntV.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        bntV.setText("Adicionar");
        bntV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVActionPerformed(evt);
            }
        });

        labelAviso.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 10)); // NOI18N
        labelAviso.setForeground(new java.awt.Color(255, 0, 0));

        labelTexto.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        labelTexto.setText("Digite um número para ser adicionado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelS, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(labelTexto)
                        .addGap(18, 18, 18)
                        .addComponent(entradaV, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntV)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTexto)
                    .addComponent(bntV))
                .addGap(50, 50, 50)
                .addComponent(labelS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVActionPerformed

        vetor[entrada] = Integer.parseInt(entradaV.getText());
        entrada++;
        int x = entrada;
        labelS.setText("Adicionados no Vetor: [" + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", " + vetor[3] + ", " + vetor[4] + "]");
        if (x > 5) {
            labelAviso.setText("Atenção: o número " + vetor[5] + " não pode ser adicionado, vetor cheio!");
        }
    }//GEN-LAST:event_bntVActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questao3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntV;
    private javax.swing.JTextField entradaV;
    private javax.swing.JLabel labelAviso;
    private javax.swing.JLabel labelS;
    private javax.swing.JLabel labelTexto;
    // End of variables declaration//GEN-END:variables
}
