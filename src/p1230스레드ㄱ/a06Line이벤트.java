package p1230스레드ㄱ;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class a06Line이벤트 extends JFrame {
    private JButton btns[] = { new JButton("play"), new JButton("stop"),
                                new JButton("play again")};
    private Clip clip;
    JLabel label = new JLabel();

    public a06Line이벤트() {
    	setTitle("오디오 제어");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        MyActionListener al = new MyActionListener();
        for(int i=0; i<btns.length; i++) {
            c.add(btns[i]);
            btns[i].addActionListener(al);
        }
        setVisible(true);
        loadAudio("audio/애국가1절.wav"); // 애국가는 재생되는데, 이건 안됨
    }

    private void loadAudio(String pathName) {
        try {
            clip = AudioSystem.getClip(); 
            File audioFile = new File(pathName); 
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile); // 오디오 파일로부터
            clip.open(audioStream); 
            
            clip.addLineListener(new LineListener() {
            	public void update(LineEvent e) {
            		if (e.getType() == LineEvent.Type.STOP) {
            			try {
            				getContentPane().setBackground(Color.ORANGE);
            				label.setText(song + " 연주 끝!");
            				audioStream.close();
            			} catch (IOException e1) {
            				e1.printStackTrace();
            			}
            		}
            	}
            });
            clip.open(audioStream);
            clip.start();
        }
        catch (LineUnavailableException e) { e.printStackTrace(); }
        catch (UnsupportedAudioFileException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }

    }
    
    class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            switch(e.getActionCommand()) {
                case "play": clip.start(); 
                    break;
                case "stop": clip.stop();
                    break;
                case "play again":
                    clip.setFramePosition(0); 
                    clip.start(); 
                    break;
                    //루프(-1)도 가능하다. 폰카 참조
            }
        }
    }
    
    public static void main(String [] args) {
        new a06Line이벤트();
    }
}