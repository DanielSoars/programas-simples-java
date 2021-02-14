
public class Questao1 extends javax.swing.JFrame {

    public Questao1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelUnico = new javax.swing.JPanel();
        labelTexto = new javax.swing.JLabel();
        caixaTexto = new javax.swing.JTextField();
        botaoClique = new javax.swing.JButton();
        labelSaida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelUnico.setBackground(new java.awt.Color(204, 255, 255));

        labelTexto.setText("Seu nome:");

        botaoClique.setText("Clique aqui");
        botaoClique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCliqueActionPerformed(evt);
            }
        });

        labelSaida.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        labelSaida.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout painelUnicoLayout = new javax.swing.GroupLayout(painelUnico);
        painelUnico.setLayout(painelUnicoLayout);
        painelUnicoLayout.setHorizontalGroup(
            painelUnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUnicoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(labelTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelUnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelUnicoLayout.createSequentialGroup()
                        .addComponent(caixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoClique)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        painelUnicoLayout.setVerticalGroup(
            painelUnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelUnicoLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(painelUnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoClique)
                    .addComponent(labelTexto))
                .addGap(18, 18, 18)
                .addComponent(labelSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelUnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelUnico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCliqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCliqueActionPerformed
        String nome = caixaTexto.getText();
        labelSaida.setText("Olá " + nome + " !");
    }//GEN-LAST:event_botaoCliqueActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Questao1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoClique;
    private javax.swing.JTextField caixaTexto;
    private javax.swing.JLabel labelSaida;
    private javax.swing.JLabel labelTexto;
    private javax.swing.JPanel painelUnico;
    // End of variables declaration//GEN-END:variables
}
