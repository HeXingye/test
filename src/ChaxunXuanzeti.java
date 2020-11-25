//File Describe:Search Choice Question Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import javax.swing.*;
class ChaxunXuanzeti extends JPanel {     
   JTextField Tihao;         
   JButton button;             
   HandleChaxun handle; 
   ChaxunXuanzeti(){
      
      button = new JButton("查询选择题");
      Tihao=new JTextField(10);
      
      setLayout(null);
      JLabel bianhao =new JLabel("编号：");     
      JLabel Tijiao =new JLabel("查询试题：");
      add(bianhao); 
      add(Tihao);       
      add(Tijiao);
      add(button);

      bianhao.setBounds(5,5,150,35);
      Tihao.setBounds(155,5,600,35);
      Tijiao.setBounds(5,155,150,35);
      button.setBounds(155,155,150,35);
      
      handle = new HandleChaxun();  
      handle.setJButton(button);  
      handle.setJTextField(Tihao); 
      button.addActionListener(handle);
      setVisible(true);
   }
}