//File Describe:User Login Handle Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import java.sql.*;
class HandleUserLogin implements ActionListener{
    Connection con;
    Statement sql; 
    ResultSet rs;
    JTextField  username;          
    JPasswordField password; 
    boolean success=false;
    HandleUserLogin(){

       try{  
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
       }

       catch(Exception e) {
           //System.out.print(e);
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
          con=DriverManager.getConnection("jdbc:derby:user;create=true");
          sql=con.createStatement();
          rs=sql.executeQuery("select * from biao");

       while(rs.next()){
           String Sname=rs.getString(1).trim();
           String Smima=rs.getString(2).trim();   
 
           if(name.equals(Sname)&&mima.equals(Smima)){              
              success=true;
				System.out.println("¹§Ï²¿¼ÉúµÇÂ½³É¹¦");
			 }						         
            else{

				//System.out.println("±§Ç¸¿¼ÉúµÇÂ½Ê§°Ü");				
											 }
             }
         }
       catch(Exception exp){

				System.out.println("±§Ç¸,Êý¾Ý¿âÒì³£,Á¬½ÓÊ§°Ü");
											 }
											 
		 if(success){   
/* 	    JOptionPane.showMessageDialog(null,"student","login success",
                                             JOptionPane.WARNING_MESSAGE); */
         // teacherWin win = new  teacherWin();
		 new Test();
          } 
       }

}
     








