package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class Updated_targeted_cos implements ActionListener{
	
	private JFrame frame;
	private JLabel head,id, name ,bname,contact,email;
	private JTextField ID,NAME,BNAME,CONATCT,EMAIL;
	private JButton update,delete,clear,back,home_page,exit,find;
	private JTextArea area;
	
	Updated_targeted_cos(){
	frame=new JFrame();
	head=new JLabel("update target customer");
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
	update= new JButton("update");
	delete= new JButton("delete");
	clear= new JButton("clear");
	back= new JButton("back");
	home_page= new JButton("home page");
	exit= new JButton("Exit");
	area=new JTextArea();
	find=new JButton("Search");

head.setBounds(280, 20,500, 100);
Font font=new Font("Imprint MT Shadow",Font.BOLD,40);
head.setFont(font);

id.setBounds(140, 70, 50, 70);
name .setBounds(100, 150, 200, 70);
bname.setBounds(100, 200, 200, 70);
contact.setBounds(100, 250, 200, 70);
email.setBounds(100, 300, 200, 70);

ID.setBounds(140, 120, 100, 30  );
NAME .setBounds(100, 190, 200, 30);
BNAME.setBounds(100, 240, 200, 30);
CONATCT.setBounds(100, 290,200, 30);
EMAIL.setBounds(100, 340, 200, 30);





update.setBounds(100, 450, 100, 30);
delete.setBounds(220, 450, 100, 30);
clear.setBounds(340, 450, 100, 30);
back.setBounds(460, 450,100, 30);
home_page.setBounds(580,450, 100, 30);
exit.setBounds(700, 450, 100, 30);

find.setBounds(5,120,100,30);






area.setBounds(500, 150, 200, 150);
	
	
	frame.setSize(1000,800);
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
	
	bg.setBounds(0, 0, 900, 600);
  
	
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
					
    bg.add(update);
	bg.add(delete);
	bg.add(clear);
	bg.add(back);
	bg.add(home_page);
	bg.add(exit);
	bg.add(area);
	
	bg.add(find);
	frame.setVisible(true);
	find.addActionListener(this);
	delete.addActionListener(this);
	clear.addActionListener(this);
    back.addActionListener(this);
    exit.addActionListener(this);
    update.addActionListener(this);
    home_page.addActionListener(this);

back.addActionListener(this);	
clear.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ID.setText("");
		NAME.setText("");
		BNAME.setText("");
		CONATCT.setText("");
		EMAIL.setText("");
		JOptionPane.showMessageDialog(bg,"clear succesful");  
	}
});


}



	public static void main(String[] args) {
new Updated_targeted_cos();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource()==back) {
	 new Add_target_cos();
	    frame.setVisible(false);

}	
if(e.getSource()==find) {
	
	try {
		search();
	} catch (SQLException e1) {
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
if(e.getSource()==delete) {
	try {
		delete();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
}
if(e.getSource()==update) {
	update();
}

	}



	private void update() {
		PreparedStatement stmt = null;
		Connection conn=Connection_class.getconnection();
		 int p=JOptionPane.showConfirmDialog(null, "Are you Sure to Update data?","Update",JOptionPane.YES_NO_OPTION);
		   if(p==0)
		   {
		      try {
		    	  
		    	
				//int id=Integer.parseInt(ID.getText());
				 String a=NAME.getText();
			     String b=BNAME.getText();
				String c=CONATCT.getText();
				 String d=EMAIL.getText();
       
		 System.out.println("1");      
		    //update add_fix1 set NAME ='" + b+ "',ADDR='" + c + "',CONTACT ='" + d + "',EMAIL ='" + e+ "' where ID= " + ID.getText())
PreparedStatement ps = conn.prepareStatement("update target_cos set NAME ='" + a+ "',BNAME ='" + b + "',CONTACT ='" + c + "',EMAIL ='" + d+ "'where ID= " + ID.getText());
System.out.println("2");		      
System.out.println("3");		      
ps.executeUpdate();
		       System.out.println("4");
		      JOptionPane.showMessageDialog(null,"Table Updated Successfully."); 
		       
		   } catch (Exception e) {
		         
		       JOptionPane.showMessageDialog(null,"We face a Problem."); 
		   }
		   
		   }
		
	}



	private void delete() throws SQLException {
		PreparedStatement pst;
		Connection conn=Connection_class.getconnection();
		pst=conn.prepareStatement("delete from target_cos where id=?");
		int id=Integer.parseInt(ID.getText());
		area.setText(id+"");
		pst.setInt(1, id);
		int b=pst.executeUpdate();
		System.out.println(b);
		if(b>0) {
		JOptionPane.showMessageDialog(null,"record delete succesfully");
		ID.setText("");
	    NAME.setText("");
		BNAME.setText("");
		CONATCT.setText("");
		EMAIL.setText("");		
		area.setText(b +": "+"records delete from "+"\n"+"target customer table");
		}else {
			JOptionPane.showMessageDialog(null,"record is not found");
	
		}
		}



	private void search() throws SQLException {
		PreparedStatement pst;
		Connection conn=Connection_class.getconnection();
		String sql=" select name,bname,contact,email from target_cos where id=?";
		pst=conn.prepareStatement(sql);
		int id=Integer.parseInt(ID.getText());
		
		pst.setInt(1, id);
		ResultSet rsmt=pst.executeQuery();
		if(rsmt.next()==false) {
			 JOptionPane.showMessageDialog(null,"record is not found");
		
		}else
		{
			//NAME,BNAME,CONATCT,EMAIL
			
			NAME.setText(rsmt.getString("NAME"));
			BNAME.setText(rsmt.getString("BNAME"));
			CONATCT.setText(rsmt.getString("CONTACT"));
			EMAIL.setText(rsmt.getString("EMAIL"));
			
		}		
	}

}
