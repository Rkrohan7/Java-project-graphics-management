package project;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class About2 {
 
	
	 
	  
	
	
	  JFrame frame;
	  private JTextArea  area,area1;
	    private JButton  home,A_System ;
	  
	  
	  
	  
	About2(){
		
		 frame=new JFrame();
		 home= new JButton("back to home ");		
			A_System= new JButton("About System");
			home.setBounds(1200, 35, 140, 40);
			A_System.setBounds(47, 35, 140, 40);

		 
		 
		 
		frame.setSize(1400,850);	
		frame.setLayout(null);
		

		Font font1=new Font("Arial Rounded MT",Font.BOLD,20);
	    Font tfont=new Font("Century Schoolbook",Font.BOLD,20);
       
        ImageIcon backgroung_Image = new ImageIcon("about1.jpeg");
        Image img = backgroung_Image.getImage();
		Image temp_img = img.getScaledInstance(1400,800, Image.SCALE_SMOOTH);
		backgroung_Image = new ImageIcon(temp_img);
		JLabel bg = new JLabel("", backgroung_Image, JLabel.CENTER);
		frame.add(bg);
		
		bg.setBounds(0, 0, 1400,800);
		
		bg.add(home);
		bg.add(A_System);
		
	
		frame.setVisible(true);
        
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Main_home_page();
			}
		});
		
		A_System.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
            new Help_system();				
			frame.setVisible(false);
			}
		});
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		frame.setVisible(true);
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		 new About2();
	}

}
