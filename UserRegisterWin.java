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
        JLabel a=new JLabel("�û���"); //ʵ����JLabel����
        JLabel b=new JLabel("��  ��");
        JLabel h=new JLabel("�ٴ�ȷ��");
        JTextField c=new JTextField(18);//ʵ�����û����ı���
        JPasswordField d=new JPasswordField(18);//ʵ���������ı���
        JPasswordField hd=new JPasswordField(18);//ʵ���������ı���
        JButton e=new JButton("ȷ��");
        JButton f=new JButton("����");
        JButton g=new JButton("�˳�");
        
		
		
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
		
		
        g.addActionListener(new ActionListener() {//���˳���ť��Ӽ����¼�
            public void actionPerformed(ActionEvent e) {
                dispose();
			    System.exit(0);
            }
           });
		   
		   
        e.addActionListener(new ActionListener() {//��ȷ�ϰ�ť��Ӽ����¼�
                public void actionPerformed(ActionEvent arg0) {
					
				String text1 = c.getText().trim();
				String pass1 = new String (d.getPassword()); 
				String pass2 = new String (hd.getPassword());
				//String h = textHeight.getText(); 	
			
                try{  
                   Class.forName("org.apache.derby.jdbc.EmbeddedDriver");//��������
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
						showMess.setText("ע��ɹ�");
							}
					}
					catch(Exception exp){showMess.setText("ע��ʧ���û��Ѵ��ڻ����û���Ϊ��");}
                  }
				else {
					showMess.setText("�������벻һ��");
				}
	   }
        });
            
			
		f.addActionListener(new ActionListener() {//�����ð�ť��Ӽ����¼�
                public void actionPerformed(ActionEvent e) {
                    new UserRegisterWin();
					setVisible(false);
                }
        });
    }
}