
package calculadorav4;
import java.math.BigDecimal; 
import javax.swing.JLabel;
import javax.swing.Timer;

public class MainCalculadora extends javax.swing.JFrame {

private StringBuilder numero = new StringBuilder();
private double num1, num2, res, memoria;
private int cantidad =0, limite = 10;
private String operador, aux;

    public MainCalculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblMemoria.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btn_Punto = new javax.swing.JButton();
        btn_Igual = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        lblOperacion = new javax.swing.JLabel();
        btnMr = new javax.swing.JButton();
        btnMAS = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnMc = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        lblMemoria = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnMemoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnOcho.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });

        btnNueve.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });

        btnSiete.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });

        btnCuatro.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });

        btnSeis.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnCinco.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnUno.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });

        btnTres.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnDos.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });

        btnCero.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });

        btn_Punto.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Punto.setText(".");
        btn_Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PuntoActionPerformed(evt);
            }
        });

        btn_Igual.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btn_Igual.setText("=");
        btn_Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IgualActionPerformed(evt);
            }
        });

        btnMas.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        txtResultado.setBackground(new java.awt.Color(204, 255, 51));
        txtResultado.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultadoActionPerformed(evt);
            }
        });
        txtResultado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtResultadoKeyTyped(evt);
            }
        });

        lblOperacion.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        btnMr.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnMr.setText("MR");
        btnMr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMrActionPerformed(evt);
            }
        });

        btnMAS.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnMAS.setText("M+");
        btnMAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMASActionPerformed(evt);
            }
        });

        btnMenos.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnMenos.setText("M-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btnMc.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnMc.setText("MC");
        btnMc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMcActionPerformed(evt);
            }
        });

        btnMulti.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnMulti.setText("*");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnResta.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnResta.setText("-");
        btnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnMemoria.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnMemoria.setText("MS");
        btnMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResultado)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMr, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMAS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnMc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMr, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnMAS, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Punto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Igual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        if(cantidad < limite){
            this.cantidad ++;
            txtResultado.setText(this.txtResultado.getText()+"8");
        }else{
            mostrarLabel(this.lblOperacion,1500);

            //this.lblOperacion.setText("limite de numeros");
        }
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        if(cantidad < limite){
            this.cantidad ++;
            txtResultado.setText(this.txtResultado.getText()+"9");
        }else{
            mostrarLabel(this.lblOperacion,1500);

            //this.lblOperacion.setText("limite de numeros");
        }
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        if(cantidad < limite){
            this.cantidad ++;
            txtResultado.setText(this.txtResultado.getText()+"7");
        }else{
            mostrarLabel(this.lblOperacion,1500);
            //this.lblOperacion.setText("limite de numeros");
        }
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        if(cantidad < limite){
            this.cantidad ++;
            txtResultado.setText(this.txtResultado.getText()+"4");
        }else{
            mostrarLabel(this.lblOperacion,1500);
            //this.lblOperacion.setText("limite de numeros");
        }
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        if(cantidad < limite){
            this.cantidad ++;
            txtResultado.setText(this.txtResultado.getText()+"6");
        }else{
            mostrarLabel(this.lblOperacion,1500);
            //this.lblOperacion.setText("limite de numeros");
        }
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        if(cantidad < limite){
            this.cantidad ++;
            txtResultado.setText(this.txtResultado.getText()+"5");
        }else{
            mostrarLabel(this.lblOperacion,1500);
            //this.lblOperacion.setText("limite de numeros");
        }
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        if(cantidad < limite){
            this.cantidad ++;
            txtResultado.setText(this.txtResultado.getText()+"1");
        }else{
            mostrarLabel(this.lblOperacion,1500);

            //this.lblOperacion.setText("limite de numeros");
        }
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        if(cantidad < limite){
            this.cantidad ++;
            txtResultado.setText(this.txtResultado.getText()+"3");
        }else{
            mostrarLabel(this.lblOperacion,1500);
           
            // this.lblOperacion.setText("limite de numeros");
        }
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        if(cantidad < limite){
            this.cantidad ++;
            txtResultado.setText(this.txtResultado.getText()+"2");
        }else{
            mostrarLabel(this.lblOperacion,1500);
            //this.lblOperacion.setText("limite de numeros");
        }
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        if(cantidad < limite){
            this.cantidad ++;
            txtResultado.setText(this.txtResultado.getText()+"0");
        }else{
            mostrarLabel(this.lblOperacion,1500);
            //this.lblOperacion.setText("limite de numeros");
        }
    }//GEN-LAST:event_btnCeroActionPerformed

    // punto decimal ************************************************************************
    private void btn_PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PuntoActionPerformed
        if(!(this.txtResultado.getText().contains("."))){
                txtResultado.setText(this.txtResultado.getText()+".");
        }
    }//GEN-LAST:event_btn_PuntoActionPerformed

// ****************  boton =  ************************************************************************ 
    private void btn_IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IgualActionPerformed
            if(!this.txtResultado.getText().isEmpty()){

                this.num2 = Double.parseDouble(this.txtResultado.getText());
                switch(this.operador){       
                    case "+": this.txtResultado.setText(redondeo(this.num1 + this.num2)); break;

                case "-":this.txtResultado.setText(redondeo(res = this.num1 - this.num2));  break;
              
                //para la division sea entre 0
                case "/": if(this.num2 == 0){this.txtResultado.setText("Error Matematico");}
                          else{this.txtResultado.setText(redondeo(this.num1 / this.num2));}  break;

                case "*":this.txtResultado.setText(redondeo(this.num1 * this.num2));  break;

                case " " : this.lblOperacion.setText("NO HAY OPERACION");break;

                default : this.lblOperacion.setText("OPERACION INVALIDA"); break;

            }
        }else{
            this.txtResultado.setText("");
        }
        
    }//GEN-LAST:event_btn_IgualActionPerformed

    //boton +  ************************************************************************
    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        //operacion mas 
        if(this.txtResultado.getText().isEmpty()){
            this.txtResultado.setText("");
            this.lblOperacion.setText("sin numeros");
        }else{
            this.cantidad =0;
            this.num1 = Double.parseDouble(this.txtResultado.getText());
            this.operador="+";
            this.lblOperacion.setText("+");
            this.txtResultado.setText("");
        }  
    }//GEN-LAST:event_btnMasActionPerformed

        //botones de memoria  *********************************************************************************
    //boton MR
    private void btnMrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMrActionPerformed
      
        this.lblMemoria.setText("M: "+this.memoria);
        this.txtResultado.setText(Double.toString(this.memoria));
        
    }//GEN-LAST:event_btnMrActionPerformed

    //boton M-          ************************************************************************
    private void btnMASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMASActionPerformed
    if(this.txtResultado.getText().isEmpty()){
            this.txtResultado.setText("");
            this.lblOperacion.setText("sin numeros");
        }else{
            this.cantidad =0;
            this.memoria = this.memoria + Double.parseDouble(this.txtResultado.getText());
            this.lblMemoria.setVisible(true);
            this.lblMemoria.setText("M: "+this.memoria);
        }
    }//GEN-LAST:event_btnMASActionPerformed
    
    //boton M-   ************************************************************************
    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if(this.txtResultado.getText().isEmpty()){
            this.txtResultado.setText("");
            this.lblOperacion.setText("sin numeros");
        }else{
            this.cantidad =0;
            this.memoria = this.memoria - Double.parseDouble(this.txtResultado.getText());
            this.lblMemoria.setVisible(true);
            this.lblMemoria.setText("M: "+this.memoria);
        }
    }//GEN-LAST:event_btnMenosActionPerformed

    //boton Memory Clear     ************************************************************************
    private void btnMcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMcActionPerformed
        this.txtResultado.setText("");
        this.cantidad =0;
        this.num1 = 0;
        this.num2 = 0;
        this.operador = "";
        this.lblOperacion.setText("");
        this.memoria = 0;
        this.lblMemoria.setVisible(false);
        txtResultado.setEditable(true);
    }//GEN-LAST:event_btnMcActionPerformed

    //boton multiplicacion  ************************************************************************
    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        if(this.txtResultado.getText().isEmpty()){
            this.txtResultado.setText("");
            this.lblOperacion.setText("sin numeros");
        }else{
            this.cantidad = 0;
            this.num1 = Double.parseDouble(this.txtResultado.getText());
            this.operador="*";
            this.lblOperacion.setText("*");
            this.txtResultado.setText("");
        }  
    }//GEN-LAST:event_btnMultiActionPerformed
     
    
    ///  BOTON Resta ************************************************************************
    private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
        if(this.txtResultado.getText().isEmpty()){
            this.txtResultado.setText("");
            this.lblOperacion.setText("sin numeros");

        }else{
            this.cantidad =0;
            this.num1 = Double.parseDouble(this.txtResultado.getText());
            this.operador="-";
            this.lblOperacion.setText("-");
            this.txtResultado.setText("");
        }  
    }//GEN-LAST:event_btnRestaActionPerformed
    //boton Divicion ************************************************************************
    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed

        if(this.txtResultado.getText().isEmpty()){
            this.txtResultado.setText("");
            this.lblOperacion.setText("sin numeros");

        }else{
            
            this.cantidad =0;
            this.num1 = Double.parseDouble(this.txtResultado.getText());
            this.operador="/";
            this.lblOperacion.setText("/");
            this.txtResultado.setText("");
        }  
    }//GEN-LAST:event_btnDivActionPerformed
    
    //boton CLEAR   ************************************************************************
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.txtResultado.setText("");
        this.cantidad = 0;
        this.num1 = 0;
        this.num2 = 0;
        this.operador = "";
        this.lblOperacion.setText("");
        txtResultado.setEditable(true);
    }//GEN-LAST:event_btnClearActionPerformed

    //boton MS   ************************************************************************
    private void btnMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoriaActionPerformed
        if(this.txtResultado.getText().isEmpty()){
            this.txtResultado.setText("");
            this.lblOperacion.setText("sin numeros");
        }else{
            this.memoria = Double.parseDouble(this.txtResultado.getText());
            this.lblMemoria.setVisible(true);
            this.lblMemoria.setText("M: "+this.memoria);
        }
    }//GEN-LAST:event_btnMemoriaActionPerformed

    
    //    txt resultado entrada de teclado  ************************************************************************
    private void txtResultadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtResultadoKeyTyped

        if(this.cantidad < limite){
            char numero = evt.getKeyChar();
            cantidad++;
                if(!Character.isDigit(numero)){
                    evt.consume();
                }
            }else{
                txtResultado.setEditable(false);
                mostrarLabel(this.lblOperacion,1500);
            }
    }//GEN-LAST:event_txtResultadoKeyTyped

    private void txtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultadoActionPerformed

// metodo de redondeo ************************************************************************
    public String redondeo(Double resultado){
        String retorno;
        Double res = Math.round(resultado * 100) / 100.0;

        retorno = Double.toString(resultado);
        
        if(resultado % 1 == 0){
            retorno = retorno.substring(0,retorno.length()-2);
        }else{
            retorno = Double.toString(res);
        }
        return retorno;
    }
    
   //visibilidad de un error  ************************************************************************
    public void mostrarLabel(JLabel label, int tiempo) {
        label.setVisible(true);
        this.lblOperacion.setText("limite de numeros");
        
        new Timer(tiempo, e -> {
            label.setVisible(false);
        }).start();
    }
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnMAS;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMc;
    private javax.swing.JButton btnMemoria;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMr;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JButton btn_Igual;
    private javax.swing.JButton btn_Punto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblOperacion;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
