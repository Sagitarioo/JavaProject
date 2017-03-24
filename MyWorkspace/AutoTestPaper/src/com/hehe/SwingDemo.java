package com.hehe;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
public class SwingDemo{
	private static JTextField tftk;
	private static JTextField tfpd;
	private static JTextField tfxz;
	private static JTextField tfbc;
	private static JButton subButton;
	static String tfxzn;
	
    public static void main(String[] args) {    
        JFrame frame = new JFrame("随机出题系统");
        frame.setSize(460, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();    
        frame.getContentPane().add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }
    
    private static void placeComponents(JPanel panel) {
    	panel.setLayout(null);
        JLabel xzLabel = new JLabel("\u9009\u62E9\u9898\u6570\u91CF");
        xzLabel.setFont(new Font("宋体", Font.PLAIN, 14));
        xzLabel.setBounds(100,90,80,25);
        panel.add(xzLabel);
        JLabel pdLabel = new JLabel("\u5224\u65AD\u9898\u6570\u91CF");
        pdLabel.setFont(new Font("宋体", Font.PLAIN, 14));
        pdLabel.setBounds(100,130,80,25);
        panel.add(pdLabel);
        JLabel tkLabel = new JLabel("\u586B\u7A7A\u9898\u6570\u91CF");
        tkLabel.setFont(new Font("宋体", Font.PLAIN, 14));
        tkLabel.setBounds(100, 170, 81, 25);
        panel.add(tkLabel);
        JLabel bcLabel = new JLabel("\u7F16\u7A0B\u9898\u6570\u91CF");
        bcLabel.setFont(new Font("宋体", Font.PLAIN, 14));
        bcLabel.setBounds(100, 210, 80, 25);
        panel.add(bcLabel);
        tfxz = new JTextField();
        tfxz.setBounds(190, 90, 60, 25);
        panel.add(tfxz);
        tfxz.setColumns(10);
        tfpd = new JTextField();
        tfpd.setBounds(190, 130, 60, 25);
        panel.add(tfpd);
        tfpd.setColumns(10);
        tftk = new JTextField();
        tftk.setBounds(190, 170, 60, 25);
        panel.add(tftk);
        tftk.setColumns(10);
        tfbc = new JTextField();
        tfbc.setBounds(190, 210, 60, 25);
        panel.add(tfbc);
        tfbc.setColumns(10);
        JLabel lblNewLabel_1 = new JLabel("生成的试题默认保存在D盘根目录");
        lblNewLabel_1.setBounds(40, 324, 200, 25);
        panel.add(lblNewLabel_1);
        JLabel lblNewLabel = new JLabel("请输入各类型题目的数量，点击按钮\n");
        lblNewLabel.setBounds(40, 300, 362, 25);
        panel.add(lblNewLabel);
        subButton = new JButton("开始");
        subButton.setFont(new Font("宋体", Font.PLAIN, 14));
        subButton.setBounds(162, 264, 100, 25);
        panel.add(subButton);
        
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String str=e.getActionCommand();
                if("开始".equals(str)){
                    int getxznum =Integer.valueOf(tfxz.getText());
                    int getpdnum =Integer.valueOf(tfpd.getText());
                    int gettknum =Integer.valueOf(tftk.getText());
                    int getbcnum =Integer.valueOf(tfbc.getText());
                    PaperT pa=new PaperT();
                    pa.PaperAutot(getxznum, getpdnum, gettknum, getbcnum);
                    JOptionPane.showMessageDialog(null, "请关闭程序，进入D盘答题","提示",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }    
    
}
