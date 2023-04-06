package project;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Help_system {
	private JButton developer,home;
	private JFrame frame;
private JTextArea area;
	Help_system(){
	 
	 
	 frame=new JFrame();
	area=new JTextArea();	
	
	Font font1=new Font("Arial Rounded MT",Font.BOLD,30);

		frame.setSize(1000,800);
	    frame.setLayout(null);
     frame.setTitle("About System");
     frame.setVisible(true);
     frame.setLocationRelativeTo(null);
     area.setBounds(0, 300, 1000,400);
     Color color=new Color(255,0,10);
     area.setBackground(color);
    area.setText("Project Name : \n                          Graphics Designer Management System - (GDMS) \n "
    		+ " Front-End :-   java \n"
    		+ "  UI Design :-   Swing \n"
    		+ "  Contivity :-   JDBC \n"
    		+ "  Back-End :-   Oracle \n"
    		+ "  Ide         :-   Eclipse");
     /*
     * forground set 
     * 
     */
     area.setFont(font1);
     area.setForeground(color.CYAN);     
     //frame.setLocationRelativeTo(c);    
	  
     
     ImageIcon backgroung_Image = new ImageIcon("about_s.jpg");
     Image img = backgroung_Image.getImage();
		Image temp_img = img.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
		backgroung_Image = new ImageIcon(temp_img);
		JLabel bg = new JLabel("", backgroung_Image, JLabel.CENTER);
		frame.add(bg);
		
		bg.setBounds(0, 0, 1000, 800);
		bg.add(area);
	
		developer=new JButton("developer page");
		home=new JButton("back home");
				
		
		
		developer.setBounds(30,700, 200, 50);
		
		home.setBounds(780, 700, 200, 50);
		
		bg.add(home);
		bg.add(developer);
		
		
		developer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
new About2				();
		frame.setVisible(false);
			}
		});
		
		home.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				new Main_home_page();
				frame.setVisible(false);
				
			}
		});
		
		
		frame.setVisible(true);
   
		
 }
	public static void main(String[] args) {
		
new Help_system();
	}

}