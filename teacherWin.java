//File Describe:Test Manage System Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import javax.swing.*;
class teacherWin extends JFrame{
    JTabbedPane firstLayer;        
    JTabbedPane secondLayerOne;   
    AddXuanzeti  addXuanzeti;
    DeleteXuanzeti deleteXuanzeti;
    ChaxunXuanzeti chaxunXuanzeti;
	UpdateXuanzeti updateXuanzeti;
    teacherWin(){
        setBounds(100,20,900,560);
        setVisible(true);
        firstLayer=new JTabbedPane();
        secondLayerOne = new JTabbedPane(JTabbedPane.LEFT);               
        addXuanzeti  =new AddXuanzeti();
        deleteXuanzeti=new DeleteXuanzeti();
        chaxunXuanzeti=new ChaxunXuanzeti();
		updateXuanzeti=new UpdateXuanzeti();
        secondLayerOne.add("��ӵ�ѡ����",addXuanzeti);   
        secondLayerOne .add("ɾ����ѡ����",deleteXuanzeti); 
        secondLayerOne.add("��ѯ��ѡ����",chaxunXuanzeti);
		secondLayerOne.add("���µ�ѡ����",updateXuanzeti);
        firstLayer.add("��ѡ�����",secondLayerOne);
        add(firstLayer,BorderLayout.CENTER); 
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

public static void main(String args[]){
      new teacherWin();
   }
}
   
