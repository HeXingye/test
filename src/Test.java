//File Describe:Test System Pannel
//DATE:2014-12-20
//Author Contact: juedai_4@163.com

import java.awt.*;
import javax.swing.*;
class Test extends JFrame {
    JButton buttonStart;      //�����ð�ť��ʼѵ��
    JButton  nextQuesion;      //�����ð�ť�����һ��Ŀ
    JButton submitButton;     //����ť
    JButton radioA,radioB,radioC,radioD;//��Ŀ��ѡ��
    JLabel  showChoice;          //��ʾ�û���ѡ����Ϣ
    JLabel  showErrorAmount;    //��ʾ�û�����������Ŀ
    JTextArea  showQuesion;    //������ʾ��ѡ����ʾ��
    //JButton showImage ;          //�����ͼ��ʾ��ͼ
    JPanel panel ;             //���ø����û���������Ҫ�����
    HandleTest handle;
    Test() {
      buttonStart = new JButton("��ʼѵ��");
      nextQuesion = new JButton("��һ��Ŀ");
      submitButton = new JButton("����");
      showChoice = new JLabel();
      showErrorAmount=new JLabel("������Ŀ��");
      radioA = new JButton(); 
      radioB = new JButton();
      radioC = new JButton(); 
      radioD = new JButton();
      showQuesion = new JTextArea("������Ŀ");
      showQuesion.setFont(new Font("����",Font.BOLD,28));
      showQuesion.setWrapStyleWord(true);
      showQuesion.setLineWrap(true);  //�Զ�����
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
      handle = new  HandleTest();  //���ݵĴ�����
      handle.setExamView(this);        //�����ͼ������
      handle.setAmount(10) ;              //�����������������Ŀ
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
      JLabel tishi=new  JLabel("��ѡ��:");
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

