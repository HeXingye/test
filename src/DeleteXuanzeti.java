//File Describe:Delete Choice Question Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import javax.swing.*;
class DeleteXuanzeti extends JPanel {     
   JTextField Tihao;         
   JButton button;             
   HandleDeleteXuanze handle; 
   DeleteXuanzeti(){
      
      button = new JButton("…æ≥˝—°‘ÒÃ‚");
      Tihao=new JTextField(10);
      
      setLayout(null);
      JLabel bianhao =new JLabel("±‡∫≈£∫");     
      JLabel Tijiao =new JLabel("…æ≥˝ ‘Ã‚£∫");
      add(bianhao); 
      add(Tihao);       
      add(Tijiao);
      add(button);

      bianhao.setBounds(5,5,150,35);
      Tihao.setBounds(155,5,600,35);
      Tijiao.setBounds(5,155,150,35);
      button.setBounds(155,155,150,35);
      
      handle = new HandleDeleteXuanze();  
      handle.setDeleteXuanzeti(this);  
      button.addActionListener(handle);
      setVisible(true);
   }
}