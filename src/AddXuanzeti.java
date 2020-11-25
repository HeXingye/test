//File Describe:Add Choice Question Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import javax.swing.*;
class AddXuanzeti extends JPanel {     
   JTextArea  Neirong;
   JTextField Tihao;    
   JTextField choiceA;          
   JTextField choiceB;          
   JTextField choiceC;          
   JTextField choiceD;          
   JTextField Daan;      
   JButton button;             
   HandleXuanze handle; 
   AddXuanzeti() {
      
      button = new JButton("添加选择题");
      Tihao=new JTextField(10);
      Neirong = new JTextArea(8,36);
      choiceA=new JTextField(30);
      choiceB=new JTextField(30);
      choiceC=new JTextField(30);
      choiceD=new JTextField(30);
      Daan=new JTextField(5);     
      setLayout(null);
      JLabel bianhao =new JLabel("编号：");
      JLabel shitiNeirong =new JLabel("试题内容：");       
      JScrollPane shiti1=new JScrollPane(Neirong);      
      JLabel xuanxiangA =new JLabel("选项A");
      JLabel xuanxiangB =new JLabel("选项B:");
      JLabel xuanxiangC =new JLabel("选项C:");
      JLabel xuanxiangD =new JLabel("选项D:");
      JLabel shitiDaan =new JLabel("正确答案:");
      JLabel Tijiao =new JLabel("添加试题：");

      add(bianhao); 
      add(Tihao); 
      add(shitiNeirong);
      add(shiti1); 
      add(xuanxiangA); 
      add(choiceA);     
      add(xuanxiangB); 
      add(choiceB);
      add(xuanxiangC); 
      add(choiceC);      
      add(xuanxiangD); 
      add(choiceD);      
      add(shitiDaan); 
      add(Daan);      
      add(Tijiao);
      add(button);

      bianhao.setBounds(5,5,150,35);
      Tihao.setBounds(155,5,600,35);
      shitiNeirong.setBounds(5,45,150,35);
      shiti1.setBounds(155,45,600,160);
      xuanxiangA.setBounds(5,255,150,35);
      choiceA.setBounds(155,255,600,35);
      xuanxiangB.setBounds(5,295,150,35);
      choiceB.setBounds(155,295,600,35);
      xuanxiangC.setBounds(5,335,150,35);
      choiceC.setBounds(155,335,600,35);
      xuanxiangD.setBounds(5,375,150,35);
      choiceD.setBounds(155,375,600,35);
      shitiDaan.setBounds(5,415,150,35);
      Daan.setBounds(155,415,600,35);
      Tijiao.setBounds(5,455,150,35);
      button.setBounds(155,455,150,35);
      
      handle = new HandleXuanze();  
      handle.setAddXuanzeti(this);  
      button.addActionListener(handle);
      setVisible(true);
   }
}