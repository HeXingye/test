//File Describe:Search Handle Program
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
class HandleChaxun implements ActionListener { 
   JTextField inputID;
   JButton buttonLook;
   PreQuery query;
   String id;
   HandleChaxun() {
      query=new PreQuery();
   }

   public void setJTextField(JTextField text) {
      inputID = text;
   }

   public void setJButton(JButton b) {
      buttonLook= b;
     
   }

   public void actionPerformed(ActionEvent e) {
   if(e.getSource()==buttonLook){
          id=inputID.getText().trim();
          doLookRecord();
       }
   }
   
   private void doLookRecord() {
        query.setDatabaseName("TiKu");
        query.setSQL("SELECT * FROM xuanzeT where number='"+id+"'");
        query.startQuery();
        String ziduan[] =query.getColumnName();
        String [][]record =query.getRecord();
        DialogOne dialog = new DialogOne(); 
        dialog.setZiduan(ziduan);
        dialog.setRecord(record);
        dialog.init(); 
        dialog.setSize(700,200);
        dialog.setVisible(true); 
   }
}
