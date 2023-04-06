package project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Add_package_cost implements ActionListener{

	private JLabel head,code,name,midname,surname,contact,address,email,package_cos,type_costomer,package_amount,paid,
	               borrows,total_amount;
	private JButton insert,delete,clear,update,exit,print;
	private JTextField CODE,NAME,MIDNAME,SURNAME,CONTACT,EMAIL,PACKAGE_AMOUNT,PAID,BORROWS,TOTAL_AMOUNT;
	private JTextArea ADDRESS;
	private JFrame frame;
	private JRadioButton rd,rd1,rd2;
	private ButtonGroup type; 
	private JComboBox combo,day,month,year;
	
	/*
	 * 
	 * constructor creation
	 * 
	 */
	
	Add_package_cost(){
		
		/*
		 * 
		 * all 
		 * frame settings 
		 */
		frame=new JFrame();
		frame.setTitle("Package costomer insert");
		
		frame.setSize(1820,880);
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0,0,screensize.width,screensize.height);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.pack();
		
		Container c=frame.getContentPane();
		c.setBackground(Color.cyan);
		

		ImageIcon backgroung_Image = new ImageIcon("v2.png");
	    Image img = backgroung_Image.getImage();
		Image temp_img = img.getScaledInstance(1860,900, Image.SCALE_SMOOTH);
		backgroung_Image = new ImageIcon(temp_img);
		JLabel bg = new JLabel("", backgroung_Image, JLabel.CENTER);
		c.add(bg);
		//bg.add(login);
		//bg.add(heading);

		bg.setBounds(0, 0, 1860,900);
		frame.setVisible(true);
	    
		
		
		
		/*
		 * 
		 * object created all classes
		 *  
		 */
		
		head=new JLabel("insert costomer details");
		code=new JLabel("code :");
		name=new JLabel("name :");
		midname=new JLabel("middle name :");
		surname=new JLabel("surname :");
		contact=new JLabel("contact no");
		address=new JLabel("address");
		email=new JLabel("email Id");
		package_cos=new JLabel("packge costomer");
		type_costomer=new JLabel("type costomer");
		package_amount=new JLabel("amount ");
		paid=new JLabel("paid");
		borrows=new JLabel("borrows");
		total_amount=new JLabel("total");
		
//all textfiled class objetc created
		
		CODE=new JTextField();
		NAME=new JTextField();
		MIDNAME=new JTextField();
		SURNAME=new JTextField();
		CONTACT=new JTextField();
		EMAIL=new JTextField();
		PACKAGE_AMOUNT=new JTextField();
		PAID=new JTextField();
		BORROWS=new JTextField();
		TOTAL_AMOUNT=new JTextField();
		
		ADDRESS=new JTextArea();
	
/*
 * 
 * 
 * button class object created
 */
		   insert=new JButton("insert");
		   delete=new JButton("delete");
		   update=new JButton("update >>");
		   clear=new JButton("clear");
		   print=new JButton("print");
		   exit=new JButton("Exit");


		   

/*
 * font object created
 * 		
 */
		
		Font font1=new Font("Arial Rounded MT",Font.BOLD,20);
	    Font tfont=new Font("Century Schoolbook",Font.BOLD,20);
		   
		   
		   

		
/*
 * 
 * first side label settings
 * 	    
 */
	    head.setBounds(450, 50, 750, 100);
	   bg.add(head);
	    Font font=new Font("Imprint MT Shadow",Font.BOLD,70);
	    head.setFont(font);
	     
	    code.setBounds(200, 200, 100, 100);
	    code.setFont(font1);
	    bg.add(code);
	      
	    name.setBounds(200, 270, 100, 100);
	    name.setFont(font1);
	    bg.add(name);
	    
	    midname.setBounds(180, 340, 150, 100);
	    midname.setFont(font1);
	    bg.add(midname);
	    
	    surname.setBounds(200, 410, 100, 100);
	    surname.setFont(font1);
	    bg.add(surname);
	   
	    contact.setBounds(200, 480, 100, 100);
	    contact.setFont(font1);
	    bg.add(contact);
	    
	    address.setBounds(200, 550, 100, 100);
	    address.setFont(font1);
	    bg.add(address);
	   
/*
 * side fisrt
 * textfiled object created
 * 
 */
	    CODE.setBounds(300, 235, 150, 40);
	    CODE.setFont(tfont);
	    bg.add(CODE);

	    NAME.setBounds(300, 305, 150, 40);
	    NAME.setFont(tfont);
	    bg.add(NAME);
	
	    MIDNAME.setBounds(300, 375, 150, 40);
	    MIDNAME.setFont(tfont);
	    bg.add(MIDNAME);
	    
	   SURNAME.setBounds(300, 445, 150, 40);
	   SURNAME.setFont(tfont);
	   bg.add(SURNAME);
	    
	    CONTACT.setBounds(300, 515, 150, 40);
	    CONTACT.setFont(tfont);
	    bg.add(CONTACT);
	    
	    ADDRESS.setBounds(300, 585, 150, 80);
	    ADDRESS.setLineWrap(true);
	    ADDRESS.setFont(tfont);
	    bg.add(ADDRESS);
	
	    
	
	   
	// BUTTON SETTING
	  
	   insert.setBounds(1330, 250, 150, 50);
	    insert.setFont(tfont);
	    bg.add(insert);
	
	   // delete.setBounds(1330, 350, 100, 50);
	    //insert.setFont(font1);
	    delete.setFont(tfont);
	    bg.add(delete);
	    
	    //update.setBounds(1330, 450, 100, 50);
	    //insert.setFont(font1);
	   
	    clear.setBounds(1330, 350, 150, 50);
	    //insert.setFont(font1);
	    clear.setFont(tfont);
	    bg.add(clear);
	    
	    print.setBounds(1330, 450, 150, 50);
	    //insert.setFont(font1);
	    print.setFont(tfont);
	    bg.add(print);
	    
	    update.setBounds(1330, 550, 150, 50);
	    //insert.setFont(font1);
	    update.setFont(tfont);
	    bg.add(update);
	    
	    exit.setBounds(1330, 650, 150, 50);
	    //insert.setFont(font1);
	    exit.setFont(tfont);
	    bg.add(exit);
	    
	    
/*
 * 
 * second side
 * jabel object created
 * 
 */
	    
	    email.setBounds(600, 200, 100, 100);
	    email.setFont(font1);
	    bg.add(email);
	
	    package_cos.setBounds(600, 270, 300, 100);
	    package_cos.setFont(font1);
	    bg.add(package_cos);
	    
	
	    type_costomer.setBounds(600, 340, 300, 100);
	    type_costomer.setFont(font1);
	    bg.add(type_costomer);
	    
	    package_amount.setBounds(600, 410, 300, 100);
	    package_amount.setFont(font1);
	    bg.add(package_amount);
	    
	    paid.setBounds(600, 480, 300, 100);
	    paid.setFont(font1);
	    bg.add(paid);
	    
	    borrows.setBounds(600, 550, 300, 100);
	    borrows.setFont(font1);
	    bg.add(borrows);
	    
	    total_amount.setBounds(600, 620, 300, 100);
	    total_amount.setFont(font1);
	    bg.add(total_amount);
	   
	    
	    /*
	     * textfiled add 
	     * second side page
	     * 
	     */
	    
	    EMAIL.setBounds(850, 225, 150, 40);
	    //insert.setFont(font1);
	    EMAIL.setFont(tfont);
	    bg.add(EMAIL);
	     
	    PACKAGE_AMOUNT.setBounds(850, 440, 150, 40);
	    PACKAGE_AMOUNT.setFont(tfont);
	    //insert.setFont(font1);
	    bg.add(PACKAGE_AMOUNT);
	     
	    PAID.setBounds(850, 510, 150, 40);
	    PAID.setFont(tfont);
	    //insert.setFont(font1);
	    bg.add(PAID);
	   
	    BORROWS.setBounds(850, 580, 150, 40);
	    //insert.setFont(font1);
	    BORROWS.setFont(tfont);
	    bg.add(BORROWS);
	
	    TOTAL_AMOUNT.setBounds(850, 650, 150, 40);
	    //insert.setFont(font1);
	    TOTAL_AMOUNT.setFont(tfont);
	    bg.add(TOTAL_AMOUNT);
	
	
		   
/*
* 
* JComboBox object creation
* 	and all setting
* 
* and add the contAINER	   
*/
		   
		   String[] a= {
				   
				   "photo editing",
				   "banner editing",
				   "video editing",
				   "cenematic banner edit",
				   "dizital markiting",
				   "bussnes desin"};
		  combo=new JComboBox(a);
		   combo.setBounds(850, 300, 180, 40);
		   combo.setEditable(true);
		   combo.setFont(tfont);
		   bg.add(combo);
		   
	/*
	 * 
	 * 
	 * radio buutton add and all settings 
	 */
		   

		   
		rd=new JRadioButton("personal");   
		rd.setBounds(800,370,150,50);
		rd.setFont(tfont);
		bg.add(rd);
 
		 rd1=new JRadioButton("bussness");   
		rd1.setBounds(950,370,150,50);
		rd1.setFont(tfont);
		
		bg.add(rd1);
		
		 rd2=new JRadioButton("political");   
		rd2.setBounds(1100,370,150,50);
		rd2.setFont(tfont);
			
		bg.add(rd2);
		
		
		type=new ButtonGroup();
		type.add(rd);
		type.add(rd1);
		type.add(rd2);
		
		
	
		
		/*
		 * 
		 * adding date 
		 * 
		 * 
		 */
		/*
		
		 String days[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
         String months[]= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Agu","Sep","Oct","Nov","Dec"};
         String years[]= {"2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995"};
         
         
         day=new JComboBox(days);
         month=new JComboBox(months);
         year=new JComboBox(years);
         

         day.setBounds(300, 585, 150, 80);
         month.setBounds(190, 250, 50, 20);
         year.setBounds(250, 250, 60, 20);
        // male.setSelected(true);
         
         bg.add(day);
         bg.add(month);
         bg.add(year);
         
		*/
		
		
		
		
		
		
		
		
		
/*
 * add action listner on button===
 * 
 */
	
	    //insert,delete,update,clear,cancel,print
	    insert.addActionListener(this);
	   // delete.addActionListener(this);
	   update.addActionListener(this);
	    clear.addActionListener(this);
	   // cancel.addActionListener(this);
	    print.addActionListener(this);
	    exit.addActionListener(this);

	}
	
	
	
	
	
	

	@Override
public void actionPerformed(ActionEvent e) {
		
		
		
		if(e.getSource()==insert) {
			
			try {
				insert_values();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			
		}else
		{
			 JOptionPane.showMessageDialog(frame,"infformation not insertetd","Alert",JOptionPane.WARNING_MESSAGE);     
			
		}
		
        if(e.getSource()==print) {
			//print();
			JOptionPane.showMessageDialog(frame,"print succesful");  
        }
		
      
        if(e.getSource()==clear) {
        	//CODE,NAME,MIDNAME,SURNAME,CONTACT,EMAIL,PACKAGE_AMOUNT,PAID,BORROWS,TOTAL_AMOUNT
        
        	clr();

        
        }
		
		if(e.getSource()==update) {
		 new 	Updation_package_costomer();
		frame.setVisible(false);
		}
		if(e.getSource()==exit) {
			 frame.setVisible(false); //you can't see me!
	    		frame.dispose(); //Destroy the JFrame object
		}
		
		
		
	}


	public void clr() {
		CODE.setText("");
	    NAME.setText("");
	    MIDNAME.setText("");
	    SURNAME.setText("");
	    CONTACT.setText("");
	    EMAIL.setText("");
	    PACKAGE_AMOUNT.setText("");
	    PAID.setText("");
	    BORROWS.setText("");
	    TOTAL_AMOUNT.setText("");
	    ADDRESS.setText("");
	}

public void insert_values() throws SQLException {
	 
	
	String str="insert into package_customer values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	
	Connection con=Connection_class.getconnection();
	System.out.println("joij");
	PreparedStatement stmt=con.prepareStatement(str);

			
			
			/*
			 * 
			 * getting all values from 
			 * textfields
			 * 
			 * CODE,NAME,MIDNAME,SURNAME,CONTACT,EMAIL,PACKAGE_AMOUNT,PAID,BORROWS,TOTAL_AMOUNT
			 */
	

			rd.setActionCommand("personal");
			rd1.setActionCommand("bussness");
			rd2.setActionCommand("political");
			
	
			
			int COD=Integer.parseInt(CODE.getText());      
			String NAM=NAME.getText();
			String MID=MIDNAME.getText();
			String SUR=SURNAME.getText();
			String CON=CONTACT.getText();      
			String AREA=ADDRESS.getText();
			String EMA=EMAIL.getText();
			String com=type.getSelection().getActionCommand();
			String RADI=type.getSelection().getActionCommand();
			
		    int PAC=Integer.parseInt(PACKAGE_AMOUNT.getText());
		    int PAI=Integer.parseInt(PAID.getText());
            int BOR=Integer.parseInt(BORROWS.getText());
	        int  TOT=Integer.parseInt(TOTAL_AMOUNT.getText());
	     
			
			
				System.out.println("enterd value succesful");
			stmt.setInt(1, COD);
			stmt.setString(2, NAM);
			stmt.setString(3, MID);
			stmt.setString(4, SUR);
			
		    stmt.setString(5, CON);
			stmt.setString(6, AREA);
			stmt.setString(7, EMA);
			stmt.setString(8, com);
			stmt.setString(9, RADI);
				

			stmt.setInt(10, PAC);
			stmt.setInt(11, PAI);
			stmt.setInt(12, BOR);
			stmt.setInt(13, TOT);
		
			
			
			
			
			
			
			
			
			
	System.out.println("succes ful input");
			stmt.executeUpdate();
			System.out.println("update succesful");
			
			  JOptionPane.showMessageDialog(frame,"information succesful submit");  
			  
		
			    CODE.setText("");
			    NAME.setText("");
			    MIDNAME.setText("");
			    SURNAME.setText("");
			    CONTACT.setText("");
			    EMAIL.setText("");
			    PACKAGE_AMOUNT.setText("");
			    PAID.setText("");
			    BORROWS.setText("");
			    TOTAL_AMOUNT.setText("");
			    ADDRESS.setText("");
			  
			}
	
public static void main(String[] args) {
	    new  Add_package_cost();
		}











/*
 * 
 * 
 * 
 * //System.out.println(type.getSelection().getActionCommand());		
			//String COM=combo.getSelectedItem().toString();
			//String RADI=type.getSelection().getActionCommand();
			//stmt.setString(1, COM);
			//stmt.setString(1, COD);
 * 
 * 
 */ 

}
























