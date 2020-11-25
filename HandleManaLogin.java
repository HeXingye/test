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
    JTextField  username;           //输入用户名
    JPasswordField password; 
    boolean success=false;
    HandleManaLogin(){
       try{  
           Class.forName("org.apache.derby.jdbc.EmbeddedDriver");//加载驱动
            //System.out.println("和数据库已经链接上了");  //测试语句
       }

       catch(Exception e) {
           System.out.print(e);
           //System.out.println("链接发生错误");
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
           String Sname=rs.getString(1).trim();  //获取结果集当前行的第1列数据
           String Smima=rs.getString(2).trim();   //获取结果集当前行的第2列数据 
           if(name.equals(Sname)&&mima.equals(Smima)){              
              success=true;
					System.out.println("恭喜教师登陆成功");							 
            }    
       
            else{
			//System.out.println("抱歉教师登陆失败");	
             }
       }
	   }
       catch(Exception exp){
			System.out.println("抱歉,数据库异常,连接失败");
       }

     if(success){   
	    /* JOptionPane.showMessageDialog(null,"教师","登陆成功",
                                             JOptionPane.WARNING_MESSAGE); */
         teacherWin win = new  teacherWin();
      }  
    }    
}







