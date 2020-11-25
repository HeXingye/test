//File Describe:Choice Question Handle
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class HandleXuanze implements ActionListener {    
   AddXuanzeti Text;
   Connection con;
   PreparedStatement sql;
   PreQuery query;
   String SQL;
   int m; 
   String id="";       
   HandleXuanze() {
      query=new PreQuery();
      try {
         String uri="jdbc:derby:TiKu;create=true"; 
         con=DriverManager.getConnection(uri);
         SQL = "create table xuanzeT"+
           "(number varchar(10) primary key not null,"+
            "neirong varchar(200)," + 
            "a  varchar(50),"+
            "b  varchar(50),"+
            "c  varchar(50),"+
            "d  varchar(50),"+
            "answer varchar(6))";
         sql=con.prepareStatement(SQL);
         sql.execute();
         con.close();
      }
      catch(SQLException exp){}
   }
   public void setAddXuanzeti(AddXuanzeti v) {
      Text = v;
   }
   public void actionPerformed(ActionEvent e) {
      String id="";
      try { 
             String uri="jdbc:derby:TiKu;create=true"; 
             con=DriverManager.getConnection(uri);
             SQL="INSERT INTO xuanzeT VALUES(?,?,?,?,?,?,?)";
             sql=con.prepareStatement(SQL);
             id=Text.Tihao.getText().trim(); 
             sql.setString(1,id); 
             sql.setString(2,Text.Neirong.getText().trim());              
             sql.setString(3,Text.choiceA.getText().trim()); 
             sql.setString(4,Text.choiceB.getText().trim());
             sql.setString(5,Text.choiceC.getText().trim()); 
             sql.setString(6,Text.choiceD.getText().trim());
             sql.setString(7,Text.Daan.getText().trim());
             m=sql.executeUpdate();
             con.close();
       }
       catch(SQLException exp) { 
         JOptionPane.showMessageDialog
         (null,""+exp,"消息对话框", JOptionPane.WARNING_MESSAGE);
       }   
      if(m!=0){
        query.setDatabaseName("TiKu");
        query.setSQL("SELECT * FROM xuanzeT where number='"+id+"'");
        query.startQuery();
        String ziduan[] =query.getColumnName();
        String [][]record =query.getRecord();
        DialogOne dialog = new DialogOne(); 
        dialog.setZiduan(ziduan);
        dialog.setRecord(record);
        dialog.init(); 
        dialog.setSize(750,200);
        dialog.setVisible(true);
      }
      else {
        JOptionPane.showMessageDialog
        (null,"添加选择题失败","消息对话框", JOptionPane.WARNING_MESSAGE);
      }
   }
}