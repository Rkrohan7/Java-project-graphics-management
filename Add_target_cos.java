package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;

import org.omg.CORBA.INTERNAL;

public class Add_target_cos implements ActionListener {
	
	private JFrame frame;
	private JLabel head,id, name ,bname,contact,email;
	private JTextField ID,NAME,BNAME,CONATCT,EMAIL;
	private JButton save,update,clear,back,home_page,exit;
	private JTextArea area;
	public Add_target_cos() {
		// TODO Auto-generated constructor stub
	
	
	frame=new JFrame();
	head=new JLabel("add target customer");
	
	id=new JLabel("id :");
	name =new JLabel("name :" );
	bname=new JLabel("bussness name :");
	contact=new JLabel("contact no:");
	email=new JLabel(" Email-id");
	ID= new JTextField();
	NAME= new JTextField();
	BNAME= new JTextField();
	CONATCT= new JTextField();
	EMAIL= new JTextField();
	save= new JButton("save");
	update= new JButton("update >>");
	clear= new JButton("clear");
	back= new JButton("back");
	home_page= new JButton("home page");
	exit= new JButton("Exit");
	area=new JTextArea();
	//frame.setResizable(false);
	


head.setBounds(250, 30,400, 100);
Font font=new Font("Imprint MT Shadow",Font.BOLD,40);
head.setFont(font);

id.setBounds(100, 100, 50, 70);
name .setBounds(100, 150, 200, 70);
bname.setBounds(100, 200, 200, 70);
contact.setBounds(100, 250, 200, 70);
email.setBounds(100, 300, 200, 70);

ID.setBounds(100, 140, 200, 30);
NAME .setBounds(100, 190, 200, 30);
BNAME.setBounds(100, 240, 200, 30);
CONATCT.setBounds(100, 290,200, 30);
EMAIL.setBounds(100, 340, 200, 30);



save.setBounds(100, 450, 100, 30);
update.setBounds(220, 450, 100, 30);
clear.setBounds(340, 450, 100, 30);
back.setBounds(460, 450,100, 30);
home_page.setBounds(580,450, 100, 30);
exit.setBounds(700, 450, 100, 30);

area.setBounds(500, 150, 200, 150);
	
	
	frame.setSize(1000,700);
    frame.setLayout(null);
    frame.setTitle("delete costomer account");
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
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
	bg.add(bname);
	bg.add(contact);
	bg.add(email);
	
	bg.add(ID);
     bg.add(NAME);
	bg.add(BNAME);
	bg.add(CONATCT);
	bg.add(EMAIL);
	bg.add(save);				
	bg.add(save);
	
	bg.add(update);
	bg.add(clear);
	bg.add(back);
	bg.add(home_page);
	bg.add(exit);
	bg.add(area);
	
	bg.setBounds(0, 0, 900, 600);
	frame.setVisible(true);
	update.addActionListener(this);
	back.addActionListener(this);
	exit.addActionListener(this);
	save.addActionListener(this);
	home_page.addActionListener(this);
	
clear.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		ID.setText("");
		NAME.setText("");
		BNAME.setText("");
		CONATCT.setText("");
		EMAIL.setText("");
		area.setText("");
		JOptionPane.showMessageDialog(bg,"clear succesful");  
	}
});

}
protected void save() throws SQLException {
	
	/*String BNA=BNAME.getText();
	int Con=Integer.parseInt(CONATCT.getText());
    String Ema=	EMAIL.getText();
	*/
    
    
	Connection con=Connection_class.getconnection();
	int a=Integer.parseInt(ID.getText());
	String b=NAME.getText();
	String c=BNAME.getText();
	String d=CONATCT.getText();
    String e=	EMAIL.getText();
    
    String str="  insert into target_cos values(?,?,?,?,?)";	
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
		  BNAME.setText("");
		  CONATCT.setText("");
		  EMAIL.setText("");
}

	/*
	 * 
	 * main methid
	 * 
	 */
	public static void main(String[] args) {
		 new Add_target_cos();
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource()==update) {
	new  Updated_targeted_cos();
	
    frame.setVisible(false);
}	


if(e.getSource()==back) {


}
if(e.getSource()==save) {
try {
	save();
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}	
}

if(e.getSource()==exit) {
	frame.setVisible(false); //you can't see me!
	frame.dispose(); //Destroy the JFrame object
	
}

if(e.getSource()==home_page) {
	
	new Main_home_page();
	
	
	
}
	}

}
