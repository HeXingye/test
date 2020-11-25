//File Describe:Delete Handle Program
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class HandleDeleteXuanze implements ActionListener {    
   DeleteXuanzeti Text;
   Connection con;
   PreparedStatement sql;
   PreQuery query;
   String SQL;
   int m; 
   String id="";       
   HandleDeleteXuanze(){
      
     query=new PreQuery();
       try {
         String uri="jdbc:derby:TiKu;create=true"; 
         con=DriverManager.getConnection(uri);
         con.close();
      }
       catch(SQLException exp){}
      }
 
      public void setDeleteXuanzeti(DeleteXuanzeti v) {
         Text =v;
      }
  
      public void actionPerformed(ActionEvent e) {
      String id="";
      try { 
             String uri="jdbc:derby:TiKu;create=true"; 
             con=DriverManager.getConnection(uri);
             SQL="delete from xuanzeT where number= ?";
             sql=con.prepareStatement(SQL);
             id=Text.Tihao.getText().trim();
             sql.setString(1,id);    
             m=sql.executeUpdate();
             con.close();
       }
       catch(SQLException exp) { 
         JOptionPane.showMessageDialog
         (null,""+exp,"消息对话框", JOptionPane.WARNING_MESSAGE);
       }   
      if(m!=0){
        JOptionPane.showMessageDialog
        (null,"删除选择题成功","消息对话框", JOptionPane.WARNING_MESSAGE);
      }
      else {
        JOptionPane.showMessageDialog
        (null,"删除选择题失败","消息对话框", JOptionPane.WARNING_MESSAGE);
      }
   }
}