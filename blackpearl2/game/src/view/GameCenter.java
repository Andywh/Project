package view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import control.Control;
import model.UserInfo;

public class GameCenter extends JFrame {
    private UserInfo user;
	public GameCenter(UserInfo user) {
		this.user = user;
	}
	public void centerFrame() {	
//        // 声明组件
//    		JPanel p = new JPanel(new GridLayout(1, 1));
//    		p.setBackground(Color.cyan);
//        JPanel pGame = new JPanel(new GridLayout(1, 2));
//        pGame.setBackground(Color.magenta);
//        JPanel pGameList = new JPanel(new GridLayout(3, 1));
//        pGameList.setBackground(Color.gray);
//        JPanel pGameInfo1 = new JPanel(new GridLayout(4, 1));
//        pGameInfo1.setBackground(Color.orange);
//        JPanel pGameInfo2 = new JPanel(new GridLayout(4, 1));
//        pGameInfo2.setBackground(Color.pink);
//        JPanel pGameInfo3 = new JPanel(new GridLayout(4, 1));
//        pGameInfo3.setBackground(Color.yellow);
//     
//        JLabel userInfo = new JLabel("个人信息");
//        JLabel gameName1 = new JLabel("五子棋");
//        JLabel gameName2 = new JLabel("打砖块");
//        JLabel gameName3 = new JLabel("飞机大战");
//        JLabel room1 = new JLabel("房间一");
//        JLabel room2 = new JLabel("房间二");
//        JLabel room3 = new JLabel("房间三");
//        JLabel game = new JLabel("房间三");
//        JLabel gameInfo = new JLabel("游戏介绍");
//        // 个人信息
//        
//        // 添加组件
//        p.add(userInfo);
//        p.setSize(800, 100);
//        p.setBounds(100, 100, 800, 100);
//        this.add(p);
//        this.add(pGame);
//        // 
//        pGame.add(pGameList);
//        pGame.add(new JPanel().add(gameInfo));
//        // 
//        pGameInfo1.add(gameName1);
//        pGameInfo1.add(new JLabel("房间一"));
//        pGameInfo1.add(new JLabel("房间二"));
//        pGameInfo1.add(new JLabel("房间三"));
//        pGameList.add(pGameInfo1);
//        
//        pGameInfo2.add(gameName2);
//        pGameInfo2.add(new JLabel("房间一"));
//        pGameInfo2.add(new JLabel("房间二"));
//        pGameInfo2.add(new JLabel("房间三"));
//        pGameList.add(pGameInfo2);
//
//        pGameInfo3.add(gameName3);
//        pGameInfo3.add(new JLabel("房间一"));
//        pGameInfo3.add(new JLabel("房间二"));
//        pGameInfo3.add(new JLabel("房间三"));
//        pGameList.add(pGameInfo3);
//
//        // 创建账号登录栏
////        JComboBox box = new JComboBox();
////        box.addItem("1237322");
////        box.addItem("2143562");
////        box.addItem("123244");
////        box.setBounds(225, 225, 230, 25);
////        this.add(box);
//        
//        // 设置窗体属性
//        this.setLayout(new GridLayout(2, 1));
//        this.setLocation(100, 100);
//        this.setTitle("游戏中心");
//        this.setSize(800, 450);
//        this.setResizable(false);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setVisible(true);
    	
    		// user info
        JPanel p0 = new JPanel(new GridLayout(1, 1));

        p0.add(new JLabel("用户: " + user.getUserName()));
        p0.setBounds(30, 30, 200, 20);

        JPanel p1 = new JPanel(new GridLayout(1, 2));

        JLabel j1 = new JLabel("等级: " + user.getLevel());
        JLabel j2 = new JLabel("金币: " + user.getMoney());

        p1.add(j1);
        p1.add(j2);
        p1.setBounds(30, 60, 200, 20);
    	 	// game list
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(3, 1));
//        p2.setAlignmentX(0);
        p2.setBounds(0,100,100,100);
        JButton[] b = {new JButton("五子棋"), new JButton("飞机大战"), new JButton("塔防游戏")};
        Dimension d = new Dimension(200, 100);
        for (int i = 0; i < 3; i++) {
        		b[i].setPreferredSize(d);
        }
        p2.add(b[0]);
        p2.add(b[1]);
        p2.add(b[2]);

    	 	JScrollPane jsp = new JScrollPane(p2);
    	 	jsp.setBounds(20,100,240,450);
    	 	
    	 	JPanel p3 = new JPanel(new GridLayout(1, 1));
    	 	JTextArea t = new JTextArea("五子棋");
    	 	t.setAlignmentY(0);
    	 	p3.add(t);
        p3.setBounds(300,100,480,450);
    	 	
        // 监听事件
        b[0].addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) {
        			t.setText("五子棋");
        		}    
        });
        b[1].addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) {
        				t.setText("飞机大战");
        			
        		}    
        });
        b[2].addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) {
        			t.setText("塔防游戏");
        		}    
        });

    	 	this.add(jsp);
    	 	this.add(p0);
    	 	this.add(p1);
    	 	this.add(p3);
    	 	
        this.setSize(800, 600);
        this.setLayout(null);
        this.setTitle("游戏中心");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
