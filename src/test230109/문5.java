package test230109;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class MyLabel2 extends JLabel {
    int barSize = 0; // 바의 크기
    int maxBarSize;
    int size = 0;
   
    MyLabel2(int maxBarSize, int size) {
        this.maxBarSize = maxBarSize;
        this.size = size;
    }
   
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth()))
				/maxBarSize*barSize);
		if(width==0) return; 
		g.fillRect(0, 0, width, this.getHeight());
    }
   
    synchronized void fill() {
        if(barSize == maxBarSize) {
            try {
                wait();
            } catch (InterruptedException e) { return; }
        }
        barSize++;
        repaint();
        notify();
    }
    synchronized void consume() {
        if(barSize == 0) {
            try {
                wait();
            } catch (InterruptedException e)
                { return; }
        }
        barSize--;
        repaint();
        notify();
    }   
}

class ConsumerThread2 extends Thread {
    MyLabel2 bar;
   
    ConsumerThread2(MyLabel2 bar) {
        this.bar = bar;
    }
    public void run() {
        while(true) {
            try {
                sleep(200);
                bar.consume();
            } catch (InterruptedException e)
            { return; }
        }
    }
}
public class 문5  extends JFrame {
    MyLabel2 bar3 = new MyLabel2(100, 3);
    문5(String title) {
        super(title);
        this.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
       
        bar3.setBackground(Color.ORANGE);
        bar3.setOpaque(true);
        bar3.setLocation(80,  50);
        bar3.setSize(300, 300);
        c.add(bar3);
       
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e)
            {
                bar3.fill();
            }
        });
        setSize(450,500);
        setVisible(true);
       
        c.requestFocus();
        ConsumerThread2 th3 = new
                ConsumerThread2(bar3);
        th3.start(); // 스레드 시작
    }

    public static void main(String[] args) {
        new 문5(
            "아무키나 빨리 눌러 바 채우기");
    }
}