package project;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Update_Common_customer  implements ActionListener{
	private JTextArea area;

	private JFrame frame;
	private JLabel head,id, name ,addr,contact,email;
	private JTextField ID,NAME,ADDR,CONATCT,EMAIL;
	private JButton update,delete,clear,back,home_page,exit,find;
	
	Update_Common_customer(){
		

		frame=new JFrame();
		head=new JLabel(" updation Common customer");
		
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
		update= new JButton("update");
        delete= new JButton("delete");
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
	find.setBounds(5,140,70,30);

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
	
	update.setBounds(100, 450, 100, 30);
	delete.setBounds(220, 450, 100, 30);
	clear.setBounds(340, 450, 100, 30);
	back.setBounds(460, 450,100, 30);
	home_page.setBounds(580,450, 100, 30);
	exit.setBounds(700, 450, 100, 30);


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
		bg.add(addr);
		bg.add(contact);
		bg.add(email);
		
		bg.add(ID);
	     bg.add(NAME);
		bg.add(ADDR);
		bg.add(CONATCT);
		bg.add(EMAIL);
		bg.add(delete);				
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
		find.addActionListener(this);   
		delete.addActionListener(this);
		clear.addActionListener(this);
	    back.addActionListener(this);
	    exit.addActionListener(this);
	    update.addActionListener(this);
	    home_page.addActionListener(this);
	
	}
	public static void main(String[] args) {
	 new 	Update_Common_customer();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
if(e.getSource()==find){
	try {
		search();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
}	
if(e.getSource()==delete) {
	
	try {
		delete1();
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
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
if(e.getSource()==back) {	
new Add_common_customer(); 
frame.setVisible(false);
}
if(e.getSource()==exit) {
	frame.setVisible(false); //you can't see me!
	frame.dispose(); //Destroy the JFrame object
	
	
	
}

if(e.getSource()==update) {
	update();
	
}

if(e.getSource()==home_page) {
	new Main_home_page();
	frame.setVisible(false);
	
	
}

	}
	
	
	
	
	
	private void delete1() throws Exception {
		PreparedStatement pst;
		Connection conn=Connection_class.getconnection();
		pst=conn.prepareStatement("delete from common  where id=?");
		int id=Integer.parseInt(ID.getText());
		area.setText(id+"");
		pst.setInt(1, id);
		int b=pst.executeUpdate();
		System.out.println(b);
		JOptionPane.showMessageDialog(null,"record delete succesfully");
		ID.setText("");
		NAME.setText("");
		ADDR.setText("");
		CONATCT.setText("");
		EMAIL.setText("");
	}
	private void search() throws SQLException {
		PreparedStatement pst;
		Connection conn=Connection_class.getconnection();
		String sql=" select name ,addr,mobile,email from common where id=?";
		pst=conn.prepareStatement(sql);
		int id=Integer.parseInt(ID.getText());
		
		pst.setInt(1, id);
		ResultSet rsmt=pst.executeQuery();
		if(rsmt.next()==false) {
			 JOptionPane.showMessageDialog(null,"record is not found");
		
		}else
		{
			NAME.setText(rsmt.getString("NAME"));
			ADDR.setText(rsmt.getString("ADDR"));
			CONATCT.setText(rsmt.getString("MOBILE"));
			EMAIL.setText(rsmt.getString("EMAIL"));
	     }
		
	}

	private void update() {
		PreparedStatement stmt = null;
		Connection conn=Connection_class.getconnection();
		 int p=JOptionPane.showConfirmDialog(null, "Are you Sure to Update data?","Update",JOptionPane.YES_NO_OPTION);
		   if(p==0)
		   {
		      try {
		    	  
		    	  /*
		    	   * code textfled getting values//using gettext() method in// formate is int 
		    	   *  
		    	   * 
		    	   * 
		    	   */
		    	  //String COD=CODE.getText();
		    	  
		    	  /*code scn o textfled 
		    	   * using get text method
		    	   * in int formate
		  
		  
		     /*  
		       String value1=txt_roll.getText();
		       String value2=txt_firstname.getText();  
		       String value3=txt_lastname.getText();
		       String value4=txt_classname.getText();
		       String value5=txt_year.getText();
		       String value6=txt_birthday.getText();
		       String value7=txt_mobile.getText();
		       String value8=txt_sex.getText();
		       String value9=txt_permanent.getText();
		       String value10=txt_present.getText();
		       */
		    	  /*
		     	   
		   			String NAM=NAME.getText();
		   			String MID=MIDNAME.getText();                             
		   			String SUR=SURNAME.getText();                           
		   			int CON=Integer.parseInt(CONTACT.getText());            
		   			String EMA=EMAIL.getText();                             
		   			float PAC=Integer.parseInt(PACKAGE_AMOUNT.getText());   
		   			float PAI=Integer.parseInt(PAID.getText());           
		   			float BOR=Integer.parseInt(BORROWS.getText());          
		   			float TOT=Integer.parseInt(TOTAL_AMOUNT.getText());  
		   	        String AREA=ADDRESS.getText();                         
		   			String COM=combo.getSelectedItem().toString();       
		   			String RADI=type.getSelection().getActionCommand();   
		       	  
		    	  
		       String sql="Update student_info set code='"+COD+"',"
		       		+ "First_name='"+NAME+"',mid_name='"+MID+"'"
		       				+ ",sur_name='"+SUR+"', contact='"+CON+"'"
		       						+ ",adress='"+AREA+"',email='"+EMA+"'"
		       								+ ",package='"+COM+"',package_type='"+RADI+"'"
		       										+ ",amount='"+PAC+"',paid='"+PAI+"'";
		       */
				int id=Integer.parseInt(ID.getText());
				 String a=NAME.getText();
			     String b=	ADDR.getText();
				 int c=Integer.parseInt(CONATCT.getText());
				 String d=EMAIL.getText();

//String sqlq="Update common set  NAME   ='" +a       + "', ADDR       ='" + b           + "'"+ ", MOBILE='"+c+"',EMAIL='"+d+"' where  ID=?";
//String sqlq="update common set    NAME ='" + a + "',ADDR ='" + b + "',MOBILE ='" + c + "',EMAIL ='" + d + "'where ID ="+ ID.getText();			       					
		       
		 System.out.println("1");      
		    
PreparedStatement ps = conn.prepareStatement("update commonf set NAME ='" + a+ "',ADDR ='" + b + "',MOBILE ='" + c + "',EMAIL ='" + d+ "'where ID= " + ID.getText());
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
	
	}


