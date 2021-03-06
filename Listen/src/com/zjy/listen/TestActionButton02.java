package com.zjy.listen;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionButton02 {
    public static void main(String[] args) {
        //������ť��ͬʱʵ��һ������
        //��ʼ ֹͣ
        Frame frame = new Frame("��ʼֹͣ");

        frame.setLocation(500,500);
        frame.setBounds(500,500,600,500);
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        //������ʾ�Ķ��崥���᷵������,����ʾ���壬�����Ĭ��ֵ
        //�����ť����ֻдһ������
        button2.setActionCommand("button2-stop");
        button1.setActionCommand("button1-start");

        MyMonitor myMonitor = new MyMonitor();
        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
}

class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        //��ð�ť����Ϣ
        System.out.println("���o�������"+e.getActionCommand());
    }
}
