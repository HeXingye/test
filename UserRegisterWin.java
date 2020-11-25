//File Describe:User Register Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UserRegisterWin extends JFrame {
        JTextArea showMess= new JTextArea();
		Connection con;
        Statement sql;
        JLabel a=new JLabel("用户名"); //实例化JLabel对象
        JLabel b=new JLabel("密  码");
        JLabel h=new JLabel("再次确认");
        JTextField c=new JTextField(18);//实例化用户名文本框
        JPasswordField d=new JPasswordField(18);//实例化密码文本框
        JPasswordField hd=new JPasswordField(18);//实例化密码文本框
        JButton e=new JButton("确定");
        JButton f=new JButton("重置");
        JButton g=new JButton("退出");
        
		
		
    public UserRegisterWin() {
	  init();
	}		
	
	void init(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container m=getContentPane();
		setVisible(true);
        m.add(a);
        m.add(b);
        m.add(h);
        m.add(hd);
        m.add(c);
        m.add(d);
        m.add(e);
        m.add(f);
        m.add(g);
		m.add(showMess);
        setBounds(300,250,400,400);
        m.setLayout(null);
        a.setBounds(10,40,50,18);
        b.setBounds(10,80,50,18);
        h.setBounds(5,120,80,18);
        c.setBounds(90,40,200,18);
        d.setBounds(90,80,200,18);
        hd.setBounds(90,120,200,18);
        e.setBounds(110,160,60,30);
        f.setBounds(30,160,60,30);
        g.setBounds(190,160,60,30);
		showMess.setBounds(50,200,200,30);
		
		
        g.addActionListener(new ActionListener() {//对退出按钮添加监听事件
            public void actionPerformed(ActionEvent e) {
                dispose();
			    System.exit(0);
            }
           });
		   
		   
        e.addActionListener(new ActionListener() {//对确认按钮添加监听事件
                public void actionPerformed(ActionEvent arg0) {
					
				String text1 = c.getText().trim();
				String pass1 = new String (d.getPassword()); 
				String pass2 = new String (hd.getPassword());
				//String h = textHeight.getText(); 	
			
                try{  
                   Class.forName("org.apache.derby.jdbc.EmbeddedDriver");//加载驱动
					}
				catch(Exception e) {
					System.out.print(e);				
					}

                
				
			    if (pass1.equals(pass2)){
					String SQL = "insert into biao values"+
				                 "('"+text1+"','"+pass1+"')";

					try {
					con=DriverManager.getConnection("jdbc:derby:user;create=true");
					sql=con.createStatement();
					int mm=sql.executeUpdate(SQL);
					if(mm!=0) {
						showMess.setText("注册成功");
							}
					}
					catch(Exception exp){showMess.setText("注册失败用户已存在或者用户名为空");}
                  }
				else {
					showMess.setText("两次密码不一致");
				}
	   }
        });
            
			
		f.addActionListener(new ActionListener() {//对重置按钮添加监听事件
                public void actionPerformed(ActionEvent e) {
                    new UserRegisterWin();
					setVisible(false);
                }
        });
    }
}