package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JWindow;
import javax.swing.Timer;

public class Loading_page extends JFrame {
	Timer timer; 
	JTextArea area;
	Loading_page(){
		Welcome();

	setSize(600,500);
	setVisible(true);
	setLocationRelativeTo(null);
	area= new JTextArea();
	area.setBounds(0, 0, 600, 500);
	//area.scrollRectToVisible(null);
	}
	private void Welcome() {
  JWindow w= new JWindow(this);
  w.setSize(600,500);
  w.setLocationRelativeTo(null);
  w.setVisible(true);	
  JPanel p= new JPanel();
  
  
  
  
  w.add(p);
  
  ImageIcon backgroung_Image = new ImageIcon("welcome.jpg");
  Image img = backgroung_Image.getImage();
	Image temp_img = img.getScaledInstance(600, 500, Image.SCALE_SMOOTH);
	backgroung_Image = new ImageIcon(temp_img);
	JLabel bg = new JLabel("", backgroung_Image, JLabel.CENTER);
	p.add(bg);
	//bg.add(login);
	//bg.add(head);

	bg.setBounds(0, 0, 600, 500);
  
  p.setBorder(BorderFactory.createLineBorder(Color.black));
	
	JProgressBar progress= new JProgressBar(0,100);
	w.add(BorderLayout.PAGE_END,progress);
	w.revalidate();
	 timer= new Timer(100,new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
        int a= progress.getValue();
        if(a==100) {
        	w.dispose();
        	new Login_page_final();
        	//new About_developer(); 
        	timer.stop();
        }else {
        	
        	progress.setValue(a+4);
        	
        	
        }
		}
	});
	timer.start();
	}
	public static void main(String[] args) {
		 new Loading_page();
	}

}
