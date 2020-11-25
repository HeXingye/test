//File Describe:Test System Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import javax.swing.*;
class Test extends JFrame {
    JButton buttonStart;      //单击该按钮开始训练
    JButton  nextQuesion;      //单击该按钮获得下一题目
    JButton submitButton;     //交卷按钮
    JButton radioA,radioB,radioC,radioD;//题目的选项
    JLabel  showChoice;          //显示用户的选项信息
    JLabel  showErrorAmount;    //提示用户做错的题的数目
    JTextArea  showQuesion;    //试题显示和选择显示区
    //JButton showImage ;          //试题的图像示意图
    JPanel panel ;             //放置各种用户答题所需要的组件
    HandleTest handle;
    Test() {
      buttonStart = new JButton("开始训练");
      nextQuesion = new JButton("下一题目");
      submitButton = new JButton("交卷");
      showChoice = new JLabel();
      showErrorAmount=new JLabel("错题数目：");
      radioA = new JButton(); 
      radioB = new JButton();
      radioC = new JButton(); 
      radioD = new JButton();
      showQuesion = new JTextArea("暂无题目");
      showQuesion.setFont(new Font("宋体",Font.BOLD,28));
      showQuesion.setWrapStyleWord(true);
      showQuesion.setLineWrap(true);  //自动回行
      //showImage = new JButton(new ImageIcon("image/wait.gif"));
      JScrollPane pane=new JScrollPane(showQuesion);
      //JSplitPane split=
      //new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,showQuesion,pane);
      //split.setDividerLocation(600);  
      add(buttonStart,BorderLayout.NORTH);
      add(pane,BorderLayout.CENTER); 
      panel = new JPanel();
      panel.setLayout(new GridLayout(2,1));
      add(panel,BorderLayout.SOUTH);   
      handle = new  HandleTest();  //数据的处理者
      handle.setExamView(this);        //获得视图的引用
      handle.setAmount(10) ;              //设置两种类型题的数目
      nextQuesion.setEnabled(false);
      buttonStart.addActionListener(handle);
      nextQuesion.addActionListener(handle);
      submitButton.addActionListener(handle);
      radioA.addActionListener(handle);
      radioB.addActionListener(handle);
      radioC.addActionListener(handle);
      radioD.addActionListener(handle);
      setSize(1000,650);
      setVisible(true);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   
   public void init() {
      panel.removeAll();
      JPanel pOne = new JPanel();
      pOne.setLayout(new GridLayout(1,7));
      pOne.setBackground(Color.yellow);
      pOne.add(showErrorAmount);
      pOne.add(showChoice);
      JLabel tishi=new  JLabel("请选择:");
      pOne.add(tishi);
      pOne.add(radioA);
      pOne.add(radioB);
      pOne.add(radioC);
      pOne.add(radioD);
      JPanel pTwo = new JPanel(); 
      pTwo.setBackground(Color.cyan);
      pTwo.setLayout(new GridLayout(1,2));
      pTwo.add(nextQuesion);
      pTwo.add(submitButton);
      panel.add(pOne);
      panel.add(pTwo);
      panel.repaint();
      validate();
   }
  
public static void main(String []arg) {
      new Test();
  }
}

