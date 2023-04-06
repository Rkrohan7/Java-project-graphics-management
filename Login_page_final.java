package project;
//login page
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login_page_final extends JFrame  {
	
	JLabel head ;
	JPanel login;
	JTextField Username ;
	//JButton login_bu;
	JButton login_bu;
	JButton clear;
	JPasswordField Password;
	
	
	
	
	Login_page_final() {
		// font
		//Font f = new Font("Serif", Font.BOLD, 30);
		 Font f=new Font("Imprint MT Shadow",Font.BOLD,50);
		// header
		/*JPanel heading;
		heading = new JPanel();
		//heading.setLayout(null);
		heading.setBackground(new Color(0, 0, 0, 80));
		heading.setBounds(0, 0, 900, 90);
		
		*/
		
		
		  head = new JLabel("Admin Login");
	      login = new JPanel();
		  Username = new JTextField("Username");
		  Password = new JPasswordField("Password");
		  login_bu = new JButton("login");
		  clear = new JButton("clear");
		
		
		
		
		 head.setBounds(550, 80, 600, 70);
		 head.setForeground(Color.WHITE);
		 head.setFont(f);
		// heading.add( head);

		// login Panel
		
		login.setLayout(null);
		login.setSize(400, 350);
		login.setBackground(new Color(1, 0, 0, 60));
		login.setBounds(470, 145, 400, 350);

		
		Username.setBounds(50, 50, 300, 50);
		Username.setBackground(new Color(210, 180, 140));
		login.add(Username);
		

		
		Password.setBackground(new Color(210, 180, 140));
		Password.setBounds(50, 150, 300, 50);
		login.add(Password);

		
		login_bu.setBounds(50, 250, 100, 50); 
		login_bu.setBackground(new Color(160, 182, 45));
		login.add(login_bu);

		
		clear.setBounds(250, 250, 100, 50);
		clear.setBackground(new Color(160, 182, 45));
		login.add(clear);

		// frame
		setSize(900, 600);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("admin login page");
	
		
		/*
		 * 
		 * iamge add in frame
		 * 
		 */
		ImageIcon backgroung_Image = new ImageIcon("yn.jpg");
        Image img = backgroung_Image.getImage();
		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		backgroung_Image = new ImageIcon(temp_img);
		JLabel bg = new JLabel("", backgroung_Image, JLabel.CENTER);
		add(bg);
		bg.add(login);
		bg.add(head);

		bg.setBounds(0, 0, 900, 600);
		setVisible(true);

	   
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Username.setText(null);
				Password.setText(null);
				
			}
		});
		
		
		Username.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				//Username.setText("username");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Username.setText("");
				
			}
		});
		
		
		
		Password.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Password.setText("");
				
			}
		});
		
		
		
		
		
		
		
		login_bu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	         			
				try {
					insert_values();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	
	}
 
	
	
	public void insert_values() throws SQLException {

		Connection conn=Connection_class.getconnection();


			PreparedStatement pst;
			ResultSet rs;

		 String sql="select * from login_page where USER_ID=? and  PASSWORD=?";
	        
	           try {
	        	   String a=Username.getText();
	        	   String b= new String(Password.getPassword());   
	        	   
	            pst=conn.prepareStatement(sql);
	            pst.setString(1, a);
                System.out.println("first complete");
		         pst.setString(2,b);
	           System.out.println("second complete");
		         
		         rs=pst.executeQuery();
	            if(rs.next()){
	                JOptionPane.showMessageDialog(null, "Log in Successful.");
	                new   Main_home_page();
	                rs.close();
	                pst.close();
	              
	                //close();
	 
	                
	              //close();
	            }
	            else{
	                JOptionPane.showMessageDialog(null, "Worng!!! User Name and Password");

	            }
	        } catch (Exception e1) {
	            
	            JOptionPane.showMessageDialog(null, e1);
	 
	        }
	        
		
	}
		
	

	
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		new Login_page_final();
		//UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
	}

}