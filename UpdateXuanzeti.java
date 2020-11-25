//File Describe:Choice Question Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import javax.swing.*;
public class UpdateXuanzeti extends JPanel {
   JTable table;
   JTextField inputID;
   JButton buttonLook,buttonUpdate;
   String []head ={"number","内容","A","B","C","D","正确答案"};
   String [][] a ={{" "," "," "," "," "," "," "}};                 
   HandleUpdateXuanze handle; 
   UpdateXuanzeti() {
      setLayout(null);
      inputID = new JTextField(10);
      table = new JTable(a,head);
      table.setRowHeight(40);
      table.setFont(new Font("宋体",Font.BOLD,16));
      buttonLook = new JButton("看看题目");
      buttonUpdate = new JButton("更新选择题");
      JLabel tishiOne=new JLabel("输入要跟新的记录的ID:");
      add(tishiOne);
      add(inputID) ;
      add(buttonLook);
      JLabel tishiTwo=new JLabel("输入新的值:");
      add(tishiTwo);
      JScrollPane js=new JScrollPane(table); 
      add(js); 
      add(buttonUpdate); 
      tishiOne.setBounds(10,10,160,30);
      inputID.setBounds(172,10,100,30);
      buttonLook.setBounds(275,10,150,30);
      tishiTwo.setBounds(10,60,200,50);
      js.setBounds(10,110,800,90);
      buttonUpdate.setBounds(10,200,100,40);
      handle = new HandleUpdateXuanze();  //数据的处理者
      handle.setArray(a);
      handle.setJTextField(inputID);
      handle.setJButton(buttonLook,buttonUpdate);
      buttonLook.addActionListener(handle);
      buttonUpdate.addActionListener(handle);
   }
}
  