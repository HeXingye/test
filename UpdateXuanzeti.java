//File Describe:Choice Question Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import javax.swing.*;
public class UpdateXuanzeti extends JPanel {
   JTable table;
   JTextField inputID;
   JButton buttonLook,buttonUpdate;
   String []head ={"number","����","A","B","C","D","��ȷ��"};
   String [][] a ={{" "," "," "," "," "," "," "}};                 
   HandleUpdateXuanze handle; 
   UpdateXuanzeti() {
      setLayout(null);
      inputID = new JTextField(10);
      table = new JTable(a,head);
      table.setRowHeight(40);
      table.setFont(new Font("����",Font.BOLD,16));
      buttonLook = new JButton("������Ŀ");
      buttonUpdate = new JButton("����ѡ����");
      JLabel tishiOne=new JLabel("����Ҫ���µļ�¼��ID:");
      add(tishiOne);
      add(inputID) ;
      add(buttonLook);
      JLabel tishiTwo=new JLabel("�����µ�ֵ:");
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
      handle = new HandleUpdateXuanze();  //���ݵĴ�����
      handle.setArray(a);
      handle.setJTextField(inputID);
      handle.setJButton(buttonLook,buttonUpdate);
      buttonLook.addActionListener(handle);
      buttonUpdate.addActionListener(handle);
   }
}
  