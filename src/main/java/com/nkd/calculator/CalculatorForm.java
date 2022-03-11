/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nkd.calculator;

/**
 *
 * @author DuyNguyen
 */
public class CalculatorForm extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorForm
     */
    String operand1 = ""; // y
    String temp = ""; // temp
    String operator = ""; // phep tinh

    boolean isEqualsPress = false;

    public CalculatorForm() {
        initComponents();
        txtResult.setText("0");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtResult = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnPercentage = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFraction = new javax.swing.JButton();
        btnLuyThua = new javax.swing.JButton();
        btnSquareRoot = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnNumber7 = new javax.swing.JButton();
        btnNumber8 = new javax.swing.JButton();
        btnNumber9 = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnNumber4 = new javax.swing.JButton();
        btnNumber5 = new javax.swing.JButton();
        btnNumber6 = new javax.swing.JButton();
        btnSubtration = new javax.swing.JButton();
        btnNumber1 = new javax.swing.JButton();
        btnNumber2 = new javax.swing.JButton();
        btnNumber3 = new javax.swing.JButton();
        btnAddition = new javax.swing.JButton();
        btnAddOrPlus = new javax.swing.JButton();
        btnNumber0 = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CASIO");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(6, 4, 5, 5));

        btnPercentage.setText("%");
        btnPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuyThuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnPercentage);

        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        jPanel2.add(btnCE);

        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);

        btnFraction.setText("1/x");
        btnFraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuyThuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnFraction);

        btnLuyThua.setText("x^2");
        btnLuyThua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuyThuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnLuyThua);

        btnSquareRoot.setText("sqrt");
        btnSquareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuyThuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSquareRoot);

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivision);

        btnNumber7.setText("7");
        btnNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber7);

        btnNumber8.setText("8");
        btnNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber8);

        btnNumber9.setText("9");
        btnNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber9);

        btnMultiplication.setText("*");
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplication);

        btnNumber4.setText("4");
        btnNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber4);

        btnNumber5.setText("5");
        btnNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber5);

        btnNumber6.setText("6");
        btnNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber6);

        btnSubtration.setText("-");
        btnSubtration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubtration);

        btnNumber1.setText("1");
        btnNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber1);

        btnNumber2.setText("2");
        btnNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber2);

        btnNumber3.setText("3");
        btnNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber3);

        btnAddition.setText("+");
        btnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddition);

        btnAddOrPlus.setText("+/-");
        btnAddOrPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrPlusActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddOrPlus);

        btnNumber0.setText("0");
        btnNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumber1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNumber0);

        btnSubtract.setText(".");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubtract);

        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });
        jPanel2.add(btnEquals);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtResultActionPerformed

    private void btnNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumber1ActionPerformed
        if (txtResult.getText().equals("Result is undefined") || txtResult.getText().equals("Cannot divide by zero")) {
            notDisabled();
            operand1 = "0";
            operator = "";
            txtResult.setText("0");
        }
        if (isEqualsPress == true) {
            isEqualsPress = false;
            txtResult.setText("0");
        }
        String cmd = evt.getActionCommand();
        if (txtResult.getText().contains(".")) {
            txtResult.setText(txtResult.getText() + cmd);
        } else if (Double.parseDouble(txtResult.getText()) == 0) {
            txtResult.setText(cmd);
        } else {
            txtResult.setText(txtResult.getText() + cmd);
        }
    }//GEN-LAST:event_btnNumber1ActionPerformed

    private void btnAddOrPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrPlusActionPerformed
        try {
            double value = Double.parseDouble(txtResult.getText());
            value = -value;
            if (value - (int) value == 0) {
                txtResult.setText("" + (int) value);
            } else {
                txtResult.setText("" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddOrPlusActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        if (Integer.parseInt(txtResult.getText()) == 0) {
            txtResult.setText("0.");
        } else {
            txtResult.setText(txtResult.getText() + ".");
        }
    }//GEN-LAST:event_btnSubtractActionPerformed

    private void btnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdditionActionPerformed
        String cmd = evt.getActionCommand();
        if (!operator.isEmpty() && operator.equals(cmd)) {
            return;
        } else {
            operator = cmd;
            if (temp.isEmpty()) {
                operand1 = txtResult.getText();
            } else {
                operand1 = temp;
            }
            txtResult.setText("0");
        }
    }//GEN-LAST:event_btnAdditionActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        double result = 0;
        if (txtResult.getText().equals("Result is undefined") || txtResult.getText().equals("Cannot divide by zero")) {
            notDisabled();
            operand1 = "0";
            operator = "";
            txtResult.setText("0");
        }
        if (operand1.equals("")) {
            result = Double.parseDouble(txtResult.getText());
        } else {
            try {
                double oprand1 = Double.parseDouble(operand1);
                double oprand2 = Double.parseDouble(txtResult.getText());
                if (operator.equals("+")) {
                    result = oprand1 + oprand2;
                } else if (operator.equals("-")) {
                    result = oprand1 - oprand2;
                } else if (operator.equals("*")) {
                    result = oprand1 * oprand2;
                } else if (operator.equals("/")) {
                    if (oprand1 == 0 && oprand2 == 0) {
                        txtResult.setText("Result is undefined");
                        disabled();
                        return;
                    }
                    if (oprand2 == 0) {
                        txtResult.setText("Cannot divide by zero");
                        disabled();
                        return;
                    }
                    result = oprand1 / oprand2;
                } else if (operator.equals("")) {
                    result = oprand2;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (result - (int) result == 0) {
            txtResult.setText("" + (int) result);
        } else {
            txtResult.setText("" + result);
        }
        temp = txtResult.getText();
        operator = "";
        isEqualsPress = true;
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnLuyThuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuyThuaActionPerformed
        if (txtResult.getText().equals("")) {
            return;
        }
        String cmd = evt.getActionCommand();
        double value = Double.parseDouble(txtResult.getText());
        double result = 0;
        try {
            if (cmd.equals("%")) {
                result = value / 100;
            } else if (cmd.equals("1/x")) {
                if (value == 0) {
                    txtResult.setText("Cannot divide by zero");
                    disabled();
                    return;
                } else {
                    result = 1 / value;
                }
            } else if (cmd.equals("x^2")) {
                result = value * value;
            } else if (cmd.equals("sqrt")) {
                result = Math.sqrt(value);
            }
            if (result - (int) result == 0) {
                txtResult.setText("" + (int) result);
            } else {
                txtResult.setText("" + result);
            }
            temp = txtResult.getText();
            operator = "";
            operand1 = "";
            isEqualsPress = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnLuyThuaActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        if (txtResult.getText().equals("Result is undefined") || txtResult.getText().equals("Cannot divide by zero")) {
            notDisabled();
            txtResult.setText("0");
        }
        txtResult.setText("0");
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        if (txtResult.getText().equals("Result is undefined") || txtResult.getText().equals("Cannot divide by zero")) {
            notDisabled();
            txtResult.setText("0");
        }
        txtResult.setText("0");
        temp = "";
        operator = "";
        operand1 = "";
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtResult.getText().equals("Result is undefined") || txtResult.getText().equals("Cannot divide by zero")) {
            notDisabled();
            txtResult.setText("0");
        }
        txtResult.setText(txtResult.getText().substring(0, txtResult.getText().length() - 1));
        if (txtResult.getText().isEmpty()) {
            txtResult.setText("0");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    public void notDisabled() {
        btnAddition.setEnabled(true);
        btnAddOrPlus.setEnabled(true);
        btnDivision.setEnabled(true);
        btnLuyThua.setEnabled(true);
        btnMultiplication.setEnabled(true);
        btnPercentage.setEnabled(true);
        btnSubtration.setEnabled(true);
        btnSubtract.setEnabled(true);
        btnSquareRoot.setEnabled(true);
        btnFraction.setEnabled(true);
    }

    public void disabled() {
        btnAddition.setEnabled(false);
        btnAddOrPlus.setEnabled(false);
        btnDivision.setEnabled(false);
        btnLuyThua.setEnabled(false);
        btnMultiplication.setEnabled(false);
        btnPercentage.setEnabled(false);
        btnSubtration.setEnabled(false);
        btnSubtract.setEnabled(false);
        btnSquareRoot.setEnabled(false);
        btnFraction.setEnabled(false);
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
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrPlus;
    private javax.swing.JButton btnAddition;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFraction;
    private javax.swing.JButton btnLuyThua;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnNumber0;
    private javax.swing.JButton btnNumber1;
    private javax.swing.JButton btnNumber2;
    private javax.swing.JButton btnNumber3;
    private javax.swing.JButton btnNumber4;
    private javax.swing.JButton btnNumber5;
    private javax.swing.JButton btnNumber6;
    private javax.swing.JButton btnNumber7;
    private javax.swing.JButton btnNumber8;
    private javax.swing.JButton btnNumber9;
    private javax.swing.JButton btnPercentage;
    private javax.swing.JButton btnSquareRoot;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JButton btnSubtration;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
