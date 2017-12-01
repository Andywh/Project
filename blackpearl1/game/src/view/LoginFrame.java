package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.*;
import control.*;

public class LoginFrame extends JFrame {
    JTextField[] t = new JTextField[2];    
    public void launchFrame() {
        JPanel[] p = {new JPanel(), new JPanel(), new JPanel()};
        JLabel[] l = {new JLabel("用户名："), new JLabel("密   码：")};
        JButton[] b = {new JButton("确认"), new JButton("清空")};
        t[0] = new JTextField(10);
        t[1] = new JPasswordField(10);
        this.setLayout(new GridLayout(3, 1, 5, 5));
        // 添加组件
        for (int i = 0; i < 2; i++) {
            p[i].add(l[i]);
            p[i].add(t[i]);
        }
        p[2].add(b[0]);
        p[2].add(b[1]);
        for (int i = 0; i < 3; i++) {
            this.add(p[i]);
        }
        // 设置监听
        b[0].addActionListener(new ActionListener() {
        		// “确定” 按钮监听事件 
            public void actionPerformed(ActionEvent e) {
                String userName = t[0].getText();
                String passWord = t[1].getText();
                UserInfo u = new UserInfo(userName, passWord);
                Control.checkUserInfo(u);
                System.out.println("username: "+ u.getUserName() + "\nlevel: " + u.getLevel() + "\nmoney: " + u.getMoney());
            }       		
        });
        b[1].addActionListener(new ActionListener() {
        		// “清空” 按钮监听事件
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 2; i++) {
                		t[i].setText("");
                }
            }      	
        });
        // 设置窗体属性
        this.setLocation(550, 300);
        this.setTitle("登陆界面");
        this.setSize(280, 160);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

