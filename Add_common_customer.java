package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Add_common_customer implements ActionListener {
	private JTextArea area;

	private JFrame frame;
	private JLabel head,id, name ,addr,contact,email;
	private JTextField ID,NAME,ADDR,CONATCT,EMAIL;
	private JButton save,update,clear,back,home_page,exit,find;
	
	Add_common_customer(){
		

		frame=new JFrame();
		head=new JLabel("  Add Common customer");
		
		id=new JLabel("id :");
		name =new JLabel("name :" );
		addr=new JLabel("Address:");
		contact=new JLabel("contact no:");
		email=new JLabel(" Email-id");
		ID= new JTextField();
		NAME= new JTextField();
		ADDR= new JTextField();
		CONATCT= new JTextField();
		EMAIL= new JTextField();
		save= new JButton("save");
        update= new JButton("update >>");
		clear= new JButton("clear");
		back= new JButton("back");
		home_page= new JButton("home page");
		exit= new JButton("Exit");
		find=new JButton("Find");
	
/*
 * 
 * pannel design 
 * loic add
 * 
 * 
 * 
 */
	
		
		
		//area=new JTextArea();
		//frame.setResizable(false);
		


	head.setBounds(250, 30,400, 100);
	Font font=new Font("Imprint MT Shadow",Font.BOLD,40);
	head.setFont(font);
	id.setBounds(100, 100, 50, 70);
	name .setBounds(100, 150, 200, 70);
	addr.setBounds(100, 200, 200, 70);
	contact.setBounds(100, 250, 200, 70);
	email.setBounds(100, 300, 200, 70);
/*
 * first side 
 * textfields 
 * 
 */
	ID.setBounds(100, 140, 200, 30);
	NAME .setBounds(100, 190, 200, 30);
	ADDR.setBounds(100, 240, 200, 30);
	CONATCT.setBounds(100, 290,200, 30);
	EMAIL.setBounds(100, 340, 200, 30);


//area fields

	area=new JTextArea();
	area.setBounds(500, 150, 200, 150);

/*
 * buttons set bounds
 * 
 */
	save.setBounds(100, 450, 100, 30);
	update.setBounds(220, 450, 100, 30);
	clear.setBounds(340, 450, 100, 30);
	back.setBounds(460, 450,100, 30);
	home_page.setBounds(580,450, 100, 30);
	exit.setBounds(700, 450, 100, 30);
	
	/*
	save.setBounds(250, 140, 100, 30);
	update.setBounds(250, 190, 100, 30);
	clear.setBounds(250, 240, 100, 30);
	back.setBounds(250, 290,100, 30);
	home_page.setBounds(250, 340, 100, 30);
	exit.setBounds(250, 390, 100, 30);
*/

		frame.setSize(1000,800);
	    frame.setLayout(null);
	    frame.setTitle("delete costomer account");
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
	    frame.setBackground(Color.BLUE);
	    //frame.setLocationRelativeTo(c);    
	  
	    
	    ImageIcon backgroung_Image = new ImageIcon("v2.png");
	    Image img = backgroung_Image.getImage();
		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		backgroung_Image = new ImageIcon(temp_img);
		JLabel bg = new JLabel("", backgroung_Image, JLabel.CENTER);
		frame.add(bg);
		//bg.add(login);
		//bg.add(head);

		
	  
		
		bg.add(head);//.setBounds(250, 50, 200, 70);
		bg.add(id);
	     bg.add(name);
		bg.add(addr);
		bg.add(contact);
		bg.add(email);
		
		bg.add(ID);
	     bg.add(NAME);
		bg.add(ADDR);
		bg.add(CONATCT);
		bg.add(EMAIL);
		bg.add(save);				
		//bg.add(save);
		
		bg.add(update);
		bg.add(clear);
		bg.add(back);
		bg.add(home_page);
		bg.add(exit);
		bg.add(area);
		
		bg.add(find);
		bg.add(area);

		bg.setBounds(0, 0, 900, 600);
		frame.setVisible(true);
		save.addActionListener(this);
		update.addActionListener(this);
		clear.addActionListener(this);
		back.addActionListener(this);
		home_page.addActionListener(this);
		exit.addActionListener(this);
		find.addActionListener(this);
		
		
	}
	public static void main(String[] args) {
	 new 	Add_common_customer();
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==save) {
			try {
				save();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(e.getSource()==update) {
			new Update_Common_customer();
		frame.setVisible(false);
		}
		if(e.getSource()==clear) {
			ID.setText("");
			NAME.setText("");
			ADDR.setText("");
			CONATCT.setText("");
			EMAIL.setText("");
			area.setText("");	
          JOptionPane.showMessageDialog(null,"record cleared succesfully");

			
		}
		if(e.getSource()==exit) {
			frame.setVisible(false); //you can't see me!
			frame.dispose(); //Destroy the JFrame object
		}
		if(e.getSource()==home_page) {
			 new Main_home_page();
		}
		if(e.getSource()==back) {
			 new Main_home_page();

			
		}
		
	}
	private void save() throws SQLException {
		 
		Connection con=Connection_class.getconnection();
		int a=Integer.parseInt(ID.getText());
		String b=NAME.getText();
		String c=ADDR.getText();
		String d=CONATCT.getText();
	    String e=EMAIL.getText();
	    
	    String str="  insert into commonf values(?,?,?,?,?)";	
	    Connection conn=Connection_class.getconnection();

	    PreparedStatement pst= con.prepareStatement(str);	
	    
		    pst.setInt(1, a);	
	    	pst.setString(2, b);
	    	pst.setString(3, c);
	    	pst.setString(4, d);
	    	pst.setString(5, e);
	    	
	    	pst.executeUpdate();
	    	System.out.println("succss");
			  JOptionPane.showMessageDialog(frame,"information succesful submit");  
			  area.setText("ID:"+a+""+"\n"+"Name :"+"    "+b+"\n"+"bussness name :"+"    "+c+"\n"+"contact :"+"    "+d+"\n"+"Email-Id"+"    "+e);
			  
			  ID.setText("");
			  NAME.setText("");
			  ADDR.setText("");
			  CONATCT.setText("");
			  EMAIL.setText("");
	
	//Update_Common_customer
	}
}
