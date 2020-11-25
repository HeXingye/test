//File Describe:Login Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class Login extends JFrame{
	 JLabel usertext=new JLabel("用 户 名:");
     JLabel passtext=new JLabel("密 码:");
	 JTextField username = new JTextField(18);//用户名
	 JPasswordField password = new JPasswordField(18);//密码
	 JLabel usertype=new JLabel("用户类型:"); //用户类型：管理员、考生
	 JButton login1 = new JButton("登录");//登录按钮
	 JButton cancel = new JButton("取消");//取消按钮
	 JButton register = new JButton("注册");  //注册按钮
	 ButtonGroup buttongroup=new ButtonGroup();
     JRadioButton manager=new JRadioButton("管理员"); //单选按钮1
     JRadioButton normaluser=new JRadioButton("考生");//单选按钮2
     HandleManaLogin handlemanalogin = new HandleManaLogin();
	 HandleUserLogin handleuserlogin = new HandleUserLogin();
     
	 
         
  public Login(){
		init();	
		setVisible(true);		
	}
  
  void init(){
	    setBounds(550,200,400,400); //设置窗体大小
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);//窗体大小不可改变
        setTitle("JAVA TEST SYSTEM");
        setLayout(null);//禁用流水布局
		usertext.setBounds(50,20,75,22);  //用户名
		username.setBounds(120,20,120,22);//用户名输入文本框
		passtext.setBounds(50,60,75,22);  //密码
		password.setBounds(120,60,120,22); //密码输入文本框
		usertype.setBounds(50,100,70,22);
		manager.setBounds(120,100,70,22);
		normaluser.setBounds(190,100,70,22);
		login1.setBounds(50,140,75,22);
        register.setBounds(150,140,75,22); 
		cancel.setBounds(250,140,75,22);
        add(usertext);
		add(username);
		add(passtext);
		add(password);
		add(usertype);
		buttongroup.add(manager);
	    buttongroup.add(normaluser);
		add(manager);
		add(normaluser);
		//manager.addItemListener(this);
		//normaluser.addItemListener(this);
		add(login1);
		add(register);
		add(cancel);
		
		
	    manager.addItemListener(new ItemListener(){
        	 public void itemStateChanged(ItemEvent f) {//注册页面 
				if(f.getSource()==manager){
					//usertype1="管理员";
					login1.addActionListener(handlemanalogin);
					handlemanalogin.setJTextField(username);
					handlemanalogin.setJPasswordField(password);
                }
				/* else(f.getSource()==normaluser){
					login1.addActionListener(handleuserlogin);
					handleuserlogin.setJTextField(username);
					handleuserlogin.setJPasswordField(password);
				} */
			 }
         });
		 
		 normaluser.addItemListener(new ItemListener(){
        	 public void itemStateChanged(ItemEvent gg) {//注册页面 
				if(gg.getSource()==normaluser){
					//usertype1="管理员";
					login1.addActionListener(handleuserlogin);
					handleuserlogin.setJTextField(username);
					handleuserlogin.setJPasswordField(password);
                }
			 }
         });
		 

			
        register.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {//注册页面 
				new UserRegisterWin();
				setVisible(false);//跳到注册界面后登陆界面隐藏
        	 }
         });


        cancel.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {//取消按钮
                dispose();
			    System.exit(0);
        	 }
         });
              	
  }
}

public class SystemLogin{
  public static void main(String args[]){
    Login login=new Login(); //在主函数中实例化Login
   }
}

 

