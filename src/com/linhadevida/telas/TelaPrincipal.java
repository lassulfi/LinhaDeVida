/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linhadevida.telas;

import com.linhadevida.model.Cabo;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author luis.assulfi
 */
public class TelaPrincipal extends javax.swing.JFrame {

    //Instanciamento dos objetos
    Cabo cabo = new Cabo();

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        preencherJComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDistancia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxConstrucao = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxAlma = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldFlecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldForca = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxBitola = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCarga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Linhas de Vida");

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("FORÇA DE TRAÇÃO EM CABOS DE AÇO PARA LINHAS DE VIDA");

        jLabel2.setText("Distância entre pontos de ancoragem do cabo de aço (m):");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/linhadevida/imagens/linhaDeVida.jpg"))); // NOI18N

        jLabel4.setText("Construção do cabo:");

        jLabel5.setText("Alma do cabo de aço:");

        jLabel6.setText("Força de tração no cabo");

        jTextFieldFlecha.setEditable(false);
        jTextFieldFlecha.setBackground(java.awt.Color.white);
        jTextFieldFlecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldFlecha.setDisabledTextColor(java.awt.Color.black);
        jTextFieldFlecha.setEnabled(false);
        jTextFieldFlecha.setOpaque(false);
        jTextFieldFlecha.setSelectionColor(java.awt.Color.black);

        jLabel7.setText("Flecha calculada:");

        jTextFieldForca.setEditable(false);
        jTextFieldForca.setBackground(java.awt.Color.white);
        jTextFieldForca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldForca.setDisabledTextColor(java.awt.Color.black);
        jTextFieldForca.setEnabled(false);
        jTextFieldForca.setOpaque(false);
        jTextFieldForca.setSelectionColor(java.awt.Color.black);

        jButtonCalcular.setText("CALCULAR!");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabel8.setText("Bitola do cabo:");

        jLabel9.setText("Massa do corpo em queda (kgf):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldForca, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldFlecha, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxAlma, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxBitola, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxBitola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxConstrucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxAlma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFlecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalcular))
                .addGap(29, 29, 29)
                .addComponent(jButtonSair)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

        System.out.println("Clique no botão sair do App");
        System.exit(0);

    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        
        System.out.println("Clique no botão calcular");
        
        //Distancia entrce cabos de aço
        float distancia = 0.0f;
        //Carga em queda
        float carga =0.0f;
        //Construcao do cabo de aço
        int construcao = jComboBoxConstrucao.getSelectedIndex();
        //Alma do cabo de aco
        int alma = jComboBoxAlma.getSelectedIndex();
        //Indice da bitola do cabo de aço
        int indiceBitola = jComboBoxBitola.getSelectedIndex();
        
        try {
            distancia = Float.parseFloat(jTextFieldDistancia.getText());
            carga = Float.parseFloat(jTextFieldCarga.getText());
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Valores inválidos "
                    + "para carga e distancia");
            return;
        }
        
        //Cálculo da força no cabo
        calcularCabo(distancia, carga, construcao, alma, indiceBitola);
        
        //Passando os resultados do cálculo para as JTextField
        jTextFieldFlecha.setText(floatFormat(cabo.getFlecha()));
        jTextFieldForca.setText(floatFormat(cabo.getForca()));  
        
    }//GEN-LAST:event_jButtonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    
    /**
     * Método para formatar o resultado do cálculo
     * @param number numero tipo float a ser formato
     * @return formaterNumber número formatado
     */
    private String floatFormat(float number){
        
        //Instanciando o objeto formatter
        DecimalFormat formatter = new DecimalFormat("#0.000");
                
        return formatter.format(number);
        
    }

    /**
     * Método para preencher as JComboBox do JFrame
     */
    private void preencherJComboBox() {

        //Preenchendo a combobox de construcao do cabo
        jComboBoxConstrucao.addItem("6 X 7");
        jComboBoxConstrucao.addItem("6 X 19 - 2 operações");
        jComboBoxConstrucao.addItem("6 X 19 - Warrington");
        jComboBoxConstrucao.addItem("6 X 19 - Seale");
        jComboBoxConstrucao.addItem("6 X 21 - Filer");
        jComboBoxConstrucao.addItem("6 X 25 - Filer");
        jComboBoxConstrucao.addItem("6 X 31 - WS");
        jComboBoxConstrucao.addItem("6 X 36 - WS");
        jComboBoxConstrucao.addItem("6 X 37 - Warrington");
        jComboBoxConstrucao.addItem("6 X 41 - Filer");
        jComboBoxConstrucao.addItem("6 X 41 - WS");
        jComboBoxConstrucao.addItem("8 X 19 - Warrington");
        jComboBoxConstrucao.addItem("8 X 19 - Seale");
        jComboBoxConstrucao.addItem("18 X 7 - não rotativo");
        jComboBoxConstrucao.addItem("1 X 7 - cordoalha");
        jComboBoxConstrucao.addItem("1 X 19 - cordoalha");

        jComboBoxConstrucao.setSelectedIndex(0);

        //Preenchendo a JComboBox do tipo de alma
        jComboBoxAlma.addItem("Alma de fibra");
        jComboBoxAlma.addItem("Alma de aço");
        jComboBoxAlma.addItem("Cordoalha");

        jComboBoxAlma.setSelectedIndex(0);

        //Preechendo a JComboBox da bitola do cabo de aço
        jComboBoxBitola.addItem("1/4 in");
        jComboBoxBitola.addItem("5/16 in");
        jComboBoxBitola.addItem("3/8 in");
        jComboBoxBitola.addItem("7/16 in");
        jComboBoxBitola.addItem("1/2 in");
        jComboBoxBitola.addItem("9/16 in");
        jComboBoxBitola.addItem("5/8 in");
        jComboBoxBitola.addItem("3/4 in");
        jComboBoxBitola.addItem("7/8 in");
        jComboBoxBitola.addItem("1 in");
        jComboBoxBitola.addItem("1.1/8 in");
        jComboBoxBitola.addItem("1.1/4 in");
        jComboBoxBitola.addItem("1.3/8 in");
        jComboBoxBitola.addItem("1.1/2 in");
        jComboBoxBitola.addItem("1.5/8 in");
        jComboBoxBitola.addItem("1.3/4 in");
        jComboBoxBitola.addItem("2 in");
        jComboBoxBitola.addItem("2.1/2 in");
        jComboBoxBitola.addItem("3 in");

        jComboBoxBitola.setSelectedIndex(0);
    }

    /**
     * Método para cálculo da força e flecha no cabo
     *
     */
    private void calcularCabo(float distancia,
            float carga,
            int construcao,
            int alma, 
            int indiceBitola ) {
        //Estimativa de flecha inicial: 1 metro
        float flechaInicial = 1.0f;

        //Passando a bitola do cabo
        cabo.setBitola(bitolaCabo(indiceBitola));

        //Passando o fator do cabo
        cabo.setFator(fatorCabo(construcao));
        //Cálculo da área do cabo de aço
        cabo.setArea(cabo.getBitola(), cabo.getFator());

        //Cálculo da elasticidade do cabo
        float elasticidade = elasticidadeCabo(alma, construcao);

        //INCIO DO LOOP PARA CÁLCULO DA FORÇA NO CABO
        float  cateto, hipotenusaFinal;
        double tracaoCabo, deformacao, constante, hipotenusa, flechaCalc, flechaInicialDouble;
        String converter;
        flechaInicialDouble = flechaInicial;
        flechaCalc = flechaInicialDouble;
        do {
            flechaInicialDouble = flechaCalc;
            converter = String.valueOf(flechaInicialDouble);
            flechaInicial = Float.parseFloat(converter);
            tracaoCabo = carga * distancia / (4 * flechaInicialDouble); //Força de tracao no cabo pela equacao de equilibrio
            cateto = distancia / 2;
            hipotenusa = Math.sqrt(sqr(cateto, 2) + sqr(flechaInicial, 2)); //Hipotenusa no cabo devido a flecha           
            constante = (elasticidade / 9.81) * cabo.getArea() / hipotenusa; // Constante elastica do cabo
            deformacao = tracaoCabo / constante; //Deformacao calculada no cabo
            hipotenusa = cateto + deformacao; //Cálculo do comprimento do dabo devido a deformacao;
            converter = String.valueOf(hipotenusa);
            hipotenusaFinal = Float.parseFloat(converter);
            flechaCalc = Math.sqrt(sqr(hipotenusaFinal, 2) - sqr(cateto, 2)); //Flecha calculada devido a deformacao do cabo
        } while (Math.abs(flechaCalc - flechaInicialDouble) > 0.0001);
        converter = String.valueOf(flechaCalc);
        cabo.setFlecha(Float.parseFloat(converter));
        converter = String.valueOf(tracaoCabo);
        cabo.setForca(Float.parseFloat(converter));
    }

    /**
     * Metodo para determinacao da bitola do cabo de aço
     *
     * @param i indice da jComboBoxBitola
     * @return bitola valor da bitola em mm
     */
    private float bitolaCabo(int i) {
        float bitola = 0.0f;

        switch (i) {
            case 0:
                bitola = 1.0f / 4.0f * 25.4f;
                break;
            case 1:
                bitola = 5.0f / 16.0f * 25.4f;
                break;
            case 2:
                bitola = 3.0f / 8.0f * 25.4f;
                break;
            case 3:
                bitola = 7.0f / 16.0f * 25.4f;
                break;
            case 4:
                bitola = 1.0f / 2.0f * 25.4f;
                break;
            case 5:
                bitola = 9.0f / 16.0f * 25.4f;
                break;
            case 6:
                bitola = 5.0f / 8.0f * 25.4f;
                break;
            case 7:
                bitola = 3.0f / 4.0f * 25.4f;
                break;
            case 8:
                bitola = 7.0f / 8.0f * 25.4f;
                break;
            case 9:
                bitola = 1.0f / 1.0f * 25.4f;
                break;
            case 10:
                bitola = (1.0f + 1.0f / 8.0f) * 25.4f;
                break;
            case 11:
                bitola = (1.0f + 1.0f / 4.0f) * 25.4f;
                break;
            case 12:
                bitola = (1.0f + 3.0f / 8.0f) * 25.4f;
                break;
            case 13:
                bitola = (1.0f + 1.0f / 2.0f) * 25.4f;
                break;
            case 14:
                bitola = (1.0f + 5.0f / 8.0f) * 25.4f;
                break;
            case 15:
                bitola = (1.0f + 3.0f / 4.0f) * 25.4f;
                break;
            case 16:
                bitola = 2.0f / 1.0f * 25.4f;
                break;
            case 17:
                bitola = (2.0f + 1.0f / 2.0f) * 25.4f;
                break;
            case 18:
                bitola = 3.0f / 1.0f * 25.4f;
                break;
        }

        return bitola;
    }

    /**
     * Método para cálculo do fator do cabo de aço em funcao da construcao
     *
     * @param i indice da jComboBoxConstrucao
     * @return fator fator calculado do cabo de aço
     */
    private float fatorCabo(int i) {
        float fator = 0.0f;
        switch (i) {
            case 0:
                fator = 0.380f;
                break;
            case 1:
                fator = 0.395f;
                break;
            case 2:
                fator = 0.395f;
                break;
            case 3:
                fator = 0.395f;
                break;
            case 4:
                fator = 0.395f;
                break;
            case 5:
                fator = 0.405f;
                break;
            case 6:
                fator = 0.405f;
                break;
            case 7:
                fator = 0.405f;
                break;
            case 8:
                fator = 0.400f;
                break;
            case 9:
                fator = 0.405f;
                break;
            case 10:
                fator = 0.405f;
                break;
            case 11:
                fator = 0.352f;
                break;
            case 12:
                fator = 0.352f;
                break;
            case 13:
                fator = 0.426f;
                break;
            case 14:
                fator = 0.596f;
                break;
            case 15:
                fator = 0.580f;
                break;
        }
        return fator;
    }

    /**
     * Método para cálculo do módulo e elasticidade do cabo de aço
     *
     * @param alma indice do tipo de alma do cabo de aço
     * @param construcao indice do tipo de construcao do cabo
     * @return elasticidade valor do módulo de elasticidade
     */
    private float elasticidadeCabo(int alma, int construcao) {
        //Valor default adotado
        float elasticidade = 65000.0f;

        switch (alma) {
            case 0: //Cabo em aço com alma de fibra
                if (construcao == 0) { //Construcao 6 X 7
                    elasticidade = 90000.0f;
                } else if (construcao == 1
                        || //Construcao 6 X 19
                        construcao == 2
                        || construcao == 3) {
                    elasticidade = 85000.0f;
                } else if (construcao == 8) { //Construcao 6 X 37
                    elasticidade = 75000.0f;
                } else if (construcao == 11 || construcao == 12) {//Construcao 8 X 19
                    elasticidade = 65000.0f;
                } else {
                    JOptionPane.showMessageDialog(this, "Construção inválida "
                            + "para esse material");
                }
                break;
            case 1: //Cabo em aço com alma de aço
                if (construcao == 0) { //Construcao 6 X 7
                    elasticidade = 105000.0f;
                } else if (construcao == 1
                        || //Construcao 6 X 19
                        construcao == 2
                        || construcao == 3) {
                    elasticidade = 100000.0f;
                } else if (construcao == 8) { //Construcao 6 X 37
                    elasticidade = 95000.0f;
                } else {
                    JOptionPane.showMessageDialog(this, "Construção inválida "
                            + "para esse material");
                }
                break;
            case 2: //Cordoalha galvanizada
                if (construcao == 0 || construcao == 13 || construcao == 14) { //Construcao 7 fios
                    elasticidade = 145000.0f;
                } else if (construcao == 1 || construcao == 2
                        || //Construcao 19 fios
                        construcao == 3 || construcao == 11
                        || construcao == 12) {
                    elasticidade = 100000.0f;
                } else if (construcao == 9) { //Construcao 6 X 37
                    elasticidade = 120000.0f;
                } else {
                    JOptionPane.showMessageDialog(this, "Construção inválida "
                            + "para esse material");
                }
                break;
            default:
                elasticidade = 65000.0f;
        }

        return elasticidade;
    }

    /**
     * Método para cálculo de um valor tipo float elevado a uma potencia
     *
     * @param a valor de cálculo float
     * @param i potencia integer
     * @return b valor calculado float
     */
    private double sqr(float a, int i) {
        String c = String.valueOf(a);
        double b = Double.parseDouble(c);
        for (int j = 1; j < i; j++) {
            b *= a;
        }
        return b;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxAlma;
    private javax.swing.JComboBox<String> jComboBoxBitola;
    private javax.swing.JComboBox<String> jComboBoxConstrucao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldCarga;
    private javax.swing.JTextField jTextFieldDistancia;
    private javax.swing.JTextField jTextFieldFlecha;
    private javax.swing.JTextField jTextFieldForca;
    // End of variables declaration//GEN-END:variables
}
