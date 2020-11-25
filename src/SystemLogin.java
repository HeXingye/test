//File Describe:Login Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
class Login extends JFrame{
	 JLabel usertext=new JLabel("�� �� ��:");
     JLabel passtext=new JLabel("�� ��:");
	 JTextField username = new JTextField(18);//�û���
	 JPasswordField password = new JPasswordField(18);//����
	 JLabel usertype=new JLabel("�û�����:"); //�û����ͣ�����Ա������
	 JButton login1 = new JButton("��¼");//��¼��ť
	 JButton cancel = new JButton("ȡ��");//ȡ����ť
	 JButton register = new JButton("ע��");  //ע�ᰴť
	 ButtonGroup buttongroup=new ButtonGroup();
     JRadioButton manager=new JRadioButton("����Ա"); //��ѡ��ť1
     JRadioButton normaluser=new JRadioButton("����");//��ѡ��ť2
     HandleManaLogin handlemanalogin = new HandleManaLogin();
	 HandleUserLogin handleuserlogin = new HandleUserLogin();
     
	 
         
  public Login(){
		init();	
		setVisible(true);		
	}
  
  void init(){
	    setBounds(550,200,400,400); //���ô����С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);//�����С���ɸı�
        setTitle("JAVA TEST SYSTEM");
        setLayout(null);//������ˮ����
		usertext.setBounds(50,20,75,22);  //�û���
		username.setBounds(120,20,120,22);//�û��������ı���
		passtext.setBounds(50,60,75,22);  //����
		password.setBounds(120,60,120,22); //���������ı���
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
        	 public void itemStateChanged(ItemEvent f) {//ע��ҳ�� 
				if(f.getSource()==manager){
					//usertype1="����Ա";
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
        	 public void itemStateChanged(ItemEvent gg) {//ע��ҳ�� 
				if(gg.getSource()==normaluser){
					//usertype1="����Ա";
					login1.addActionListener(handleuserlogin);
					handleuserlogin.setJTextField(username);
					handleuserlogin.setJPasswordField(password);
                }
			 }
         });
		 

			
        register.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {//ע��ҳ�� 
				new UserRegisterWin();
				setVisible(false);//����ע�������½��������
        	 }
         });


        cancel.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {//ȡ����ť
                dispose();
			    System.exit(0);
        	 }
         });
              	
  }
}

public class SystemLogin{
  public static void main(String args[]){
    Login login=new Login(); //����������ʵ����Login
   }
}

 

