
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Questao5 extends javax.swing.JFrame {

    public Questao5() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bntAcao = new javax.swing.JButton();
        labeL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntAcao.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        bntAcao.setText("Ler arquivo");
        bntAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAcaoActionPerformed(evt);
            }
        });

        labeL.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        labeL.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(bntAcao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(labeL, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(bntAcao)
                .addGap(18, 18, 18)
                .addComponent(labeL, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAcaoActionPerformed
        File texto = new File("texto.txt");
        try {
            FileReader fr = new FileReader(texto);
            BufferedReader ler = new BufferedReader(fr);
            String leitor = ler.readLine();
            labeL.setText(leitor);
            ler.close();

        } catch (Exception e) {
        }

    }//GEN-LAST:event_bntAcaoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questao5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAcao;
    private javax.swing.JLabel labeL;
    // End of variables declaration//GEN-END:variables
}
