//File Describe:Manager Login Handle Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import java.sql.*;
public class HandleManaLogin implements ActionListener{
    Connection con;
    Statement sql; 
    ResultSet rs;
    JTextField  username;           //�����û���
    JPasswordField password; 
    boolean success=false;
    HandleManaLogin(){
       try{  
           Class.forName("org.apache.derby.jdbc.EmbeddedDriver");//��������
            //System.out.println("�����ݿ��Ѿ���������");  //�������
       }

       catch(Exception e) {
           System.out.print(e);
           //System.out.println("���ӷ�������");
       }
    }

    public void setJTextField(JTextField ... t) {
       username =t[0];
       
       }

    public void setJPasswordField(JPasswordField ... m) {
       password =m[0];
       
       }
   

    public void actionPerformed(ActionEvent e) {
       String name = username.getText();
       String mima = password.getText();

       try {
          con=DriverManager.getConnection("jdbc:derby:mana;create=true");
          sql=con.createStatement();
          rs=sql.executeQuery("select * from biao");
       
	   while(rs.next()){
           String Sname=rs.getString(1).trim();  //��ȡ�������ǰ�еĵ�1������
           String Smima=rs.getString(2).trim();   //��ȡ�������ǰ�еĵ�2������ 
           if(name.equals(Sname)&&mima.equals(Smima)){              
              success=true;
					System.out.println("��ϲ��ʦ��½�ɹ�");							 
            }    
       
            else{
			//System.out.println("��Ǹ��ʦ��½ʧ��");	
             }
       }
	   }
       catch(Exception exp){
			System.out.println("��Ǹ,���ݿ��쳣,����ʧ��");
       }

     if(success){   
	    /* JOptionPane.showMessageDialog(null,"��ʦ","��½�ɹ�",
                                             JOptionPane.WARNING_MESSAGE); */
         teacherWin win = new  teacherWin();
      }  
    }    
}







