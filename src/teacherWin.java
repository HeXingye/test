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
        secondLayerOne.add("添加单选试题",addXuanzeti);   
        secondLayerOne .add("删除单选试题",deleteXuanzeti); 
        secondLayerOne.add("查询单选试题",chaxunXuanzeti);
		secondLayerOne.add("更新单选试题",updateXuanzeti);
        firstLayer.add("单选题管理",secondLayerOne);
        add(firstLayer,BorderLayout.CENTER); 
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

public static void main(String args[]){
      new teacherWin();
   }
}
   
