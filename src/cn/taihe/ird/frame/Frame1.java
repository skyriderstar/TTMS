package cn.taihe.ird.frame;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Frame1 extends javax.swing.JFrame {

    public Frame1() {
        super("客运首页  > 注册");
        initComponents();
    }

    // 变量声明
    String username = null;
    String password = null;
    String rpassword = null;
    String realname = null;
    String card_catagary = null;
    String id_card = null;
    String phone_no = null;
    String email = null;
    String passage_catagary = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("*用  户  名：");

        jLabel2.setText("*登录密码：");

        jLabel3.setText("*确认密码：");

        jLabel4.setText("*姓        名：");

        jLabel5.setText("*证件类型：");

        jLabel6.setText("*证件号码：");

        jLabel7.setText("邮        箱：");

        jLabel8.setText("*手机号码：");

        jLabel9.setText("*旅客类型：");

        jTextField1.setToolTipText("用户名设置成功后不可修改");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField4.setText("于涛");
        jTextField4.setToolTipText("请输入姓名");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "二代身份证", "港澳通行证", "台湾通行证", "护照" }));

        jTextField5.setText("420325199109067018");
        jTextField5.setToolTipText("请输入您的证件号码");

        jTextField6.setText("13477292353");
        jTextField6.setToolTipText("请输入您的手机号码");

        jTextField7.setText("2543272477@qq.com");
        jTextField7.setToolTipText("请正确填写邮箱地址");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "成人", "儿童", "学生", "残疾军人、伤残人民警察" }));

        jLabel10.setText("6-30位字母、数字或“_”,字母开头");

        jLabel11.setText("姓名填写规则");
        jLabel11.setToolTipText("<html>\n<div class=\"name-tips\">\n<ul>\n<li>确认姓名中生僻字无法输入时，可用生僻字拼音或同音字<br>替代。</li>\n<li>输入姓名保存后，遇有系统无法正确显示的汉字，可用该<br>汉字的拼音或同音字重新修改后保存。</li>\n<li>姓名中有繁体字无法输入时，可用简体替代。</li>\n<li>姓名较长，汉字与英文字符合计超过30个（1个汉字算2<br>个字符）的，需按姓名中第一个汉字或英文字符开始按顺<br>序连续输入30个字符（空格字符不输入），其中英文字<br>符输入时不区别大小写。</li>\n<li>姓名中有“.”或“• ”时，请仔细辨析身份证件原件上的“.”或<br>“• ”，准确输入。</li>\n</ul>\n</div>\n</html>\n\n\n\n ");

        jLabel12.setText("请正确填写手机号码，稍后将向该手机号码发送短信验证码");

        jLabel13.setText("我已阅读并同意遵守");

        jLabel14.setForeground(new java.awt.Color(0, 0, 204));
        jLabel14.setText(" 《中国铁路客户服务中心网站服务条款》");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
        });

        jLabel15.setText("账户信息");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("下一步");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordField1.setToolTipText("6-20位字母、数字或符号");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        jPasswordField2.setToolTipText("6-20位字母、数字或符号");
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(2, 2, 2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, 0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(64, 64, 64)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jPasswordField2))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jPasswordField1))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

    }//GEN-LAST:event_jTextField1KeyReleased

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered

    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        ServiceMsg s = new ServiceMsg();
        s.setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // 用户注册
        // 判断非空===
        // 设置正则表达式 验证提交内容是否符合规范
        // 判断单选按钮是否勾选  
        // 写入数据库
        if (jTextField1.getText().trim().isEmpty() || jPasswordField1.getText().trim().isEmpty() || jPasswordField2.getText().trim().isEmpty() || jTextField4.getText().trim().isEmpty() || jTextField5.getText().trim().isEmpty() || jTextField6.getText().trim().isEmpty() || jTextField7.getText().trim().isEmpty() || jTextField1.getText().equals("") || jPasswordField1.getText().equals("") || jPasswordField2.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "带*的是必填项，请完整填写");
        } else {
            // 判断用户名
            if ((jTextField1.getText().length() >= 6) && (jTextField1.getText().length() <= 30)) {
                username = jTextField1.getText();
            } else {
                JOptionPane.showMessageDialog(null, "用户名填写不符合规范");
            }

            // 判断登录密码
            if ((jPasswordField1.getText().length() >= 6) && (jPasswordField1.getText().length() <= 20)) {
                password = jPasswordField2.getText();
            } else {
                JOptionPane.showMessageDialog(null, "密码填写不符合规范");
            }

            // 判断确认密码
            if ((jPasswordField1.getText().equals(jPasswordField2.getText()))) {
                rpassword = jPasswordField2.getText();
            } else {
                JOptionPane.showMessageDialog(null, "二次密码输入不一致");
            }

            // 证件号码判断
            if (jTextField5.getText().length() == 18) {
                id_card = jTextField5.getText();
            } else {
                JOptionPane.showMessageDialog(null, "证件号码不对");
            }

            // 邮箱判断
            if (jTextField7.getText().length() == 225) {
                email = jTextField7.getText();
            } else {
                JOptionPane.showMessageDialog(null, "邮箱格式不对");
            }

            // 手机号判断
            if (jTextField6.getText().length() == 11) {
                phone_no = jTextField6.getText();
            } else {
                JOptionPane.showMessageDialog(null, "电话号码格式不对");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        // 根据输入密码的长度设置进度条的值
        if (jPasswordField1.getText().length() + 1 >= 7) {
            jProgressBar1.setValue(30);
            jLabel16.setText("弱");
        }
        if (jPasswordField1.getText().length() + 1 >= 10) {
            jProgressBar1.setValue(60);
            jLabel16.setText("中");
        }
        if (jPasswordField1.getText().length() + 1 >= 15) {
            jProgressBar1.setValue(90);
            jLabel16.setText("强");
        }
        if (jPasswordField1.getText().length() + 1 < 7) {
            jProgressBar1.setValue(0);
            jLabel16.setText("");
        }
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        //输入用户名之后判断输入是否合法

        boolean flag = true;
        String patern = "^[A-Za-z]+[a-zA-Z0-9_]{5,29}$";
        String s = jTextField1.getText();
        if ("".equals(s)) {
            //  do nothing
        } else {
            if (s.length() <= 5) {
                JOptionPane.showMessageDialog(null, "用户名太短");
                flag = false;
            }
            if (s.length() > 30) {
                JOptionPane.showMessageDialog(null, "用户名太长");
                flag = false;
            }
            if (flag) {
                boolean b = Pattern.compile(patern).matcher(s).matches();
                if (b) {
                    System.out.println("输入用户名合乎规则");
                    // 查找数据库是否存在该用户，如果不存在
                    //  就是合法的用户名
                } else {
                    JOptionPane.showMessageDialog(null, "输入用户名不符合规则");
                    System.out.println("输入用户名不符合规则");
                }
            }
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        // 用户输入密码判断密码是否符合规范
        boolean flag = true;
        String patern = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{5,19})$";
        String s = jPasswordField1.getText();
        if ("".equals(s)) {
            //  do nothing
        } else {
            if (s.length() <= 5) {
                JOptionPane.showMessageDialog(null, "密码太短");
                flag = false;
            }
            if (s.length() > 20) {
                JOptionPane.showMessageDialog(null, "密码太长");
                flag = false;
            }
            if (flag) {
                boolean b = Pattern.compile(patern).matcher(s).matches();
                if (b) {
                    System.out.println("输入密码合乎规则");
                    // 查找数据库是否存在该用户，如果不存在
                } else {
                    System.out.println("输入密码不符合规则");
                    JOptionPane.showMessageDialog(null, "输入用户名不符合规则");
                }
            }
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
        // 判断两次输入是否一致
        String p1 = jPasswordField1.getText();
        String p2 = jPasswordField2.getText();
        if ("".equals(p1) || "".equals(p2)) {
            //  do nothing
        } else {
            if (p2.equals(p1)) {
                JOptionPane.showMessageDialog(null, "两次输入一致");
                System.out.println("两次输入一致");
            } else {
                JOptionPane.showMessageDialog(null, "两次不输入一致");
                System.out.println("两次不输入一致");
            }
        }
    }//GEN-LAST:event_jPasswordField2FocusLost

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
