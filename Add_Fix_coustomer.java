package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Add_Fix_coustomer implements ActionListener{
	
	
	

	private JFrame frame;
	private JLabel head,id, name ,addr,contact,email;
	private JTextField ID,NAME,ADDR,CONATCT,EMAIL;
	private JButton save,update,clear,back,home_page,exit,serach,calculate;
	private JTextArea area;
	private JTextField SEARCH,ALL_OVER_TOTAL_AMOUNT,BORROW,PAY,TOTAL;
	private JLabel all_over_total_amount,borrow,pay,total;
	private JPanel a;
	
	
	
	Add_Fix_coustomer(){

		frame=new JFrame();
		head=new JLabel(" Add fix customer");
		
		ALL_OVER_TOTAL_AMOUNT=new JTextField();
		BORROW=new JTextField();
		PAY=new JTextField();
		TOTAL=new JTextField();
		
         all_over_total_amount=new JLabel(" p amount");
         borrow=new JLabel("behind amount");
         pay=new JLabel("pay");
         total=new JLabel("total");
		
		
		a= new JPanel();
		a.setLayout(null);
		//a.setSize(400, 350);
		a.setBackground(new Color(1, 0, 0, 60));
		a.setBounds(100, 130, 200, 250);

		
		
		
		
		
		
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
		update= new JButton("update");
		clear= new JButton("clear");
		back= new JButton("delete");
		home_page= new JButton("home page");
		exit= new JButton("Exit");
		calculate= new JButton("calculation");
		area=new JTextArea();
		//frame.setResizable(false);
		
//setEditable(false)

	head.setBounds(250,30,400, 100);
	Font font=new Font("Imprint MT Shadow",Font.BOLD,40);
	head.setFont(font);

	id.setBounds(100, 100, 50, 70);
	name .setBounds(100, 150, 200, 70);
	addr.setBounds(100, 200, 200, 70);
	contact.setBounds(100, 250, 200, 70);
	email.setBounds(100, 300, 200, 70);
     
	all_over_total_amount.setBounds(100, 420, 100, 30);
	borrow.setBounds(100, 470, 100, 30);
	pay.setBounds(100, 520, 100, 30);
    total.setBounds(100, 570, 100, 30);
	
	
	
	
	
	
	
	
    serach= new JButton("Search");
	serach.setBounds(320, 140, 100, 30);
	
	ID.setBounds(100, 140, 200, 30);
	NAME .setBounds(100, 190,200, 30);
	ADDR.setBounds(100, 240, 200, 30);
	CONATCT.setBounds(100, 290,200, 30);
	EMAIL.setBounds(100, 340, 200, 30);
  
	
	ALL_OVER_TOTAL_AMOUNT.setBounds(100, 440, 200, 30);
	ALL_OVER_TOTAL_AMOUNT.setEditable(true);
	BORROW.setBounds(100, 490, 200, 30);
	BORROW.setEditable(false);

	PAY.setBounds(100, 540, 200, 30);
	TOTAL.setBounds(100, 590, 200, 30);
	TOTAL.setEditable(false);

	
	
	
	
	
	
	
	
	
	save.setBounds(100, 650, 100, 30);
	update.setBounds(220, 650, 100, 30);
	clear.setBounds(340, 650, 100, 30);
	calculate.setBounds(460, 650,100, 30);
	home_page.setBounds(580,650, 100, 30);
	exit.setBounds(700,650, 100, 30);
	
	
	
	area.setBounds(500, 150, 200, 400);
		
		
		frame.setSize(1000,800);
	    frame.setLayout(null);
	    frame.setTitle("delete costomer account");
	    frame.setVisible(true);
	    frame.setLocationRelativeTo(null);
	    //frame.setLocationRelativeTo(c);    
	  
	    
	    ImageIcon backgroung_Image = new ImageIcon("v2.png");
	    Image img = backgroung_Image.getImage();
		Image temp_img = img.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
		backgroung_Image = new ImageIcon(temp_img);
		JLabel bg = new JLabel("", backgroung_Image, JLabel.CENTER);
		frame.add(bg);
		//bg.add(login);
		//bg.add(head);
		frame.setVisible(true);

		bg.setBounds(0, 0, 1000, 800);
	
	  
		
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
		bg.add(a);
		bg.add(all_over_total_amount);
		bg.add(borrow);
       bg.add(pay);
        bg.add(total);
		
        bg.add(ALL_OVER_TOTAL_AMOUNT);
        bg.add(BORROW);
        bg.add(PAY);
        bg.add(TOTAL);
        bg.add(serach);
        bg.add(calculate);
		
save.addActionListener(this);
update.addActionListener(this);
clear.addActionListener(this);
back.addActionListener(this);
home_page.addActionListener(this);
exit.addActionListener(this);		
serach.addActionListener(this);	
calculate.addActionListener(this);
	}
	
	public static void main(String[] args) {
new Add_Fix_coustomer();
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
		
	
		if(e.getSource()==clear) {
			ID.setText("");
			NAME.setText("");
			ADDR.setText("");
			CONATCT.setText("");
			EMAIL.setText("");
			area.setText("");	
			  ALL_OVER_TOTAL_AMOUNT.setText("");
			  BORROW.setText("");
			  PAY.setText("");
			  TOTAL.setText("");
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
			try {
				delete();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource()==serach) {
			try {
				search();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		
		if(e.getSource()==update) {
update();
			
			
		}
		if(e.getSource()==calculate) {
			calaculate();
						
						
					}
		
		
	}
	
	
	
	
	
	

	private void calaculate() {

		if(BORROW.getText().isEmpty() &&  TOTAL.getText().isEmpty()) {
			BORROW.setText(""+0);
			TOTAL.setText(""+0);
		}else {
	    Long baki =Long.parseLong(BORROW.getText());
		Long current_amount =Long.parseLong(ALL_OVER_TOTAL_AMOUNT.getText());
		Long paying=Long.parseLong(PAY.getText());
		
		
		Long addtion=baki+current_amount;
		Long sub=addtion-paying;
		
		
		
       if(sub<=0) {
    	   int set_0=0;
    	   int intial=00;
    	   BORROW.setText(""+set_0);
    	   TOTAL.setText(sub+""); 
    	   ALL_OVER_TOTAL_AMOUNT.setText(""+intial);
    	   
       }else {
    	   
       	   
    	   BORROW.setText(sub+"");
    	   TOTAL.setText(""+"-"+sub); 
    	  
    	   
       }
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		
	}

	private void update() {
		
		
		
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    /*
		    
		    
		    Scanner sc= new Scanner(System.in);
		    int total,b_a=30;
		       
		    System.out.println("current amount");
		    int b=sc.nextInt();
		    System.out.println("pay");
		    int c=sc.nextInt();
		    	
		    	int fina=b+b_a;
		    	int to= fina-c;
		    	int out=to;
		    	System.out.println(out);
		    
		    */
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			PreparedStatement stmt = null;
			Connection conn=Connection_class.getconnection();
			 int p=JOptionPane.showConfirmDialog(null, "Are you Sure to Update data?","Update",JOptionPane.YES_NO_OPTION);
			   if(p==0)
			   {
			      try {
			    
			    	  int a=Integer.parseInt(ID.getText());
			  		String b=NAME.getText();
			  		String c=ADDR.getText();
			  		String d=CONATCT.getText();
			  	    String e=EMAIL.getText();
			  	    int h=Integer.parseInt(BORROW.getText());
			  	    int j=Integer.parseInt(TOTAL.getText());
			  	    
			  	    
			  	    
	       
			 System.out.println("1");      
			    
	PreparedStatement ps = conn.prepareStatement("update add_fix1 set NAME ='" + b+ "',ADDR='" + c + "',CONTACT ='" + d + "',EMAIL ='" + e+ "',  BORROW='" +h+ "', TOTAL_A ='" + j + "' where ID= " + ID.getText());
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
		pst=conn.prepareStatement("delete from add_fix1 where id=?");
		int id=Integer.parseInt(ID.getText());
		pst.setInt(1, id);
		int b=pst.executeUpdate();
		if(b==0) {
		JOptionPane.showMessageDialog(null,"record delete succesfully");
		ID.setText("");
		NAME.setText("");
		ADDR.setText("");
		CONATCT.setText("");
		EMAIL.setText("");
		
		}
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	private void search() throws SQLException {
		PreparedStatement pst;
		Connection conn=Connection_class.getconnection();
		String sql="select name,addr,contact,email, BORROW, TOTAL_A from add_fix1 where id=?";
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
			CONATCT.setText(rsmt.getString("CONTACT"));
			EMAIL.setText(rsmt.getString("EMAIL"));
			BORROW.setText(rsmt.getString("BORROW"));
		    TOTAL.setText(rsmt.getString("TOTAL_A"));
			
			
			
			
	     }
		
		
		
		
		
	}

	private void save() throws SQLException {
		 
		
		
		
		
		Connection con=Connection_class.getconnection();
		int a=Integer.parseInt(ID.getText());
		String b=NAME.getText();
		String c=ADDR.getText();
		String d=CONATCT.getText(); 
	    String e=EMAIL.getText();
	    int h=Integer.parseInt(BORROW.getText());
	    int j=Integer.parseInt(TOTAL.getText());
	    
	   
	    
	    String str="insert into add_fix1 values(?,?,?,?,?,?,?)";	

	    PreparedStatement pst= con.prepareStatement(str);	
	 
		    pst.setInt(1, a);	
	    	pst.setString(2, b);
	    	pst.setString(3, c);
	    	pst.setString(4, d);
	    	pst.setString(5, e);
	    	pst.setInt(6, h);
	         pst.setInt(7, j);
	    	
	    	pst.executeUpdate();
	    	System.out.println("succss");
			  JOptionPane.showMessageDialog(frame,"information succesful submit");  
			  
			  area.setText(ID.getText()+"\n"+NAME.getText()+"\n"+ADDR.getText()+"\n"
			  		+ ""+CONATCT.getText()+"\n"+EMAIL.getText()+"\n"+ALL_OVER_TOTAL_AMOUNT.getText()+""
			  				+ "\n"+BORROW.getText()+ "\n"+PAY.getText()+"\n"+TOTAL.getText());
			  
			  
			  
			  
			  
			  
			  ID.setText("");
			  NAME.setText("");
			  ADDR.setText("");
			  CONATCT.setText("");
			  EMAIL.setText("");
			  ALL_OVER_TOTAL_AMOUNT.setText("");
			  BORROW.setText("");
			  PAY.setText("");
			  TOTAL.setText("");
	
	//Update_Common_customer
	}

}
