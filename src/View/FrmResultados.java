package View;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dani-
 */
public class FrmResultados extends javax.swing.JFrame {

    /**
     * Creates new form FrmPreguntas
     */
    public FrmResultados() {
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

        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Score = new javax.swing.JLabel();
        Paragraph = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Question1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Question2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Question3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Question4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Question5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Question6 = new javax.swing.JLabel();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        Question7 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Question8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        Question9 = new javax.swing.JLabel();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        Question10 = new javax.swing.JLabel();
        Button10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test Ingles Pregunta #");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(12, 21, 50));
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.setMinimumSize(new java.awt.Dimension(720, 150));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(720, 150));

        Title.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Title.setText("Tus Resultados!");

        Score.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Score.setText("0   |   0/10");

        Paragraph.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Paragraph.setForeground(new java.awt.Color(255, 255, 255));
        Paragraph.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Paragraph.setText("<html>Acá podrás ver tus resultados de cada una de las preguntas de tu examen, y adémas poder repasar cada uno de los temas</html>");
        Paragraph.setToolTipText("");
        Paragraph.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                        .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Paragraph, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Paragraph, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(720, 279));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(720, 279));
        jScrollPane1.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(18, 32, 61));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 643));

        Question1.setBackground(new java.awt.Color(255, 51, 102));
        Question1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Question1.setForeground(new java.awt.Color(255, 255, 255));
        Question1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Question1.setText("1. Maecenas in lacus mauris. Morbi mattis sed urna a malesuada?");
        Question1.setToolTipText("");
        Question1.setAutoscrolls(true);
        Question1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(138, 44, 63), 2, true));

        Question2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Question2.setForeground(new java.awt.Color(255, 255, 255));
        Question2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Question2.setText("2. Maecenas in lacus mauris. Morbi mattis sed urna a malesuada?");
        Question2.setToolTipText("");
        Question2.setAutoscrolls(true);
        Question2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 105, 37), 2, true));

        Question3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Question3.setForeground(new java.awt.Color(255, 255, 255));
        Question3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Question3.setText("3. Maecenas in lacus mauris. Morbi mattis sed urna a malesuada?");
        Question3.setToolTipText("");
        Question3.setAutoscrolls(true);
        Question3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 105, 37), 2, true));

        Question4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Question4.setForeground(new java.awt.Color(255, 255, 255));
        Question4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Question4.setText("4. Maecenas in lacus mauris. Morbi mattis sed urna a malesuada?");
        Question4.setToolTipText("");
        Question4.setAutoscrolls(true);
        Question4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(138, 44, 63), 2, true));

        Question5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Question5.setForeground(new java.awt.Color(255, 255, 255));
        Question5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Question5.setText("5. Maecenas in lacus mauris. Morbi mattis sed urna a malesuada?");
        Question5.setToolTipText("");
        Question5.setAutoscrolls(true);
        Question5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 105, 37), 2, true));

        Question6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Question6.setForeground(new java.awt.Color(255, 255, 255));
        Question6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Question6.setText("6. Maecenas in lacus mauris. Morbi mattis sed urna a malesuada?");
        Question6.setToolTipText("");
        Question6.setAutoscrolls(true);
        Question6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 105, 37), 2, true));

        Button1.setBackground(new java.awt.Color(0, 102, 255));
        Button1.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 255, 255));
        Button1.setText("REPASAR AQUI");
        Button1.setPreferredSize(new java.awt.Dimension(134, 24));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(0, 102, 255));
        Button2.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 255, 255));
        Button2.setText("REPASAR AQUI");
        Button2.setPreferredSize(new java.awt.Dimension(134, 24));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(0, 102, 255));
        Button3.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 255, 255));
        Button3.setText("REPASAR AQUI");
        Button3.setPreferredSize(new java.awt.Dimension(134, 24));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(0, 102, 255));
        Button4.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        Button4.setForeground(new java.awt.Color(255, 255, 255));
        Button4.setText("REPASAR AQUI");
        Button4.setPreferredSize(new java.awt.Dimension(134, 24));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(0, 102, 255));
        Button5.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        Button5.setForeground(new java.awt.Color(255, 255, 255));
        Button5.setText("REPASAR AQUI");
        Button5.setPreferredSize(new java.awt.Dimension(134, 24));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(0, 102, 255));
        Button6.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 255, 255));
        Button6.setText("REPASAR AQUI");
        Button6.setPreferredSize(new java.awt.Dimension(134, 24));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Question7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Question7.setForeground(new java.awt.Color(255, 255, 255));
        Question7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Question7.setText("7. Maecenas in lacus mauris. Morbi mattis sed urna a malesuada?");
        Question7.setToolTipText("");
        Question7.setAutoscrolls(true);
        Question7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(138, 44, 63), 2, true));

        Question8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Question8.setForeground(new java.awt.Color(255, 255, 255));
        Question8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Question8.setText("8. Maecenas in lacus mauris. Morbi mattis sed urna a malesuada?");
        Question8.setToolTipText("");
        Question8.setAutoscrolls(true);
        Question8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 105, 37), 2, true));

        Question9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Question9.setForeground(new java.awt.Color(255, 255, 255));
        Question9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Question9.setText("9. Maecenas in lacus mauris. Morbi mattis sed urna a malesuada?");
        Question9.setToolTipText("");
        Question9.setAutoscrolls(true);
        Question9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 105, 37), 2, true));

        Button7.setBackground(new java.awt.Color(0, 102, 255));
        Button7.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 255, 255));
        Button7.setText("REPASAR AQUI");
        Button7.setPreferredSize(new java.awt.Dimension(134, 24));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setBackground(new java.awt.Color(0, 102, 255));
        Button8.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        Button8.setForeground(new java.awt.Color(255, 255, 255));
        Button8.setText("REPASAR AQUI");
        Button8.setPreferredSize(new java.awt.Dimension(134, 24));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setBackground(new java.awt.Color(0, 102, 255));
        Button9.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        Button9.setForeground(new java.awt.Color(255, 255, 255));
        Button9.setText("REPASAR AQUI");
        Button9.setPreferredSize(new java.awt.Dimension(134, 24));
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Question10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Question10.setForeground(new java.awt.Color(255, 255, 255));
        Question10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Question10.setText("10. Maecenas in lacus mauris. Morbi mattis sed urna a malesuada?");
        Question10.setToolTipText("");
        Question10.setAutoscrolls(true);
        Question10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 105, 37), 2, true));

        Button10.setBackground(new java.awt.Color(0, 102, 255));
        Button10.setFont(new java.awt.Font("Cascadia Code", 1, 12)); // NOI18N
        Button10.setForeground(new java.awt.Color(255, 255, 255));
        Button10.setText("REPASAR AQUI");
        Button10.setPreferredSize(new java.awt.Dimension(134, 24));
        Button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Question1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Question2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Question3, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Question4, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Question5, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Question6, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Question7, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Question8, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Question9, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Question10, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Button10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(20, 20, 20))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator8)
                    .addComponent(jSeparator9)
                    .addComponent(jSeparator10)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Question9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Question10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Question1.getAccessibleContext().setAccessibleName("<html><body>Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit/body></html>");

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.LINE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button10ActionPerformed

    
    public void mouseHover(JButton btn){
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn.setBackground(Color.GREEN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn.setBackground(UIManager.getColor("control"));
            }
        });
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
            java.util.logging.Logger.getLogger(FrmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmResultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Button1;
    public javax.swing.JButton Button10;
    public javax.swing.JButton Button2;
    public javax.swing.JButton Button3;
    public javax.swing.JButton Button4;
    public javax.swing.JButton Button5;
    public javax.swing.JButton Button6;
    public javax.swing.JButton Button7;
    public javax.swing.JButton Button8;
    public javax.swing.JButton Button9;
    private javax.swing.JLabel Paragraph;
    public javax.swing.JLabel Question1;
    public javax.swing.JLabel Question10;
    public javax.swing.JLabel Question2;
    public javax.swing.JLabel Question3;
    public javax.swing.JLabel Question4;
    public javax.swing.JLabel Question5;
    public javax.swing.JLabel Question6;
    public javax.swing.JLabel Question7;
    public javax.swing.JLabel Question8;
    public javax.swing.JLabel Question9;
    public javax.swing.JLabel Score;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator10;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public javax.swing.JSeparator jSeparator7;
    public javax.swing.JSeparator jSeparator8;
    public javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
